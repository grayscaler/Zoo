package com.james.zoo.data.source;

import com.james.zoo.data.Area;
import com.james.zoo.data.Plant;
import com.james.zoo.data.source.remote.ZooRemoteDataSource;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

import static com.james.zoo.Constants.Constants.API_QUERY_KEY_Q;
import static com.james.zoo.Constants.Constants.API_QUERY_KEY_RID;
import static com.james.zoo.Constants.Constants.API_QUERY_KEY_SCOPE;
import static com.james.zoo.Constants.Constants.API_QUERY_VALUE_AREAS;
import static com.james.zoo.Constants.Constants.API_QUERY_VALUE_PLANTS;
import static com.james.zoo.Constants.Constants.API_QUERY_VALUE_RESOURCE_A_QUIRE;

public class ZooRepository implements ZooDataSource {

    private static ZooRepository INSTANCE = null;
    private final ZooRemoteDataSource mZooRemoteDataSource;

    List<Area.ResultBean.ResultsBean> mCachedAreas;
    boolean mCacheIsDirty = false;

    private ZooRepository(ZooRemoteDataSource zooRemoteDataSource) {
        mZooRemoteDataSource = zooRemoteDataSource;
    }

    public static ZooRepository getInstance(ZooRemoteDataSource zooRemoteDataSource) {
        if (INSTANCE == null) {
            INSTANCE = new ZooRepository(zooRemoteDataSource);
        }
        return INSTANCE;
    }

    @Override
    public void getAreas(GetAreasCallback getAreasCallback) {
        // Respond immediately with cache if available and not dirty
        if (mCachedAreas != null && !mCacheIsDirty) {
            getAreasCallback.onAreaLoaded(mCachedAreas);
            return;
        }

        if (mCacheIsDirty) {
            // If the cache is dirty we need to fetch new data from the network.
            getAreasFromRemoteSource(getAreasCallback);
        }
    }

    @Override
    public void getPlants(String area, GetPlantsCallback getPlantsCallback) {
        getPlantsFromRemoteSource(area, getPlantsCallback);
    }

    private void getAreasFromRemoteSource(final GetAreasCallback getAreasCallback) {
        Map<String, String> options = new HashMap<>();
        options.put(API_QUERY_KEY_SCOPE, API_QUERY_VALUE_RESOURCE_A_QUIRE);
        options.put(API_QUERY_KEY_RID, API_QUERY_VALUE_AREAS);
        mZooRemoteDataSource.rxGetAreas(options)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<Area>() {
                    @Override
                    public void accept(Area area) throws Exception {
                        refreshCache(area.getResult().getResults());
                        getAreasCallback.onAreaLoaded(area.getResult().getResults());
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        getAreasCallback.onDataNotAvailable(throwable);
                    }
                });
    }

    public void refreshTasks() {
        mCacheIsDirty = true;
    }

    private void refreshCache(List<Area.ResultBean.ResultsBean> areas) {
        if (mCachedAreas == null) {
            mCachedAreas = new LinkedList<>();
        }
        mCachedAreas.clear();
        mCachedAreas.addAll(areas);

        mCacheIsDirty = false;
    }

    private void getPlantsFromRemoteSource(String area, final GetPlantsCallback getPlantsCallback) {
        Map<String, String> options = new HashMap<>();
        options.put(API_QUERY_KEY_SCOPE, API_QUERY_VALUE_RESOURCE_A_QUIRE);
        options.put(API_QUERY_KEY_RID, API_QUERY_VALUE_PLANTS);
        options.put(API_QUERY_KEY_Q, area);
        mZooRemoteDataSource.rxGetPlants(options)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<Plant>() {
                    @Override
                    public void accept(Plant plant) throws Exception {
                        getPlantsCallback.onAreaLoaded(plant.getResult().getResults());
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        getPlantsCallback.onDataNotAvailable(throwable);
                    }
                });
    }
}
