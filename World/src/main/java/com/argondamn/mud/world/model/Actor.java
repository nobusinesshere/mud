package com.argondamn.mud.world.model;

/**
 *
 * @author tim
 */
public class Actor {

    private Integer characterId;

    public Actor() {

    }

    public Actor(Integer characterId) {
        this.characterId = characterId;
    }

    public Integer getCharacterId() {
        return characterId;
    }
}
