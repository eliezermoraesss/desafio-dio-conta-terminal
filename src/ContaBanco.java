import java.math.BigDecimal;

public class ContaBanco {
    private Integer numero;
    private String agencia;
    private String nomeCliente;
    private BigDecimal saldo;

    public ContaBanco() {
    }

    public ContaBanco(BigDecimal saldo, String nomeCliente, String agencia, Integer numero) {
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

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }
}
