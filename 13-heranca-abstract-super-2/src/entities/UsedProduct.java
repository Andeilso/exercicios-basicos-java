package entities;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product{
    private LocalDate manufactureDate;

    public UsedProduct(){
    }

    public UsedProduct(String name, Double price, LocalDate manufactureDate){
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public LocalDate getManufactureDate(){
        return this.manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate){
        this.manufactureDate = manufactureDate;
    }
    
    @Override
    public String priceTag(){
        StringBuilder stringBuilder = new StringBuilder();
        DecimalFormat decimalFormat = new java.text.DecimalFormat("0.00");

        stringBuilder.append(getName());
        stringBuilder.append(" (used) $ ");
        stringBuilder.append(decimalFormat.format(getPrice()));
        stringBuilder.append(" (Manufacture date: ");
        stringBuilder.append(DateTimeFormatter.ofPattern("dd/MM/yyyy").format(manufactureDate));
        stringBuilder.append(")");

        return stringBuilder.toString();
    }
}
