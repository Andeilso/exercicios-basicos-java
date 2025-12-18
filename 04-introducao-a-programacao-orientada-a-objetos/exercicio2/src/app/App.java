package app;

import entidades.Empregado;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Empregado empregado = new Empregado();

        System.out.println("Digite os dados do funcionario.");
        System.out.println("Digite o nome:");
        empregado.nome = scanner.nextLine();
        System.out.println();
        
        System.out.println("Digite o Salário bruto:");
        empregado.salarioBruto = scanner.nextDouble();
        System.out.println();

        System.out.println("Digite o imposto devido:");
        empregado.imposto = scanner.nextDouble();
        System.out.println();
        
        System.out.println();
        System.out.println("Empregado: " + empregado.nome + ", $ " + String.format("%.2f", empregado.calcularSalarioLiquido()));
        
        System.out.println();
        System.out.println("Qual a porcentagem desejada para aumentar o salário: ");
        empregado.aumentarSalario(scanner.nextDouble());
        
        System.out.println();
        System.out.println("Dados atualizados: " + empregado.nome + ", $ " + String.format("%.2f", empregado.calcularSalarioLiquido()));
        
        scanner.close();
    }
}
