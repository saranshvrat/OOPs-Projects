package OrderMaker;

import Common.*;
import User.Customer;

public class OrderDetails {
    private int orderID;
    private int invoiceID;
    private Customer customer;
    private String deliveryDate;
    private String orderDate;
    private boolean paid = false;
    private int totalPrice = 0;
    private static int id = 10000;
    private static DatabaseManager db = new DatabaseManager();
    private static Email email = new Email();

    // Constructor
    public OrderDetails(Customer customer, String deliveryDate, String orderDate, int... price) {
        this.customer = customer;
        this.deliveryDate = deliveryDate;
        this.orderDate = orderDate;
        this.totalPrice = PriceCal.calculateTotal(price);
        this.orderID = ++id;
        saveToDB(this);
    }

    public OrderDetails(OrderDetails order)
    {
        this.customer = order.getCustomer();
        this.deliveryDate = order.getDeliveryDate();
        this.orderDate = order.getOrderDate();
        this.paid = order.isPaid();
        this.totalPrice = order.getTotalPrice();
        this.orderID = order.getOrderID();
    }

    public void saveToDB(OrderDetails order)
    {
        db.addOrder(order);
    }

    // Getters
    public Customer getCustomer() {
        return customer;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public int getOrderID() {
        return orderID;
    }
    public int getInvoiceID() {
        return invoiceID;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid() {
    if (!this.paid && this.totalPrice != 0) {
        this.paid = true;

        this.invoiceID = makeInvoiceID();

        email.sendMail(this);
    }
}

    public int makeInvoiceID()
    {
        Invoice invoice = new Invoice(customer, this);
        return invoice.getInvoiceID();
    }

}
