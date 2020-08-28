package br.com.bgvit.billingcompany.core.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

public class PaymentTypeDTO {

    public PaymentTypeDTO(String description, BigDecimal value, String type){
        this.description = description;
        this.value = value;
        this.type = type;
    }

    @Getter
    @Setter
    private String description;

    @Getter
    @Setter
    private BigDecimal value;

    @Getter
    @Setter
    private String type;
}
