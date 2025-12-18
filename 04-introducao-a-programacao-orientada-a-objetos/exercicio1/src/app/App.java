package app;

import entidades.Retangulo;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Retangulo r = new Retangulo();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com a altura e largura do retangulo (Exemplo 3 4):");
        r.height = scanner.nextDouble();
        r.width = scanner.nextDouble();
        
        System.out.printf("AREA = %.2f%n", r.area());
        System.out.printf("PERIMETRO = %.2f%n", r.perimetro());
        System.out.printf("DIAGONAL = %.2f%n", r.diagonalDoRetangulo());

        scanner.close();
    }
}
