/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.pkgdo;

import byui.cit260.BYUIDO.model.Player;
import byui.cit260.BYUIDO.model.Character;
import byui.cit260.BYUIDO.model.Game;
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
          System.out.println("\nPlayer two:" + zelda.toString());
          
          Game bYUIdo = new Game();
          bYUIdo.setPlayerName("Rachel McAdams");
          System.out.println("\nPlayer three:" + bYUIdo.toString());
          
          Location location = new Location();
          location.setTitle("Natalie Portman");
          System.out.println("\nPlayer Four:" + location.toString());
          
          Map map = new Map();
          map.setRowCount(0.5);
          System.out.println("\nPlayer Five:" + map.toString());
          
          Scene scene = new Scene();
          scene.setDescription("Jennifer Lawrence");
          System.out.println("\nPlayer Six:" + scene.toString());
          
          RandomScene randomscene = new RandomScene();
          randomscene.setTitle("Jennifer Anniston");
          randomscene.setDescription("hello");
          randomscene.setDisplaySymbol("North");
          System.out.println("\nPlayer Seven:" + randomscene.toString());
          
       
      }
    }    
    
