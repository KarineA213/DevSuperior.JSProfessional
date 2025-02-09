package com.devsuperior.componenteInjecao.demo;

import com.devsuperior.componenteInjecao.demo.entities.Order;
import com.devsuperior.componenteInjecao.demo.services.OrderService;
import com.devsuperior.componenteInjecao.demo.services.ShippingService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import javax.xml.transform.Source;
import java.sql.SQLOutput;
import java.util.Scanner;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	ShippingService shippingService;
	OrderService orderService;

	public DemoApplication(OrderService orderService, ShippingService shippingService) {
		this.orderService = orderService;
		this.shippingService = shippingService;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


		@Override
		public void run(String... args) throws Exception {
		Order order1 = new Order(1034, 150.0, 20.0);
		System.out.println("pedido código: " + order1.getCode());
		System.out.println("Valor total: R$ " + orderService.setTotal(order1));


		Order order2 = new Order(2282, 800.0, 10.0);
		System.out.println("pedido código: " + order2.getCode());
		System.out.println("Valor total: R$ " + orderService.setTotal(order2));

		Order order3 = new Order(1309, 95.90, 0.0);
		System.out.println("pedido código: " + order3.getCode());
		System.out.println("Valor total: R$ " + orderService.setTotal(order3));


		}



	}


