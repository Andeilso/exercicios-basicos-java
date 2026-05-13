package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter cliente data:");

        System.out.print("Name: ");
        String clientName = scanner.nextLine();

        System.out.print("Client email: ");
        String clientEmail = scanner.nextLine();

        System.out.print("Birth Date (DD/MM/YYYY): ");
        String clientBirthDateString = scanner.nextLine();
        DateTimeFormatter birthDateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate clientBirthDate = LocalDate.parse(clientBirthDateString, birthDateFormatter);

        Client client = new Client(clientName, clientEmail, clientBirthDate);

        System.out.println("Enter order data: ");

        System.out.print("Status: ");
        String orderStatus = scanner.nextLine();

        System.out.print("How many items to this order? ");
        int itemsCount = scanner.nextInt();
        scanner.nextLine(); // Para limpar o buffer do scanner

        Order order = new Order(LocalDateTime.now(), OrderStatus.valueOf(orderStatus.toUpperCase()), client);

        for (int i = 1; i <= itemsCount; i++) {
            System.out.println("Enter #" + i + " item data:");

            System.out.print("Product name: ");
            String productName = scanner.nextLine();

            System.out.print("Product price: ");
            double productPrice = scanner.nextDouble();

            System.out.print("Quantity: ");
            int quantity = scanner.nextInt();
            scanner.nextLine(); // Para limpar o buffer do scanner

            order.addItem(new OrderItem(quantity, new Product(productName, productPrice)));
        }

        System.out.println();
        System.out.println("ORDER SUMMARY:");
        System.out.println("Order moment: " + order.getMoment().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));

        System.out.println("Order status: " + order.getStatus());

        Client currentOrderClient = order.getClient();
        System.out.printf("Client: %s (%s) - %s\n", currentOrderClient.getName(), currentOrderClient.getBirthDate().format(birthDateFormatter), currentOrderClient.getEmail());

        System.out.println("Order items: ");

        for(OrderItem item : order.getItems()){
            Product currentProduct = item.getProduct();
            System.out.printf("%s, $%.2f, Quantity: %d, Subtotal: $%.2f\n", currentProduct.getName(), currentProduct.getPrice(), item.getQuantity(), item.subTotal());
        }

        System.out.printf("Total price: $%.2f\n", order.total());

        scanner.close();
    }
}