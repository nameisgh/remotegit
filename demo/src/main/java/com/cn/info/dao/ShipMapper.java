package com.cn.info.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import com.cn.info.pojo.Ship;
import java.util.*;

/**
 * Created by GH on 2017/5/10.
 */
public interface ShipMapper {

    //查询获取所有船舶信息
    @Select("select * from ship")
    List<Ship> findAll();
    @Insert("insert into ship(indexs,type,port,level,district,length,width,height,grosston,deadweight,enginetype,enginepower,builddate,factory,dealdate,predict) values(#{index},#{type},#{port},#{level},#{district},#{length},#{width},#{height},#{grosston},#{deadweight},#{enginetype},#{enginepower},#{builddate},#{factory},#{dealdate},#{predict})")
    void saveshipMessage(Ship ship);
}
