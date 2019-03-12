package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dmacc.beans.Computer;
import dmacc.beans.Employee;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.ComputerRepository;

@SpringBootApplication
public class SpringBeansComputerApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBeansComputerApplication.class, args);
	}
	@Autowired
	ComputerRepository repo;
	
	@Override
	public void run(String... args) throws Exception{
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		Computer c = appContext.getBean("computer", Computer.class);
		c.setInventoryID("DSM003");
		repo.save(c);
		
		Computer d = new Computer("Des Moines Tablet", "DSM015", 2, 16);
		Employee e = new Employee("Bert", "Masterson");
		d.setEmployee(e);
		repo.save(d);
		
		List<Computer> allMyComputers = repo.findAll();
		for(Computer all: allMyComputers) {
			System.out.println(all.toString());
		}
		((AnnotationConfigApplicationContext) appContext).close();
	}
}
