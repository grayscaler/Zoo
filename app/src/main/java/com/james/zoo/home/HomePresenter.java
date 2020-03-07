package com.james.zoo.home;

import com.james.zoo.data.Area;
import com.james.zoo.data.source.ZooDataSource;
import com.james.zoo.data.source.ZooRepository;

import java.util.List;

public class HomePresenter implements HomeContract.Presenter {

    private final HomeContract.View mView;
    private final ZooRepository mZooRepository;

    private boolean mFirstLoad = true;

    HomePresenter(HomeContract.View view, ZooRepository zooRepository) {
        mView = view;
        mZooRepository = zooRepository;

        mView.setPresenter(this);
    }

    @Override
    public void start() {
        loadAreas(mFirstLoad);
        mFirstLoad = false;
    }

    @Override
    public void loadAreas(boolean forceUpdate) {
        mView.setLoadingIndicator(true);

        if (forceUpdate) {
            mZooRepository.refreshTasks();
        }

        mZooRepository.getAreas(new ZooDataSource.GetAreasCallback() {
            @Override
            public void onAreaLoaded(List<Area.ResultBean.ResultsBean> areas) {
                mView.showAreas(areas);
                mView.setLoadingIndicator(false);
            }

            @Override
            public void onDataNotAvailable(Throwable throwable) {
                mView.setLoadingIndicator(false);
            }
        });
    }

    @Override
    public void openAreaDetail(Area.ResultBean.ResultsBean clickedArea) {
        mView.showAreaDetail(clickedArea);
    }
}
