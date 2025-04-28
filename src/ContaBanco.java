import java.math.BigDecimal;

public class ContaBanco {
    private Integer numero;
    private String agencia;
    private String nomeCliente;
    private Double saldo;

    public ContaBanco() {
    }

    public ContaBanco(Double saldo, String nomeCliente, String agencia, Integer numero) {
        this.saldo = saldo;
        this.nomeCliente = nomeCliente;
        this.agencia = agencia;
        this.numero = numero;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Olá " + nomeCliente + ", " +
                "obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + agencia + ", conta " + numero + " e " +
                "seu saldo no valor de " + saldo + " já está disponível para saque!";
    }
}
