package com.zmk.v1.bean;

import com.alibaba.fastjson.JSONObject;

/**
 * @Package v1.realtime.bean.CartAddUuBean
 * @Author zhoumingkai
 * @Date 2025/5/2 18:42
 * @description: CartAddUuBean
 */

public interface DimJoinFunction<T> {
    void addDims(T obj, JSONObject dimJsonObj) ;

    String getTableName() ;

    String getRowKey(T obj) ;

}
