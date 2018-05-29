package com.example.search_shopcart.model;

import com.example.search_shopcart.bean.SearchBean;

/**
 * 搜索框model层接口
 */
public interface SearchModelCallBack {
    public void success(SearchBean searchBean); //请求成功数据
    public void failure(Exception e);           //请求数据失败
}
