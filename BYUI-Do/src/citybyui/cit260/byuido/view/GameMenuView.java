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
      
//this just needs to be aligned, essentially. You'll need to submit it though        
        System.out.println("\n Where will you go?");

        System.out.println("|----0------1------2------3------4");
        for ( int row = 0; row < locations.length; row++ ) {
            System.out.println("\n" + row + "|------|------|------|------|------|");
            
            for (int column = 0; column < locations.length; column++ ) {
                System.out.printf(" --");
               Location location = locations[row][column];
               String mp = location.getScene().getDisplaySymbol();
               System.out.printf(mp);
                } 
             System.out.printf("|");
            }
               System.out.println("=="); 
            }
            
}
        

   



