package entities;

import java.text.DecimalFormat;

public class ImportedProduct extends Product{
    private Double customsFee;

    public ImportedProduct(){
    }

    public ImportedProduct(String name, Double price, Double customsFee){
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee(){
        return this.customsFee;
    }

    public void setCustomsFee(){
        this.customsFee = customsFee;
    }

    public Double totalPrice(){
        return getPrice() + this.customsFee; 
    }

    @Override
    public String priceTag(){
        StringBuilder stringBuilder = new StringBuilder();
        DecimalFormat decimalFormat = new java.text.DecimalFormat("0.00");

        stringBuilder.append(getName());
        stringBuilder.append(" $ ");
        stringBuilder.append(decimalFormat.format(this.totalPrice()));
        stringBuilder.append(" (Customs fee: $ ");
        stringBuilder.append(decimalFormat.format(this.customsFee));
        stringBuilder.append(")");

        return stringBuilder.toString();
    }
}
