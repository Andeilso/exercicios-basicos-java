import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Exercicios de Estruturas Repetitivas");
        System.out.println("------------------------------------");
        System.out.println();



        // Exercicio 1
        // System.out.println("Exercicio 1: O programa deve ler a senha passada pelo usuário e verificar se ela é igual à 2002.");

        // int senha = 0;

        // while(senha != 2002){
        //     System.out.println("Digite a senha válida:");
        //     senha = scanner.nextInt();
        //     scanner.nextLine();

        //     if(senha != 2002){
        //         System.out.print("Senha inválida. Pressione <Enter> para tentar novamente.");
        //     } else {
        //         System.out.print("Acesso Permitido");
        //     }

        //     scanner.nextLine();
        //     System.out.println();
        // }
        // System.out.println("------------------------------------------------------------------------------------------------");
        // System.out.println();



        // Exercicio 2
        // System.out.println("Exercicio 2: O progama deve ler os valores de x e y de um ponto no plano cartesiano e informar em qual quadrante ele está.");
        
        // String stringX, stringY;

        // while (true) { 
        //     System.out.println("Digite o valor de X: (Pressione apenas <Enter> para sair)");
        //     stringX = scanner.nextLine();
        //     if(stringX.isBlank()) break;

        //     System.out.println("Digite o valor de Y: (Pressione apenas <Enter> para sair)");
        //     stringY = scanner.nextLine();
        //     if(stringY.isBlank()) break;

        //     double x  = Double.parseDouble(stringX);
        //     double y  = Double.parseDouble(stringY);

        //     if(x > 0 && y > 0){
        //         System.out.println("Primeiro Quadrante");
        //     } else if(x < 0 && y > 0){
        //         System.out.println("Segundo Quadrante");
        //     } else if(x < 0 && y < 0){
        //         System.out.println("Terceiro Quadrante");
        //     } else if (x > 0 && y < 0){
        //         System.out.println("Qaurto Quadrante");
        //     } else {
        //         System.out.println("Origem");
        //     }

        //     scanner.nextLine();
        //     System.out.println();
        // }

        // System.out.println("Programa finalizado pelo usuário.");
        // System.out.println("--------------------------------------------------------------------------------------------------------------------------");
        // scanner.nextLine();



        // Exercicio 3
        // System.out.println("Exercicio 3: Receber código dos combustiveis utilizados pelo cliente e informar a quantidade de cada combustível.");

        // int idProduto;
        // int quantidadeDeAlcool = 0;
        // int quantidadeDeGasolina = 0;
        // int quantidadeDeDiesel = 0;

        // boolean encerrarPrograma = false;

        // do { 
        //     System.out.println("Digite o código do combustível desejável (1 - Álcool, 2 - Gasolina, 3 - Diesel, 4 - Para sair do sistema):");
        //     idProduto = scanner.nextInt();
        //     scanner.nextLine();

        //     switch (idProduto) {
        //         case 1 -> quantidadeDeAlcool++;
        //         case 2 -> quantidadeDeGasolina++;
        //         case 3 -> quantidadeDeDiesel++;
        //         case 4 -> {
        //             encerrarPrograma = true;
        //             System.out.println("Muito obrigado!");
        //             System.out.printf("Alcool: %d%n", quantidadeDeAlcool);
        //             System.out.printf("Gasolina: %d%n", quantidadeDeGasolina);
        //             System.out.printf("Diesel: %d%n", quantidadeDeDiesel);
        //         }
        //         default -> {
        //             System.out.println("Código inválido. Tente novamente.");
        //             System.out.println();
        //         }
        //     }
        // } while (!encerrarPrograma);
        // System.out.println("-----------------------------------------------------------------------------------------------------------------");



        // Exercicio 4
        // System.out.println("Exercicio 4: Le um número inteiro entre 1 e 1000 e mostrar todos os valores impares no console entre 1 e x.");

        // int numero;

        // do{
        //     System.out.println("Digite um número inteiro entre 1 e 1000:");
        //     numero = scanner.nextInt();
        //     scanner.nextLine();

        //     if(numero >= 1 && numero <= 1000){
        //         break;
        //     } else {
        //         System.out.println("Número inválido. Tente novamente.");
        //         System.out.println();
        //     }
        // } while(true);

        // System.out.println();
        // System.out.println("Números ímpares entre 1 e " + numero + ":");
        // for(int i = 1; i <= numero; i++){
        //     if(i % 2 != 0){
        //         System.out.println(i);
        //     }
        // }
        // System.out.println("-----------------------------------------------------------------------------------------------------------");


        
        // Exercicio 5
        // System.out.println("Exercicio 5: Ler um número inteiro N que sera quantidade de números que serão passados pelo usuário.");
        // System.out.println("Mostre a quantidade de números que estão dentro e fora do intervalo [10,20] utilizando in e out.");

        // int quantidadeDeNumeros;
        // int numeroAtual;
        // int numerosDentroDoIntervalo = 0;
        // int numerosForaDoIntervalo = 0;

        // System.out.println("Digite a quantidade de números que serão informados:");
        // quantidadeDeNumeros = scanner.nextInt();
        // scanner.nextLine();

        // for(int i = 0; i < quantidadeDeNumeros; i++){
        //     System.out.println("Digite o " + (i + 1) + "º número:");
        //     numeroAtual = scanner.nextInt();
        //     scanner.nextLine();

        //     if(numeroAtual >= 10 && numeroAtual <= 20){
        //         numerosDentroDoIntervalo++;
        //     } else {
        //         numerosForaDoIntervalo++;
        //     };
        // };

        // System.out.println();
        // System.out.println("Resultados:");
        // System.out.println(numerosDentroDoIntervalo + " in");
        // System.out.println(numerosForaDoIntervalo + " out");
        // System.out.println("----------------------------------------------------------------------------------------------------");



        // Exercicio 6
        // System.out.println("Exercicio 6: Ler um número inteiro N que será a quantidade de casos de teste.");

        // int casosDeTeste;
        // int pesoDoValor1, pesoDoValor2, pesoDoValor3;
        // double valor1, valor2, valor3, mediaPonderada;

        // pesoDoValor1 = 2;
        // pesoDoValor2 = 3;
        // pesoDoValor3 = 5;

        // System.out.println("Digite a quantidade de casos de teste:");
        // casosDeTeste = scanner.nextInt();
        // scanner.nextLine();

        // for(int i = 0; i < casosDeTeste; i++){
        //     System.out.println("digite os 3 valores do caso de teste " + (i + 1) + " em uma unica linha (5.5 6.2 8.7):");
        //     valor1 = scanner.nextDouble();
        //     valor2 = scanner.nextDouble();
        //     valor3 = scanner.nextDouble();
        //     scanner.nextLine();

        //     mediaPonderada = ((valor1 * pesoDoValor1) + (valor2 * pesoDoValor2) + (valor3 * pesoDoValor3)) / (pesoDoValor1 + pesoDoValor2 + pesoDoValor3);
        //     System.out.println("A média ponderada dos valores é: " + String.format("%.1f", mediaPonderada));
        //     System.out.println();
        // }
        // System.out.println("-----------------------------------------------------------------------------");



        // Exercicio 7
        // System.out.println("Exercicio 7: Ler um número inteiro N que será a quantidade de valores inteiros.");
        // System.out.println("Ler N pares de numeros inteiros e mostrar a divisão do primeiro pelo segundo.");
        // System.out.println();

        // int quantidadeDeTestes, numero1, numero2;
        // double resultado;

        // System.out.println("Digite a quantidade de testes que serão realizados:");
        // quantidadeDeTestes = scanner.nextInt();
        // scanner.nextLine();

        // for (int i = 0; i < quantidadeDeTestes; i++) {
        //     System.out.println("Digite o par de números inteiros do teste " + (i + 1) + " em uma unica linha (numerador denominador):");
        //     numero1 = scanner.nextInt();
        //     numero2 = scanner.nextInt();
        //     scanner.nextLine();

        //     resultado = (double) numero1 / numero2;

        //     if(numero2 == 0){
        //         System.out.println("Divisão impossível");
        //     } else {
        //         System.out.println("Resultado: " + String.format("%.1f", resultado));
        //     }
        //     System.out.println();
        // }
        // System.out.println("-------------------------------------------------------------------------------");



        // Exercicio 8
        // System.out.println("Exercicio 8: Ler um número inteiro N e calcular seu fatorial.");

        // int numeroFatorial, resultadoFatorial = 1;

        // System.out.println("Digite um número inteiro para calcular seu fatorial:");
        // numeroFatorial = scanner.nextInt();
        // scanner.nextLine();

        // for(int i = numeroFatorial; i >= 1; i--){
        //     resultadoFatorial *= i;
        // };

        // System.out.println("O fatorial de " + numeroFatorial + " é: " + resultadoFatorial);

        // System.out.println("-------------------------------------------------------------");

        
        
        // Exercicio 9
        // System.out.println("Exercicio 9: Ler um número inteiro N e calcular todos os seus divisores.");
        
        // int numeroParaDivisores;
        
        // System.out.println("Digite um número inteiro para calcular seus divisores:");
        // numeroParaDivisores = scanner.nextInt();
        // scanner.nextLine();
        // System.out.println();
        
        // System.out.println("Os divisores de " + numeroParaDivisores + " são:");
        // for(int i = 1; i <= numeroParaDivisores; i++){
        //     if(numeroParaDivisores % i == 0){
        //         System.out.println(i);
        //     }
        // }

        // System.out.println("------------------------------------------------------------------------");



        // // Exercicio 10
        // System.out.println("Exercicio 10: Ler um número inteiro N imprimir o numero, depoi o numero ao quadrado e depois ao cubo na mesma linha");
        // System.out.println("o programa vai imprimir a cada linha começando de 1 até o valor N. Exemplo: para N = 3. Vai imprimir: 1 1 1, 2 4 8, 3 9 27");

        // int numeroNParaImprimirQuadradoEAoCubo;

        // System.out.println("Digite um número inteiro:");
        // numeroNParaImprimirQuadradoEAoCubo = scanner.nextInt();
        // scanner.nextLine();
        // System.out.println();

        // for(int i = 1; i <= numeroNParaImprimirQuadradoEAoCubo; i++){
        //     System.out.println(i + " " + (i * i) + " " + (i * i * i));
        // }
        // System.out.println("--------------------------------------------------------------------------------------------------------------------------");


        // scanner.close();
    }
}
