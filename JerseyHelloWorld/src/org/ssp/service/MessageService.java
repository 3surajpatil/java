package org.ssp.service;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.ssp.bean.Message;

public class MessageService {

	//List<Message> messageList=new ArrayList<Message>();
	
	Map<Long,Message> messageMap=new HashMap<Long,Message>();
	
	public String addMessage(Message msg)
	{
		Long id=messageMap.size()+1L; System.out.println("id="+id);
		messageMap.put(id,msg);
		System.out.println(msg.getMessage()+" id="+msg.getId()+"messageMap size"+messageMap.size());
		return "added message :- '"+msg.getMessage()+"' ";
	}
	
	public Message getMessage(Long id)
	{
		System.out.println("id in mesage service is "+id);
		
		return messageMap.get(id);
	}
	
	public String deleteMessage(Long id)
	{
		System.out.println("message id for delete is "+id);
		
		String msg=messageMap.get(id).getMessage();
		messageMap.remove(id);
		return "removed message :- '"+msg+"' ";		
	}
	
	public Message updateMessage(Long id,Message message)
	{
		System.out.println(messageMap+" id ="+id);
		String CurrentMessage=messageMap.get(id).getMessage();
		messageMap.remove(id);
		messageMap.put(id, message);
		
		System.out.println("updated message from '"+CurrentMessage+"' To '"+message.getMessage()+"'");
		
		return messageMap.get(id);
	}
	
	public List<Message> getAllMessages()
	{
		/*
		Message m1=new Message(1L,"first message...!","Suraj");		
		Message m2=new Message(1L,"first message...!","supriya");				
		messageList.add(m1);
		messageList.add(m2);		
		return messageList;
		*/
		
		
		List al=new ArrayList(messageMap.values());
		return al;
	}
	
}
