/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citybyui.cit260.byuido.view;

import byui.cit260.BYUIDO.control.GameControl;
import byui.cit260.BYUIDO.control.SaveControl;
import byui.cit260.BYUIDO.model.Player;
import java.util.Scanner;

/**
 *
 * @author Scotty
 */
public class CharNameView {
        
    private String promptMessage;
    
   public CharNameView() {
       
    this.promptMessage = "\nEnter the name of your character: ";
    }


    public void displayCharNameView() {
        
        boolean done = false; //set flag to not done
        do {
            //prompt for and get players name
            String playersName = this.getPlayersName();
            if (playersName.toUpperCase().equals('Q')) // user wants to quit
                return; //exit the game
            
            //do the requested action and display the next view
            done = this.doAction(playersName);
            
        }
        while (!done);  
    }

    private String getPlayersName() {
        /*
        While valid value has not been entered
            Display promptmessage
        Get the value entered from keyboard
        Trim front and trailing blanks off the name
        
        If the length of the value is blank then
            display "Invalid value: the value cannot be blank"
        continue
        ENDIF
        
        Break
        
        Endwhile
        Return name
        */
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        while (!valid) {
            System.out.println("\n" + this.promptMessage);
            
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

    private boolean doAction(String playersName) {
        if (playersName.length() < 2){
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
                         + "\n has been saved."
                         + "\n==========================================");
    
        CharNameView nameMenu = new CharNameView();
        nameMenu.displayCharNameView();
    
        return;
    } 
}
    

