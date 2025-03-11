package juliock.springPro.session1.desafio.services;

import juliock.springPro.session1.desafio.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private ShippingService shippingService;

    public OrderService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    public Double total(Order order) {
        double discountApplied = order.getBasic() - order.getBasic() * (order.getDiscount() / 100);
        return discountApplied + shippingService.shipment(order);
    }
}
