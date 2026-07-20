package Common;

import OrderMaker.OrderDetails;
import java.util.ArrayList;

public class Payment {
    private int orderID;
    private boolean paid;

    public void setPaid(int orderID, ArrayList<OrderDetails> orders) {
        for (OrderDetails entry : orders) {
            if (entry.isPaid()) {
                System.out.println("You've already paid for this order.");
                return;
            }

            entry.setPaid();
            this.paid = true;
            this.orderID = orderID;
        }
    }

    public void printPayment() {
        System.out.println("Payment for Order ID: " + orderID + " Status: " + (paid ? "Paid" : "Unpaid"));
    }
}
