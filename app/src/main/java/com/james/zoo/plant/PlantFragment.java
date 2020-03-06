package com.james.zoo.plant;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.james.zoo.R;

import java.util.LinkedHashMap;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class PlantFragment extends Fragment implements PlantContract.View {

    private PlantContract.Presenter mPresenter;

    private LinearLayout rootLinearLayout;
    private LinearLayout linearLayout;
    private ImageView imageView;

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

        rootLinearLayout = root.findViewById(R.id.root);
        imageView = root.findViewById(R.id.image);
        linearLayout = root.findViewById(R.id.info);

        return root;
    }

    @Override
    public void onResume() {
        super.onResume();
        mPresenter.start();
    }

    @Override
    public void setView(String picUrl, LinkedHashMap<Integer, String> plantOrderedInfo) {
        Glide.with(this)
                .load(picUrl)
                .apply(new RequestOptions().centerCrop())
                .into(imageView);

        linearLayout.removeAllViews();

        for (Integer id : plantOrderedInfo.keySet()) {
            View view = LayoutInflater.from(getContext()).inflate(R.layout.plant_info_item, rootLinearLayout, false);
            TextView title = view.findViewById(R.id.title);
            TextView content = view.findViewById(R.id.content);

            title.setText(id);
            content.setText(plantOrderedInfo.get(id));

            linearLayout.addView(view);
        }
    }
}
