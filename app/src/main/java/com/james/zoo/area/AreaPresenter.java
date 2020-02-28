package com.james.zoo.area;

public class AreaPresenter implements AreaContract.Presenter {

    private final AreaContract.View mView;

    public AreaPresenter(AreaContract.View view) {
        mView = view;

        mView.setPresenter(this);
    }

    @Override
    public void start() {

    }

    @Override
    public void openPlant() {
        mView.showPlantUi();
    }
}
