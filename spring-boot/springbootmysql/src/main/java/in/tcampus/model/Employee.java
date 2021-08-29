package in.tcampus.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	@GeneratedValue
	int id;
	String ename;
	float esal;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public float getEsal() {
		return esal;
	}
	public void setEsal(float esal) {
		this.esal = esal;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", ename=" + ename + ", esal=" + esal + "]";
	}
}
