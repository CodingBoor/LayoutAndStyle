package com.codingkai.layoutandstyle.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import com.codingkai.layoutandstyle.R;
import com.codingkai.layoutandstyle.adapter.RecyclerAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DoubleRecycleActivity extends AppCompatActivity {

    @BindView(R.id.recycle)
    RecyclerView recycle;
    private RecyclerAdapter mRecycleAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_double_recycle);
        ButterKnife.bind(this);
    }
}
