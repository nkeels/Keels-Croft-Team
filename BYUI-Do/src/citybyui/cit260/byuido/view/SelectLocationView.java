/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citybyui.cit260.byuido.view;

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
import byui.pkgdo.BYUIDo;

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
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
         }
        return true;
    }
        
    private void porterPark() {
       //get point
       PORTERPARK.getCoordinates();
       //get character
       BYUIDo.getCurrentGame().getCharacter();
       //get location
       BYUIDo.getCurrentGame().getMap().getLocations();
       
       
    }
  
    private void theRidge() {
        THERIDGE.getCoordinates();
    }

    private void aspenVillage() {
       ASPENVILLAGE.getCoordinates();
    }

    private void tuscanyPlace() {
        TUSCANYPLACE.getCoordinates();
    }

    private void windsorManor() {
       WINDSORMANOR.getCoordinates();
    }

    private void northPoint() {
        NORTHPOINT.getCoordinates();
    }

    private void theWillows() {
        THEWILLOWS.getCoordinates();
    }

    private void ricksBuilding() {
        RICKS.getCoordinates();
    }

    private void taylorBuilding() {
       TAYLOR.getCoordinates();
    }

    private void manwaringCenter() {
         MANWARING.getCoordinates();
    }

    private void romneyBuilding() {
         ROMNEY.getCoordinates();
    }

    private void sporiBuilding() {
        spori.getCoordinates();
    }

}
