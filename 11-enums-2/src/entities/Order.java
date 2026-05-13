package entities;

import entities.enums.OrderStatus;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private LocalDateTime moment;
    private OrderStatus status;
    private Client client;
    private List<OrderItem> items = new ArrayList<>();

    public Order(){
    }

    public Order(LocalDateTime moment, OrderStatus status, Client client){
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public LocalDateTime getMoment(){
        return this.moment;
    }

    public OrderStatus getStatus(){
        return this.status;
    }

    public void setStatus(OrderStatus status){
        this.status = status;
    }

    public Client getClient(){
        return this.client;
    }

    public void setClient(Client client){
        this.client = client;
    }

    public List<OrderItem> getItems(){
        return this.items;
    }

    public void addItem(OrderItem item){
        this.items.add(item);
    }

    public void removeItem(OrderItem item){
        this.items.remove(item);
    }

    public double total(){
        double sum = 0.0;
        for(OrderItem item : items){
            sum += item.subTotal();
        }
        return sum;
    }
}
