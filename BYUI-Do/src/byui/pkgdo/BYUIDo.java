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
public class BYUIDo implements Serializable{

    
    
      public static void main(String[] args) {
            
         //set all values for classes
          Player playerOne = new Player();
          playerOne.setName("Nicholas Cage");
          System.out.println("\nPlayer one:" + playerOne.toString());
          
          Character zelda = new Character();
          zelda.setCharName("Katy Perry");
          System.out.println("\nCharacter Name: " + zelda.toString());
          
          Character stress = new Character();
          stress.setStress(180);
          System.out.println("\nStress Level: " + stress.toString());
          
          Character confide = new Character();
          confide.setConfide(25);
          System.out.println("\nConfidence level:" + confide.toString());
          
          Character gender = new Character();
          gender.setGender("Male");
          System.out.println("\nGender:" + gender.toString());
          
          Character persona = new Character();
          persona.setPersonalityQual(79);
          System.out.println("\nQuality of Personality:" + persona.toString());
          
          Game bYUIdo = new Game();
          bYUIdo.setPlayerName("Rachel McAdams");
          System.out.println("\nGame File Name:" + bYUIdo.toString());
          
          Game confirm = new Game();
          confirm.setConfirmation("Yes");
          System.out.println("\nDo you wish to continue? " + confirm.toString());
          
          Location location = new Location();
          location.setTitle("Tuscany Apartments");
          System.out.println("\nName of Location:" + location.toString());
          
          Location date = new Location();
          date.setTime(10:45);
          System.out.println("\nTime of day:" + date.toString());
          
          Location grid = new Location();
          grid.setCoordinate(256.453);
          System.out.println("\nLocation on grid:" + grid.toString());
          
          Map map = new Map();
          map.setRowCount(0.5);
          System.out.println("\nnumber of rows:" + map.toString());
          
          Map life = new Map();
          life.setColumnCount(0.6);
          System.out.println("\nnumber of columns:" + life.toString());
          
          Scene scene = new Scene();
          scene.setDescription("meet Jennifer Lawrence");
          System.out.println("\nWhen you arrive, you " + scene.toString());
          
          Scene symbol = new Scene();
          symbol.setDisplaySymbol("JL");
          System.out.println("\ninitials of Jennifer Lawrence: " + symbol.toString());
          
          RandomScene randomscene = new RandomScene();
          randomscene.setTitle("Jennifer Anniston");
          randomscene.setDescription("hello to a new face");
          randomscene.setDisplaySymbol("North");
          System.out.println("\nWhat happened:" + randomscene.toString());
          
          Girl old = new Girl();
          old.setAge(24);
          System.out.println("\nAge of the girl: " + old.toString());
          
          Girl hobby = new Girl();
          hobby.setInterest("likes sports");
          System.out.println("\nFavorite Hobby: " + hobby.toString());
          
          Friend grade = new Friend();
          grade.setGrade("sophmore");
          System.out.println("\nWhat grade is he? " + grade.toString()
          );
          
          Friend age = new Friend();
          age.setAge(19);
          System.out.println("\nWhat age is he? " + age.toString()
          );
          
          DateScene place = new DateScene();
          place.setTitle("The Craze");
          System.out.println("\nWhere shall we go for our date? " + place.toString());
          
          DateScene interact = new DateScene();
          interact.setInteraction("You go bowling!");
          System.out.println("\nWhat shall we do? " + interact.toString());
          
          DateScene food = new DateScene();
          food.setFoodbased("true");
          System.out.println("\nCan we eat here? " + food.toString());
          
          
      }
    }
        
    
