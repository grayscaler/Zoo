package com.james.zoo.home;

import com.james.zoo.data.Area;
import com.james.zoo.data.source.ZooDataSource;
import com.james.zoo.data.source.ZooRepository;

import java.util.List;

public class HomePresenter implements HomeContract.Presenter {

    private final HomeContract.View mView;

    private final ZooRepository mZooRepository;

    public HomePresenter(HomeContract.View view, ZooRepository zooRepository) {
        mView = view;
        mZooRepository = zooRepository;

        mView.setPresenter(this);
    }

    @Override
    public void start() {
        loadAreas();
    }

    private void loadAreas() {
        mZooRepository.getAreas(new ZooDataSource.GetAreasCallback() {
            @Override
            public void onAreaLoaded(List<Area.ResultBean.ResultsBean> areas) {
                mView.showAreas(areas);
            }

            @Override
            public void onDataNotAvailable(Throwable throwable) {

            }
        });
    }

    @Override
    public void openAreaDetail(Area.ResultBean.ResultsBean clickedArea) {
        mView.showAreaDetail(clickedArea);
    }
}
