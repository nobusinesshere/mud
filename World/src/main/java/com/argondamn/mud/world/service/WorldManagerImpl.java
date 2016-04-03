package com.argondamn.mud.world.service;

import com.argondamn.mud.world.factory.CellFactory;
import com.argondamn.mud.world.model.Actor;
import com.argondamn.mud.world.model.Cell;
import com.argondamn.mud.world.model.World;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author tim
 */
@Component
public class WorldManagerImpl implements WorldManager {

    @Autowired
    CellFactory cellFactory;
    
    World world;
    
    public WorldManagerImpl() {
        world = new World();              
        //cellFactory = new CellFactory();
    }
    
    @PostConstruct
    public void postConstructor() {
        world.addCell(cellFactory.getNewCell());
    }
    
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
