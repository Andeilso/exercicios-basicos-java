
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);



        //  Exercicio 1
        int numero;

        System.out.println("Digite um número inteiro:");
        numero = scanner.nextInt();

        if( numero > 0 ) {
            System.out.println("O número é positivo.");
        } else if ( numero < 0) {
            System.out.println("O número é negativo.");
        } else if ( numero == 0 ) {
            System.out.println("O número é zero.");
        }


        
        // Exercicio 2
        int numeroImparOuPar;

        System.out.println("Digite um número inteiro:");
        numeroImparOuPar = scanner.nextInt();

        if( numeroImparOuPar % 2 == 0 ){
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }



        // Exercicio 3
        int valorA, valorB;
        System.out.println("Digite o valor A e B divididos por espaço (exemplo: 5 10): ");
        valorA = scanner.nextInt();
        valorB = scanner.nextInt();

        if( valorB > valorA && valorB % valorA == 0 ){
            System.out.printf("%d é multiplo de %d.", valorB, valorA);
        } else if(valorA > valorB && valorA % valorB == 0) {
            System.out.printf("%d é multiplo de %d.", valorA, valorB);
        } else {
            System.out.println("Nenhum dos valores é múltiplo do outro.");
        }



        // Exercicio 4
        int horaInicial, horaFinal, totalDeHorasJogadas;

        System.out.println("Digite a hora que começou a jogar e a hora que parou de jogar, entre 0 e 23, separado por espaço (exemplo: 16 2): ");
        horaInicial = scanner.nextInt();
        horaFinal = scanner.nextInt();

        if( horaInicial < horaFinal ){
            totalDeHorasJogadas = horaFinal - horaInicial;
            System.out.printf("O JOGO DUROU %d HORA(S)", totalDeHorasJogadas);
        } else if(horaInicial > horaFinal) {
            totalDeHorasJogadas = (24 + horaFinal) - horaInicial;
            System.out.printf("O JOGO DUROU %d HORA(S)", totalDeHorasJogadas);
        } else {
            System.out.printf("O JOGO DUROU 24 HORA(S)");
        }



        // Exercicio 5
        int idDoProduto, quantidadeDoProduto;
        double totalAPagar;

        System.out.println("Digite o código do produto e a quantidade desejada, separados por espaço (exemplo: 1 2): ");
        idDoProduto = scanner.nextInt();
        quantidadeDoProduto = scanner.nextInt();

        switch( idDoProduto ) {
            case 1 ->{
                totalAPagar = quantidadeDoProduto * 4.00;
                System.out.printf("Total a pagar: R$ %.2f", totalAPagar);
            }
            case 2 -> {
                totalAPagar = quantidadeDoProduto * 4.50;
                System.out.printf("Total a pagar: R$ %.2f", totalAPagar);
            }
            case 3 -> {
                totalAPagar = quantidadeDoProduto * 5.00;
                System.out.printf("Total a pagar: R$ %.2f", totalAPagar);
            }
            case 4 -> {
                totalAPagar = quantidadeDoProduto * 2.00;
                System.out.printf("Total a pagar: R$ %.2f", totalAPagar);
            }
            case 5 -> {
                totalAPagar = quantidadeDoProduto * 1.50;
                System.out.printf("Total a pagar: R$ %.2f", totalAPagar);
            }
            default -> {
                System.out.printf("Código de produto inválido.");
            }
        }



        // Exercicio 6
        double valor;

        System.out.println("Digite um valor entre 0 e 100:");
        valor = scanner.nextDouble();

        if( valor >= 0 && valor <= 25){
            System.out.println("Intervalo [0, 25]");
        } else if( valor > 25 && valor <= 50){
            System.out.println("Intervalo [25, 50]");
        } else if( valor > 50 && valor <= 75){
            System.out.println("Intervalo [50, 75]");
        } else if( valor > 75 && valor <= 100){
            System.out.println("Intervalo [75, 100]");
        } else {
            System.out.println("Fora de intervalo");
        }



        // Exercicio 7
        double x, y;
        System.out.println("Digite as coordenadas X e Y separadas por espaço (exemplo: 3.0 -2.5): ");
        x = scanner.nextDouble();
        y = scanner.nextDouble();

        if(x == 0 && y == 0){
            System.out.println("Origem");
        } else if(x == 0){
            System.out.println("Eixo X");
        } else if(y == 0){
            System.out.println("Eixo Y");
        } else if(x > 0 && y > 0){
            System.out.println("Q1");
        } else if(x < 0 && y > 0){
            System.out.println("Q2");
        } else if(x < 0 && y < 0){
            System.out.println("Q3");
        } else if(x > 0 && y < 0){
            System.out.println("Q4");
        }



        // Exercicio 8
        double salario, impostoDeRenda;

        System.out.println("Digite o salário do funcionário:");
        salario = scanner.nextDouble();
        
        if( salario >= 0 && salario <= 2000.00){
            System.out.println("Isento");
        } else if ( salario > 2000.00 && salario <= 3000.00 ){
            impostoDeRenda = (salario - 2000.00) * 0.08;
            System.out.println("R$ " + String.format("%.2f", impostoDeRenda));
        } else if ( salario > 3000.00 && salario <= 4500.00){
            impostoDeRenda = (1000.00 * 0.08) + ((salario - 3000.00) * 0.18);
            System.out.println("R$ " + String.format("%.2f", impostoDeRenda));
        } else if ( salario > 4500.00 ){
            impostoDeRenda = (1000.00 * 0.08) + ( 1500.00 * 0.18) + ((salario - 4500.00) * 0.28);
            System.out.println("R$ " + String.format("%.2f", impostoDeRenda));
        } else {
            System.out.println("Salário inválido.");
        }

        scanner.close();
    }
}
