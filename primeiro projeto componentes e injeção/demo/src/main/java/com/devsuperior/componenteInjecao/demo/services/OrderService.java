package com.devsuperior.componenteInjecao.demo.services;


//import org.springframework.core.annotation.Order;

import com.devsuperior.componenteInjecao.demo.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

//    private double total;

    ShippingService shippingService;


    @Autowired
    public OrderService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    public OrderService() {

    }

    public double setTotal(Order order) {

               return order.getBasic() * (1 - order.getDiscount()/100) + shippingService.getShipment(order.getBasic());

    }
}
