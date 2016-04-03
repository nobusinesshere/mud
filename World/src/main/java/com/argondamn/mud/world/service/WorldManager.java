package com.argondamn.mud.world.service;

import com.argondamn.mud.world.model.Actor;
import com.argondamn.mud.world.model.Cell;

/**
 *
 * @author tim
 */
public interface WorldManager {        
    public Cell getCell(Integer cellId);    
    public Actor getActor(Integer characterId);
    public void transferActor(Integer characterId, Integer cellIdFrom, 
            Integer cellIdTo);   
    
}
