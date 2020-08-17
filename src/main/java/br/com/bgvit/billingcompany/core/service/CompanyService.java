package br.com.bgvit.billingcompany.core.service;

import br.com.bgvit.billingcompany.core.entity.CompanyEntity;
import br.com.bgvit.billingcompany.core.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {

    @Autowired
    CompanyRepository companyRepository;

    public CompanyEntity save(CompanyEntity company) {
        return companyRepository.save(company);
    }
}
