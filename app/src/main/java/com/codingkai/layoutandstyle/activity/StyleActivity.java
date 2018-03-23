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

public class StyleActivity extends AppCompatActivity {

    @BindView(R.id.tv_rectangle)
    TextView tvRectangle;
    @BindView(R.id.tv_oval)
    TextView tvOval;
    @BindView(R.id.tv_line)
    TextView tvLine;
    @BindView(R.id.tv_ring)
    TextView tvRing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_style);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.tv_rectangle, R.id.tv_oval, R.id.tv_line, R.id.tv_ring})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv_rectangle:
                startActivity(new Intent(StyleActivity.this,RectangleActivity.class));
                break;
            case R.id.tv_oval:
                break;
            case R.id.tv_line:
                break;
            case R.id.tv_ring:
                break;
        }
    }
}
