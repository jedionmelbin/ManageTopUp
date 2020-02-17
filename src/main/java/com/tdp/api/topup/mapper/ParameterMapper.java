package com.tdp.api.topup.mapper;

import com.tdp.api.topup.domain.ParameterEntity;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.StatementType;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface ParameterMapper {

    @Select(value = "{CALL }")
    @Results({
            @Result(column = "", property = ""),
            @Result(column = "", property = "")
    })
    @Options(statementType = StatementType.CALLABLE)
    List<ParameterEntity> findAll(HashMap<String, Object> parameters);
}
