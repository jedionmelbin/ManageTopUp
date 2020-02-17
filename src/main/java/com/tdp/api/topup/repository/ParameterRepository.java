package com.tdp.api.topup.repository;

import com.tdp.api.topup.domain.ParameterEntity;
import com.tdp.api.topup.mapper.ParameterMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public class ParameterRepository {

    @Autowired
    private ParameterMapper parameterMapper;

    public List<ParameterEntity> findAll(HashMap<String, Object> parameters) {
        try {

            List<ParameterEntity> listAll = parameterMapper.findAll(parameters);

            return listAll;

        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        }
    }

}
