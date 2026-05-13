package entidades;

public class Pessoa {
    public String nome;
    public int idade;
    public double altura;

    public Pessoa( String nome, int idade, double altura ){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    };

    public Pessoa( String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){
        return this.nome;
    };

    public int getIdade(){
        return this.idade;
    };

    public double getAltura(){
        return this.altura;
    };
}
