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
 * @author Scotty
 */
public enum Girl implements Serializable {

    Stacy("Stacy","Super passive aggresive, loves stadium singing, and long walks at night in the gardens ", 1, 3),
    Kytanna("Kytanna", "Avid scrapbooker, Loves david archuletta, angsty facebook posts about being single", 2, 5),
    Brieaunah("Kytanna", "Classified in high school yearbook as most likely to be a cat lady", 0, 3),
    Brielle("Brielle","Takes over 100 seflies, shakey convert that is a borderline rule breaker.", 3, 1),
    Michelle("Michelle", "Loves starbucks hot chocolate, uggs, yoga pants, aviators, and her iPhone.", 4, 2);

    private final Point coordinates;
    private final String description;
    private final String name;
    Girl(String name, String description, int row, int column) {
        this.description = description;
        this.coordinates = new Point(row, column);
        this.name = name;

    }

    public Point getCoordinates() {
        return coordinates;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }
    

}
