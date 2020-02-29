package com.james.zoo.area;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.james.zoo.R;
import com.james.zoo.plant.PlantActivity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class AreaFragment extends Fragment implements AreaContract.View {

    private AreaContract.Presenter mPresenter;

    private Button button;

    public AreaFragment() {
    }

    public static AreaFragment newInstance() {
        return new AreaFragment();
    }

    @Override
    public void setPresenter(AreaContract.Presenter presenter) {
        mPresenter = presenter;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.area_frag, container, false);

        button = root.findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mPresenter.openPlant();
            }
        });

        return root;
    }

    @Override
    public void onResume() {
        super.onResume();
        mPresenter.start("");
    }

    @Override
    public void showPlantUi() {
        Intent intent = new Intent(getContext(), PlantActivity.class);
        startActivity(intent);
    }
}
