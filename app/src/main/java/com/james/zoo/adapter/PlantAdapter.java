package com.james.zoo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.james.zoo.R;
import com.james.zoo.area.AreaFragment;
import com.james.zoo.data.Plant;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PlantAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context mContext;
    private List<Plant.ResultBean.ResultsBean> mPlants;
    private AreaFragment.PlantItemListener mPlantItemListener;

    public PlantAdapter(List<Plant.ResultBean.ResultsBean> plants, AreaFragment.PlantItemListener plantItemListener) {
        mPlants = plants;
        mPlantItemListener = plantItemListener;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        mContext = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        View view = layoutInflater.inflate(R.layout.plant_item, parent, false);

        return new PlantViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Plant.ResultBean.ResultsBean plant = mPlants.get(position);
        PlantViewHolder plantViewHolder = (PlantViewHolder) holder;

        plantViewHolder.itemView.setTag(R.id.root, plant);

        Glide.with(mContext)
                .load(plant.getF_Pic01_URL())
                .apply(new RequestOptions().centerCrop())
                .into(plantViewHolder.mImage);
        plantViewHolder.mName.setText(plant.getF_Name_Ch());
        plantViewHolder.mInfo.setText(plant.getF_Brief());
    }

    @Override
    public int getItemCount() {
        return mPlants.size();
    }

    public void replaceData(List<Plant.ResultBean.ResultsBean> plants) {
        setPlants(plants);
        notifyDataSetChanged();
    }

    private void setPlants(List<Plant.ResultBean.ResultsBean> plants) {
        this.mPlants = plants;
    }

    class PlantViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        RelativeLayout mRoot;
        ImageView mImage;
        TextView mName;
        TextView mInfo;

        public PlantViewHolder(View itemView) {
            super(itemView);
            mRoot = itemView.findViewById(R.id.root);
            mImage = itemView.findViewById(R.id.image);
            mName = itemView.findViewById(R.id.name);
            mInfo = itemView.findViewById(R.id.info);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            Plant.ResultBean.ResultsBean plant = (Plant.ResultBean.ResultsBean) view.getTag(R.id.root);
            mPlantItemListener.onPlantClick(plant);
        }
    }
}
