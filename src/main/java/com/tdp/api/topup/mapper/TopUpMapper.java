package com.tdp.api.topup.mapper;

import com.tdp.api.topup.domain.TopUpEntity;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.StatementType;

import java.util.List;

@Mapper
public interface TopUpMapper {

    @Select("SELECT recharge_id, amount FROM recharge")
    @Results({
            @Result(property = "topUpId", column = "recharge_id"),
            @Result(property = "amount", column = "amount")
    })
    List<TopUpEntity> listAllTopUp();

    @Insert("INSERT INTO recharge () VALUES (#{},#{})")
    TopUpEntity createTopUp(TopUpEntity entity);

    @Insert(value = {})
    @Options(statementType = StatementType.CALLABLE)
    void runTheProcedure(TopUpEntity entity);
}
