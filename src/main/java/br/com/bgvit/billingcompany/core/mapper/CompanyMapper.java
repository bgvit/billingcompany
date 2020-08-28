package br.com.bgvit.billingcompany.core.mapper;

import br.com.bgvit.billingcompany.core.dto.CompanyDTO;
import br.com.bgvit.billingcompany.core.dto.PaymentTypeDTO;
import br.com.bgvit.billingcompany.core.entity.CompanyEntity;
import br.com.bgvit.billingcompany.core.entity.PaymentTypeEntity;

import java.util.ArrayList;
import java.util.List;

public class CompanyMapper {
    public static List<CompanyDTO> toCompaniesDTO(List<CompanyEntity> companies) {
        List<CompanyDTO> CompaniesDTO = new ArrayList<CompanyDTO>();

        for (CompanyEntity company : companies) {
            CompaniesDTO.add(new CompanyDTO(company.getFantasyName())
            );
        }
        return CompaniesDTO;
    }

    public static CompanyDTO toCompanyDTO(CompanyEntity company) {

        CompanyDTO companyDTO = new CompanyDTO(company.getFantasyName());

        List<PaymentTypeDTO> paymentTypesDTO = new ArrayList<>();

        for (PaymentTypeEntity paymentType : company.getPaymentTypesEntities()) {
            paymentTypesDTO.add(new PaymentTypeDTO(paymentType.getDescription(),paymentType.getValue(),paymentType.getType()));
        }
        companyDTO.setPaymentTypesDTO(paymentTypesDTO);

        return companyDTO;
    }
}
