package com.james.zoo.area;

import com.james.zoo.data.Plant;
import com.james.zoo.data.source.ZooDataSource;
import com.james.zoo.data.source.ZooRepository;

import java.util.List;

public class AreaPresenter implements AreaContract.Presenter {

    private final AreaContract.View mView;

    private final ZooRepository mZooRepository;

    public AreaPresenter(AreaContract.View view, ZooRepository zooRepository) {
        mView = view;
        mZooRepository = zooRepository;

        mView.setPresenter(this);
    }

    @Override
    public void start() {

    }

    @Override
    public void start(String area) {
        loadPlants(area);
    }

    private void loadPlants(String area) {
        mZooRepository.getPlants(new ZooDataSource.GetPlantsCallback() {
            @Override
            public void onAreaLoaded(List<Plant.ResultBean.ResultsBean> plants) {

            }

            @Override
            public void onDataNotAvailable(Throwable throwable) {

            }
        }, area);
    }

    @Override
    public void openPlant() {
        mView.showPlantUi();
    }
}
