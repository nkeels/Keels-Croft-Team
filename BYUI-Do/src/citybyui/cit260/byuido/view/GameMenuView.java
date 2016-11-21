/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citybyui.cit260.byuido.view;

import byui.cit260.BYUIDO.control.MapControl;
import byui.cit260.BYUIDO.model.Location;
import byui.cit260.BYUIDO.model.Map;
import byui.pkgdo.BYUIDo;

/**
 *
 * @author Scotty
 */
public class GameMenuView extends View {

    private String menu;

    public GameMenuView() {
        super("\n"
                + "\n----------------------------------------------------"
                + "\n| Game Menu                                        |"
                + "\n----------------------------------------------------"
                + "\n|N - Name of Character                             |"
                + "\n|Y - Confirm                                       |"
                + "\n|W - Whatever                                      |"
                + "\n|SA - Search Area                                  |"
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
                this.confirm();
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
        NumberGuessView numberGuess = new NumberGuessView();
        numberGuess.display();
    }

    private void inArea() {
        // displayMap
        Location[][] locations = BYUIDo.getCurrentGame().getMap().getLocations();
        this.displayMap(locations);
        SelectLocationView search = new SelectLocationView();
        search.display();
    }

    private void displayMap(Location[][] locations) {
      
        
        System.out.println("\n Where will you go?");

        System.out.println("\n 1---2---3---4---5");
        for ( row = 0; row < .length; noOfRows++ ) {
            System.out.println("|");
            System.out.print("\n 1");
            for (column = 0; columnCount < noOfColumns; column++ ) {
                System.out.println("_");
                Location = locations[row][column];
                if (Location) {
                    display;
                } 
                System.out.println("|");
            }
            System.out.println("_");
        }

    }
}


