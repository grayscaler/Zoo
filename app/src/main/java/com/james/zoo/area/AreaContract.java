package com.james.zoo.area;

import com.james.zoo.BasePresenter;
import com.james.zoo.BaseView;
import com.james.zoo.data.Area;
import com.james.zoo.data.Plant;

import java.util.List;

public interface AreaContract {

    interface Presenter extends BasePresenter {

        void openPlant(Plant.ResultBean.ResultsBean clickedPlant);
    }

    interface View extends BaseView<Presenter> {

        void setView(Area.ResultBean.ResultsBean area);

        void showPlants(List<Plant.ResultBean.ResultsBean> plants);

        void showPlantUi(Plant.ResultBean.ResultsBean clickedPlant);
    }
}
