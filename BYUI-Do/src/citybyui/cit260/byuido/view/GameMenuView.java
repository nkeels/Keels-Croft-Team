/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citybyui.cit260.byuido.view;

import java.util.Scanner;

/**
 *
 * @author Scotty
 */
public class GameMenuView {
    private String menu;

    public GameMenuView() {
        this.menu = "\n"
                  + "\n----------------------------------------------------"
                  + "\n| Game Menu                                        |"
                  + "\n----------------------------------------------------"
                  + "\n|N - Name of Character                              |"                             
                  + "\n|Y - Confirm                                        |"
                  + "\n|W - Whatever                                       |"
                  + "\n|O - Old Man Guessing Game                          |"
                  + "\n|Q - Main Menu                                      |"
                  + "\n----------------------------------------------------";
    }
   
    
    
    public void displayGameMenuView() {
        
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
                this.charaName();
                break;
            case "Y":
                this. confirm();
                break;
            case "O":
                this. olMan();
                break;
            case "W":
                this.actionMenuView();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
        }
        return false;
    }

    private void charaName() {
        CharNameView nameMenu = new CharNameView();
        nameMenu.displayCharNameView();
    }

    private void confirm() {
        System.out.println("\n*** The confirm function was called ***");
    }

    private void actionMenuView() {
        ActionMenuView actionMenu = new ActionMenuView();
        actionMenu.displayActionMenuView();
    }

    private void olMan() {
        NumberGuessView  numberGuess = new NumberGuessView();
        numberGuess.displayNumberGuessView();}
    
    }
    

