package entidades;

public class Empregado {
    public String nome;
    public double salarioBruto;
    public double imposto;

    public double calcularSalarioLiquido(){
        return salarioBruto - imposto;
    };

    public void aumentarSalario(double aumentoEmPorcentagem){
        this.salarioBruto += ( (salarioBruto/100) * aumentoEmPorcentagem );
    };

}
