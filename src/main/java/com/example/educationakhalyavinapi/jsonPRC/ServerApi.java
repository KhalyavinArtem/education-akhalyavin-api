package com.example.educationakhalyavinapi.jsonPRC;

import com.example.educationakhalyavinapi.exceptions.BadRequestException;
import com.example.educationakhalyavinapi.models.ModelRequest;
import com.example.educationakhalyavinapi.models.ModelResponse;
import com.googlecode.jsonrpc4j.JsonRpcParam;
import com.googlecode.jsonrpc4j.JsonRpcService;

import java.util.List;

@JsonRpcService("/api")
public interface ServerApi {

    ModelResponse create(@JsonRpcParam(value = "modelRequest")ModelRequest modelRequest) throws BadRequestException;
    ModelResponse update(@JsonRpcParam(value = "modelRequest")ModelRequest modelRequest) throws BadRequestException;
    void deleteById(@JsonRpcParam(value = "id") String id);
    ModelResponse findById(@JsonRpcParam(value = "id") String id);
    List<ModelResponse> findAll();
}
