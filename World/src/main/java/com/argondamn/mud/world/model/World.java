package com.argondamn.mud.world.model;


import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author tim
 */
public class World {
    
    private Map<Integer, Cell> cells;
    private Map<Integer, Actor> actors;

    public World() {
        cells = new HashMap<Integer, Cell>();
        actors = new HashMap<Integer, Actor>();
    }
    
    public World(Map<Integer, Cell> cells, Map<Integer, Actor> actors) {
        this.cells = cells;
        this.actors = actors;
    }      
    
    public World addCell(Cell cell) {
        cells.put(cell.getCellId(), cell);
        return this;
    }
    
    public World addActor(Actor actor) {
        actors.put(actor.getCharacterId(), actor);
        return this;
    }
    
    public Cell getCell(Integer cellId) {
        return cells.get(cellId);
    }
    public Actor getCharacter(Integer characterId) {
        return actors.get(characterId);
    }
}
