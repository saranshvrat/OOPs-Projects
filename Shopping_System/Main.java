import User.Customer;

import java.util.List;
import OrderMaker.OrderDetails;

public class Main {
   public static void main(String[] args) {

      Customer customer = new Customer("C123", "alice@example.com", "123-456-7890", "Alice");

      System.out.println("Customer Name: " + customer.getName());
      System.out.println("Customer Email: " + customer.getEmail());
      System.out.println("Customer Phone: " + customer.getPhone());
      System.out.println("Customer ID: " + customer.getId());

      customer.makeOrder("2026-07-19", "2026-07-22", 150);
      customer.makeOrder("2026-07-20", "2026-07-25", 250);

      List<OrderDetails> orders = customer.getOrders();
      System.out.println("Total orders placed: " + orders.size());

      for (OrderDetails order : orders) {
         System.out.println("Order ID: " + order.getOrderID());
         System.out.println("Order Date: " + order.getOrderDate());
         System.out.println("Delivery Date: " + order.getDeliveryDate());
         System.out.println("Total Price: " + order.getTotalPrice());
         System.out.println("Is Paid: " + order.isPaid());

         int firstOrderID = order.getOrderID();
         customer.pay(firstOrderID);

         System.out.println("After payment - Is Paid: " + order.isPaid());
         System.out.println("-----------------------------------");
      }
   }
}