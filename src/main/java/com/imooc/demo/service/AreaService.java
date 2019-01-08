package com.imooc.demo.service;

import java.util.List;
import com.imooc.demo.entity.Area;

public interface AreaService {

    List<Area> queryAreaList();
    Area getAreaById(int areaId);
    boolean addArea(Area area);
    boolean modifyArea(Area area);
    boolean deleteArea(int areaId);

}
