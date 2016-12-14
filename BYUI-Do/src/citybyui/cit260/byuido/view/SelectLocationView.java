/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citybyui.cit260.byuido.view;

import byui.cit260.BYUIDO.control.MapControl;
import static byui.cit260.BYUIDO.enumer.BuildingEnum.ASPENVILLAGE;
import static byui.cit260.BYUIDO.enumer.BuildingEnum.MANWARING;
import static byui.cit260.BYUIDO.enumer.BuildingEnum.NORTHPOINT;
import static byui.cit260.BYUIDO.enumer.BuildingEnum.PORTERPARK;
import static byui.cit260.BYUIDO.enumer.BuildingEnum.RICKS;
import static byui.cit260.BYUIDO.enumer.BuildingEnum.ROMNEY;
import static byui.cit260.BYUIDO.enumer.BuildingEnum.TAYLOR;
import static byui.cit260.BYUIDO.enumer.BuildingEnum.THERIDGE;
import static byui.cit260.BYUIDO.enumer.BuildingEnum.THEWILLOWS;
import static byui.cit260.BYUIDO.enumer.BuildingEnum.TUSCANYPLACE;
import static byui.cit260.BYUIDO.enumer.BuildingEnum.WINDSORMANOR;
import static byui.cit260.BYUIDO.enumer.BuildingEnum.spori;
import byui.cit260.BYUIDO.model.Location;
import byui.pkgdo.BYUIDo;
import citbyui.cit260.BYUIDO.exceptions.MapControlException;
import java.awt.Point;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Scotty
 */
class SelectLocationView extends View {

    private String message;

    public SelectLocationView() {
        super("\n                                                    "
                + "\n----------------------------------------------------"
                + "\n|Where do you want to go?                          |"
                + "\n----------------------------------------------------"
                + "\n|PP - Porter Park                                  |"
                + "\n|RI - The ridge                                    |"
                + "\n|AV - Aspen Village                                |"
                + "\n|TP - Tuscany Place                                |"
                + "\n|WM - Windsor Manor                                |"
                + "\n|NP - North Point                                  |"
                + "\n|TW - The Willows                                  |"
                + "\n|RB - The Ricks                                    |"
                + "\n|TB - The Taylor                                   |"
                + "\n|MC - The Manwaring Center                         |"
                + "\n|RB - The Romney Building                          |"
                + "\n|SB - The Spori Building                           |"
                + "\n|Q - Go back a menu                                |"
                + "\n----------------------------------------------------");

    }

    public SelectLocationView(String message) {

    }

    @Override
    public boolean doAction(String choice) {
        try {
            choice = choice.toUpperCase();
            switch (choice) {
                case "PP":
                    this.porterPark();
                    break;
                case "TR":
                    this.theRidge();
                    break;
                case "AV":
                    this.aspenVillage();
                    break;
                case "TP":
                    this.tuscanyPlace();
                    break;
                case "WM":
                    this.windsorManor();
                    break;
                case "NP":
                    this.northPoint();
                    break;
                case "TW":
                    this.theWillows();
                    break;
                case "RB":
                    this.ricksBuilding();
                    break;
                case "TB":
                    this.taylorBuilding();
                    break;
                case "MC":
                    this.manwaringCenter();
                    break;
                case "RM":
                    this.romneyBuilding();
                    break;
                case "SP":
                    this.sporiBuilding();
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

    private void porterPark() throws MapControlException {
        //get point
        Point coordinates = PORTERPARK.getCoordinates();
        //get character
        byui.cit260.BYUIDO.model.Character mc = BYUIDo.getCurrentGame().getCharacter();
        //get location
        Location[][] locations = BYUIDo.getCurrentGame().getMap().getLocations();
        //call move function
        MapControl.move(locations, mc, coordinates);

    }

    private void theRidge() throws MapControlException {
        Point coordinates = THERIDGE.getCoordinates();
        //get character
        byui.cit260.BYUIDO.model.Character mc = BYUIDo.getCurrentGame().getCharacter();
        //get location
        Location[][] locations = BYUIDo.getCurrentGame().getMap().getLocations();
        //call move function
        MapControl.move(locations, mc, coordinates);
    }

    private void aspenVillage() throws MapControlException {
        Point coordinates = ASPENVILLAGE.getCoordinates();
        //get character
        byui.cit260.BYUIDO.model.Character mc = BYUIDo.getCurrentGame().getCharacter();
        //get location
        Location[][] locations = BYUIDo.getCurrentGame().getMap().getLocations();
        //call move function
        MapControl.move(locations, mc, coordinates);
    }

    private void tuscanyPlace() throws MapControlException {
        Point coordinates = TUSCANYPLACE.getCoordinates();
        byui.cit260.BYUIDO.model.Character mc = BYUIDo.getCurrentGame().getCharacter();
        //get location
        Location[][] locations = BYUIDo.getCurrentGame().getMap().getLocations();
        //call move function
        MapControl.move(locations, mc, coordinates);
    }

    private void windsorManor() throws MapControlException {

        Point coordinates = WINDSORMANOR.getCoordinates();
        //get character
        byui.cit260.BYUIDO.model.Character mc = BYUIDo.getCurrentGame().getCharacter();
        //get location
        Location[][] locations = BYUIDo.getCurrentGame().getMap().getLocations();
        //call move function
         MapControl.move(locations, mc, coordinates);
    }

    private void northPoint() throws MapControlException {

        Point coordinates = NORTHPOINT.getCoordinates();
        //get character
        byui.cit260.BYUIDO.model.Character mc = BYUIDo.getCurrentGame().getCharacter();
        //get location
        Location[][] locations = BYUIDo.getCurrentGame().getMap().getLocations();
        //call move function
         MapControl.move(locations, mc, coordinates);
    }

    private void theWillows() throws MapControlException {

        Point coordinates = THEWILLOWS.getCoordinates();
        //get character
        byui.cit260.BYUIDO.model.Character mc = BYUIDo.getCurrentGame().getCharacter();
        //get location
        Location[][] locations = BYUIDo.getCurrentGame().getMap().getLocations();
        //call move function
         MapControl.move(locations, mc, coordinates);
    }

    private void ricksBuilding() throws MapControlException {

        Point coordinates = RICKS.getCoordinates();
        //get character
        byui.cit260.BYUIDO.model.Character mc = BYUIDo.getCurrentGame().getCharacter();
        //get location
        Location[][] locations = BYUIDo.getCurrentGame().getMap().getLocations();
        //call move function
        MapControl.move(locations, mc, coordinates);
    }

    private void taylorBuilding() throws MapControlException {

        Point coordinates = TAYLOR.getCoordinates();
        //get character
        byui.cit260.BYUIDO.model.Character mc = BYUIDo.getCurrentGame().getCharacter();
        //get location
        Location[][] locations = BYUIDo.getCurrentGame().getMap().getLocations();
        //call move function
        MapControl.move(locations, mc, coordinates);
    }

    private void manwaringCenter() throws MapControlException {

        Point coordinates = MANWARING.getCoordinates();
        //get character
        byui.cit260.BYUIDO.model.Character mc = BYUIDo.getCurrentGame().getCharacter();
        //get location
        Location[][] locations = BYUIDo.getCurrentGame().getMap().getLocations();
        //call move function
        MapControl.move(locations, mc, coordinates);
    }

    private void romneyBuilding() throws MapControlException {
        ROMNEY.getCoordinates();
        Point coordinates = THERIDGE.getCoordinates();
        //get character
        byui.cit260.BYUIDO.model.Character mc = BYUIDo.getCurrentGame().getCharacter();
        //get location
        Location[][] locations = BYUIDo.getCurrentGame().getMap().getLocations();
        //call move function
        MapControl.move(locations, mc, coordinates);
    }

    private void sporiBuilding() throws MapControlException {
        spori.getCoordinates();
        Point coordinates = THERIDGE.getCoordinates();
        //get character
        byui.cit260.BYUIDO.model.Character mc = BYUIDo.getCurrentGame().getCharacter();
        //get location
        Location[][] locations = BYUIDo.getCurrentGame().getMap().getLocations();
        //call move function
        MapControl.move(locations, mc, coordinates);
    }

}
