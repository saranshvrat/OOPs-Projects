package Order;

import Interface.DeliveryPartner;

public class OrderProcessor {
    private DeliveryPartner partner;
    private int orderId;

    public OrderProcessor(DeliveryPartner partner, int OrderId)
    {
        this.partner = partner;
        this.orderId = OrderId;
        partner.deliverOrder(OrderId);
    }

}
