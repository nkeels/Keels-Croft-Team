/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citybyui.cit260.byuido.view;

import byui.cit260.BYUIDO.control.GameControl;
import byui.cit260.BYUIDO.control.MapControl;
import byui.cit260.BYUIDO.enumer.Scene;
import byui.pkgdo.BYUIDo;

/**
 *
 * @author Nick
 */
public class HelpMenuView extends View {

    private String menu;

    public HelpMenuView() {
        super("\n"
                + "\n----------------------------------------------------"
                + "\n| Help Menu                                         |"
                + "\n----------------------------------------------------"
                + "\nG - What is the goal of the game                    |"
                + "\nM - How to move                                     |"
                + "\nL - List meanings of stats                          |"
                + "\nH - How to gain stats                               |"
                + "\nQ - Quit                                            |"
                + "\n----------------------------------------------------");
    }

    @Override
    public boolean doAction(String choice) {

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
                this.console.println("\n*** Invalid Selection *** Try Again");
                break;

        }
        return false;
    }

    private void startNewGame() {
        GameControl.createNewGame(BYUIDo.getPlayer());

        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();

    }

    private void goalOfGame() {
        this.console.println("\n The goal if the game is to "
                + "\n find a girl, go on dates, foster emotion, and"
                + "\n commit her to marriage. You win by recieving a "
                + "\n marriage certificate.");
    }

    private void howToMove() {
        this.console.println("\n You move your character by choosing"
                + "\n a date location, or a general location"
                + "\n and select people within areas to talk to.");

        Scene[] scenes = MapControl.sceneSort();
        for (Scene scene : scenes) {
            this.console.println(scene.getDisplaySymbol() + " " + scene.getDescription());
        }
        return;
    }

    private void listStats() {
        this.console.println("\n Navigate through the character Menu. Within that"
                + "\n Within that menu, there will be an option that lists"
                + "\n your characters stat points");
    }

    private void gainStats() {
        this.console.println("\nYou can gain or lose stat points by going"
                + "\non dates, making choices on events and actions. Every"
                + "\nevent you do, or interaction you do choose affects stats.");
    }

    private void goBack() {
        this.console.println("\n In any menu, simply select the Q option."
                + "\n this selection will either take you to the"
                + "\n previous menu, or the start game menu ");
    }
}
