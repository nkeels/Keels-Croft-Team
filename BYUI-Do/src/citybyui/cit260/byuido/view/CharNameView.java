/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citybyui.cit260.byuido.view;

import byui.cit260.BYUIDO.control.GameControl;
import byui.cit260.BYUIDO.control.SaveControl;
import byui.cit260.BYUIDO.model.Character;
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
    public boolean doAction(String charName) {
        if (charName.length() < 2) {
            System.out.println("\nInvalid characters name: "
                    + "The name must be greater than one character in length");
            return false;
        }

        GameControl.createCharacter(charName);

        System.out.println(charName + " was saved correctly. THIS IS A TEST TOO");
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
