package br.com.bgvit.billingcompany.core.service;

import br.com.bgvit.billingcompany.core.dto.DebtDTO;
import br.com.bgvit.billingcompany.core.entity.DebtEntity;
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
        return debtToDebtDTO(debtRepository.findDebitsByBorrowerCpf(cpf));
    }

    public List<DebtDTO> debtToDebtDTO(List<DebtEntity> debts) {
        List<DebtDTO> debtsDTO = new ArrayList<DebtDTO>();

        for (DebtEntity debt : debts) {
            debtsDTO.add(new DebtDTO(debt.getBorrower().getName(),
                    debt.getCompany().getFantasyName(),
                    debt.getValue())
            );
        }

        return debtsDTO;
    }
}
