package dmacc.beans;

import javax.persistence.Embeddable;

@Embeddable
public class Employee {
	private String firstname;
	private String lastname;
	
	public Employee() {
		super();
	}
	
	public Employee(String firstName, String lastName) {
		super();
		this.firstname = firstName;
		this.lastname = lastName;
	}

	private String getFirstName() {
		return firstname;
	}

	private void setFirstName(String firstName) {
		this.firstname = firstName;
	}

	private String getLastName() {
		return lastname;
	}

	private void setLastName(String lastName) {
		this.lastname = lastName;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstname + ", lastName=" + lastname + "]";
	}
}
