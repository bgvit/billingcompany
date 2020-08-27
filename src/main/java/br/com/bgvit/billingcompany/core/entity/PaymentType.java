package br.com.bgvit.billingcompany.core.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@NoArgsConstructor
public class PaymentType implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    Long id;

    @Getter
    @Setter
    String description;

    @Getter
    @Setter
    BigDecimal value;

    @Getter
    @Setter
    String type;
}
