package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Computer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String inventoryid;
	private int numofcores;
	private int memory;
	@Autowired
	private Employee employee;
	
	public Computer() {
		super();
		this.inventoryid = "DSM001";
	}
	
	public Computer(String name) {
		this.name = name;
	}
	
	public Computer(String name, String inventoryID, int numOfCores, int memory) {
		this.name = name;
		this.inventoryid = inventoryID;
		this.numofcores = numOfCores;
		this.memory = memory;
	}
	
	public Computer(int id, String name, String inventoryID, int numOfCores, int memory) {
		this.id = id;
		this.name = name;
		this.inventoryid = inventoryID;
		this.numofcores = numOfCores;
		this.memory = memory;
	}

	private long getId() {
		return id;
	}

	private void setId(long id) {
		this.id = id;
	}

	private String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String getInventoryID() {
		return inventoryid;
	}

	public void setInventoryID(String inventoryID) {
		this.inventoryid = inventoryID;
	}

	private int getNumOfCores() {
		return numofcores;
	}

	public void setNumOfCores(int numOfCores) {
		this.numofcores = numOfCores;
	}

	private int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}

	@Override
	public String toString() {
		return "Computer [id=" + id + ", name=" + name + ", inventoryID=" + inventoryid + ", numOfCores=" + numofcores
				+ ", memory=" + memory + ", employee=" + employee + "]";
	}

	public void setEmployee(Employee e) {
		
	}

	
}
