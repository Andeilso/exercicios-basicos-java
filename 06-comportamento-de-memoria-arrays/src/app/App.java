package app;

import entidades.Pessoa;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Exercicio 1 -----------------------------------------------------------------------------
        int numeroDeEntradas1;
        
        System.out.println("Entre com o número de números que seram escritos no console: ");
        numeroDeEntradas1 = scanner.nextInt();
        int[] entradas = new int[numeroDeEntradas1];
        System.out.println();
        
        
        for( int i = 0; i < numeroDeEntradas1; i++ ) {
            System.out.println("Agora entre com o " + (i+1) + "º número: ");
            entradas[i] = scanner.nextInt();
            System.out.println();
        };
        
        
        System.out.println("Os números negativos digitados foram: ");
        for( int i = 0; i < entradas.length; i++ ) {
            if(entradas[i] < 0){
                System.out.println(entradas[i]);
            }
        };
        // -----------------------------------------------------------------------------------------
        

        
        // Exercicio 2 -----------------------------------------------------------------------------
        int numeroDeEntradas2;
        double soma = 0;
        double media2 = 0;

        System.out.println("Entre com a quantidade de entradas que seram feitas: ");
        numeroDeEntradas2 = scanner.nextInt();
        double[] entradas2 = new double[numeroDeEntradas2];
        System.out.println();

        for( int i = 0; i < numeroDeEntradas2; i++ ) {
            System.out.println("Agora entre com o " + (i+1) + "º número: ");
            entradas2[i] = scanner.nextDouble();
            System.out.println();
        };

        for( int i = 0; i < entradas2.length; i++ ) {
            soma += entradas2[i];
        };

        media2 = soma / entradas2.length;

        System.out.println("A média dos números digitados é: " + String.format("%.2f", media2));
        // -----------------------------------------------------------------------------------------
        
        
        
        // Exercicio 3 -----------------------------------------------------------------------------
        int numeroDeEntradas3;
        double somaDasAltura = 0;
        double mediaDeAltura;
        int numeroDePessoasMenoresDe16Anos = 0;
        double porcentagemDePessoasMenoresDe16Anos;
        
        System.out.println("Entre com a quantide de entradas que seram feitas: ");
        numeroDeEntradas3 = scanner.nextInt();
        System.out.println();
        
        Pessoa[] entradas3 = new Pessoa[numeroDeEntradas3];

        for(int i = 0; i < numeroDeEntradas3; i++ ) {
            String nome;
            int idade;
            double altura;

            System.out.println("Dados da " + (i+1) + "ª pessoa:");
            System.out.print("Nome: ");
            nome = scanner.next();
            System.out.println();

            System.out.print("Idade: ");
            idade = scanner.nextInt();
            if(idade < 16){
                numeroDePessoasMenoresDe16Anos++;
            };
            System.out.println();

            System.out.print("Altura: ");
            altura = scanner.nextDouble();
            somaDasAltura += altura;
            System.out.println();

            entradas3[i] = new Pessoa(nome, idade, altura);
        };

        mediaDeAltura = somaDasAltura / numeroDeEntradas3;
        porcentagemDePessoasMenoresDe16Anos = (double) numeroDePessoasMenoresDe16Anos /entradas3.length * 100.0;

        System.out.println("A média de altura das pessoas é: " + String.format("%.2f", mediaDeAltura));
        System.out.println("Pessoas com menos de 16 anos: " + String.format("%.2f", porcentagemDePessoasMenoresDe16Anos) + "%");
        for( int i = 0; i < entradas3.length; i++ ) {
            if(entradas3[i].getIdade() < 16){
                System.out.println(entradas3[i].getNome());
            }
        };
        // -----------------------------------------------------------------------------------------
        
        
        
        // Exercicio 4 -----------------------------------------------------------------------------
        // Numeros pares

        int numeroDeEntradas4;
        int quantidadeDeNumerosPares4 = 0;

        System.out.print("Entre com a quantidade de números que seram digitados: ");
        numeroDeEntradas4 = scanner.nextInt();
        System.out.println();

        int[] numeros4 = new int[numeroDeEntradas4];

        for (int i = 0; i < numeroDeEntradas4; i++) {
            System.out.print("Digite um numero: ");
            numeros4[i] = scanner.nextInt();
        }

        System.out.println();
        System.out.println("Numeros Pares:");
        
        for (int i = 0; i < numeros4.length; i++) {
            if (numeros4[i] % 2 == 0) {
                System.out.print(numeros4[i] + " ");
                quantidadeDeNumerosPares4++;
            }
        }

        System.out.println();
        System.out.println("Quantidade de Números Pares: " + quantidadeDeNumerosPares4);
        // -----------------------------------------------------------------------------------------



        // Exercicio 5 -----------------------------------------------------------------------------
        //  Maior e posicao

        int numeroDeEntradas5;
        System.out.print("Quantos numeros voce vai digitar? ");
        numeroDeEntradas5 = scanner.nextInt();
        System.out.println();

        double[] numeros5 = new double[numeroDeEntradas5];

        for (int i = 0; i < numeros5.length; i++) {
            System.out.print("Digite um numero: ");
            numeros5[i] = scanner.nextDouble();
        };

        System.out.println();

        double maiorNumero5 = 0.0;
        int posicaoDoMaiorNumero5 = 0;

        for (int i = 0; i < numeros5.length; i++) {
            if(maiorNumero5 < numeros5[i]){
                maiorNumero5 = numeros5[i];
                posicaoDoMaiorNumero5 = i;
            }
        }

        System.out.println("Maior valor: " + maiorNumero5);
        System.out.println("Posicao do maior valor: " + posicaoDoMaiorNumero5);


        // -----------------------------------------------------------------------------------------



        // Exercicio 6 -----------------------------------------------------------------------------
        //  soma e vetores

        int numeroDeEntradasDeCadaVetor_6;
        
        System.out.print("Quantos elementos vai ter cada vetor? ");
        numeroDeEntradasDeCadaVetor_6 = scanner.nextInt();
        
        int [] vetorA_6 = new int[numeroDeEntradasDeCadaVetor_6];
        int [] vetorB_6 = new int[numeroDeEntradasDeCadaVetor_6];
        int [] vetorC_6 = new int[numeroDeEntradasDeCadaVetor_6];

        System.out.println("Digite os valores do vetor A:");
        for (int i = 0; i < vetorA_6.length; i++) {
            vetorA_6[i] = scanner.nextInt();
        }
        
        System.out.println("Digite os valores do vetor B:");
        for (int i = 0; i < vetorB_6.length; i++) {
            vetorB_6[i] = scanner.nextInt();
        }

        for( int i = 0; i < vetorC_6.length; i++){
            vetorC_6[i] = vetorA_6[i] + vetorB_6[i];
        }
        
        System.out.println("Vetor Resultante:");
        for (int i = 0; i < vetorC_6.length; i++) {
            System.out.println(vetorC_6[i]);
        }
        // -----------------------------------------------------------------------------------------



        // Exercicio 7 -----------------------------------------------------------------------------
        //  abaixo da media

        int numeroDeEntradas7;

        System.out.print("Quantos números reais serão digitados? ");
        numeroDeEntradas7 = scanner.nextInt();
        System.out.println();

        double[] vetorDeNumeros7 = new double[numeroDeEntradas7];
        double somaDeNumeros7 = 0.0;
        double mediaDeNumeros7;

        for(int i = 0; i < vetorDeNumeros7.length; i++){
            System.out.println("Digite um número: ");
            vetorDeNumeros7[i] = scanner.nextDouble();
            somaDeNumeros7 += vetorDeNumeros7[i];
        }

        mediaDeNumeros7 = somaDeNumeros7 / vetorDeNumeros7.length;

        System.out.println("Média do vetor = " + String.format("%.2f", mediaDeNumeros7));
        System.out.println("Os números abaixo da média são: ");
        for(int i = 0; i<vetorDeNumeros7.length; i++){
            if(vetorDeNumeros7[i] < mediaDeNumeros7){
                System.out.println(vetorDeNumeros7[i]);
            }
        }
        // -----------------------------------------------------------------------------------------



        // Exercicio 8 -----------------------------------------------------------------------------
        //  media pares

        int numeroDeEntradas8;

        System.out.print("Quantos números inteiros serão digitados? ");
        numeroDeEntradas8 = scanner.nextInt();
        System.out.println();

        int[] vetorDeNumerosInteiros8 = new int[numeroDeEntradas8];
        double somaDosNumerosPares8 = 0.0;
        int quantidadeDeNumerosPares8 = 0;

        for(int i = 0; i < vetorDeNumerosInteiros8.length; i++){
            System.out.print("Digite um número inteiro: ");
            vetorDeNumerosInteiros8[i] = scanner.nextInt();

            if(vetorDeNumerosInteiros8[i] % 2 == 0){
                somaDosNumerosPares8 += vetorDeNumerosInteiros8[i];
                quantidadeDeNumerosPares8++;
            }
        }
        
        if(quantidadeDeNumerosPares8 > 0){
            System.out.println("Média dos numeros pares = " + String.format("%.2f", somaDosNumerosPares8 / quantidadeDeNumerosPares8));
        } else {
            System.out.println("Nenhum número par foi digitado.");
        }
        // -----------------------------------------------------------------------------------------



        // Exercicio 9 -----------------------------------------------------------------------------
        //  mais velho

        int numeroDeEntradas9;

        System.out.print("Quantas pessoas você ira digitar? ");
        numeroDeEntradas9 = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner
        System.out.println();

        Pessoa[] vetorDePessoas9 = new Pessoa[numeroDeEntradas9];
        int idadeDaPessoaMaisVelha9 = 0;
        int posicaoDaPessoaMaisVelha9 = 0;
        
        for(int i = 0; i < vetorDePessoas9.length; i++){
            System.out.println("Dados da " + (i+1) + "ª pessoa:");
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            if(idade > idadeDaPessoaMaisVelha9){
                posicaoDaPessoaMaisVelha9 = i;
                idadeDaPessoaMaisVelha9 = idade;
            }

            vetorDePessoas9[i] = new Pessoa(nome, idade);
        };

        System.out.println("Pessoa mais velha: " + vetorDePessoas9[posicaoDaPessoaMaisVelha9].getNome());
        // -----------------------------------------------------------------------------------------



        // Exercicio 10 -----------------------------------------------------------------------------
        //  aprovados

        int numeroDeEntradas10;
        
        System.out.print("Quantos alunos serão digitados? ");
        numeroDeEntradas10 = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner
        System.out.println();

        String[] nomesDosAlunos10 = new String[numeroDeEntradas10];
        double[] primeiraNotaDosAlunos10 = new double[numeroDeEntradas10];
        double[] segundaNotaDosAlunos10 = new double[numeroDeEntradas10];

        for( int i = 0; i < nomesDosAlunos10.length; i++){
            System.out.println("Digite nome, primeira e segunda nota do " + (i+1) + "° Aluno: ");
            nomesDosAlunos10[i] = scanner.nextLine();
            primeiraNotaDosAlunos10[i] = scanner.nextDouble();
            segundaNotaDosAlunos10[i] = scanner.nextDouble();
            scanner.nextLine(); // Limpar o buffer do scanner
        };

        System.out.println("Alunos aprovados: ");

        for( int i = 0; i < nomesDosAlunos10.length; i++){
            double media10 = (primeiraNotaDosAlunos10[i] + segundaNotaDosAlunos10[i])/ 2.0;
            if(media10 >= 6.0){
                System.out.println(nomesDosAlunos10[i]);
            }
        }
        
        // -----------------------------------------------------------------------------------------



        // Exercicio 11 -----------------------------------------------------------------------------
        //  dados pessoas

        int numeroDeEntradas11;
        
        System.out.print("Quantas pessoas serão digitadas? ");
        numeroDeEntradas11 = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner
        System.out.println();

        double menorAltura11 = 0.0;
        double maiorAltura11 = 0.0;
        double mediaDasAlturasDasMulheres11 = 0.0;
        int quantidadeDeMulheres11 = 0;
        int quantidadeDeHomens11 = 0;

        for( int i = 0; i < numeroDeEntradas11; i++){
            System.out.print("Altura da " + (i+1) + "ª pessoa: ");
            double altura = scanner.nextDouble();
            scanner.nextLine(); // Limpar o buffer do scanner

            System.out.print("Genero da " + (i+1) + "ª pessoa (M/F): ");
            char genero = scanner.nextLine().charAt(0);

            if(genero == 'F' || genero == 'f'){
                mediaDasAlturasDasMulheres11 += altura;
                quantidadeDeMulheres11++;
            } else if(genero == 'M' || genero == 'm'){
                quantidadeDeHomens11++;
            }

            if(menorAltura11 == 0.0 || menorAltura11 > altura){
                menorAltura11 = altura;
            } else if(maiorAltura11 < altura){
                maiorAltura11 = altura;
            }
        }

        System.out.println("Menor altura = " + String.format("%.2f", menorAltura11));
        System.out.println("Maior altura = " + String.format("%.2f", maiorAltura11));
        System.out.println("Média das alturas das mulheres = " + String.format("%.2f", mediaDasAlturasDasMulheres11/quantidadeDeMulheres11));
        System.out.println("Número dos homens = " + quantidadeDeHomens11);
        // -----------------------------------------------------------------------------------------

        scanner.close();
    }
}
