import DeliveryPartners.*;
import Order.OrderProcessor;

public class Main {
    public static void main(String[] args) {
        
        // Using Zomato as delivery partner
        OrderProcessor order1 = new OrderProcessor(new Zomato(), 101);

        // Using Swiggy as delivery partner
        OrderProcessor order2 = new OrderProcessor(new Swiggy(), 102);

    }
}
