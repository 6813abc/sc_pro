package com.example.sc_pro.service.Impl;

import com.example.sc_pro.dao.PointDao;
import com.example.sc_pro.entity.Point;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author cyg
 * @date 2021/9/7 10:45
 **/
@Service
@Transactional
public class PointService {

    @Autowired
    private PointDao pointDao;

    public String addPoint(Point point) {
        pointDao.save(point);
        return "添加成功";
    }

    public String deleteById(String pointId) {
        pointDao.deleteById(pointId);
        return "删除成功";
    }

    public Point findById(String pointId) {
        return pointDao.findById(pointId).get();
    }
}
