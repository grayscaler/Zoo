package com.james.zoo.home;

import com.james.zoo.BasePresenter;
import com.james.zoo.BaseView;

public interface HomeContract {

    interface Presenter extends BasePresenter {

        void openArea();
    }

    interface View extends BaseView<Presenter> {

        void showAreaUi();
    }
}
