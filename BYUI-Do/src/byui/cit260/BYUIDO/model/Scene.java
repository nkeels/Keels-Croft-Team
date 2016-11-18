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
    RI("You arrive at The Ridge. You've heard it has private rooms. One day you might move there.", "The Ridge", "Apartment Scene"),
    AV("Welcome to Aspen Village! Enjoy the Hot tub, and relax in our comfortable, social rooms!" , "Alpine Village", "Apartment Scene"),
    TP("Mostly known for the girl single apartments, its a pretty social community. The ward even has ward prayer on Sundays", "Tuscany Place", "Apartment Scene"),
    WM("Welcome to 'Hogwarts'! We have a secret room, platform 9 3/4, and private parking!", "Windsor Manor", "Apartment Scene"),
    NP("#PartyPlace! We have Papa Johns and a couple of other restaurants. Have you seen our gym?!?", "North Point", "Apartment Scene"),
    TW("Super clean, nice looking area. Its an all girl dorm. #winkyface", "The Willows", "Apartment Scene"),
    RK("Math, History, and Psychology building. People there can USUALLY read minds" , "The Ricks", "School Building"),
    TL("Religion and Humanities building. Has two chapels. This is where you start", "Taylor Building", "School Building"),
    MC("Has the Crossroads. Students hang out, and 'do homework'.....lets be real.", "Manwring Center", "School Building"),
    RN("Science and Geology building. It has a pretty sweet geology museum. Go there. ", "Romney Building", "School Building"),
    SR("The art building. It is an excellent date opportuninty to see the art and other exhibits", "Spori Building", "School Building"),
    FC("The date center of Rexburg. There is bowling, pool, movies, and best of all.....pizza. What more do you need?.....Honest ", "Fat Cats", "Date Scene"),
    P("The date center of Rexburg. There is bowling, pool, movies, and best of all.....pizza. What more do you need?.....Honest ", "Fat Cats", "Date Scene"),
    CR("The date center of Rexburg. There is bowling, pool, movies, and best of all.....pizza. What more do you need?.....Honest ", "Fat Cats", "Date Scene"),
    MD("The date center of Rexburg. There is bowling, pool, movies, and best of all.....pizza. What more do you need?.....Honest ", "Fat Cats", "Date Scene"),
    RM("The date center of Rexburg. There is bowling, pool, movies, and best of all.....pizza. What more do you need?.....Honest ", "Fat Cats", "Date Scene"),
    PB("The date center of Rexburg. There is bowling, pool, movies, and best of all.....pizza. What more do you need?.....Honest ", "Fat Cats", "Date Scene"),
    NYB("The date center of Rexburg. There is bowling, pool, movies, and best of all.....pizza. What more do you need?.....Honest ", "Fat Cats", "Date Scene"),
    TF("The date center of Rexburg. There is bowling, pool, movies, and best of all.....pizza. What more do you need?.....Honest ", "Fat Cats", "Date Scene"),
    FO("The date center of Rexburg. There is bowling, pool, movies, and best of all.....pizza. What more do you need?.....Honest ", "Fat Cats", "Date Scene"),
    TB("The date center of Rexburg. There is bowling, pool, movies, and best of all.....pizza. What more do you need?.....Honest ", "Fat Cats", "Date Scene"),
    SP("The date center of Rexburg. There is bowling, pool, movies, and best of all.....pizza. What more do you need?.....Honest ", "Fat Cats", "Date Scene"),
    SD("The date center of Rexburg. There is bowling, pool, movies, and best of all.....pizza. What more do you need?.....Honest ", "Fat Cats", "Date Scene"),
    CD("The date center of Rexburg. There is bowling, pool, movies, and best of all.....pizza. What more do you need?.....Honest ", "Fat Cats", "Date Scene"),
    CS("Customizable ice cream. It has a pretty 'vanilla' atmosphere, and is good for a date.", "Cold Stone", "Date Scene");
    
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
