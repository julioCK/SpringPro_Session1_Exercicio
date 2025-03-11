package juliock.springPro.session1.desafio.services;

import juliock.springPro.session1.desafio.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {
    public Double shipment(Order order) {
        double discountApplied = order.getBasic() - order.getBasic() * (order.getDiscount() / 100);
        double shipmentCost = 0.0;

        if(discountApplied < 100)
            shipmentCost = 20.00;
        else if (discountApplied >= 100 && discountApplied < 200)
            shipmentCost = 12.00;
        else
            shipmentCost = 0.0;

        return shipmentCost;
    }
}
