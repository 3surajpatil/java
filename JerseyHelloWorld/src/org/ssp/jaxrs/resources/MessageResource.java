package org.ssp.jaxrs.resources;

import java.util.List;

import javax.inject.Singleton;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.ssp.bean.Message;
import org.ssp.service.MessageService;

@Path("/messages")
@Singleton // if we do not annotate this class as singleton it will create a new object everytime when we hit the request.
public class MessageResource {


	MessageService ms=new MessageService();
	
	@Path("/{name}")
	@GET
	@Produces(MediaType.TEXT_HTML)
	public Response getHellomessage(@PathParam("name") String name)
	{
		String output ="<h1>hello form jaxrs...! "+name+"</h1>";
		
		return Response.status(200).entity(output).build();
	}
	
	
	
	@POST
	@Path("/createMessage")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public String createMessage(Message m1)
	{
		/*
		 * when started this app , first we need to create a message below is sample message json  
		  {
		    "id": 1,
		    "message": "hello there",
		    "author": "suraj",
		    "createTime": 1529831761498
			}
		 */
		
		return ms.addMessage(m1);
	}
	
	
	@Path("/getMessage/{id}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Message getMessage(@PathParam("id")Long id)
	{
		//Message m1=new Message(1L,"hello there","suraj");
		//return m1;
		
		System.out.println("message requested with id "+id);
		
		Message ms1=ms.getMessage(id);
		System.out.println("ms1"+ms1.getMessage());
		return ms1;
	}
	
	
	@Path("/getAllMessages")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getAllMessages()
	{				
		return ms.getAllMessages();
	}
	
	@Path("/updateMessage/{messageId}")
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public  Message updateMessage(@PathParam("messageId") Long messageId,Message msg)
	{		
		System.out.println("message id in resource class for update is :- "+messageId);
		return ms.updateMessage(messageId, msg);	
	}
	
	@Path("/deleteMessage/{messageId}")
	@DELETE
	@Produces(MediaType.TEXT_PLAIN)
	public String deleteMessage(@PathParam("messageId") Long deleteMessageId)
	{
		System.out.println("message id for delete in resource is :="+ deleteMessageId);
		return ms.deleteMessage(deleteMessageId);
		
	}
	
}
