package com.qf.pojo;


import lombok.Data;

@Data
public class Course {
    private Integer id;

    private String courseTitle;

    private Integer subjectId;

    private String courseDesc;

}