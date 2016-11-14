/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citybyui.cit260.byuido.view;

/**
 *
 * @author Scotty
 */
public class GameMenuView extends View{
    private String menu;

    public GameMenuView() {
        super( "\n"
                  + "\n----------------------------------------------------"
                  + "\n| Game Menu                                        |"
                  + "\n----------------------------------------------------"
                  + "\n|N - Name of Character                             |"                             
                  + "\n|Y - Confirm                                       |"
                  + "\n|W - Whatever                                      |"
                  + "\n|SA - Search Area                                  |"
                  + "\n|O - Old Man Guessing Game                         |"
                  + "\n|Q - Main Menu                                     |"
                  + "\n----------------------------------------------------");
    }
   
        @Override
    public boolean doAction(String choice) {
        
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
            case "SA":
                this.inArea();
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
        }
        return false;
    }

    private void charaName() {
        CharNameView nameMenu = new CharNameView();
        nameMenu.display();
    }

    private void confirm() {
        System.out.println("\n*** The confirm function was called ***");
    }

    private void actionMenuView() {
        ActionMenuView actionMenu = new ActionMenuView();
        actionMenu.display();
    }

    private void olMan() {
        NumberGuessView  numberGuess = new NumberGuessView();
        numberGuess.display();
    }
    
    private void inArea(){
    SelectLocationView search = new SelectLocationView();
    search.display();
            
    }
}

