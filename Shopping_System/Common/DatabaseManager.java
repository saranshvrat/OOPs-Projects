package Common;

import OrderMaker.OrderDetails;
import java.util.ArrayList;
import java.util.List;

public class DatabaseManager {
    private List<OrderDetails> orders = new ArrayList<>();

    public void addOrder(OrderDetails order) {
        OrderDetails entry = new OrderDetails(order);
        orders.add(entry);
    }

    public List<OrderDetails> getOrders() {
        return orders;
    }

    public OrderDetails getOrderById(int orderID) {
        for (OrderDetails entry : orders) {
            if (entry.getOrderID() == orderID) {
                return entry;
            }
        }
        return null;
    }

    public boolean removeOrder(int orderID) {
        return orders.removeIf(entry -> entry.getOrderID() == orderID);
    }

}
