package br.com.bgvit.billingcompany.core.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@NoArgsConstructor
public class CompanyEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Integer id;

    @Getter
    @Setter
    private String fantasyName;

    @OneToMany
    @Getter
    @Setter
    List<PaymentTypeEntity> paymentTypesEntities;
}
