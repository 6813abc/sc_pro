package com.example.sc_pro.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 模型
 *
 * @date 2021/9/7 10:40
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Model {

    @Id
    private Long id;
    private String name;
    private String path;
    private Integer status;
    private Integer apply;
}
