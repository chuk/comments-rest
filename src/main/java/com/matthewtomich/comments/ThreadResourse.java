package com.matthewtomich.comments;

import com.google.inject.Inject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("threads")
public class ThreadResourse {
	//private final Greeter greeter;

	/*@Inject
	public HelloResource(final Greeter greeter) {
		this.greeter = greeter;
	}*/
	
	@GET
	@Path("")
	public String list() {
		return "OK";
	}

}
