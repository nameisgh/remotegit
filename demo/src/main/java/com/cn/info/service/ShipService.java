package com.cn.info.service;

import com.cn.info.pojo.Ship;

import java.util.List;

/**
 * Created by GH on 2017/5/10.
 */
public interface ShipService {
    //查找和获取所有船舶信息

    List<Ship> getAll();
    void saveshipMessage(Ship ship);
}
