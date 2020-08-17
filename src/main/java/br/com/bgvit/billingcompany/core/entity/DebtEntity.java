package br.com.bgvit.billingcompany.core.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@NoArgsConstructor
public class DebtEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Integer id;

    @Getter
    @Setter
    private BigDecimal value;

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "company_id")
    CompanyEntity company;

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "borrower_id")
    BorrowerEntity borrower;

}
