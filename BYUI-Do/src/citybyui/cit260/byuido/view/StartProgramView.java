/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citybyui.cit260.byuido.view;

import byui.cit260.BYUIDO.control.GameControl;
import byui.cit260.BYUIDO.model.Player;

/**
 *
 * @author Nick
 */
public class StartProgramView extends View{
    
    private String promptMessage;
    
   public StartProgramView() {
       
    super( "\nPlease enter your name: ");
    this.displayBanner();
    
}

    private void displayBanner() {
        
        System.out.println(
        "\n|------------------------------------------------|"
      + "\n|                 Welcome!!!                     |"        
      + "\n|------------------------------------------------|"
      + "\n| This is the game of BYU-I DO!!!                |" 
      + "\n| In this game you will help your character      |"
      + "\n| experience the joys of dating in Rexburg.      |"
      + "\n|                                                |"          
      + "\n| In order to find your eternal spouse,          |"  
      + "\n| You will begin by finding the girl of          |"  
      + "\n| your dreams at one of many Apartments.         |"  
      + "\n| You will then work to improve your relationship|"  
      + "\n| and build trust by going on dates and          |" 
      + "\n| spending time with her. Eventually, you'll     |"  
      + "\n| want to ask her to join in matrimony.          |" 
      + "\n| When you've won her hand in marriage,          |"
      + "\n| You will be prepared for eternal happiness!    |"
      + "\n|------------------------------------------------|"  );
    }

    @Override
    public boolean doAction(String playersName) {
        if (playersName.length() < 2){
        System.out.println("\nInvalid players name: "
                    + "The name must be greater than one character in length");
        return false;
    }
        Player player = GameControl.createPlayer(playersName);
        
        if (player == null) {
            System.out.println("\nError creating the player.");
            return false;
        }
        
        this.displayNextView(player);
        return true;

    }
    private void displayNextView(Player player) {
        System.out.println("\n=========================================="
                         + "\n Welcome to the school of BYUI " + player.getName()
                         + "\n ! May your dreams of marriage ever be in your favor!"
                         + "\n==========================================");
    MainMenuView mainMenuView = new MainMenuView();
    
    mainMenuView.display();
    }
    
}
