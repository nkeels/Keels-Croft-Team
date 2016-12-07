/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.BYUIDO.control;

import byui.cit260.BYUIDO.model.Location;
import byui.cit260.BYUIDO.model.Map;
import byui.cit260.BYUIDO.enumer.Scene;
import citybyui.cit260.byuido.view.InArea;

/**
 *
 * @author Nick
 */
public class MapControl {

    static void moveActorsToStartingLocation(Map map) {
        
    }

    private static void getDisplayMap(Location[][] locations) {
        
    }

    public MapControl() {
    }

    public static Map createMap() {
        Map map = new Map(5, 5);

        MapControl.assignScenesToLocations(map);

        return map;
    }

    private static void assignScenesToLocations(Map map) {
        Location[][] locations = map.getLocations();

        locations[0][0].setScene(Scene.PP);
        locations[0][1].setScene(Scene.RI);
        locations[0][2].setScene(Scene.AV);
        locations[0][3].setScene(Scene.TP);
        locations[0][4].setScene(Scene.WM);

        locations[1][0].setScene(Scene.NP);
        locations[1][1].setScene(Scene.TW);
        locations[1][2].setScene(Scene.RK);
        locations[1][3].setScene(Scene.TL);
        locations[1][4].setScene(Scene.MC);

        locations[2][0].setScene(Scene.RN);
        locations[2][1].setScene(Scene.SR);
        locations[2][2].setScene(Scene.P);
        locations[2][3].setScene(Scene.CR);
        locations[2][4].setScene(Scene.RM);

        locations[3][0].setScene(Scene.PB);
        locations[3][1].setScene(Scene.NYB);
        locations[3][2].setScene(Scene.TF);
        locations[3][3].setScene(Scene.FO);
        locations[3][4].setScene(Scene.TB);

        locations[4][0].setScene(Scene.SP);
        locations[4][1].setScene(Scene.SD);
        locations[4][2].setScene(Scene.CD);
        locations[4][3].setScene(Scene.FC);
        locations[4][4].setScene(Scene.MD);

        getDisplayMap(locations);
    }

    public static void sceneSort() {
        Scene[] scenes = Scene.values();
        int n = scenes.length;
        int k;
        //sort the enum
        Scene[] places = MapControl.bubbleSort(scenes);
        //print a report of locations (place in the view layer)
        for (Scene nextScene : places) {
            String sym = nextScene.getDisplaySymbol();
            String scene = nextScene.name();
            System.out.println(sym + " " + scene);
        }

    }

    public static void swapNumbers(int s1, int j, Scene[] sceneList) {
        Scene temp;
        temp = sceneList[s1];
        sceneList[s1] = sceneList[j];
        sceneList[j] = temp;
    }

    public void printNumbers(int[] input) {

        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + ", ");
        }
        System.out.println("\n");
    }
    
       public void move() {
        InArea choice = new InArea();
        choice.display();

    }


    public static Scene[] bubbleSort(Scene[] sceneList) {
        int n = sceneList.length;
        int k;
        for (int s2 = n; s2 >= 0; s2--) {
            for (int s1 = 0; s1 < s2 - 1; s1++) {
                k = s1 + 1;
                if (sceneList[s1].getDisplaySymbol().compareTo(sceneList[k].getDisplaySymbol()) > 0) {
                    swapNumbers(s1, k, sceneList);
                }
            }
        }
        return sceneList;

    }
}

   

