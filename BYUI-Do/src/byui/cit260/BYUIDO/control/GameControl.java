/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.BYUIDO.control;

import byui.cit260.BYUIDO.enumer.BuildingEnum;
import byui.cit260.BYUIDO.model.Game;
import byui.cit260.BYUIDO.model.Map;
import byui.cit260.BYUIDO.model.Player;
import byui.cit260.BYUIDO.model.Character;
import byui.cit260.BYUIDO.model.Location;
import byui.pkgdo.BYUIDo;
import citbyui.cit260.BYUIDO.exceptions.GameControlException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Nick
 */
public class GameControl {

    
    
    public static Player createPlayer(String name) {

        if (name == null) {
            return null;
        }

        Player player = new Player();
        player.setName(name);

        BYUIDo.setPlayer(player);

        return player;
    }

    public static Character createCharacter(String name) {

        if (name == null) {
            return null;
        }

        Character character = new Character();
        int confide = 0;
        int charisma = 0;
        int personality = 0;
        int stress = 0;
        String gender = "Male";
        

        character.setCharName(name);
        character.setConfide(confide);
        character.setStress(stress);
        character.setCharisma(charisma);
        character.setGender(gender);
        character.setPersonalityQual(personality);
        
        
        Location[][] array = BYUIDo.getCurrentGame().getMap().getLocations();
        Location startLocation = array[BuildingEnum.TAYLOR.getCoordinates().x][BuildingEnum.TAYLOR.getCoordinates().y];
        character.setPlace(startLocation);

        BYUIDo.getCurrentGame().setCharacter(character);
        
        return character;
    }

    public static void createNewGame(Player player) {

        Game game = new Game();
        BYUIDo.setCurrentGame(game);

        game.setPlayer(player);

        Map map = MapControl.createMap();
        game.setMap(map);

        MapControl.moveActorsToStartingLocation(map);

    }

    public static void numberGuessingGame(int usersGuess) throws GameControlException {

        int actualNumber = (int) (Math.random() * 10);

        if (usersGuess < 1 || usersGuess > 10) {
            throw new GameControlException("Cannot make choice " + usersGuess + ", " + "because that number is not a whole number between 1 and 10.");
        } else if (usersGuess < actualNumber) {
            throw new GameControlException(usersGuess + " is too low.");

        } else if (usersGuess > actualNumber) {
            throw new GameControlException(usersGuess + " is too high.");
        }

    }

    static void assignScenesToLocations(Map map) {
       System.out.println("\n Suh dude");
    }

    public static void setCurrentLocation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static void saveGame(Game game, String filepath) throws GameControlException{
        try(FileOutputStream fops = new FileOutputStream(filepath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(game);
        } catch (Exception ex) {
            throw new GameControlException(ex.getMessage());
        }

}
    public static void getSavedGame(String filepath) throws GameControlException{
        Game game = null;
        
        try(FileInputStream fops = new FileInputStream(filepath)) {
            ObjectInputStream input = new ObjectInputStream(fops);
            
            game = (Game) input.readObject();
        } catch (Exception ex) {
            throw new GameControlException(ex.getMessage());
        }
        BYUIDo.setCurrentGame(game);
    
        }
}
