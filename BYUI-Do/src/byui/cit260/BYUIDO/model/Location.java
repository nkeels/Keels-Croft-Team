/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.BYUIDO.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Nick
 */
public class Location implements Serializable {
    
    private String title;
    private String time;
    private Double coordinate;

    public Location() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Double getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Double coordinate) {
        this.coordinate = coordinate;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.title);
        hash = 23 * hash + Objects.hashCode(this.time);
        hash = 23 * hash + Objects.hashCode(this.coordinate);
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
        final Location other = (Location) obj;
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.time, other.time)) {
            return false;
        }
        if (!Objects.equals(this.coordinate, other.coordinate)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "title=" + title + ", time=" + time + ", coordinate=" + coordinate + '}';
    }
    
    
    
    
}
