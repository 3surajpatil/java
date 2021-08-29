package in.tcampus.hibernate_annotation.model;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="RediffmailUser")
public class RediffmailUser extends User {

	
	Date accountOpeningDate;		
	String accesslocation;

	@Column(name="accountOpeningDate")
	public Date getAccountOpeningDate() {
		return accountOpeningDate;
	}

	public void setAccountOpeningDate(Date accountOpeningDate) {
		this.accountOpeningDate = accountOpeningDate;
	}

	@Column(name="accesslocation")
	public String getAccesslocation() {
		return accesslocation;
	}

	public void setAccesslocation(String accesslocation) {
		this.accesslocation = accesslocation;
	}
	
}
