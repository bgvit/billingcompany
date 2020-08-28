package br.com.bgvit.billingcompany.core.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@ToString
public class DebtDTO {

    public DebtDTO(String borrowerName, String companyFantasyName, BigDecimal value, Integer companyId) {
        this.borrowerName = borrowerName;
        this.companyFantasyName = companyFantasyName;
        this.debtValue = value;
        this.companyId = companyId;
    }

    @Getter
    @Setter
    private String borrowerName;

    @Getter
    @Setter
    private String companyFantasyName;

    @Getter
    @Setter
    private BigDecimal debtValue;

    @Getter
    @Setter
    private Integer companyId;
}
