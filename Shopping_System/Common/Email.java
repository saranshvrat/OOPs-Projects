package Common;

import OrderMaker.OrderDetails;

public class Email {
    public void sendMail(OrderDetails order) {
        System.out.println("Confirmation mail sent for Order ID: " + order.getOrderID() + " and Invoice is attached with Invoice ID: " + order.getInvoiceID());
    }
}
