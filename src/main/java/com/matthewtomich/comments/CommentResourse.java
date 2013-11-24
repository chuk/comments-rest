package com.matthewtomich.comments;

import com.google.inject.Inject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("comments")
public class CommentResourse {
	//private final Greeter greeter;

	/*@Inject
	public HelloResource(final Greeter greeter) {
		this.greeter = greeter;
	}*/
	
	@GET
	@Path("echo/{name}")
	public String echo(@PathParam("name") final String name) {
		return name;
	}

}
