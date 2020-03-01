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
import com.james.zoo.data.Area;
import com.james.zoo.home.HomeFragment;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AreaAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context mContext;
    private List<Area.ResultBean.ResultsBean> mAreas;
    private HomeFragment.AreaItemListener mAreaItemListener;

    public AreaAdapter(List<Area.ResultBean.ResultsBean> areas, HomeFragment.AreaItemListener areaItemListener) {
        mAreas = areas;
        mAreaItemListener = areaItemListener;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        mContext = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        View view = layoutInflater.inflate(R.layout.area_item, parent, false);

        return new AreaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Area.ResultBean.ResultsBean area = mAreas.get(position);
        AreaViewHolder areaViewHolder = (AreaViewHolder) holder;

        areaViewHolder.itemView.setTag(R.id.root, area);

        Glide.with(mContext)
                .load(area.getE_Pic_URL())
                .apply(new RequestOptions().centerCrop())
                .into(areaViewHolder.mImage);
        areaViewHolder.mName.setText(area.getE_Name());
        areaViewHolder.mInfo.setText(area.getE_Info());
        areaViewHolder.mMemo.setText(area.getE_Memo());
    }

    @Override
    public int getItemCount() {
        return mAreas.size();
    }

    public void replaceData(List<Area.ResultBean.ResultsBean> areas) {
        setAreas(areas);
        notifyDataSetChanged();
    }

    private void setAreas(List<Area.ResultBean.ResultsBean> areas) {
        this.mAreas = areas;
    }

    class AreaViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        RelativeLayout mRoot;
        ImageView mImage;
        TextView mName;
        TextView mInfo;
        TextView mMemo;

        public AreaViewHolder(View itemView) {
            super(itemView);
            mRoot = itemView.findViewById(R.id.root);
            mImage = itemView.findViewById(R.id.image);
            mName = itemView.findViewById(R.id.name);
            mInfo = itemView.findViewById(R.id.info);
            mMemo = itemView.findViewById(R.id.memo);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            Area.ResultBean.ResultsBean area = (Area.ResultBean.ResultsBean) view.getTag(R.id.root);
            mAreaItemListener.onAreaClick(area);
        }
    }
}
