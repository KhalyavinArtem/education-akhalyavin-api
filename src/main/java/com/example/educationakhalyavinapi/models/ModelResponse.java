package com.example.educationakhalyavinapi.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class ModelResponse {

    private String id;
    private String name;
    private String comment;
    private Date createAt;
    private Date updateAt;
    private String creator;
    private String updater;
}
