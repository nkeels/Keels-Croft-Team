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

public enum Scene implements Serializable{
        
    PP("You arrive at Porter Park, anticipating the feeling of grass beneath your feet.", "Porter Park", "RandomScene" ),
    RI("Avid scrapbooker, Loves david archuletta, angsty facebook posts about life", "The Ridge", "Apartment Scene"),
    AV("Classified in high school yearbook as most likely to be a cat lady" , "Alpine Village", "Apartment Scene"),
    TP("Takes over 100 seflies, shakey convert that is a borderline rule follower", "Tuscany Place", "Apartment Scene"),
    WM("Loves starbucks hot chocolate, uggs, yoga pants, aviators, and her iPhone.", "Windsor Manor", "Apartment Scene"),
    NP("Super passive aggresive, loves stadium singing, and long walks at night in the gardens ", "North Point", "Apartment Scene"),
    TW("Avid scrapbooker, Loves david archuletta, angsty facebook posts about life", "The Willows", "Apartment Scene"),
    RK("Classified in high school yearbook as most likely to be a cat lady" , "The Ricks", "School Building"),
    TL("Takes over 100 seflies, shakey convert that is a borderline rule follower", "Taylor Building", "School Building"),
    MC("Loves starbucks hot chocolate, uggs, yoga pants, aviators, and her iPhone.", "Manwring Center", "School Building"),
    RN("Super passive aggresive, loves stadium singing, and long walks at night in the gardens ", "Romney Building", "School Building"),
    SR("Avid scrapbooker, Loves david archuletta, angsty facebook posts about life", "Spori Building", "School Builfing");
    
    private final String displaySymbol;
    private final String description;
    private final String sceneType;

    
    Scene(String description, String displaySymbol, String sceneType){
         this.description = description;
         this.displaySymbol = displaySymbol; 
         this.sceneType = sceneType;
         
    }
    


    public String getDisplaySymbol() {
        return displaySymbol;
    }
    

    public String getDescription() {
        return description;
    }

    public String getSceneType() {
        return sceneType;
    }

   
    
    
    
}
