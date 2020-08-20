package br.com.bgvit.billingcompany.core.mapper;

import br.com.bgvit.billingcompany.core.dto.DebtDTO;
import br.com.bgvit.billingcompany.core.entity.DebtEntity;

import java.util.ArrayList;
import java.util.List;

public class DebtMapper {

    public static List<DebtDTO> toDebtDTO(List<DebtEntity> debts) {
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
