package br.com.bgvit.billingcompany.core.service;

import br.com.bgvit.billingcompany.core.dto.CompanyDTO;
import br.com.bgvit.billingcompany.core.entity.CompanyEntity;
import br.com.bgvit.billingcompany.core.mapper.CompanyMapper;
import br.com.bgvit.billingcompany.core.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {

    @Autowired
    CompanyRepository companyRepository;

    public CompanyEntity save(CompanyEntity company) {
        return companyRepository.save(company);
    }

    public List<CompanyEntity> getCompanies() {
        return companyRepository.findAll();
    }

    public CompanyDTO getCompany(Integer id) {
        CompanyEntity companyEntity = companyRepository.getCompanyById(id);
        return CompanyMapper.toCompanyDTO(companyEntity);
    }


}
