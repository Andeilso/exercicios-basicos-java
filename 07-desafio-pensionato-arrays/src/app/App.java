package app;

import entidades.Aluno;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        Aluno[] quartoParaOsALunos = new Aluno[10];
        
        System.out.print("Quantos quartos serão alugados? ");
        int numeroDeQuartosAlugados = scanner.nextInt();
        scanner.nextLine();

        for(int i = 0; i < numeroDeQuartosAlugados; i++){
            System.out.println("Aluguel #" + (i+1) + ":");
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();
            System.out.print("Quarto: ");
            int numeroDoQuarto = scanner.nextInt();
            scanner.nextLine();
            System.out.println();

            if(quartoParaOsALunos[numeroDoQuarto] == null){
                quartoParaOsALunos[numeroDoQuarto] = new Aluno(nome, email);
            } else {
                System.out.println("Quarto já alugado, tente outro.");
                 i--;
            }
        }

        System.out.println("Quartos ocupados:");
        for(int i = 0; i < quartoParaOsALunos.length; i++){
            if(quartoParaOsALunos[i] != null){
                System.out.println(i + ": " + quartoParaOsALunos[i].getNome() + ", " + quartoParaOsALunos[i].getEmail());
            }
        }
        scanner.close();
    }
}
