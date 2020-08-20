package br.com.bgvit.billingcompany.core.controller;

import br.com.bgvit.billingcompany.core.entity.CompanyEntity;
import br.com.bgvit.billingcompany.core.service.CompanyService;
import br.com.bgvit.billingcompany.core.service.DebtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping
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

    @GetMapping("/debts/{companyId}/{cpf}")
    public ModelAndView getDebtsByBorrowerCpf(@PathVariable("cpf") String cpf,
                                              @PathVariable("companyId") Integer companyId){
        ModelAndView mv = new ModelAndView("/list-all-debts.html");
        mv.addObject();
      return mv;
    }
}
