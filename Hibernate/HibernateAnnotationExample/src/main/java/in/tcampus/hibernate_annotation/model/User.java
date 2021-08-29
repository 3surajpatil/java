package in.tcampus.hibernate_annotation.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;	
	@Column(name="firstName")
	String firstName;
	String lastName;
	String mobile;
	
	
	public User(int id, String firstName, String lastName, String mobile) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobile = mobile;
	}
		
	
	public User(String firstName, String lastName, String mobile) {
	this.firstName=firstName;
			this.lastName=lastName;
			this.mobile=mobile;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}




	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", mobile=" + mobile + "]";
	}

}
