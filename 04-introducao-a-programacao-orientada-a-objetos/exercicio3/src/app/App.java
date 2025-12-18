package app;

import entidades.Estudante;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Estudante estudante = new Estudante();

        System.out.println("Digite o nome do aluno/estudante:");
        estudante.nome = scanner.nextLine();
        System.out.println();
        
        System.out.println("Digite a primeira nota entre 0 e 30:");
        estudante.nota1 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println();
        
        System.out.println("Digite a segunda nota entre 0 e 35:");
        estudante.nota2 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println();
        
        System.out.println("Digite a terceira nota entre 0 e 35:");
        estudante.nota3 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println();

        estudante.estudanteAprovadoOuReprovado();
    }
}
