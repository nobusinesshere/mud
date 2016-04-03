package com.argondamn.mud.world.service;

import com.argondamn.mud.world.model.Cell;
import com.google.gson.Gson;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author tim
 */
@Path("world")
public class WorldService {
    
    @Autowired 
    WorldManager worldManager;
    
    @GET
    @Path("cell/{cellId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCell(@PathParam("cellId") Integer cellId) {
        Cell cell = worldManager.getCell(cellId);
        
        return Response.ok().entity(new Gson().toJson(cell)).build();
    }
}
