package br.com.bgvit.billingcompany.core.controller;

import br.com.bgvit.billingcompany.core.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    CompanyService companyService;

    @GetMapping("/paymentsTypes/{id}")
    public ModelAndView showPaymentsTypes(@PathVariable("id") Integer id) {
        ModelAndView mv = new ModelAndView("companies/list-payments-types");
        mv.addObject("company", companyService.getCompany(id));
        return mv;
    }

}
