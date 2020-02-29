package com.james.zoo.data.source;

import com.james.zoo.data.Area;
import com.james.zoo.data.Plant;
import com.james.zoo.data.source.remote.ZooRemoteDataSource;

import java.util.HashMap;
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
        getAreasFromRemoteSource(getAreasCallback);
    }

    @Override
    public void getPlants(GetPlantsCallback getPlantsCallback, String area) {
        getPlantsFromRemoteSource(getPlantsCallback, area);
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
                        getAreasCallback.onAreaLoaded(area.getResult().getResults());
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        getAreasCallback.onDataNotAvailable(throwable);
                    }
                });
    }

    private void getPlantsFromRemoteSource(final GetPlantsCallback getPlantsCallback, String area) {
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
