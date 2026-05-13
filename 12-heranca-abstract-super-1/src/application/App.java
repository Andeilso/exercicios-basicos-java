package application;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        List<Pessoa> listaDePessoa = new ArrayList<>();

        System.out.print("Insira o número de contribuintes: ");
        int numeroDeContribuintes = scanner.nextInt();
        scanner.nextLine(); // Limpar

        for(int i = 1; i <= numeroDeContribuintes; i++){
            System.out.println("Dados do contribuinte #" + i + ":");
            System.out.print("Pessoa Fisica ou Pessoa Juridica (f/j)? ");
            char pessoaFisicaOuJuridica = scanner.nextLine().charAt(0);

            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Renda anual: ");
            Double rendaAnual = scanner.nextDouble();

            if(pessoaFisicaOuJuridica == 'f'){
                System.out.print("Gastos com saúde: ");
                Double gastosComSaude = scanner.nextDouble();
                scanner.nextLine(); // Limpar

                listaDePessoa.add(new PessoaFisica(nome, rendaAnual, gastosComSaude));
            } else if(pessoaFisicaOuJuridica == 'j'){
                System.out.print("Numero de funcionários: ");
                int numeroDeFuncionarios = scanner.nextInt();
                scanner.nextLine(); // Limpar

                listaDePessoa.add(new PessoaJuridica(nome, rendaAnual, numeroDeFuncionarios));
            } else {
                System.out.println("Código inválido.");
            }
        }

        Double totalDosImpostos = 0.0;

        System.out.println();
        System.out.println("Impostos pagos:");
        for(Pessoa pessoa : listaDePessoa){
            totalDosImpostos += pessoa.impostosPagos();

            System.out.printf("%s: $ %.2f%n", pessoa.getNome(), pessoa.impostosPagos());
        }

        System.out.println();
        System.out.printf("Total de impostos: $ %.2f%n", totalDosImpostos);
    }
}
