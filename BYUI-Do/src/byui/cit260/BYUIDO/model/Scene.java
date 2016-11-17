/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.BYUIDO.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Nick
 */
public class Scene implements Serializable{
    
    private String description;
    private String displaySymbol;
    
    private Location[] scene;

    public Scene() {
    }

    private static Scene[] createScenes() {
        Scene[] scene = new Scene[SceneType.values().length];
        
        Scene starting Scene = new Scene();
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

    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDisplaySymbol() {
        return displaySymbol;
    }

    public void setDisplaySymbol(String displaySymbol) {
        this.displaySymbol = displaySymbol;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.description);
        hash = 41 * hash + Objects.hashCode(this.displaySymbol);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Scene other = (Scene) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.displaySymbol, other.displaySymbol)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Scene{" + "description=" + description + ", displaySymbol=" + displaySymbol + '}';
    }
    
    
    
}
