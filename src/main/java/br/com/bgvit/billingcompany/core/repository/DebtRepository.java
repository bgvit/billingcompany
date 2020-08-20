package br.com.bgvit.billingcompany.core.repository;

import br.com.bgvit.billingcompany.core.entity.DebtEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DebtRepository extends JpaRepository<DebtEntity, Integer> {

    @Query("SELECT d FROM DebtEntity d LEFT JOIN FETCH d.borrower WHERE d.borrower.cpf = :cpf")
    List<DebtEntity> findDebtsByBorrowerCpf(@Param("cpf") String cpf);
}
