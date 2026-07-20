package User;

import OrderMaker.OrderDetails;
import Common.Payment;
import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String id;
    private String email;
    private String phone;
    private String name;
    private ArrayList<OrderDetails> orders = new ArrayList<>();
    private static Payment pay = new Payment();

    public Customer(String id, String email, String phone, String name)
    {
        this.id = id;
        this.email = email;
        this.phone = phone;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }

    public List<OrderDetails> getOrders() {
        return orders;
    }

    public void makeOrder(String orderDate, String deliveryDate, int totalPrice)
    {
        OrderDetails order = new OrderDetails(this, deliveryDate, orderDate, totalPrice);
        orders.add(order);
    }

    public void pay(int orderID)
    {
        pay.setPaid(orderID, orders);
    }

}
