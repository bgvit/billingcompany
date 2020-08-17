package br.com.bgvit.billingcompany.core.repository;

import br.com.bgvit.billingcompany.core.entity.BorrowerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BorrowerRepository extends JpaRepository<BorrowerEntity, Integer> {
    BorrowerEntity findByCpf(String cpf);
}
