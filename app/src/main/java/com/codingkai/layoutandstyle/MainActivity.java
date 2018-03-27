package com.codingkai.layoutandstyle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.codingkai.layoutandstyle.activity.RecycleActivity;
import com.codingkai.layoutandstyle.activity.StyleActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.id_tyle)
    TextView idTyle;
    @BindView(R.id.id_tyle2)
    TextView idTyle2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.id_tyle, R.id.id_tyle2})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.id_tyle:

                startActivity(new Intent(MainActivity.this, StyleActivity.class));
                break;
            case R.id.id_tyle2:
                startActivity(new Intent(MainActivity.this, RecycleActivity.class));
                break;
        }
    }
}
