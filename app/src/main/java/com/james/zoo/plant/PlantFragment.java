package com.james.zoo.plant;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.james.zoo.R;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class PlantFragment extends Fragment implements PlantContract.View {

    private PlantContract.Presenter mPresenter;

    public PlantFragment() {
    }

    public static PlantFragment newInstance() {
        return new PlantFragment();
    }

    @Override
    public void setPresenter(PlantContract.Presenter presenter) {
        mPresenter = presenter;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.plant_frag, container, false);

        return root;
    }
}
