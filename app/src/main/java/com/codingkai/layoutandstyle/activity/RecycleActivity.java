package com.codingkai.layoutandstyle.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.codingkai.layoutandstyle.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class RecycleActivity extends AppCompatActivity {

    @BindView(R.id.double_rechcler)
    TextView doubleRechcler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.double_rechcler)
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.double_rechcler:
                startActivity(new Intent(RecycleActivity.this,RectangleActivity.class));
                break;
        }
    }
}
