package com.example.sc_pro.controller;

import com.example.sc_pro.entity.Point;
import com.example.sc_pro.service.Impl.PointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author cyg
 * @date 2021/9/7 10:46
 **/
@RestController
@RequestMapping("/point")
public class PointController {

    @Autowired
    private PointService pointService;

    @PostMapping("/save")
    String addPoint(@RequestBody Point point) {
        return pointService.addPoint(point);
    }

    @DeleteMapping("/del/{id}")
    String deleteById(@PathVariable String id) {
        return pointService.deleteById(id);
    }

    @GetMapping("/get/{id}")
    Point findById(@PathVariable String id) {
        return pointService.findById(id);
    }
}
