package com.argondamn.mud.world.factory;

import com.argondamn.mud.world.model.Cell;
import org.springframework.stereotype.Component;

/**
 *
 * @author tim
 */
@Component
public class CellFactory {
    
    private Integer nextCellId;
    public CellFactory() {
        nextCellId = 0;
    }
    
    public Cell getNewCell() {        
        return new Cell(nextCellId++);        
    }
}
