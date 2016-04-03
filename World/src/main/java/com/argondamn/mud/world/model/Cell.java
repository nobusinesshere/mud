package com.argondamn.mud.world.model;

import java.util.EnumMap;
import java.util.HashSet;

import java.util.Set;

/**
 *
 * @author tim
 */
public class Cell {    
    private final EnumMap<Direction, Integer> neighborCells;
    private final Set<Integer> characters;
    private final String description;
    private final Integer cellId;

    public Cell() {
        neighborCells = new EnumMap<>(Direction.class);
        characters = new HashSet<>();
        description = "No description";
        cellId = null;
    }

    public Cell(EnumMap<Direction, Integer> neighborCells, Set<Integer> characters, String description, Integer cellId) {
        this.neighborCells = neighborCells;
        this.characters = characters;
        this.description = description;
        this.cellId = cellId;
    }    
    
    public Cell addNeighborCell(Direction direction, Integer cellId) {
        neighborCells.put(direction, cellId);
        return this;
    }
    
    public Cell addCharacter(Integer characterId) {
        characters.add(characterId);
        return this;
    }
    
    public Cell removeCharacter(Integer characterId) {
        characters.remove(characterId);
        return this;
    }
    
    /**
     * @return the neighborCells
     */
    public EnumMap<Direction, Integer> getNeighborCells() {
        return neighborCells;
    }

    /**
     * @return the characters
     */
    public Set<Integer> getCharacters() {
        return characters;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    public Integer getCellId() {
        return cellId;
    }       
}
