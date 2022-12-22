package com.jap.c12_s4_Mc;

import com.jap.c12_s4_Mc.demo.MessageService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;

@SpringBootApplication
public class C12S4McApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(C12S4McApplication.class, args);
		MessageService msg = applicationContext.getBean(MessageService.class);
		System.out.println(msg.getMessage());
	}

}
