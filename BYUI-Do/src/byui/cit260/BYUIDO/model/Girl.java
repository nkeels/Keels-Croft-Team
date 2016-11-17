/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.BYUIDO.model;

import java.awt.Point;
import java.io.Serializable;

/**
 *
 * @author Scotty
 */
public enum Girl implements Serializable{
        
    Stacy("Super passive aggresive, loves stadium singing, and long walks at night in the gardens "),
    Kytanna("Avid scrapbooker, Loves david archuletta, angsty facebook posts about life"),
    Brieaunah("Classified in high school yearbook as most likely to be a cat lady"),
    Brielle("Takes over 100 seflies, shakey convert that is a borderline rule follower"),
    Michelle("Loves starbucks hot chocolate, uggs, yoga pants, aviators, and her iPhone. ");
    
    private final Point coordinates;
    private final String description;

    Girl(String description){
         this.description = description;
         coordinates = new Point(1,1); 
        
    }
    

    public Point getCoordinates() {
        return coordinates;
    }

    public String getDescription() {
        return description;
    }

   
    
    
    
}
