/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citybyui.cit260.byuido.view;

import byui.cit260.BYUIDO.control.SaveControl;
import byui.pkgdo.BYUIDo;

/**
 *
 * @author Scotty
 */
public class SaveGameView extends View {

    public SaveGameView() {
        super("\n Where do you want to save your game?");
    }

    @Override
    public boolean doAction(String value) {
        //check to see if the value is null, return false and print an error message
        if (value == null) {
            ErrorView.display("SaveGameView", "Invalid Path Name. Try again.");
            return false;
        } else {
        //save the game to the file path, print a message then return true 
        SaveControl.saveGame(BYUIDo.getCurrentGame(), value);
        this.console.println("\nYour game was saved successfully!");
            return true;
        }

    }
}
