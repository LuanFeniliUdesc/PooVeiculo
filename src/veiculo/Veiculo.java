package veiculo;

import java.math.BigDecimal;
import java.util.Date;

public class Veiculo {
    private String modelo;
    private String cor;
    private Date ano;
    private BigDecimal KM;

    public Veiculo(Date ano, String modelo, String cor, BigDecimal KM) {
        this.ano = ano;
        this.modelo = modelo;
        this.cor = cor;
        this.KM = KM;
    }

    public Date getAno() {
        return ano;
    }

    public void setAno(Date ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public BigDecimal getKM() {
        return KM;
    }

    public void setKM(BigDecimal KM) {
        this.KM = KM;
    }

    public void verificarManutencao() {
        if (KM.compareTo(new BigDecimal("25000")) < 0) {
            System.out.println("Tudo ok!");
        } else if (KM.compareTo(new BigDecimal("75000")) <= 0) {
            System.out.println("Realizar revisão parcial!");
        } else {
            System.out.println("Realizar revisão completa!");
        }
    }

    public void mudarCor(String cor) {
        this.cor = cor;
    }

    public void exibirCor() {
        System.out.println("A cor do veículo é: " + cor);
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                ", ano=" + ano +
                ", KM=" + KM +
                '}';
    }
}
