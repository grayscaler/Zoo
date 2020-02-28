package com.james.zoo.plant;

public class PlantPresenter implements PlantContract.Presenter {

    private final PlantContract.View mView;

    public PlantPresenter(PlantContract.View view) {
        mView = view;

        mView.setPresenter(this);
    }

    @Override
    public void start() {

    }
}
