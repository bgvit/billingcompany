package br.com.bgvit.billingcompany.core.init;

import br.com.bgvit.billingcompany.core.dto.DebtDTO;
import br.com.bgvit.billingcompany.core.entity.BorrowerEntity;
import br.com.bgvit.billingcompany.core.entity.CompanyEntity;
import br.com.bgvit.billingcompany.core.entity.DebtEntity;
import br.com.bgvit.billingcompany.core.service.BorrowerService;
import br.com.bgvit.billingcompany.core.service.CompanyService;
import br.com.bgvit.billingcompany.core.service.DebtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Component
public class Init implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    BorrowerService borrowerService;

    @Autowired
    CompanyService companyService;

    @Autowired
    DebtService debtService;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {

//        ###### BORROWER ######

        BorrowerEntity borrower = new BorrowerEntity();
        borrower.setName("Carla");
        borrower.setCpf("11111111111111");
        borrowerService.save(borrower);

        BorrowerEntity borrower2 = new BorrowerEntity();
        borrower2.setName("Luiz");
        borrower2.setCpf("2222222222222");
        borrowerService.save(borrower2);

        BorrowerEntity borrower3 = new BorrowerEntity();
        borrower3.setName("Carlos");
        borrower3.setCpf("333333333333333");
        borrowerService.save(borrower3);

//        ###### COMPANIES ######

        CompanyEntity company = new CompanyEntity();
        company.setFantasyName("Lojas Renner");
        companyService.save(company);

        CompanyEntity company2 = new CompanyEntity();
        company2.setFantasyName("Lojas Americanas");
        companyService.save(company2);

        CompanyEntity company3 = new CompanyEntity();
        company3.setFantasyName("Zizane");
        companyService.save(company3);

//        ###### DEBTS ######

        DebtEntity debt = new DebtEntity();
        debt.setBorrower(borrower);
        debt.setCompany(company);
        debt.setValue(new BigDecimal("1000"));
        debtService.save(debt);

        DebtEntity debt2 = new DebtEntity();
        debt2.setBorrower(borrower);
        debt2.setCompany(company2);
        debt2.setValue(new BigDecimal("1200"));
        debtService.save(debt2);

        DebtEntity debt3 = new DebtEntity();
        debt3.setBorrower(borrower2);
        debt3.setCompany(company2);
        debt3.setValue(new BigDecimal("1800"));
        debtService.save(debt3);

        DebtEntity debt4 = new DebtEntity();
        debt4.setBorrower(borrower3);
        debt4.setCompany(company3);
        debt4.setValue(new BigDecimal("1700"));
        debtService.save(debt4);

//        ###### TESTS ######
        List<DebtDTO> teste = new ArrayList<DebtDTO>();
        teste = debtService.findDebitsByBorrowerCpf("11111111111111");
        System.out.println(teste);

    }
}
