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
			//não funciona porque orderService não foi inicializado dentro do main().
			//
			//Para corrigir, mova a lógica de entrada de dados para run(), que é executado após a injeção do Spring Boot:
			Scanner sc = new Scanner(System.in);

			System.out.println("Componentes e injeção de valores");
			System.out.println("Digite o código do seu pedido");
			int code = sc.nextInt();

			System.out.println("Digite o valor do seu pedido");
			double basic = sc.nextDouble();

			System.out.println("Digite o valor do seu desconto");
			double discount = sc.nextDouble();

			Order order = new Order(basic, discount, code);
			double total = orderService.setTotal(order);

			System.out.println("O código do seu pedido é: " + code);
			System.out.println("O valor total do seu pedido é: " + total);


		}



	}


