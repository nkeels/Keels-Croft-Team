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
    P("Most game nerds reside here. If you're into Magic the gathering and Warhammer 40, this is your home. ", "The Pulse", "Date Scene"),
    CR("The Craze: Fun Zone has lazer tag, mini golf, and most importantly pizza", "Fat Cats", "Date Scene"),
    MD("Are you lovin' it? You're date will love it. People say they hate it....as they oder a mcdouble....you've done it too.", "McDonalds", "Date Scene"),
    RM("Welcome to R Mountain. You see a wonderful area to hike.", "Fat Cats", "Date Scene"),
    PB("Welcome to Splatter Paintball. You smell the smell that smells...smelly. Its a good date to go on.", "Splatter Paintball", "Date Scene"),
    NYB("You enter to see a small little restaurant, great deals on wraps and the wonderful smell of future commitment", "New York Burrito", "Date Scene"),
    FO("Walk in and seThe date center of Rexburg. There is boe cheap asian decorations. One of the waitresses is dressed up super wierd", "Old Fongs", "Date Scene"),
    TF("You enter the restaurant. It smells super good. You have heard that the yellow curry is way good.", "Thai Food Place", "Date Scene"),
    TB("Welcome to Taco Bell. Its a pretty easy ,low key kind of date.", "Fat Cats", "Date Scene"),
    SP("You walk through the park and see a playset, a nearby hospital, and open area for a possible picnic. ", "Smith Park", "Date Scene"),
    SD("You Walk into the sand dunes. You smell ember from surrounding bonfires, and notice that you have sand in your shoe.", "Sand Dunes", "Date Scene"),
    CD("You see a cave entrance, and some open idaho desert land.", "Civil Defense Caves", "Date Scene"),
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
