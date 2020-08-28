package br.com.bgvit.billingcompany.core.repository;

import br.com.bgvit.billingcompany.core.entity.PaymentTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentTypeRepository extends JpaRepository<PaymentTypeEntity, Integer> {
}
