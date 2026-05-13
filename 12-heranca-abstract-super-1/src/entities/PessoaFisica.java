package entities;

public class PessoaFisica extends Pessoa{
    private Double gastosComSaude;

    public PessoaFisica(){
        super();
    }

    public PessoaFisica(String nome, Double rendaAnual, Double gastosComSaude){
        super(nome, rendaAnual);
        this.gastosComSaude = gastosComSaude;
    }

    public Double getGastosComSaude(){
        return gastosComSaude;
    }

    public void setGastosComSaude(Double gastosComSaude){
        this.gastosComSaude = gastosComSaude;
    }

    @Override
    public Double impostosPagos() {
        Double impostosPagos = 0.0;
        if(super.getRendaAnual() < 20000.00){
            impostosPagos = (super.getRendaAnual()/100.0) * 15.0;
        } else {
            impostosPagos = (super.getRendaAnual()/100.0) * 25.0;
        }

        if(gastosComSaude > 0.0){
            impostosPagos -= (gastosComSaude/2.0);
        }

        return impostosPagos;
    }
    
}
