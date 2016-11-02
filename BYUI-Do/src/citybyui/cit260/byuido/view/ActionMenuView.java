/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citybyui.cit260.byuido.view;

import java.util.Scanner;

/**
 *
 * @author Nick
 */
public class ActionMenuView {
    
    private String menu; 
      
    public ActionMenuView() {
        this.menu = "\n"
                  + "\n----------------------------------------------------"
                  + "\n|What do you do?                                    |"
                  + "\n----------------------------------------------------"
                  + "\nT - Talk"
                  + "\nF - Flirt"
                  + "\nA - Ask for a date"
                  + "\nK - Kiss"
                  + "\nP - Propose"
                  + "\nQ - Quit"
                  + "\n----------------------------------------------------";
        
        
    }
    public void displayActionMenuView() {
        
        boolean done = false;
        do {
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q"))
                return;
            done = this.doAction(menuOption);
        }while (!done);
    }

    private String getMenuOption() {
        Scanner keyboard = new Scanner (System.in);
        String value = "";
        boolean valid = false;
    
            while(!valid) {
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
            case "T":
                this.talkTo();
                break;
            case "F":
                this.flirtWith();
                break;
            case "A":
                this.askDate();
                break;
            case "K":
                this.kissGirl();
                break;
            case "P":
                this.proposeTo();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
                
        }
        return false;
    }

    private void talkTo() {
        System.out.println("\n*** talkTo function called ***"); 
    }

    private void flirtWith() {
        System.out.println("\n*** flirtWith function called ***");  
    }

    private void askDate() {
        System.out.println("\n*** askDate function called ***");    
    }

    private void kissGirl() {
        System.out.println("\n*** kissGirl function called ***");   
    }

    private void proposeTo() {
        System.out.println("\n*** proposeTo function called ***"); 
    }
 }

