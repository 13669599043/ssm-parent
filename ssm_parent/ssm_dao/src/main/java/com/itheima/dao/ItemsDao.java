package com.itheima.dao;

import com.itheima.bean.Items;

import java.util.List;

public interface ItemsDao {
    List<Items> finAll();

    int save(Items items);
}
