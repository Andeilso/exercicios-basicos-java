package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import models.entities.Product;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Caminho de entrada e nome do arquivo: ");
        String pathIn = sc.nextLine();
        
        System.out.print("Caminho de saida e nome do arquivo: ");
        String pathOut = sc.nextLine();

        List<String> lines = new ArrayList<>();

        try(BufferedReader bw = new BufferedReader(new FileReader(pathIn))){
            String line = bw.readLine();

            while(line != null){
                lines.add(line);
                line = bw.readLine();
            }
        } catch (IOException e){
            System.out.println("Read error: " + e.getMessage());
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(pathOut))){
            List<String> newLines = new ArrayList<>();

            for(String line : lines){
                String[] productArray = line.split(",");

                Product product = new Product(productArray[0], Double.parseDouble(productArray[1]), Integer.parseInt(productArray[2]));

                String newLine = String.join(",", product.getName(), String.format(Locale.US, "%.2f", product.totalValue()) );
                newLines.add(newLine);
            }

            for (String line : newLines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Write error: " + e.getMessage());
        }
    }
}
