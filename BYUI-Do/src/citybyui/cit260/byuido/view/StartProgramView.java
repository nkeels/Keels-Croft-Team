/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citybyui.cit260.byuido.view;

import byui.cit260.BYUIDO.control.GameControl;
import byui.cit260.BYUIDO.model.Player;

/**
 *
 * @author Nick
 */
public class StartProgramView extends View {

    public StartProgramView() {

        super("\nPlease enter your name: ");
        this.displayBanner();

    }

    private void displayBanner() {

        this.console.println(
                  "\n|------------------------------------------------|"
                + "\n|                 Welcome!!!                     |"
                + "\n|------------------------------------------------|"
                + "\n| This is the game of BYU-I DO!!!                |"
                + "\n| In this game you will help your character      |"
                + "\n| experience the joys of dating in Rexburg.      |"
                + "\n|                                                |"
                + "\n| In order to find your eternal spouse,          |"
                + "\n| You will begin by finding the girl of          |"
                + "\n| your dreams at one of many Apartments.         |"
                + "\n| You will then work to improve your relationship|"
                + "\n| and build trust by going on dates and          |"
                + "\n| spending time with her. Eventually, you'll     |"
                + "\n| want to ask her to join in matrimony.          |"
                + "\n| When you've won her hand in marriage,          |"
                + "\n| You will be prepared for eternal happiness!    |"
                + "\n|------------------------------------------------|");
    }

    @Override
    public boolean doAction(String playersName) {
        if (playersName.length() < 2) {
            ErrorView.display(this.getClass().getName(),
                    "\nInvalid players name: "
                    + "The name must be greater than one character in length");
            return false;
        }
        Player player = GameControl.createPlayer(playersName);

        if (player == null) {
            ErrorView.display(this.getClass().getName(),
                    "\nError creating the player.");
            return false;
        }

        this.displayNextView(player);
        return true;

    }

    private void displayNextView(Player player) {
        this.console.println("\n==================================================="
                + "\nWelcome to the school of BYU-I, " + player.getName() + "! May your"
                + "\ndreams of marriage ever be in your favor!"
                + "\n===================================================");
        MainMenuView mainMenuView = new MainMenuView();

        mainMenuView.display();
    }

}
