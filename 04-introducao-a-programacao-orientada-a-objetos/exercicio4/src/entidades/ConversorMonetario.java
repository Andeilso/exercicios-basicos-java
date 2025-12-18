package entidades;

public class ConversorMonetario {
    public static final double IOF = 0.06;

    public static double calcularValorDeCompraDoDolar(double cotacaoDoDolar, double quantidadeDeDolarAComprar){
        double valorDoDolarEmReais = cotacaoDoDolar * quantidadeDeDolarAComprar;
        return valorDoDolarEmReais + valorDoDolarEmReais * IOF;
    };
}
