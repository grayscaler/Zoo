package com.james.zoo.area;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.james.zoo.R;
import com.james.zoo.data.Area;
import com.james.zoo.plant.PlantActivity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import static com.james.zoo.Constants.Constants.OBJECT_AREA;

public class AreaFragment extends Fragment implements AreaContract.View {

    private AreaContract.Presenter mPresenter;

    private Area.ResultBean.ResultsBean area;

    private ImageView imageView;
    private TextView info;
    private TextView location;
    private TextView memo;
    private TextView web;
    private RecyclerView recyclerView;

    public AreaFragment() {
    }

    static AreaFragment newInstance() {
        return new AreaFragment();
    }

    @Override
    public void setPresenter(AreaContract.Presenter presenter) {
        mPresenter = presenter;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        area = getArguments().getParcelable(OBJECT_AREA);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.area_frag, container, false);

        imageView = root.findViewById(R.id.image);
        info = root.findViewById(R.id.info);
        location = root.findViewById(R.id.location);
        memo = root.findViewById(R.id.memo);
        web = root.findViewById(R.id.web);
        recyclerView = root.findViewById(R.id.recycler_view);

        Glide.with(this)
                .load(area.getE_Pic_URL())
                .apply(new RequestOptions().centerCrop())
                .into(imageView);

        info.setText(area.getE_Info());
        location.setText(area.getE_Category());
        memo.setText(area.getE_Memo());
        web.setText(Html.fromHtml(String.format(getString(R.string.area_link), area.getE_URL())));

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
