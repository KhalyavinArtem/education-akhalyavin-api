package com.example.educationakhalyavinapi.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "model")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Model {
    @Id
    private String id;
    private String name;
    private String comment;
    @CreatedDate
    private Date createAt;
    @LastModifiedDate
    private Date updateAt;
    private String creator;
    private String updater;
}
