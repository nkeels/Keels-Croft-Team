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
 * @author Scotty
 */
public class MainMenuView {
    private String menu;

    public MainMenuView() {
        this.menu = "\n"
                  + "\n----------------------------------------------------"
                  + "\n| Main Menu                                        |"
                  + "\n----------------------------------------------------"
                  + "\nN - start new game"
                  + "\nG - get and start saved game"
                  + "\nH - Get help on how to play the game"
                  + "\nS - Save game"
                  + "\nQ - Quit"
                  + "\n----------------------------------------------------";
    }
   
    
    
    public void displayMainMenuView() {
        
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
            case "N":
                this.startNewGame();
                break;
            case "G":
                this.startExistingGame();
                break;
            case "H":
                this.displayHelpMenu();
                HelpMenuView helpMenu = new HelpMenuView();
                helpMenu.displayHelpMenuView();
                break;
            case "S":
                this.saveGame();
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

    private void startExistingGame() {
    System.out.println("***startExisting Game function called ***");    
    }

    private void displayHelpMenu() {
    System.out.println("***helpMenu function called ***");
    }
    
    private void saveGame() {
    System.out.println("***saveGame function called ***");    
    }
}

