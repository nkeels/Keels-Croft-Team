/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citybyui.cit260.byuido.view;

/**
 *
 * @author Nick
 */
public class StartProgramView {
    
    private String promptMessage;
    
   public StartProgramView() {
       
    this.promptMessage = "\nPlease enter your name: ";
    this.displayBanner();
    
}

    private void displayBanner() {
        
        System.out.println(
        "\n**********************************************"
      + "\n*                                             "
      + "\n* This is the game of BYU-I DO!!!             " 
      + "\n* In this game you will help your character   "
      + "\n* experience the joys of dating in Rexburg.   "
      + "\n*                                             "          
      + "\n* In order to find your eternal spouse,       "  
      + "\n* You will begin by finding the girl of       "  
      + "\n* your dreams at one of many Apartments.      "  
      + "\n* You will then work to improve your relationship "  
      + "\n* and build trust by going on dates and       " 
      + "\n* spending time with her. Eventually, you'll  "  
      + "\n* want to ask her to join in matrimony.       " 
      + "\n* When you've won her hand in marriage,       "
      + "\n* You will be prepared for eternal happiness! "  );
    }

    public void displayStartProgramView() {
        System.out.println("\n*** displayStartProgram() function called ***");
    }
}
