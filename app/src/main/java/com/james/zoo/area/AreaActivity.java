package com.james.zoo.area;

import android.os.Bundle;

import com.james.zoo.R;
import com.james.zoo.util.ActivityUtils;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class AreaActivity extends AppCompatActivity {

    private AreaPresenter mAreaPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.area_act);

        // Set up the toolbar.
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Area");
        setSupportActionBar(toolbar);
        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);
        ab.setDisplayShowHomeEnabled(true);

        AreaFragment areaFragment = (AreaFragment) getSupportFragmentManager().findFragmentById(R.id.contentFrame);
        if (areaFragment == null) {
            areaFragment = AreaFragment.newInstance();
            ActivityUtils.addFragmentToActivity(getSupportFragmentManager(), areaFragment, R.id.contentFrame);
        }

        mAreaPresenter = new AreaPresenter(areaFragment);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
