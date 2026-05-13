package application;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter department's name: ");
        String departmentName = scanner.nextLine();

        System.out.println("Enter worker data:");
        System.out.print("Name: ");
        String workerName = scanner.nextLine();

        System.out.print("Level: ");
        String workerLevel = scanner.nextLine();

        System.out.print("Base salary: ");
        Double baseSalary = scanner.nextDouble();
        
        System.out.print("How many contracts to this worker? ");
        int contracts = scanner.nextInt();
        System.out.println();

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));

        
        for(int i = 0; i < contracts; i++){
            System.out.println("Enter contract #" + (i+1) + " data:");
            System.out.print("Date (DD/MM/YYYY): ");
            String dateString = scanner.next();
            DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            
            System.out.print("Value per hour: ");
            Double valuePerHour = scanner.nextDouble();
            
            System.out.print("Duration (hours): ");
            int hours = scanner.nextInt();
            
            HourContract contract = new HourContract(LocalDate.parse(dateString, formatter1) , valuePerHour, hours);
            worker.addContract(contract);
        }
        
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthYearString = scanner.next();

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("MM/yyyy");
        YearMonth monthYearDate = YearMonth.parse(monthYearString, formatter2);
        
        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.printf("Income for %s: %.2f", monthYearString, worker.income(monthYearDate.getYear(), monthYearDate.getMonthValue()) );

        scanner.close();
    }
}
