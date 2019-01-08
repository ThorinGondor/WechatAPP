package com.imooc.demo.dao;

import com.imooc.demo.entity.Area;

import java.util.List;

/****
 * 此处为增删改查的方法
 */
public interface AreaDao {

    List<Area> queryArea();

    Area queryAreaById(int areaId);

    int insertArea(Area area);

    int updateArea(Area area);

    int deleteArea(int AreaId);
}
