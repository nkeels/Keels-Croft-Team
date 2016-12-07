/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.BYUIDO.model;

import java.io.Serializable;

/**
 *
 * @author Nick
 */
public enum Scene implements Serializable {

    PP("You arrive at Porter Park, anticipating the feeling of grass beneath your feet.", "PP", "RandomScene"),
    RI("You arrive at The Ridge. You've heard it has private rooms. One day you might move there.", "TR", "Apartment Scene"),
    AV("Welcome to Aspen Village! Enjoy the Hot tub, and relax in our comfortable, social rooms!", "AV", "Apartment Scene"),
    TP("Tuscany Place: Mostly known for the girl single apartments, its a pretty social community. The ward even has ward prayer on Sundays", "TP", "Apartment Scene"),
    WM("Windsor Manor: Welcome to 'Hogwarts'! We have a secret room, platform 9 3/4, and private parking!", "WM", "Apartment Scene"),
    NP("NorthPoint: #PartyPlace! We have Papa Johns and a couple of other restaurants. Have you seen our gym?!?", "NP", "Apartment Scene"),
    TW("The Willows: Super clean, nice looking area. Its an all girl dorm. #winkyface", "TW", "Apartment Scene"),
    RK("Ricks Building: Math, History, and Psychology building. People there can USUALLY read minds", "TR", "School Building"),
    TL("Taylor Building: Religion and Humanities building. Has two chapels. This is where you start", "TL", "School Building"),
    MC("Manwaring Center: Has the Crossroads. Students hang out, and 'do homework'.....lets be real.", "MC", "School Building"),
    RN("Romney Building: Science and Geology building. It has a pretty sweet geology museum. Go there. ", "RB", "School Building"),
    SR("Spori Building: The art building. It is an excellent date opportuninty to see the art and other exhibits", "SB", "School Building"),
    FC("Fat Cats: The date center of Rexburg. There is bowling, pool, movies, and best of all.....pizza. What more do you need?.....Honest ", "FC", "Date Scene"),
    P("The Pulze: Most game nerds reside here. If you're into Magic the gathering and Warhammer 40, this is your home. ", "TP", "Date Scene"),
    CR("The Craze: Fun Zone has lazer tag, mini golf, and most importantly pizza", "CR", "Date Scene"),
    MD("McDonalds: Are you lovin' it? You're date will love it. People say they hate it....as they oder a mcdouble....you've done it too.", "MD", "Date Scene"),
    RM("Welcome to R Mountain. You see a wonderful area to hike.", "RM", "Date Scene"),
    PB("Welcome to Splatter Paintball. You smell the smell that smells...smelly. Its a good date to go on.", "PB", "Date Scene"),
    NYB("NewYork Burrito: You enter to see a small little restaurant, great deals on wraps and the wonderful smell of future commitment", "NY", "Date Scene"),
    FO("Fong's: Walk in and see the date center of Rexburg. There is both cheap asian decorations. One of the waitresses is dressed up super weird", "FO", "Date Scene"),
    TF("Thai Food: You enter the restaurant. It smells super good. You have heard that the yellow curry is way good.", "TF", "Date Scene"),
    TB("Welcome to Taco Bell. Its a pretty easy, low key kind of date.", "TB", "Date Scene"),
    SP("Smith Park: You walk through the park and see a playset, a nearby hospital, and open area for a possible picnic. ", "SP", "Date Scene"),
    SD("You walk into the sand dunes. You smell embers from surrounding bonfires, and notice that you have sand in your shoe.", "SD", "Date Scene"),
    CD("Civil Defense Caves: You see a cave entrance, and some open idaho desert land.", "CD", "Date Scene"),
    CS("ColdStone Creamery: Customizable ice cream. It has a pretty 'vanilla' atmosphere, and is good for a date.", "CS", "Date Scene");

    private final String displaySymbol;
    private final String description;
    private final String sceneType;

    Scene(String description, String displaySymbol, String sceneType) {
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
