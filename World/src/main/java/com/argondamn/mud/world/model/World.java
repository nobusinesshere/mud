package com.argondamn.mud.world.model;


import java.util.Map;

/**
 *
 * @author tim
 */
public class World {
    
    private Map<Integer, Cell> cells;
    private Map<Integer, Actor> characters;

    public World() {
        
    }
    
    public World(Map<Integer, Cell> cells, Map<Integer, Actor> characters) {
        this.cells = cells;
        this.characters = characters;
    }        
    
    public Cell getCell(Integer cellId) {
        return cells.get(cellId);
    }
    public Actor getCharacter(Integer characterId) {
        return characters.get(characterId);
    }
}
