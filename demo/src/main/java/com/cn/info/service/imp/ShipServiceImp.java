package com.cn.info.service.imp;

import com.cn.info.dao.ShipMapper;
import com.cn.info.pojo.Ship;
import com.cn.info.service.ShipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by GH on 2017/5/10.
 */
@Service("ShipService")
public class ShipServiceImp implements ShipService {


    //自动注入Mapper
    @Autowired
    private ShipMapper shipmapper;

    @Override
    public List<Ship> getAll(){
        return shipmapper.findAll();
    }
    public void saveshipMessage(Ship ship){
        shipmapper.saveshipMessage(ship);
    }



}
