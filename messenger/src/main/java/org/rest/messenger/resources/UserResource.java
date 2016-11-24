package org.rest.messenger.resources;

import java.io.File;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.rest.messenger.model.User;
import org.rest.messenger.service.UserService;

@Path("/UserService")
public class UserResource {
	
	UserService userService = new UserService();
	
	@GET
	@Path("/users")
	@Produces(MediaType.APPLICATION_XML)
	public List<User> getUsers(){
		System.out.println(" users resource called");
		return userService.getUserDetail();
	}
	
	@GET
	@Path("/usersjson")
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> getUsersInJson(){
		System.out.println(" users resource called");
		return userService.getUserDetail();
	}
	
	@GET
	@Path("/userdestails")
	@Produces(MediaType.APPLICATION_OCTET_STREAM)
	public File getUsersdetails(){
		System.out.println(" users resource called");
		return userService.getUserInfo();
	}
}
