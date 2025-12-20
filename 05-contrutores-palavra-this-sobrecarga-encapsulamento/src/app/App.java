package app;

import entidades.ContaBancaria;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int numeroDaConta;
        String nomeDoTitular;
        double deposito;

        System.out.println("Digite o numero da conta sem pontuação (Exemplo: 4569): ");
        numeroDaConta = scanner.nextInt();
        scanner.nextLine();
        System.out.println();

        System.out.println("Digite o nome do titular da conta: ");
        nomeDoTitular = scanner.nextLine();
        System.out.println();

        System.out.println("Vai fazer algum deposito inicial? (y/n): ");
        String simOuNao = scanner.nextLine();
        System.out.println();

        ContaBancaria contaBancaria;

        if(simOuNao.charAt(0) == 'y'){
            System.out.println("Digite o valor do deposito inicial: ");
            deposito = scanner.nextDouble();
            System.out.println();

            contaBancaria = new ContaBancaria( numeroDaConta, nomeDoTitular, deposito);
        } else {
            contaBancaria = new ContaBancaria(numeroDaConta, nomeDoTitular);
        };

        System.out.println("Dados da Conta: ");
        System.out.println(contaBancaria);
        System.out.println();
        
        System.out.println("Entre com valor do deposito: ");
        contaBancaria.realizarDepositoNaConta(scanner.nextDouble());
        System.out.println();
        
        System.out.println("Dados da conta Atualizado: ");
        System.out.println(contaBancaria);
        System.out.println();
        
        System.out.println("Entre com o valor de Saque: ");
        contaBancaria.realizarSaqueDaConta(scanner.nextDouble());
        System.out.println();
        
        System.out.println("Dados da conta atualizados: ");
        System.out.println(contaBancaria);
    }
}
