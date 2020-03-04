package com.james.zoo.home;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.james.zoo.R;
import com.james.zoo.adapter.AreaAdapter;
import com.james.zoo.area.AreaActivity;
import com.james.zoo.data.Area;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import static com.james.zoo.Constants.Constants.INITIAL_CAPACITY;
import static com.james.zoo.Constants.Constants.OBJECT_AREA;

public class HomeFragment extends Fragment implements HomeContract.View {

    private Context mContext;
    private HomeContract.Presenter mPresenter;
    private AreaAdapter mAreaAdapter;

    public HomeFragment() {
    }

    public static HomeFragment newInstance() {
        return new HomeFragment();
    }

    @Override
    public void setPresenter(HomeContract.Presenter presenter) {
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
        mAreaAdapter = new AreaAdapter(new ArrayList<Area.ResultBean.ResultsBean>(INITIAL_CAPACITY), mAreaItemListener);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.home_frag, container, false);

        RecyclerView recyclerView = root.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(mContext));
        recyclerView.setAdapter(mAreaAdapter);
        recyclerView.addItemDecoration(new DividerItemDecoration(mContext, DividerItemDecoration.VERTICAL));

        return root;
    }

    @Override
    public void onResume() {
        super.onResume();
        mPresenter.start();
    }

    private AreaItemListener mAreaItemListener = new AreaItemListener() {
        @Override
        public void onAreaClick(Area.ResultBean.ResultsBean clickedArea) {
            mPresenter.openAreaDetail(clickedArea);
        }
    };

    @Override
    public void showAreas(List<Area.ResultBean.ResultsBean> areas) {
        mAreaAdapter.replaceData(areas);
    }

    @Override
    public void showAreaDetail(Area.ResultBean.ResultsBean clickedArea) {
        Intent intent = new Intent(mContext, AreaActivity.class);
        intent.putExtra(OBJECT_AREA, clickedArea);
        startActivity(intent);
    }

    public interface AreaItemListener {

        void onAreaClick(Area.ResultBean.ResultsBean clickedArea);

    }
}
