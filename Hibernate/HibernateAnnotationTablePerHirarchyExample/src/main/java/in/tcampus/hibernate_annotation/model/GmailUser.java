package in.tcampus.hibernate_annotation.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="GmailUser")
public class GmailUser extends User {

	int inboxSize;
	int sentMailSize;
	int allMailSize;
	
	@Column(name="inboxSize")
	public int getInboxSize() {
		return inboxSize;
	}

	public void setInboxSize(int inboxSize) {
		this.inboxSize = inboxSize;
	}
	@Column(name="sentMailSize")
	public int getSentMailSize() {
		return sentMailSize;
	}

	public void setSentMailSize(int sentMailSize) {
		this.sentMailSize = sentMailSize;
	}
	@Column(name="allMailSize")
	public int getAllMailSize() {
		return allMailSize;
	}

	public void setAllMailSize(int allMailSize) {
		this.allMailSize = allMailSize;
	}

	
	
	public GmailUser(int id, String firstName, String lastName, String mobile, int inboxSize, int sentMailSize,int allMailSize) {
		super(id, firstName, lastName, mobile);
		this.inboxSize=inboxSize;
		this.sentMailSize=sentMailSize;
		this.allMailSize=allMailSize;
		
	}

	public GmailUser() {	
		super();
	}


	
	
}
