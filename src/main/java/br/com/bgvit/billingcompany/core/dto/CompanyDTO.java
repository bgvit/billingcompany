package br.com.bgvit.billingcompany.core.dto;

import br.com.bgvit.billingcompany.core.entity.PaymentTypeEntity;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class CompanyDTO {

    public CompanyDTO(String fantasyName) {
        this.fantasyName = fantasyName;
    }

    @Getter
    @Setter
    private String fantasyName;

    @Getter
    @Setter
    private Integer companyId;

    @Getter
    @Setter
    private List<PaymentTypeDTO> paymentTypesDTO;
}