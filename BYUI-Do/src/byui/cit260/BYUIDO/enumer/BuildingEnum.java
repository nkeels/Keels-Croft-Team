/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.BYUIDO.enumer;

import java.awt.Point;
import java.io.Serializable;

/**
 *
 * @author Nick
 */
public enum BuildingEnum implements Serializable {
    
    PORTERPARK(new Point(0,0)),
    THERIDGE(new Point (0,1)),
    ASPENVILLAGE(new Point (0,2)),
    TUSCANYPLACE(new Point (0,3)),
    WINDSORMANOR(new Point (0,4)), 
    NORTHPOINT(new Point (1,0)),
    THEWILLOWS(new Point (1,1)),
    RICKS(new Point (1,2)),
    TAYLOR(new Point (1,3)),
    MANWARING(new Point (1,4)),
    ROMNEY(new Point (2,0)),
    spori(new Point (2,1)),
    pulse(new Point(2,2)),
    craze(new Point(2,3)),
    mcdonalds(new Point(2,4)),
    rmountain(new Point(3,0)),
    paintball(new Point (3,1)),
    newYorkBurrito(new Point (3,2)), 
    fongs(new Point(3,3)),
    tacoBell(new Point(3,4)),
    smithPark(new Point(4,0)),
    sandDunes(new Point(4,1)),
    civilCaves(new Point(4,2)),
    fatCats(new Point(4,3)),
    thaiFood(new Point(4,4));
    
    
    private final Point coordinates;

    private BuildingEnum(Point coordinates) {
        this.coordinates = coordinates;
    }

    public Point getCoordinates() {
        return coordinates;
    }
    

    
}
