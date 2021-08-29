package org.ssp.bean;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Message {

	//adding a comment to test the git commit feature.
	
	long id;
	String message;
	String author;
	Date createTime;
	
	public Message()
	{
		
	}
	
	public Message(long id, String message, String author) {
		super();
		this.id = id;
		this.message = message;
		this.author = author;
		this.createTime=new Date();
	}
	
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	
	
}
