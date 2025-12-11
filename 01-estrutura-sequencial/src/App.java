import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);



        // Exercicio 1
        int valor1, valor2, soma;

        System.out.println("Digite o primeiro valor:");
        valor1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o segundo valor:");
        valor2 = scanner.nextInt();
        scanner.nextLine();

        soma = valor1 + valor2;

        System.out.println("A soma de " + valor1 + " + " + valor2 + " é igual a " + soma);



        // Exercicio 2
        double pi, raio, area;
        pi = 3.14159;

        System.out.println("Digite o valor do raio:");
        raio = scanner.nextDouble();
        scanner.nextLine();

        area = pi * (raio * raio);

        System.out.println("A área do círculo de raio " + raio + " é igual a " + String.format("%.4f", area));



        // Exercicio 3
        int valorA, valorB, valorC, valorD, diferenca;

        System.out.println("Digite quatro valores inteiros divididos por espaços (exemplo: 2 5 7 9) e confirme com enter:");
        valorA = scanner.nextInt();
        valorB = scanner.nextInt();
        valorC = scanner.nextInt();
        valorD = scanner.nextInt();

        System.out.println();

        diferenca = (valorA * valorB - valorC * valorD);

        System.out.println("Diferença dos números é: " + diferenca);
        


        // Exercicio 4
        int funcionarioId, horasTrabalhadas;
        double salarioPorHora, salarioTotal;

        System.out.println("Digite o Id do Funcionário: ");
        funcionarioId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite as horas trabalhadas: ");
        horasTrabalhadas = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o  valor do salário ganhado por hora trabalhada: ");
        salarioPorHora = scanner.nextDouble();
        scanner.nextLine();

        salarioTotal = horasTrabalhadas * salarioPorHora;
        System.out.println("Number = " + funcionarioId);
        System.out.println("Salary = U$ " + String.format("%.2f", salarioTotal));



        // Exercicio 5
        int numeroDePecas1, numeroDePecas2;
        double valorUnitarioPeca1, valorUnitarioPeca2, valorTotal;

        System.out.println("Digite o código, a quantidade e o valor unitário da primeira peça (exemplo: 12 5 2.50):");
        numeroDePecas1 = scanner.nextInt();
        valorUnitarioPeca1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Digite o código, a quantidade e o valor unitário da segunda peça (exemplo: 12 5 2.50):");
        numeroDePecas2 = scanner.nextInt();
        valorUnitarioPeca2 = scanner.nextDouble();
        scanner.nextLine();

        valorTotal = ((numeroDePecas1 * valorUnitarioPeca1) + (numeroDePecas2 * valorUnitarioPeca2));

        System.out.println("VALOR A PAGAR: R$ " + String.format("%.2f", valorTotal));



        // Exercicio 6
        double valorA2, valorB2, valorC2;
        double areaDoTriangulo, areaDoCirculo, areaDoTrapezio, areaDoQuadrado, areaDoRetangulo;

        System.out.println("Digite os valores A, B e C separados por espaço (exemplo: 7.0 8.0 5.0);");
        valorA2 = scanner.nextDouble();
        valorB2 = scanner.nextDouble();
        valorC2 = scanner.nextDouble();

        areaDoTriangulo = (valorA2 * valorC2) / 2.0;
        areaDoCirculo = 3.14159 * (valorC2 * valorC2);
        areaDoTrapezio = ((valorA2 + valorB2) * valorC2) / 2.0;
        areaDoQuadrado = Math.pow(valorB2, 2.0);
        areaDoRetangulo = valorA2 * valorB2;

        System.out.println("TRIANGULO: " + String.format("%.3f", areaDoTriangulo));
        System.out.println("CIRCULO: " + String.format("%.3f", areaDoCirculo));
        System.out.println("TRAPEZIO: " + String.format("%.3f", areaDoTrapezio));
        System.out.println("QUADRADO: " + String.format("%.3f", areaDoQuadrado));
        System.out.println("RETANGULO: " + String.format("%.3f", areaDoRetangulo));
        
        scanner.close();
    }
}
