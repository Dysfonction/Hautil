package com.hautil.exemple;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class HelloService {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getMessage() {
        return "Hello world!";
    }

    @GET
    @Path("/{nom}")
    @Produces(MediaType.TEXT_PLAIN)
    public String getMessagePerso(@PathParam("nom") String nom) {
        return "Hello "+nom;
    }
}