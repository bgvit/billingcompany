package br.com.bgvit.billingcompany.core.mapper;

import br.com.bgvit.billingcompany.core.dto.CompanyDTO;
import br.com.bgvit.billingcompany.core.entity.CompanyEntity;

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
}
