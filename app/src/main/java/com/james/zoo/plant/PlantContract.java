package com.james.zoo.plant;

import com.james.zoo.BasePresenter;
import com.james.zoo.BaseView;

import java.util.LinkedHashMap;

public interface PlantContract {

    interface Presenter extends BasePresenter {
    }

    interface View extends BaseView<Presenter> {
        void setView(String plant, LinkedHashMap<Integer, String> plantOrderedInfo);
    }
}
