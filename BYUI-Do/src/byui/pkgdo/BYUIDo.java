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
            
         
          Player playerOne = new Player();
          playerOne.setName("Nicholas Cage");
          System.out.println("\nPlayer one:" + playerOne.toString());
          
          Character playerTwo = new Character();
          playerTwo.setCharName("Katy Perry");
          System.out.println("\nPlayer two:" + playerTwo.toString());
          
          Game playerThree = new Game();
          playerThree.setPlayerName("Rachel McAdams");
          System.out.println("\nPlayer three:" + playerThree.toString());
          
          Location playerFour = new Location();
          playerFour.setTitle("Natalie Portman");
          System.out.println("\nPlayer Four:" + playerFour.toString());
          
          Map playerFive = new Map();
          playerFive.setRowCount(0.5);
          System.out.println("\nPlayer Five:" + playerFive.toString());
          
          Scene playerSix = new Scene();
          playerSix.setDescription("Jennifer Lawrence");
          System.out.println("\nPlayer Six:" + playerSix.toString());
          
          RandomScene playerSeven = new RandomScene();
          playerSeven.setTitle("Jennifer Anniston");
          System.out.println("\nPlayer Seven:" + playerSeven.toString());
          
       
      }
    }    
    
