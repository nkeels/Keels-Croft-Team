/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citybyui.cit260.byuido.view;

import byui.cit260.BYUIDO.control.MapControl;
import byui.cit260.BYUIDO.model.Location;
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
                this.move("PP");
                break;
            case "RI":
                this.move("RI");
                break;
            case "AV":
                this.move("AV");
                break;
            case "TP":
                this.move("TP");
                break;
            case "WM":
                this.("WM");
                break;
            case "NP":
                this.move("NP");
                break;
            case "TW":
                this.move("TW");
                break;
            case "RB":
                this.move("RB");
                break;
            case "TB":
                this.move("TB");
                break;
            case "MC":
                this.move("MC");
                break;
            case "RM":
                this.move("RM");
                break;
            case "SB":
                this.move("SR");
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
        }
        return false;
    }

    private static void move(Location[][] locations, Character mc, point coordinate) throw GameControl(){
        //error control
        if (locations == null);{
            System.out.println("\nWe can't find your location.");
            return false;
    }
        if(mc == null){
            System.out.println("\nWe can't find your character.");
            return false;
        }
        if(coordinate == null || coordinate.x < 0 || coordinate.x > 5 || coordinate.y < 0 || coordinate.y > 5){
            System.out.println("\nCoordinates are invalid.");
            return false;
    }
        //get old location info of character
        Location oldLoc = Character.getLocation();
        //get new location coordinates
        Location newLoc = Location[coordinate.x][coordinate.y];
        //set character to null
        oldLoc.setCharacter(null);
        //assign character to new location
        newLoc.setCharacter(mc);
        //set character location to newLoc
        Character.setLocation(newLoc);
        //ignore below unless necessary for syntax control
//       Location building = Location.getCharacter(); 
//       character = null;
//       Location building = location.setCharacter();
//       
    private void porterPark() {
        Location location = MapControl.GetLocation(0,3);
        
        BYUIDo.getCurrentGame().getCharacter().setPlace(location);
        
        InArea inAreaView = new InArea();
        inAreaView.display();
    }

    private void theRidge() {
        Location location = MapControl.GetLocation(0, 1);
    }

    private void aspenVillage() {
        MapControl move = new MapControl();
        move.move();
    }

    private void tuscanyPlace() {
        MapControl move = new MapControl();
        move.move();
    }

    private void windsorManor() {
        MapControl move = new MapControl();
        move.move();
    }

    private void northPoint() {
        MapControl move = new MapControl();
        move.move();
    }

    private void theWillows() {
        MapControl move = new MapControl();
        move.move();
    }

    private void ricksBuilding() {
        MapControl move = new MapControl();
        move.move();
    }

    private void taylorBuilding() {
        MapControl move = new MapControl();
        move.move();
    }

    private void manwaringCenter() {
        MapControl move = new MapControl();
        move.move();
    }

    private void romneyBuilding() {
        MapControl move = new MapControl();
        move.move();
    }

    private void sporiBuilding() {
        MapControl move = new MapControl();
        move.move();
    }

}
