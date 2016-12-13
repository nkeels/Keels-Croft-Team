/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citybyui.cit260.byuido.view;

import byui.cit260.BYUIDO.control.GameControl;
import citbyui.cit260.BYUIDO.exceptions.GameControlException;

/**
 *
 * @author Nick
 */
public class NumberGuessView extends View {

    private String menu;

    public NumberGuessView() {
        super("\n"
                + "\n----------------------------------------------------"
                + "\n|Guess a number between 1 and 10                    |"
                + "\n|                                                   |"
                + "\n|Q - Main Menu                                      |"
                + "\n----------------------------------------------------");
    }

    @Override
    public boolean doAction(String charactersNumber) {

        try {
            int numberChoice = Integer.parseInt(charactersNumber);
        } catch (NumberFormatException nf) {
            this.console.println("Enter a whole number between 1 and 10, or enter Q to quit");
            return false;
        }
        int numberChoice = Integer.parseInt(charactersNumber);
        try {
            GameControl.numberGuessingGame(numberChoice);
            this.console.println("\nYou got it!!!!");
            return true;
        } catch (GameControlException ge) {
            ErrorView.display(this.getClass().getName(),
                            ge.getMessage());
            return false;
        }
    }

}
