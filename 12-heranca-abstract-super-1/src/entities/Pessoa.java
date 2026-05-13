package entities;

public abstract class Pessoa {
    private String nome;
    private Double rendaAnual;

    public Pessoa(){
    }

    public Pessoa(String nome, Double rendaAnual){
        this.nome = nome;
        this.rendaAnual = rendaAnual;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(){
        this.nome = nome;
    }

    public Double getRendaAnual(){
        return this.rendaAnual;
    }

    public void setRendaAnual(){
        this.rendaAnual = rendaAnual;
    }

    public abstract Double impostosPagos();
}
