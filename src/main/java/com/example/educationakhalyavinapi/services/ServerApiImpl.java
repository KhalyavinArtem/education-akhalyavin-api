package com.example.educationakhalyavinapi.services;

import com.example.educationakhalyavinapi.exceptions.BadRequestException;
import com.example.educationakhalyavinapi.jsonPRC.ServerApi;
import com.example.educationakhalyavinapi.mappers.ModelMapper;
import com.example.educationakhalyavinapi.models.Model;
import com.example.educationakhalyavinapi.models.ModelRequest;
import com.example.educationakhalyavinapi.models.ModelResponse;
import com.example.educationakhalyavinapi.repositories.ModelRepository;
import com.googlecode.jsonrpc4j.spring.AutoJsonRpcServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;

import java.util.List;
import java.util.Random;

@Service
@AutoJsonRpcServiceImpl
@AllArgsConstructor
public class ServerApiImpl implements ServerApi {

    private ModelRepository modelRepository;
    private ModelMapper modelMapper;

    @Override
    @Transactional
    public ModelResponse create(ModelRequest modelRequest) throws BadRequestException {
        if (ObjectUtils.isEmpty(modelRequest)){
            throw new BadRequestException("modelRequest have not params");
        }
        Model model = modelMapper.toEntity(modelRequest);
        model.setCreator("Current user");
        model.setUpdater("current user");

        return modelMapper.toDto(modelRepository.insert(model));
    }

    @Override
    @Transactional
    public ModelResponse update(ModelRequest modelRequest) throws BadRequestException {
        if (ObjectUtils.isEmpty(modelRequest.getId())) {
            throw new BadRequestException("id can't be null");
        }
        Model model = modelRepository.findById(modelRequest.getId()).orElseThrow();
        model.setUpdater("current user" + new Random().nextInt());

        return modelMapper.toDto(modelRepository.save(model));

    }

    @Override
    @Transactional
    public void deleteById(String id) {
        modelRepository.deleteById(id);
    }

    @Override
    public ModelResponse findById(String id) {
        return modelRepository.findById(id)
                .map(modelMapper::toDto)
                .orElseThrow();

    }

    @Override
    public List<ModelResponse> findAll() {
        return modelMapper.toListDto(modelRepository.findAll());
    }
}
