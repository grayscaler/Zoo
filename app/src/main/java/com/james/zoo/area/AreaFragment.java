package com.james.zoo.area;

import android.content.Context;
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
import com.james.zoo.adapter.PlantAdapter;
import com.james.zoo.data.Area;
import com.james.zoo.data.Plant;
import com.james.zoo.plant.PlantActivity;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import static com.james.zoo.Constants.Constants.OBJECT_PLANT;

public class AreaFragment extends Fragment implements AreaContract.View {

    private Context mContext;
    private AreaContract.Presenter mPresenter;

    private ImageView imageView;
    private TextView info;
    private TextView location;
    private TextView memo;
    private TextView web;

    private PlantAdapter mPlantAdapter;

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
    public void onAttach(Context context) {
        super.onAttach(context);
        mContext = context;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPlantAdapter = new PlantAdapter(new ArrayList<Plant.ResultBean.ResultsBean>(0), mPlantItemListener);
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

        RecyclerView recyclerView = root.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(mContext));
        recyclerView.setAdapter(mPlantAdapter);
        recyclerView.addItemDecoration(new DividerItemDecoration(mContext, DividerItemDecoration.VERTICAL));

        return root;
    }

    @Override
    public void onResume() {
        super.onResume();
        mPresenter.start();
    }

    @Override
    public void setView(Area.ResultBean.ResultsBean area) {
        Glide.with(this)
                .load(area.getE_Pic_URL())
                .apply(new RequestOptions().centerCrop())
                .into(imageView);

        info.setText(area.getE_Info());
        location.setText(area.getE_Category());
        memo.setText(area.getE_Memo());
        web.setText(Html.fromHtml(String.format(getString(R.string.area_link), area.getE_URL())));
    }

    private PlantItemListener mPlantItemListener = new PlantItemListener() {

        @Override
        public void onPlantClick(Plant.ResultBean.ResultsBean clickedPlant) {
            mPresenter.openPlant(clickedPlant);
        }
    };

    @Override
    public void showPlants(List<Plant.ResultBean.ResultsBean> plants) {
        mPlantAdapter.replaceData(plants);
    }

    @Override
    public void showPlantUi(Plant.ResultBean.ResultsBean clickedPlant) {
        Intent intent = new Intent(mContext, PlantActivity.class);
        intent.putExtra(OBJECT_PLANT, clickedPlant);
        startActivity(intent);
    }

    public interface PlantItemListener {

        void onPlantClick(Plant.ResultBean.ResultsBean clickedPlant);

    }
}
