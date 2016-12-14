/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citybyui.cit260.byuido.view;

import byui.cit260.BYUIDO.control.MapControl;
import static byui.cit260.BYUIDO.enumer.BuildingEnum.PULSE;
import static byui.cit260.BYUIDO.enumer.BuildingEnum.civilCaves;
import static byui.cit260.BYUIDO.enumer.BuildingEnum.craze;
import static byui.cit260.BYUIDO.enumer.BuildingEnum.fatCats;
import static byui.cit260.BYUIDO.enumer.BuildingEnum.fongs;
import static byui.cit260.BYUIDO.enumer.BuildingEnum.mcdonalds;
import static byui.cit260.BYUIDO.enumer.BuildingEnum.newYorkBurrito;
import static byui.cit260.BYUIDO.enumer.BuildingEnum.paintball;
import static byui.cit260.BYUIDO.enumer.BuildingEnum.rmountain;
import static byui.cit260.BYUIDO.enumer.BuildingEnum.sandDunes;
import static byui.cit260.BYUIDO.enumer.BuildingEnum.smithPark;
import static byui.cit260.BYUIDO.enumer.BuildingEnum.tacoBell;
import static byui.cit260.BYUIDO.enumer.BuildingEnum.thaiFood;

import byui.cit260.BYUIDO.model.Location;
import byui.pkgdo.BYUIDo;
import citbyui.cit260.BYUIDO.exceptions.MapControlException;
import java.awt.Point;

/**
 *
 * @author Scotty
 */
class DateLocationView extends View {

    private String message;

    public DateLocationView() {
        super("\n                                                    "
                + "\n----------------------------------------------------"
                + "\n|Where do you want to go?                          |"
                + "\n----------------------------------------------------"
                + "\n|P - The Pulse                                     |"
                + "\n|C - The Craze                                     |"
                + "\n|M - Mcdonalds                                     |"
                + "\n|R - R Mountain                                    |"
                + "\n|PB - Paintball                                    |"
                + "\n|N - New York Burrito                              |"
                + "\n|F - Fongs                                         |"
                + "\n|T - Taco Bell                                     |"
                + "\n|TB - The Taylor                                   |"
                + "\n|SP - Smith Park                                   |"
                + "\n|SD - Sand Dunes                                   |"
                + "\n|C - Civil Defence Caves                           |"
                + "\n|TF - Thai Food                                    |"
                + "\n|Q - Go back to main menu                          |"
                + "\n----------------------------------------------------");

    }

    public DateLocationView(String message) {

    }

    @Override
    public boolean doAction(String choice) {
        try {
            choice = choice.toUpperCase();
            switch (choice) {
                case "P":
                    this.thePulse();
                    break;
                case "CR":
                    this.theCraze();
                    break;
                case "RM":
                    this.rMountain();
                    break;
                case "PB":
                    this.paintBall();
                    break;
                case "NYB":
                    this.newYorkBurrito();
                    break;
                case "TF":
                    this.thaiFood();
                    break;
                case "FO":
                    this.fongs();
                    break;
                case "TB":
                    this.tacoBell();
                    break;
                case "SP":
                    this.smithPark();
                    break;
                case "SD":
                    this.sandDunes();
                    break;
                case "CD":
                    this.civilDefense();
                    break;
                case "FC":
                    this.fatCats();
                    break;
                case "MD":
                    this.mcDonalds();
                    break;
                default:
                    ErrorView.display(this.getClass().getName(),
                            "\n*** Invalid Selection *** Try Again");
                    break;
            }
            InAreaView searchLocation = new InAreaView();
            searchLocation.display();
        } catch (MapControlException ex) {
            ErrorView.display("SelectLoctaionView", "Invalid location");
        }
        return true;
    }

    private void thePulse() throws MapControlException {
        //get point
        Point coordinates = PULSE.getCoordinates();
        //get character
        byui.cit260.BYUIDO.model.Character mc = BYUIDo.getCurrentGame().getCharacter();
        //get location
        Location[][] locations = BYUIDo.getCurrentGame().getMap().getLocations();
        //call move function
        MapControl.move(locations, mc, coordinates);

    }

    private void theCraze() throws MapControlException {
        Point coordinates = craze.getCoordinates();
        //get character
        byui.cit260.BYUIDO.model.Character mc = BYUIDo.getCurrentGame().getCharacter();
        //get location
        Location[][] locations = BYUIDo.getCurrentGame().getMap().getLocations();
        //call move function
        MapControl.move(locations, mc, coordinates);
    }

    private void mcDonalds() throws MapControlException {
        Point coordinates = mcdonalds.getCoordinates();
        //get character
        byui.cit260.BYUIDO.model.Character mc = BYUIDo.getCurrentGame().getCharacter();
        //get location
        Location[][] locations = BYUIDo.getCurrentGame().getMap().getLocations();
        //call move function
        MapControl.move(locations, mc, coordinates);
    }

    private void rMountain() throws MapControlException {
        Point coordinates = rmountain.getCoordinates();
        byui.cit260.BYUIDO.model.Character mc = BYUIDo.getCurrentGame().getCharacter();
        //get location
        Location[][] locations = BYUIDo.getCurrentGame().getMap().getLocations();
        //call move function
        MapControl.move(locations, mc, coordinates);
    }

    private void paintBall() throws MapControlException {

        Point coordinates = paintball.getCoordinates();
        //get character
        byui.cit260.BYUIDO.model.Character mc = BYUIDo.getCurrentGame().getCharacter();
        //get location
        Location[][] locations = BYUIDo.getCurrentGame().getMap().getLocations();
        //call move function
        MapControl.move(locations, mc, coordinates);
    }

    private void newYorkBurrito() throws MapControlException {

        Point coordinates = newYorkBurrito.getCoordinates();
        //get character
        byui.cit260.BYUIDO.model.Character mc = BYUIDo.getCurrentGame().getCharacter();
        //get location
        Location[][] locations = BYUIDo.getCurrentGame().getMap().getLocations();
        //call move function
        MapControl.move(locations, mc, coordinates);
    }

    private void fongs() throws MapControlException {

        Point coordinates = fongs.getCoordinates();
        //get character
        byui.cit260.BYUIDO.model.Character mc = BYUIDo.getCurrentGame().getCharacter();
        //get location
        Location[][] locations = BYUIDo.getCurrentGame().getMap().getLocations();
        //call move function
        MapControl.move(locations, mc, coordinates);
    }

    private void tacoBell() throws MapControlException {

        Point coordinates = tacoBell.getCoordinates();
        //get character
        byui.cit260.BYUIDO.model.Character mc = BYUIDo.getCurrentGame().getCharacter();
        //get location
        Location[][] locations = BYUIDo.getCurrentGame().getMap().getLocations();
        //call move function
        MapControl.move(locations, mc, coordinates);
    }

    private void smithPark() throws MapControlException {

        Point coordinates = smithPark.getCoordinates();
        //get character
        byui.cit260.BYUIDO.model.Character mc = BYUIDo.getCurrentGame().getCharacter();
        //get location
        Location[][] locations = BYUIDo.getCurrentGame().getMap().getLocations();
        //call move function
        MapControl.move(locations, mc, coordinates);
    }

    private void sandDunes() throws MapControlException {

        Point coordinates = sandDunes.getCoordinates();
        //get character
        byui.cit260.BYUIDO.model.Character mc = BYUIDo.getCurrentGame().getCharacter();
        //get location
        Location[][] locations = BYUIDo.getCurrentGame().getMap().getLocations();
        //call move function
        MapControl.move(locations, mc, coordinates);
    }

    private void civilDefense() throws MapControlException {

        Point coordinates = civilCaves.getCoordinates();
        //get character
        byui.cit260.BYUIDO.model.Character mc = BYUIDo.getCurrentGame().getCharacter();
        //get location
        Location[][] locations = BYUIDo.getCurrentGame().getMap().getLocations();
        //call move function
        MapControl.move(locations, mc, coordinates);
    }

    private void fatCats() throws MapControlException {

        Point coordinates = fatCats.getCoordinates();
        //get character
        byui.cit260.BYUIDO.model.Character mc = BYUIDo.getCurrentGame().getCharacter();
        //get location
        Location[][] locations = BYUIDo.getCurrentGame().getMap().getLocations();
        //call move function
        MapControl.move(locations, mc, coordinates);
    }

    private void thaiFood() throws MapControlException {
        Point coordinates = thaiFood.getCoordinates();
        //get character
        byui.cit260.BYUIDO.model.Character mc = BYUIDo.getCurrentGame().getCharacter();
        //get location
        Location[][] locations = BYUIDo.getCurrentGame().getMap().getLocations();
        //call move function
        MapControl.move(locations, mc, coordinates);
    }

}
