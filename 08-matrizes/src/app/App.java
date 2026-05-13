package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // // Exercicios de fixação
        
        // // Exercício 1 --------------------------------------------------------------------------------------------------------------------
        int tamanhoDaMatriz1;
        int quantidadeDeNumerosNegativos = 0;

        System.out.print("Digite o tamanho da matriz (será usado para coluna e linha): ");
        tamanhoDaMatriz1 = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner
        
        int[][] matriz1 = new int[tamanhoDaMatriz1][tamanhoDaMatriz1];

        System.out.println("Digite os elementos da matriz:");
        for(int linha = 0; linha < matriz1.length; linha++){
            for(int coluna = 0; coluna < matriz1[linha].length; coluna++){
                matriz1[linha][coluna] = scanner.nextInt();
            }
        }

        System.out.println();
        
        System.out.println("Diagonal principal:");
        for(int linha = 0; linha < matriz1.length; linha++){
            System.out.print(matriz1[linha][linha] + " ");
        }
        System.out.println();


        for(int linha = 0; linha < matriz1.length; linha++){
            for(int coluna = 0; coluna < matriz1[linha].length; coluna++){
                if(matriz1[linha][coluna] < 0){
                    quantidadeDeNumerosNegativos++;
                }
            }
        }
        System.out.println("Quantidade de números negativos: " + quantidadeDeNumerosNegativos);
        // --------------------------------------------------------------------------------------------------------------------------------


        // Exercício 2 --------------------------------------------------------------------------------------------------------------------
        // Busca por número e seus adjacentes na matriz
        int tamanhoDaMatriz2Linha;
        int tamanhoDaMatriz2Coluna;
        boolean numeroExisteNaMatriz = false;

        System.out.println("Qual o tamanho da Matriz? (Digite 2 números inteiros na mesma linha, separados por espaço) ");
        tamanhoDaMatriz2Linha = scanner.nextInt();
        tamanhoDaMatriz2Coluna = scanner.nextInt();

        int[][] matriz2 = new int[tamanhoDaMatriz2Linha][tamanhoDaMatriz2Coluna];

        System.out.println("Digite os elementos da matriz:");
        for(int linha = 0; linha < matriz2.length; linha++){
            for(int coluna = 0; coluna < matriz2[linha].length; coluna++){
                matriz2[linha][coluna] = scanner.nextInt();
            }
        }
        System.out.println();

        int numeroParaBuscar;
        System.out.print("Digite o número desejado para buscar na matriz: ");
        numeroParaBuscar = scanner.nextInt();

        System.out.println();

        for(int linha = 0; linha < matriz2.length; linha++){
            for(int coluna = 0; coluna < matriz2[linha].length; coluna++){

                if(numeroParaBuscar == matriz2[linha][coluna]){
                    numeroExisteNaMatriz = true;

                    System.out.println("Posição do número: [" + linha + ", " + coluna + "]");
                
                    imprimirNumerosAdjacentes(matriz2, linha, coluna);
                }
            }
        }

        if(!numeroExisteNaMatriz){
            System.out.println("Número não encontrado na matriz.");
        }
        // --------------------------------------------------------------------------------------------------------------------------------
        scanner.close();
    }

    public static void imprimirNumerosAdjacentes(int[][]matriz, int linha, int coluna){

        if( (coluna - 1) >= 0 ){
            System.out.println("À esquerda: " + matriz[linha][coluna-1]);
        }
    
        if( (coluna + 1) < matriz[linha].length ){
            System.out.println("À direita: " + matriz[linha][coluna+1]);
        }
        
        if( (linha - 1) >=0 ){
            System.out.println("Acima: " + matriz[linha-1][coluna]);
        }
    
        if( (linha + 1) < matriz.length){
            System.out.println("Abaixo: " + matriz[linha+1][coluna]);
        }
        }
}
