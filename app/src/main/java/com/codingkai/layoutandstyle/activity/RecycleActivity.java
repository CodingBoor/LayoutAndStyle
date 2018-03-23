package com.codingkai.layoutandstyle.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.codingkai.layoutandstyle.R;
import com.codingkai.layoutandstyle.adapter.RecyclerAdapter;
import com.codingkai.layoutandstyle.adapter.RecyclerViewHolder;
import com.codingkai.layoutandstyle.bean.DoubleRecycleListBean;
import com.codingkai.layoutandstyle.bean.DoubleRecyclerBean;
import com.codingkai.layoutandstyle.bean.DoubleRecyclerGoodsBean;
import com.codingkai.layoutandstyle.utils.JsonUtils;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class RecycleActivity extends AppCompatActivity {

    @BindView(R.id.double_recycler)
    TextView doubleRecycler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.double_recycler)
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.double_recycler:
                startActivity(new Intent(RecycleActivity.this,DoubleRecycleActivity.class));
                break;
        }
    }


}
