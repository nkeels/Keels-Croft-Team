/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citybyui.cit260.byuido.view;

import byui.cit260.BYUIDO.control.SaveControl;
import byui.cit260.BYUIDO.model.Player;

/**
 *
 * @author Scotty
 */
public class CharNameView extends View {

    private String promptMessage;

    public CharNameView() {

        super("\nEnter the name of your character: ");
    }

    @Override
    public boolean doAction(String playersName) {
        if (playersName.length() < 2) {
            System.out.println("\nInvalid players name: "
                    + "The name must be greater than one character in length");
            return false;
        }
        int player = SaveControl.createCharName(playersName);

        if (player < 0) {
            System.out.println("\nError creating the character's name.");
            return false;
        }

        System.out.println(playersName + " was saved correctly.");
        return true;

    }

    private void displayNextView(Player player) {
        System.out.println("\n=========================================="
                + "\n The Name " + player.getName()
                + "\n has been saved.  THIS IS A TEST"
                + "\n==========================================");

        CharNameView nameMenu = new CharNameView();
        nameMenu.display();

    }
}
