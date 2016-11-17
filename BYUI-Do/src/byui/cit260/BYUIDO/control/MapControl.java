/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.BYUIDO.control;

import byui.cit260.BYUIDO.model.Location;
import byui.cit260.BYUIDO.model.Map;
import byui.cit260.BYUIDO.model.RandomScene;
import byui.cit260.BYUIDO.model.Scene;
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
        Map map = new Map(5, 5);
        
        MapControl.assignScenesToLocations(map);
        
        return map;
    }
    
    /**private static Scene[] createScenes() {
       Scene[] scene = new Scene[SceneType.values().length];
       (we don't need any of this!) 
        Scene starting Scene = new Scene() ;
        startingScene.setDescription(
              "And we did come to the place called Porter Park....."
            + "because you were looking for a wife, this scripture comes to mind");
        startingScene.setMapSymbol("PP");
        startingScene.setBlocked(false);
        startingScene.setTravelTime(240);
        scene[SceneType.start.ordinal()] = startingScene;
        
        Scene finishScene = new Scene();
        finishScene.setDescription(
              "And we did finally get married....."
            + "because you were looking for a wife, this scripture comes to mind");
        finishScene.setMapSymbol("PP");
        finishScene.setBlocked(false);
        finishScene.setTravelTime(Double.POSITIVE_INFINITY);
        scene[SceneType.finish.ordinal()] = startingScene;
        return scenes;
        
        Scene finishScene = new Scene();
        finishScene.setDescription(
              "And we did finally get married....."
            + "because you were looking for a wife, this scripture comes to mind");
        finishScene.setMapSymbol("PP");
        finishScene.setBlocked(false);
        finishScene.setTravelTime(Double.POSITIVE_INFINITY);
        scene[SceneType.finish.ordinal()] = startingScene;
        return scenes;
        
        
    }
    **/
    
    private static void assignScenesToLocations(Map map) {
        Location[][] locations = map.getLocations();
        
        locations[0][0].setRandomScene(RandomScene.PP);
        locations[0][1].setRandomScene(RandomScene.PP);
        locations[0][2].setRandomScene(RandomScene.PP);
        locations[0][3].setRandomScene(RandomScene.PP);
        locations[0][4].setRandomScene(RandomScene.PP);
        locations[0][5].setRandomScene(RandomScene.PP);
        
    }

// this function is for character movement    
    public void move() {
        InArea choice = new InArea();
        choice.display();
        
        
    }
    
}
