package com.devsuperior.componenteInjecao.demo.services;

import com.devsuperior.componenteInjecao.demo.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    private double shipment;

    public double getShipment(double basic) {


        if (basic < 100.00) {
            return 20.00;

        } else if (basic >= 100.00 && basic <= 200.00) {
            return  12.00;

        } else {
            return 0.00;
        }

    }
}

