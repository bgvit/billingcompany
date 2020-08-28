package br.com.bgvit.billingcompany.core.service;

import br.com.bgvit.billingcompany.core.entity.PaymentTypeEntity;
import br.com.bgvit.billingcompany.core.repository.PaymentTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentTypeService {

    @Autowired
    PaymentTypeRepository paymentTypeRepository;

    public PaymentTypeEntity save(PaymentTypeEntity paymentTypeEntity){
        return paymentTypeRepository.save(paymentTypeEntity);
    }
}
