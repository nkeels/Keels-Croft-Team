/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citybyui.cit260.byuido.view;

import byui.cit260.BYUIDO.control.GameControl;
import byui.pkgdo.BYUIDo;

/**
 *
 * @author Scotty
 */
public class MainMenuView extends View {

    private String menu;

    public MainMenuView() {
        super("\n"
                + "\n----------------------------------------------------"
                + "\n| Main Menu                                        |"
                + "\n----------------------------------------------------"
                + "\n|N - start new game                                |"
                + "\n|G - get and start saved game                      |"
                + "\n|H - Get help on how to play the game              |"
                + "\n|S - Save game                                     |"
                + "\n|Q - Quit                                          |"
                + "\n----------------------------------------------------");
    }

    @Override
    public boolean doAction(String choice) {

        choice = choice.toUpperCase();

        switch (choice) {
            case "N":
                this.startNewGame();
                break;
            case "G":
                this.startExistingGame();
                break;
            case "H":
                HelpMenuView helpMenu = new HelpMenuView();
                helpMenu.display();
                break;
             case "S":
                this.saveGame();
                break;
            default:
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid Selection *** Try Again");
                break;

        }
        return false;
    }

    private void startNewGame() {
        GameControl.createNewGame(BYUIDo.getPlayer());

        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();

    }

    private void startExistingGame() {
        this.console.println("\n\nEneter the FilePath for the file where the game "
                        + "is saved");
        String filePath = this.getInput();
        
        try{
            GameControl.getSavedGame(filePath);
        }catch (Exception ex) {
            ErrorView.display("mainMenuView", ex.getMessage());
        }
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
        }
    }

    

        private void saveGame() {
        this.console.println("\n\nEnter the file Path for the file where the game "
                        + "is to be saved");
        String filePath = this.getInput();
        
        try{
            GameControl.saveGame(BYUIDo.getCurrentGame(), filePath);
        }catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
    }
}
