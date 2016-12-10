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

        
    private void porterPark() {
        Location location = MapControl.GetLocation(0, 3);

        BYUIDo.getCurrentGame().getCharacter().

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
