package br.com.bgvit.billingcompany.core.service;

import br.com.bgvit.billingcompany.core.entity.BorrowerEntity;
import br.com.bgvit.billingcompany.core.repository.BorrowerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BorrowerService {

    @Autowired
    BorrowerRepository borrowerRepository;

    public BorrowerEntity save(BorrowerEntity borrower) {
        return borrowerRepository.save(borrower);
    }

    public BorrowerEntity findByCpf(String cpf) {
        return borrowerRepository.findByCpf(cpf);
    }

}
