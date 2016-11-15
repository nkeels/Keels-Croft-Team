/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citybyui.cit260.byuido.view;

import byui.cit260.BYUIDO.control.GameControl;
import static java.lang.Integer.parseInt;

/**
 *
 * @author Nick
 */
public class NumberGuessView extends View{
    
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
       public boolean doAction(String playersNumber) {
        
        int numberChoice = parseInt(playersNumber);
        int number = GameControl.numberGuessingGame(numberChoice);
        
        
        if (number < 0){
            System.out.println("\nThat's not the right number");
            return false;
        } 
        if (number == 0){
            System.out.println("\nToo low");
            return false;
        }
        if (number == 1) {
            System.out.println("\nToo High");
            return false;
        }
        if (number == 3) {
            System.out.println("\nYou got it");
            return true;
        }  
       return true;
    }
}
