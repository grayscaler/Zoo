package com.james.zoo.data.source;

import com.james.zoo.data.Area;
import com.james.zoo.data.Plant;

import java.util.List;

public interface ZooDataSource {

    interface GetAreasCallback {

        void onAreaLoaded(List<Area.ResultBean.ResultsBean> areas);

        void onDataNotAvailable(Throwable throwable);
    }

    interface GetPlantsCallback {

        void onAreaLoaded(List<Plant.ResultBean.ResultsBean> plants);

        void onDataNotAvailable(Throwable throwable);
    }

    void getAreas(GetAreasCallback getAreasCallback);

    void getPlants(String area, GetPlantsCallback getPlantsCallback);
}
