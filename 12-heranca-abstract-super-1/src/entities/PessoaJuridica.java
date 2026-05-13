package entities;

public class PessoaJuridica extends Pessoa{
    private int numeroDeFuncionarios;

    public PessoaJuridica(){
        super();
    }

    public PessoaJuridica(String nome, Double rendaAnual, int numeroDeFuncionarios){
        super(nome, rendaAnual);
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }

    public int getNumeroDeFuncionarios(){
        return numeroDeFuncionarios;
    }

    public void setNumeroDeFuncionarios(int numeroDeFuncionarios){
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }

    @Override
    public Double impostosPagos() {
        Double impostosPagos = 0.0;

        if(numeroDeFuncionarios <=10){
            impostosPagos = (super.getRendaAnual()/100.0) * 16.0;
        } else {
            impostosPagos = (super.getRendaAnual()/100.0) * 14.0;
        }

        return impostosPagos;
    }
}
