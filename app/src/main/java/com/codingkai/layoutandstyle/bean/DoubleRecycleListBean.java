package com.codingkai.layoutandstyle.bean;

import java.util.List;

/**
 * Created by codin on 2018/3/23.
 */

public class DoubleRecycleListBean {
    /**
     * id : 160
     * amount : 690.00
     * pay_status : 0
     * system_time : 2018-03-13 22:11:09
     * count : 1
     * goods : [{"sku_thumb":"http://parisine.cn/./uploadfile/goods/ae/a3/2a/0d/5a095676edf27.jpg","sku_name":"男士香水-海涵","sku_price":"690.00","buy_nums":"1"}]
     */

    private String id;
    private String amount;
    private String pay_status;
    private String system_time;
    private int count;
    private List<DoubleRecyclerGoodsBean> goods;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getPay_status() {
        return pay_status;
    }

    public void setPay_status(String pay_status) {
        this.pay_status = pay_status;
    }

    public String getSystem_time() {
        return system_time;
    }

    public void setSystem_time(String system_time) {
        this.system_time = system_time;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<DoubleRecyclerGoodsBean> getGoods() {
        return goods;
    }

    public void setGoods(List<DoubleRecyclerGoodsBean> goods) {
        this.goods = goods;
    }


}
