package com.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/")
public class HelloEndpoint {
	@GET
	public String hi() {
		return "Hello World!";
	}
}
