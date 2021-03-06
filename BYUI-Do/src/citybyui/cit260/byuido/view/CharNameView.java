/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citybyui.cit260.byuido.view;

import byui.cit260.BYUIDO.control.GameControl;
import byui.cit260.BYUIDO.model.Character;
import byui.cit260.BYUIDO.model.Player;
import byui.pkgdo.BYUIDo;

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
            ErrorView.display(this.getClass().getName(),
                    "\nInvalid characters name: "
                    + "The name must be greater than one character in length");
            return false;
        }

        Character character = GameControl.createCharacter(charName);

        String characterName = BYUIDo.getCurrentGame().getCharacter().getCharName();

        this.console.println(characterName + " was saved correctly!!!!");
        return true;

    }

    private void displayNextView(Player player) {
        this.console.println("\n=========================================="
                + "\n The Name " + player.getName()
                + "\n has been saved."
                + "\n==========================================");

        CharNameView nameMenu = new CharNameView();
        nameMenu.display();

    }
}
