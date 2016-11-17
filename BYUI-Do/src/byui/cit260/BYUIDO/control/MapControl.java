/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.BYUIDO.control;

import byui.cit260.BYUIDO.model.Map;
import citybyui.cit260.byuido.view.InArea;

/**
 *
 * @author Nick
 */
public class MapControl {

    static void moveActorsToStartingLocation(Map map) {
        System.out.println("blah");
    }

    public MapControl() {
    }
    
    public static Map createMap() {
        Map map = new Map();
        
        Scene[] scenes = createScenes();
        
        GameControl.assignScenesToLocations(map, scenes);
        
        return map;
    }
// this function is for character movement    
    public void move() {
        InArea choice = new InArea();
        choice.display();
        
        
    }
    
}
