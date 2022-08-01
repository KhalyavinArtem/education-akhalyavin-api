package com.example.educationakhalyavinapi.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ModelRequest {
    private String id;
    private String name;
    private String comment;
}
