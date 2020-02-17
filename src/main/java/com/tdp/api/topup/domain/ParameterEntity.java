package com.tdp.api.topup.domain;

public class ParameterEntity {

    private Long parametersId;

    private String concept;

    private String parametersCode;

    private String parametersName;

    private String description;

    private Integer valueNumber;

    private Double valueDecimal;

    public Long getParametersId() {
        return parametersId;
    }

    public void setParametersId(Long parametersId) {
        this.parametersId = parametersId;
    }

    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    public String getParametersCode() {
        return parametersCode;
    }

    public void setParametersCode(String parametersCode) {
        this.parametersCode = parametersCode;
    }

    public String getParametersName() {
        return parametersName;
    }

    public void setParametersName(String parametersName) {
        this.parametersName = parametersName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getValueNumber() {
        return valueNumber;
    }

    public void setValueNumber(Integer valueNumber) {
        this.valueNumber = valueNumber;
    }

    public Double getValueDecimal() {
        return valueDecimal;
    }

    public void setValueDecimal(Double valueDecimal) {
        this.valueDecimal = valueDecimal;
    }
}
