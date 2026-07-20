package Common;

import OrderMaker.OrderDetails;
import User.Customer;

public class Invoice {
    private int invoiceID;
    private Customer customer;
    private OrderDetails order;
    private static int id = 2000;

    // Constructor
    public Invoice(Customer customer, OrderDetails order) {
        this.customer = customer;
        this.order = order;
        this.invoiceID = ++id;
    }

    // Getters
    public int getInvoiceID() {
        return invoiceID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public OrderDetails getOrder() {
        return order;
    }

    // Print invoice details
    public void printInvoice() {
        System.out.println("===== Invoice =====");
        System.out.println("Invoice ID: " + invoiceID);
        System.out.println("Customer: " + customer.getName());
        System.out.println("Phone: " + customer.getPhone());
        System.out.println("Email: " + customer.getEmail());
        System.out.println("Order ID: " + order.getOrderID());
        System.out.println("Order Date: " + order.getOrderDate());
        System.out.println("Delivery Date: " + order.getDeliveryDate());
        System.out.println("Total Price: " + order.getTotalPrice());
        System.out.println("Paid: " + (order.isPaid() ? "Yes" : "No"));
        System.out.println("===================");
    }
}
