package br.com.bgvit.billingcompany.core.service;

import br.com.bgvit.billingcompany.core.dto.DebtDTO;
import br.com.bgvit.billingcompany.core.entity.DebtEntity;
import br.com.bgvit.billingcompany.core.mapper.DebtMapper;
import br.com.bgvit.billingcompany.core.repository.DebtRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DebtService {

    @Autowired
    DebtRepository debtRepository;

    public DebtEntity save(DebtEntity debt) {
        return debtRepository.save(debt);
    }

    public List<DebtDTO> findDebitsByBorrowerCpf(String cpf) {
        List<DebtEntity> debtEntities = debtRepository.findDebtsByBorrowerCpf(cpf);
        return DebtMapper.toDebtDTO(debtEntities);
    }

    }
