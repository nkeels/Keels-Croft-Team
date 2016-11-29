/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.BYUIDO.control;

import byui.cit260.BYUIDO.model.Game;
import byui.cit260.BYUIDO.model.Map;
import byui.cit260.BYUIDO.model.Player;
import byui.pkgdo.BYUIDo;
import citbyui.cit260.BYUIDO.exceptions.GameControlException;

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
        
        Game game = new Game();
        BYUIDo.setCurrentGame(game);
        
        game.setPlayer(player);
        
        Map map = MapControl.createMap();
        game.setMap(map);
        
        MapControl.moveActorsToStartingLocation(map);
        
    }
    public static void numberGuessingGame(int usersGuess) throws GameControlException{
          
        int actualNumber = (int) (Math.random() * 10);
        
        if (usersGuess < 1 || usersGuess > 10){
              throw new GameControlException("Cannot make choice " + usersGuess + ", " + "because that number is not a whole number between 1 and 10.");
        }else if (usersGuess < actualNumber) {
               throw new GameControlException( usersGuess + "is too low.");

        }else if (usersGuess > actualNumber) {
                         throw new GameControlException( usersGuess + "is too high."); 

        
        }
           
    }

    static void assignScenesToLocations(Map map) {
System.out.println("\n Suh dude");    }
}
