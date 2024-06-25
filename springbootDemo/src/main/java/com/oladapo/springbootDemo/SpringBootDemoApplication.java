package com.oladapo.springbootDemo;

import com.oladapo.springbootDemo.model.Alien;
import com.oladapo.springbootDemo.model.Laptop;
import com.oladapo.springbootDemo.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);

		LaptopService service = context.getBean(LaptopService.class);
		Laptop lap = context.getBean(Laptop.class);
		service.addLaptop(lap);


//		Alien alien = context.getBean(Alien.class);
//		System.out.println(alien.getAge());
//		alien.code();
	}
}
