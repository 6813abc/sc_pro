package com.example.sc_pro.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

/**
 * 点位
 *
 * @date 2021/9/7 10:38
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Point {

    @Id
    private String id;
    @Field("unit_id")
    private String unitId;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date time;
    private Double value;
    private Integer granularity;
    private String label;
}
