package com.argondamn.mud.client.services;

import com.google.gson.Gson;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;


/**
 *
 * @author tim
 */
@Path("service")
public class TestService {
    
    @Autowired
    TestResource resource;
    
    @GET
    @Path("test")
    @Produces(MediaType.TEXT_PLAIN)
    public String testCall() {
        return resource.getThingToSay();
    }
    
    @GET
    @Path("nextTest")
    @Produces(MediaType.APPLICATION_JSON)
    public Object testJson() {
        String f = "here's my string";
        return new Gson().toJson(f);                
    }
}
