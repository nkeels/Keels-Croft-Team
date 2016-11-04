    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citybyui.cit260.byuido.view;

import byui.cit260.BYUIDO.control.GameControl;
import byui.pkgdo.BYUIDo;
import java.util.Scanner;

/**
 *
 * @author Nick
 */
public class HelpMenuView {
    
    private String menu;

    public HelpMenuView() {
        this.menu = "\n"
                  + "\n----------------------------------------------------"
                  + "\n| Help Menu                                         |"
                  + "\n----------------------------------------------------"
                  + "\nG - What is the goal of the game                    |"
                  + "\nM - How to move                                     |"
                  + "\nL - List meanings of stats                          |"
                  + "\nH - How to gain stats                               |"
                  + "\nP - Previous Menu                                   |"
                  + "\nQ - Quit                                            |"
                  + "\n----------------------------------------------------";
    }
    
    public void displayHelpMenuView() {
        
        boolean done = false;
        do{
        String menuOption = this.getMenuOption();
        if (menuOption.toUpperCase().equals("Q"))
            return;
        
        done = this.doAction(menuOption);
    }    while (!done);
    }
    private String getMenuOption() {
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
    

    private boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "G":
                this.goalOfGame();
                break;
            case "M":
                this.howToMove();
                break;
            case "L":
                this.listStats();
                break;
            case "H":
                this.gainStats();
                break;
            case "P":
                this.helpBack();
            case "Q":
                this.goBack();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
                
        }
        return false;
    }
    private void startNewGame() {
    GameControl.createNewGame(BYUIDo.getPlayer());
    
    GameMenuView gameMenu = new GameMenuView();
    gameMenu.displayGameMenuView();
    
 
    }

    private void goalOfGame() {
        System.out.println("\n The goal if the game is to "
                          +"\n find a girl, go on dates, foster emotion, and"
                          +"\n commit her to marriage. You win by recieving a "
                          +"\n marriage certificate.");
    }

    private void howToMove() {
        System.out.println("\n You move your character by choosing"
                         + "\n a date location, or a general location"
                         + "\n and select people within areas to talk to.");    
    }

    private void listStats() {
    System.out.println("\n Navigate through the character Menu. Within that"
                     + "\n Within that menu, there will be an option that lists"
                     + "\n your characters stat points");
    }

    private void gainStats() {
    System.out.println("\nYou can gain or lose stat points by going"
                     + "\non dates, making choices on events and actions. Every"
                     + "\nevent you do, or interaction you do choose affects stats.");  
    }

    private void goBack() {
        System.out.println("\n goBack has been called");
    }

    private void helpBack() {
        System.out.println("\n In any menu, simply select the Q option."
                     + "\n this selection will either take you to the" 
                     + "\n previous menu, or the start game menu ");
    }
}

