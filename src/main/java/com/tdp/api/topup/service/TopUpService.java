package com.tdp.api.topup.service;

import com.tdp.api.topup.domain.TopUpEntity;
import com.tdp.api.topup.repository.TopUpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopUpService {

    @Autowired
    private TopUpRepository topUpRepository;


    public List<TopUpEntity> findAll() {
        try {

            List<TopUpEntity> entityList = topUpRepository.findAll();
            return  entityList;

        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        }
    }
}
