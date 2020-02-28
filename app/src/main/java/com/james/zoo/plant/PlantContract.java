package com.james.zoo.plant;

import com.james.zoo.BasePresenter;
import com.james.zoo.BaseView;

public interface PlantContract {

    interface Presenter extends BasePresenter {
    }

    interface View extends BaseView<Presenter> {
    }
}
