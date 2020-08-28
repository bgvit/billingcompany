package br.com.bgvit.billingcompany.core.repository;

import br.com.bgvit.billingcompany.core.entity.CompanyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CompanyRepository extends JpaRepository<CompanyEntity, Integer> {
    @Query("SELECT c FROM CompanyEntity c WHERE c.id = :id")
    CompanyEntity getCompanyById(Integer id);
}
