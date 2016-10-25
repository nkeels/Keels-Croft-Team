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
        "\n*****************************************"
      + "\n*                                        "
      + "\n* This is the game of BYU-I DO!!!        " 
      + "\n* In this game you will help your character"
      + "\n* experience the joys of dating in Rexburg."
      + "\n*                                        "          
        );
    }
}
