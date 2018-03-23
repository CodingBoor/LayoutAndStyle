package com.codingkai.layoutandstyle.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
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

public class DoubleRecycleActivity extends AppCompatActivity {

    @BindView(R.id.recycle)
    RecyclerView recycle;
    private RecyclerAdapter doubleListAdapter;
    List<DoubleRecycleListBean> doubleRecycleList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_double_recycle);
        ButterKnife.bind(this);
        init();
    }

    public void init(){
        DoubleRecyclerBean doubleRecyclerBean = JsonUtils.fromJson(JsonUtils.getAssestStr(DoubleRecycleActivity.this,"recycle.json"),DoubleRecyclerBean.class);
        doubleRecycleList =  doubleRecyclerBean.getData();
        doubleListAdapter = new RecyclerAdapter<DoubleRecycleListBean>(this,doubleRecycleList,R.layout.item_recycler_list) {
            @Override
            public void convert(RecyclerViewHolder helper, DoubleRecycleListBean item, int position) {
                TextView title =  helper.getView(R.id.tv_title);
                TextView tvFoot = helper.getView(R.id.tv_footer);
                title.setText("下单时间:    "+item.getSystem_time());
                tvFoot.setText("商品总价:    "+item.getAmount());
                RecyclerView mGoodRecycler = helper.getView(R.id.recycle_goods);
                RecyclerAdapter goodsAdapter;
                List<DoubleRecyclerGoodsBean> goodsList = item.getGoods();
                goodsAdapter = new RecyclerAdapter<DoubleRecyclerGoodsBean>(DoubleRecycleActivity.this,goodsList,R.layout.item_goods_list) {
                    @Override
                    public void convert(RecyclerViewHolder helper, DoubleRecyclerGoodsBean item, int position) {
                        TextView name =  helper.getView(R.id.tv_name);
                        TextView price = helper.getView(R.id.tv_price);
                        name.setText(item.getSku_name());
                        price.setText(item.getSku_price());

                    }
                };

                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(DoubleRecycleActivity.this,LinearLayoutManager.VERTICAL,false);
                mGoodRecycler.setHasFixedSize(true);
                mGoodRecycler.setLayoutManager(linearLayoutManager);
                mGoodRecycler.setAdapter(goodsAdapter);

            }
        };

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recycle.setHasFixedSize(true);
        recycle.setLayoutManager(linearLayoutManager);
        recycle.setAdapter(doubleListAdapter);
    }

}
