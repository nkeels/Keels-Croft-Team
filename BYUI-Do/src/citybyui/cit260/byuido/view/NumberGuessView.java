/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citybyui.cit260.byuido.view;

import static java.lang.Integer.parseInt;
import java.util.Scanner;

/**
 *
 * @author Nick
 */
public class NumberGuessView {
    
    private String menu;
    
    public NumberGuessView() {
        this.menu = "\n"
                  + "\n----------------------------------------------------"
                  + "\n|Guess a number between 1 and 10                    |"
                  + "\n|                                                   |"
                  + "\n|Q - Main Menu                                      |"
                  + "\n----------------------------------------------------";
                      }

    void displayNumberGuessView() {
        boolean done = false; //set flag to not done
        do {
            //prompt for and get players name
            String playersNumber = this.getPlayersNumber();
            if (playersNumber.toUpperCase().equals('Q')) // user wants to quit
                return; //exit the game
            
            //do the requested action and display the next view
            done = this.doAction(playersNumber);
            
        }
        while (!done);  
    }

    private String getPlayersNumber() {
       
       
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        while (!valid) {
            System.out.println("\n" + this.menu);
            
            value = keyboard.nextLine();
            value = value.trim();
            
            if (value.length() < 1) {
                System.out.println("\nInvalid value: value cannot be blank");
                continue;
            }
        break;
        }
        return value;        
    }
    
    private boolean doAction(String playersNumber) {
        
        int numberChoice = parseInt(playersNumber);
        int actualNumber = (int) (Math.random() * 10);
        
        if (numberChoice < 1 || numberChoice > 10){
        System.out.println("\nInvalid: please enter a number between 1 and 10 ");
        return false;
        }else if (numberChoice < actualNumber) {
            System.out.println("\nSorry you chose too low");
        }else if (numberChoice > actualNumber) {
                        System.out.println("\nSorry you chose too high");

        }else {
            System.out.println("\nYou're Correct!!!");
            return true;
        }
        return false;
    } 
}
    
        
    
    

