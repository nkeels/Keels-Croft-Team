/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.pkgdo;

import byui.cit260.BYUIDO.model.Player;
import byui.cit260.BYUIDO.model.Character;
import byui.cit260.BYUIDO.model.DateScene;
import byui.cit260.BYUIDO.model.Friend;
import byui.cit260.BYUIDO.model.Game;
import byui.cit260.BYUIDO.model.Girl;
import byui.cit260.BYUIDO.model.Location;
import byui.cit260.BYUIDO.model.Scene;
import byui.cit260.BYUIDO.model.RandomScene;
import byui.cit260.BYUIDO.model.Map;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Scotty
 */
public class BYUIDo implements Serializable {

    public static void main(String[] args) {

        
        Player playerOne = new Player();
        playerOne.setName("Nicholas Cage");
        System.out.println("\nPlayer one:" + playerOne.toString());

        Character zelda = new Character();
        zelda.setCharName("Katy Perry");
        zelda.setStress(180);
        zelda.setConfide(25);
        zelda.setGender("Male");
        zelda.setPersonalityQual(79);
        System.out.println("\nCharacter Name: " + zelda.toString());


        Game bYUIdo = new Game();
        bYUIdo.setPlayerName("Rachel McAdams");
        bYUIdo.setConfirmation("Yes");
        System.out.println("\nGame File Name:" + bYUIdo.toString());


        Location location = new Location();
        location.setTitle("Tuscany Apartments");
        location.setTime("it is 10:45 PM.");
        location.setCoordinate(256.453);
        System.out.println("\nName of Location:" + location.toString());


      

        Map map = new Map();
        map.setRowCount(0.5);
        map.setColumnCount(0.6);
        System.out.println("\nnumber of rows:" + map.toString());

    
        Scene scene = new Scene();
        scene.setDescription("meet Jennifer Lawrence");
        scene.setDisplaySymbol("JL");
        System.out.println("\nWhen you arrive, you " + scene.toString());

     

        RandomScene randomscene = new RandomScene();
        randomscene.setTitle("Jennifer Anniston");
        randomscene.setDescription("hello to a new face");
        randomscene.setDisplaySymbol("North");
        System.out.println("\nWhat happened:" + randomscene.toString());

        Girl old = new Girl();
        old.setCharName("Jamie Snow");
        old.setStress(12);
        old.setConfide(64);
        old.setGender("Female");
        old.setPersonalityQual(100);
        old.setAge(24);
        old.setInterest("likes sports");
        System.out.println("\nAge of the girl: " + old.toString());


        Friend grade = new Friend();
        old.setCharName("Samson Grayson");
        old.setStress(95);
        old.setConfide(50);
        old.setGender("Male");
        old.setPersonalityQual(12);
        grade.setGrade("sophmore");
        grade.setAge(19);
        System.out.println("\nWhat grade is he? " + grade.toString()
        );
        
        DateScene place = new DateScene();
        scene.setDescription("You go on a date with Jennifer Lawrence");
        scene.setDisplaySymbol("W");
        place.setTitle("The Craze");
        place.setInteraction("You go bowling!");
        place.setFoodbased("true");
        System.out.println("\nWhere shall we go for our date? " + place.toString());
       


    }
}
