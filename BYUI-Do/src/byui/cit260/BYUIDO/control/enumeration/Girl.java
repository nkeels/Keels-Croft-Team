/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.BYUIDO.control.enumeration;

import java.awt.Point;
import java.io.Serializable;

/**
 *
 * @author Scotty
 */
public enum Girl implements Serializable {

    Stacy("Super passive aggresive, loves stadium singing, and long walks at night in the gardens ", 1, 3),
    Kytanna("Avid scrapbooker, Loves david archuletta, angsty facebook posts about life", 2, 5),
    Brieaunah("Classified in high school yearbook as most likely to be a cat lady", 0, 3),
    Brielle("Takes over 100 seflies, shakey convert that is a borderline rule follower", 3, 1),
    Michelle("Loves starbucks hot chocolate, uggs, yoga pants, aviators, and her iPhone.", 4, 2);

    private final Point coordinates;
    private final String description;

    Girl(String description, int row, int column) {
        this.description = description;
        this.coordinates = new Point(row, column);

    }

    public Point getCoordinates() {
        return coordinates;
    }

    public String getDescription() {
        return description;
    }

}
