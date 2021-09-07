package com.example.sc_pro.dao;

import com.example.sc_pro.entity.Point;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author cyg
 * @date 2021/9/7 10:43
 **/
@Repository
public interface PointDao extends MongoRepository<Point, String> {

    void deleteById(String pointId);
}
