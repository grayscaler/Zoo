package com.james.zoo.home;

public class HomePresenter implements HomeContract.Presenter {

    private final HomeContract.View mView;

    public HomePresenter(HomeContract.View view) {
        mView = view;

        mView.setPresenter(this);
    }

    @Override
    public void start() {

    }

    @Override
    public void openArea() {
        mView.showAreaUi();
    }
}
