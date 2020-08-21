package br.com.bgvit.billingcompany.core.dto;

public class CompanyDTO {

    public CompanyDTO(String fantasyName){
        this.fantasyName = fantasyName;
    }

    private String fantasyName;

    public String getFantasyName() {
        return fantasyName;
    }

    public void setFantasyName(String fantasyName) {
        this.fantasyName = fantasyName;
    }
}
//TODO: Implementar paymentType: Descrição, Tipo de pagamento = Porcentagem, Parcelado, Valor_calculado