package com.james.zoo.home;

import com.james.zoo.BasePresenter;
import com.james.zoo.BaseView;
import com.james.zoo.data.Area;

import java.util.List;

public interface HomeContract {

    interface Presenter extends BasePresenter {

        void loadAreas(boolean forceUpdate);

        void openAreaDetail(Area.ResultBean.ResultsBean clickedArea);
    }

    interface View extends BaseView<Presenter> {

        void setLoadingIndicator(boolean active);

        void showAreas(List<Area.ResultBean.ResultsBean> areas);

        void showAreaDetail(Area.ResultBean.ResultsBean clickedArea);
    }
}
