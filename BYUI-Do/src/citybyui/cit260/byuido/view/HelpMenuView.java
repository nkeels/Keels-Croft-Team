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
                  + "\n| Help Menu                                       |"
                  + "\n----------------------------------------------------"
                  + "\nG - What is the goal of the game"
                  + "\nM - How to move"
                  + "\nL - List meanings of stats "
                  + "\nH - How to gain stats"
                  + "\nQ - Quit"
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
    
    GameMenuView helpMenu = new GameMenuView();
    helpMenu.displayMenu();
    }

    private void goalOfGame() {
        System.out.println("\n ***goalOfGame is called***");
    }

    private void howToMove() {
    System.out.println("\n ***howToMove is called***");    
    }

    private void listStats() {
    System.out.println("\n ***ListStats is called***");
    }

    private void gainStats() {
    System.out.println("\n ***gainStats is called***");  
    }

    private void goBack() {
    System.out.println("\n ***goBack is called***");    }
}
