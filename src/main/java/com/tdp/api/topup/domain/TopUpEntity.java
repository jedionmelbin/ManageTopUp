package com.tdp.api.topup.domain;

public class TopUpEntity {

    private Long topUpId;

    private Double amount;

    public Long getTopUpId() {
        return topUpId;
    }

    public void setTopUpId(Long topUpId) {
        this.topUpId = topUpId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
