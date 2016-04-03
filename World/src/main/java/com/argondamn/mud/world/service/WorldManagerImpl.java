package com.argondamn.mud.world.service;

import com.argondamn.mud.world.model.Actor;
import com.argondamn.mud.world.model.Cell;
import com.argondamn.mud.world.model.World;
import org.springframework.stereotype.Component;

/**
 *
 * @author tim
 */
@Component
public class WorldManagerImpl implements WorldManager {

    World world = new World();       
    
    @Override
    public Cell getCell(Integer cellId) {
        return world.getCell(cellId);
    }

    @Override
    public void transferActor(Integer characterId, Integer cellIdFrom, Integer cellIdTo) {
        world.getCell(cellIdFrom).removeCharacter(characterId);
        world.getCell(cellIdTo).addCharacter(characterId);
    }

    @Override
    public Actor getActor(Integer characterId) {
        return world.getCharacter(characterId);
    }    
}
