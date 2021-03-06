package com.james.zoo.plant;

import android.os.Bundle;

import com.james.zoo.R;
import com.james.zoo.data.Plant;
import com.james.zoo.util.ActivityUtils;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import static com.james.zoo.Constants.Constants.OBJECT_PLANT;

public class PlantActivity extends AppCompatActivity {

    private PlantPresenter mPlantPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.plant_act);

        Plant.ResultBean.ResultsBean plant = getIntent().getParcelableExtra(OBJECT_PLANT);

        // Set up the toolbar.
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        if (plant != null) {
            toolbar.setTitle(plant.getF_Name_Ch());
        }
        setSupportActionBar(toolbar);
        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);
        ab.setDisplayShowHomeEnabled(true);

        PlantFragment plantFragment = (PlantFragment) getSupportFragmentManager().findFragmentById(R.id.contentFrame);
        if (plantFragment == null) {
            plantFragment = PlantFragment.newInstance();
            ActivityUtils.addFragmentToActivity(getSupportFragmentManager(), plantFragment, R.id.contentFrame);
        }

        mPlantPresenter = new PlantPresenter(plantFragment, plant);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
