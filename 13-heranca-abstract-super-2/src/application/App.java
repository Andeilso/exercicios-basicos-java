package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int numberOfProducts = scanner.nextInt();
        scanner.nextLine(); // Limpar

        List<Product> productList = new ArrayList<>();

        for(int i = 0; i < numberOfProducts; i++){
            System.out.println("Product #" + (i+1) + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char productType = scanner.nextLine().charAt(0);

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Price: ");
            Double price = scanner.nextDouble();
            scanner.nextLine();


            if(Character.toLowerCase(productType) == 'c'){
                productList.add(new Product(name, price));
            } else if(Character.toLowerCase(productType) == 'u'){
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                String manufactureDateString = scanner.nextLine();
                LocalDate manufactureDate = LocalDate.parse(manufactureDateString, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

                productList.add(new UsedProduct(name, price, manufactureDate));
            } else if(Character.toLowerCase(productType) == 'i'){
                System.out.print("Customs fee: ");
                Double customsFee = scanner.nextDouble();
                scanner.nextLine(); // Limpar

                productList.add(new ImportedProduct(name, price, customsFee));
            } else {
                System.out.println("Comando não aceito!");
            }
            System.out.println();
        }

        System.out.println("Price Tags:");
        for(Product product : productList){
            System.out.println(product.priceTag());
        }
        
    }
}
