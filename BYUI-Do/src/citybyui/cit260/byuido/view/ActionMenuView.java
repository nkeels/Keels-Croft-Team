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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private boolean doAction(String menuOption) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
