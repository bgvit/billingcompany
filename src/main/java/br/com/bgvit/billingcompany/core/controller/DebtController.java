package br.com.bgvit.billingcompany.core.controller;

import br.com.bgvit.billingcompany.core.service.CompanyService;
import br.com.bgvit.billingcompany.core.service.DebtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/debts")
public class DebtController {

    @Autowired
    DebtService debtService;

    @Autowired
    CompanyService companyService;

    @GetMapping
    public ModelAndView getCompanies() {
        ModelAndView mv = new ModelAndView("/index");
        mv.addObject("companies", companyService.getCompanies());
        return mv;
    }

    @PostMapping
    public ModelAndView getDebtsByBorrowerCpf(@RequestBody String cpf){
        String cpf_renew = cpf.replace("cpf=","");
        ModelAndView mv = new ModelAndView("debts/list-all-debts");
        mv.addObject("debts", debtService.findDebitsByBorrowerCpf(cpf_renew));
      return mv;
    }
}
