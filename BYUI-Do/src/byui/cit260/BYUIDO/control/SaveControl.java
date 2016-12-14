/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.BYUIDO.control;

import byui.cit260.BYUIDO.model.Game;
import citybyui.cit260.byuido.view.ErrorView;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author Scotty
 */
public class SaveControl implements Serializable {

    public static int createCharName(Character character) {
        System.out.println("\n*** createCharName function has been called ***");
        return 1;
    }

    public static int createCharName(int character) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void saveGame(Game game, String filePath) {

        try (ObjectOutputStream out
                = new ObjectOutputStream(new FileOutputStream(filePath))){ // create the file stream

            out.writeObject(game);

        } catch (IOException ex) {
            ErrorView.display("SaveControl", "Error saving the game");
        }
    }
}


