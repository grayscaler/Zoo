package com.james.zoo.area;

import com.james.zoo.BasePresenter;
import com.james.zoo.BaseView;

public interface AreaContract {

    interface Presenter extends BasePresenter {

        void start(String area);

        void openPlant();
    }

    interface View extends BaseView<Presenter> {

        void showPlantUi();
    }
}
