package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Computer;
import dmacc.beans.Employee;

@Configuration
public class BeanConfiguration {
	@Bean
	public Computer computer() {
		Computer bean = new Computer("Des Moines Laptop");
		//bean.setName("Des Moines Server");
		//bean.setInventoryID("DSM002");
		//bean.setNumOfCores(8);
		//bean.setMemory(64);
		return bean;
	}
	
	@Bean
	public Employee employee() {
		Employee bean = new Employee("Bob", "Ross");
		return bean;
	}
}
