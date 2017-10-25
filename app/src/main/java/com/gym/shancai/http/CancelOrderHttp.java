package com.gym.shancai.http;

import android.support.annotation.NonNull;

import com.gym.shancai.http.base.BaseBean;
import com.gym.shancai.http.base.BaseHttp2;
import com.gym.shancai.http.base.HttpCallBackListener;
import com.gym.shancai.http.base.ServerUrl;

/**
 * Created by gym on 2017/9/14.
 */

public class CancelOrderHttp extends BaseHttp2{
    public CancelOrderHttp(String  orderid , HttpCallBackListener listener) {
        putUserId();
        put("orderid",orderid );
        this.listener=listener;
    }

    @NonNull
    @Override
    public String getUrl() {
        return ServerUrl.getInstance().cancelOrder;
    }

    @NonNull
    @Override
    public Class getClazz() {
        return BaseBean.class;
    }
}
