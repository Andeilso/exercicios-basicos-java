package app;

import entidades.ConversorMonetario;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a cotação do dolar?: ");
        double cotacaoDoDolar = scanner.nextDouble();
        System.out.println();
        
        System.out.println("Quantos dolares você quer comprar?: ");
        double quantidadeDeDolar = scanner.nextDouble();
        System.out.println();

        System.out.printf("Valor que deve ser pago em reais = R$ %.2f%n", ConversorMonetario.calcularValorDeCompraDoDolar(cotacaoDoDolar, quantidadeDeDolar) );
    }
}
