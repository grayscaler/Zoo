package com.james.zoo.area;

import com.james.zoo.data.Area;
import com.james.zoo.data.Plant;
import com.james.zoo.data.source.ZooDataSource;
import com.james.zoo.data.source.ZooRepository;

import java.util.List;

public class AreaPresenter implements AreaContract.Presenter {

    private final AreaContract.View mView;
    private final ZooRepository mZooRepository;
    private final Area.ResultBean.ResultsBean mArea;

    public AreaPresenter(AreaContract.View view, ZooRepository zooRepository, Area.ResultBean.ResultsBean area) {
        mView = view;
        mZooRepository = zooRepository;
        mArea = area;

        mView.setPresenter(this);
    }

    @Override
    public void start() {
        mView.setView(mArea);
        loadPlants(mArea.getE_Name());
    }

    private void loadPlants(String area) {
        mZooRepository.getPlants(area, new ZooDataSource.GetPlantsCallback() {
            @Override
            public void onAreaLoaded(List<Plant.ResultBean.ResultsBean> plants) {
                mView.showPlants(plants);
            }

            @Override
            public void onDataNotAvailable(Throwable throwable) {

            }
        });
    }

    @Override
    public void openPlant(Plant.ResultBean.ResultsBean clickedPlant) {
        mView.showPlantUi(clickedPlant);
    }
}
