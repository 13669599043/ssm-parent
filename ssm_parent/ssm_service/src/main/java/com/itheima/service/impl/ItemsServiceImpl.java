package com.itheima.service.impl;

import com.itheima.bean.Items;
import com.itheima.dao.ItemsDao;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ItemsServiceImpl implements ItemsService {
    @Autowired
    private ItemsDao itemsDao;
    public List<Items> finAll() {
        return itemsDao.finAll();
    }

    public int save(Items items) {
        return itemsDao.save(items);
    }
}
