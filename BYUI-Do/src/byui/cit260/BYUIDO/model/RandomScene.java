/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.BYUIDO.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Nick
 */
public enum RandomScene implements Serializable{
        
    PP("Super passive aggresive, loves stadium singing, and long walks at night in the gardens ", 1, 3),
    RI("Avid scrapbooker, Loves david archuletta, angsty facebook posts about life", 2, 5),
    AV("Classified in high school yearbook as most likely to be a cat lady" , 0, 3),
    TP("Takes over 100 seflies, shakey convert that is a borderline rule follower", 3, 1),
    WM("Loves starbucks hot chocolate, uggs, yoga pants, aviators, and her iPhone.", 4, 2),
    NP("Super passive aggresive, loves stadium singing, and long walks at night in the gardens ", 1, 3),
    TW("Avid scrapbooker, Loves david archuletta, angsty facebook posts about life", 2, 5),
    RK("Classified in high school yearbook as most likely to be a cat lady" , 0, 3),
    TL("Takes over 100 seflies, shakey convert that is a borderline rule follower", 3, 1),
    MC("Loves starbucks hot chocolate, uggs, yoga pants, aviators, and her iPhone.", 4, 2),
    RN("Super passive aggresive, loves stadium singing, and long walks at night in the gardens ", 1, 3),
    SR("Avid scrapbooker, Loves david archuletta, angsty facebook posts about life", 2, 5);
    
    private final Point coordinates;
    private final String description;

    RandomScene(String description, int row, int column){
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