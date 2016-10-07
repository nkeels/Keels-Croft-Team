/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.pkgdo;

import byui.cit260.BYUIDO.model.Player;
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
       
      }
    }    
    
