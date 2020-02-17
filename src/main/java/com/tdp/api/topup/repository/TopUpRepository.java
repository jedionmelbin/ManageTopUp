package com.tdp.api.topup.repository;

import com.tdp.api.topup.domain.TopUpEntity;
import com.tdp.api.topup.mapper.TopUpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TopUpRepository {

    private TopUpMapper topUpMapper;

    public List<TopUpEntity> findAll() {
        try {

            List<TopUpEntity> entityList = topUpMapper.listAllTopUp();
            return  entityList;

        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        }
    }
}
