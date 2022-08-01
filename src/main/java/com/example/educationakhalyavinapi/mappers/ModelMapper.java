package com.example.educationakhalyavinapi.mappers;

import com.example.educationakhalyavinapi.models.Model;
import com.example.educationakhalyavinapi.models.ModelRequest;
import com.example.educationakhalyavinapi.models.ModelResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ModelMapper extends CommonMapper<ModelRequest, Model, ModelResponse> {
}
