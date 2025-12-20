package entidades;

public class ContaBancaria {

    private static final double TAXA_DO_BANCO_PARA_SAQUES = 5.0;
    private final int numeroDaConta;
    private String nomeDoTitularDaConta;
    private double saldoDaConta;
    
    public ContaBancaria(int numeroDaConta, String nomeDoTitularDaConta){
        this.numeroDaConta = numeroDaConta;
        this.nomeDoTitularDaConta = nomeDoTitularDaConta;
        this.saldoDaConta = 0.0;
    };

    public ContaBancaria(int numeroDaConta, String nomeDoTitularDaConta, double depositoInicial){
        this.numeroDaConta = numeroDaConta;
        this.nomeDoTitularDaConta = nomeDoTitularDaConta;
        this.saldoDaConta = depositoInicial;
    };

    public int getNumeroDaConta(){
        return this.numeroDaConta;
    }

    public String getNomeDoTitularDaConta(){
        return nomeDoTitularDaConta;
    };
    
    public void setNomeDoTitularDaConta(String nomeDoTitularDaContaAtualizado){
        this.nomeDoTitularDaConta = nomeDoTitularDaContaAtualizado;
    };

    public double getSaldoDaConta(){
        return saldoDaConta;
    };
    
    public void realizarDepositoNaConta(double valorDoDeposito){
        this.saldoDaConta += valorDoDeposito;
    };

    public void realizarSaqueDaConta(double valorSacado){
        this.saldoDaConta -= (valorSacado + TAXA_DO_BANCO_PARA_SAQUES);
    };

    public String toString(){
        return "Conta: " + this.numeroDaConta + ", Titular: " + this.nomeDoTitularDaConta + ", Saldo: R$ " + String.format("%.2f", this.saldoDaConta);
    };
}
