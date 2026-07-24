package DeliveryPartners;

import Interface.DeliveryPartner;

public class Dunzo implements DeliveryPartner{
    public void deliverOrder(int orderId)
    {
        System.out.println("Dunzo is your delivery partner for OrderId: " + orderId);
        System.out.println("Your Order will be delivered soon");
    }
}
