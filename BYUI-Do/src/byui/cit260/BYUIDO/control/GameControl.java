/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.BYUIDO.control;

import byui.cit260.BYUIDO.model.Player;
import byui.pkgdo.BYUIDo;
import static java.lang.Integer.parseInt;

/**
 *
 * @author Nick
 */
public class GameControl {

    public static Player createPlayer(String name) {
        
        if(name == null) {
            return null;
        }
        
        Player player = new Player();
        player.setName(name);
        
        BYUIDo.setPlayer(player);
        
        return player;
    }

    public static void createNewGame(Player player) {
         System.out.println("\n*** createNewGame function called ***");
        
    }
    public static int numberGuessingGame(int usersGuess){
          
        int actualNumber = (int) (Math.random() * 10);
        
        if (usersGuess < 1 || usersGuess > 10){
              return -1;
        }else if (usersGuess < actualNumber) {
            return 0;
        }else if (usersGuess > actualNumber) {
                        return 1; 

        }else {
            return 3;
        }
           
    }
}
