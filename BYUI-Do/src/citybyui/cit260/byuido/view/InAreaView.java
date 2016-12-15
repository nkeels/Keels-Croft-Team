/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citybyui.cit260.byuido.view;

import byui.cit260.BYUIDO.control.GirlControl;
import byui.pkgdo.BYUIDo;

/**
 *
 * @author Nick
 */
public class InAreaView extends View {

    public InAreaView() {
        super("\n"
                + "\n----------------------------------------------------"
                + "\n| What do you do?                                  |"
                + "\n----------------------------------------------------"
                + "\n|S - Search the area                               |"
                + "\n|T - Talk a random person                          |"
                + "\n|A - Adventure the area                            |"
                + "\n|H - Get help on how to play the game              |"
                + "\n|P - Print out list                                |"
                + "\n|S - Save game                                     |"
                + "\n|Q - Quit                                          |"
                + "\n----------------------------------------------------");
    }

    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase();

        switch (choice) {
            case "SA":
                this.searchTheArea();
                break;
            case "T":
                this.talkToOldMan();
                 break;
            case "A":
                this.goAdventure();
                break;
            case "H":
                HelpMenuView helpMenu = new HelpMenuView();
                helpMenu.display();
            case "S":
                this.saveGame();
            case "P":
                GirlControl.PrintGirlReport(choice);
                break;
                default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
        }
        return false;
    }

    private void searchTheArea() {
        String sceneDesc = BYUIDo.getCurrentGame().getMap().getLocal().getScene().getDescription();
        System.out.println(sceneDesc);
        
    }

    private void talkToOldMan() {
        NumberGuessView guess = new NumberGuessView();
        guess.display();
    }

    private void goAdventure() {
        this.console.println("You found one of the Girls!");
        ActionMenuView act = new ActionMenuView();
        act.display();
    }

    private void saveGame() {
        System.out.println("This function has been called");
    }

    private void goBack() {
        System.out.println("This function has been called");
    }

}
