package com.example.educationakhalyavinapi.mappers;

import java.util.List;

interface CommonMapper<Request, Model, Response> {

    Model toEntity(Request request);
    Response toDto(Model model);
    List<Response> toListDto(List<Model> models);
}
