package com.james.zoo.area;

import android.os.Bundle;

import com.james.zoo.R;
import com.james.zoo.data.Area;
import com.james.zoo.data.source.ZooRepository;
import com.james.zoo.data.source.remote.ZooRemoteDataSource;
import com.james.zoo.util.ActivityUtils;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import static com.james.zoo.Constants.Constants.OBJECT_AREA;

public class AreaActivity extends AppCompatActivity {

    private AreaPresenter mAreaPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.area_act);

        Area.ResultBean.ResultsBean area = getIntent().getParcelableExtra(OBJECT_AREA);

        // Set up the toolbar.
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(area != null ? area.getE_Name() : null);
        setSupportActionBar(toolbar);
        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);
        ab.setDisplayShowHomeEnabled(true);

        AreaFragment areaFragment = (AreaFragment) getSupportFragmentManager().findFragmentById(R.id.contentFrame);
        if (areaFragment == null) {
            areaFragment = AreaFragment.newInstance();
            ActivityUtils.addFragmentToActivity(getSupportFragmentManager(), areaFragment, R.id.contentFrame);
        }

        mAreaPresenter = new AreaPresenter(areaFragment, ZooRepository.getInstance(ZooRemoteDataSource.getInstance()));
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
