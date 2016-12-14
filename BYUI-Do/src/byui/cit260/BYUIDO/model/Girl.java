/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.BYUIDO.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author Scotty
 */
public class Girl implements Serializable {
        //I think I got everything here figured....
    private String girlName; 
    private String location;

    private Game character;

    private Location place;
    private Girl[] person;

    
    public Girl() {

    }
    public String getGirlName() {
        return girlName;
    }

    public void setGirlName(String girlName) {
        this.girlName = girlName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Game getCharacter() {
        return character;
    }

    public void setCharacter(Game character) {
        this.character = character;
    }

    public Location getPlace() {
        return place;
    }

    public void setPlace(Location place) {
        this.place = place;
    }

    public Girl[] getPerson() {
        return person;
    }

    public void setPerson(Girl[] person) {
        this.person = person;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.girlName);
        hash = 53 * hash + Objects.hashCode(this.location);
        hash = 53 * hash + Objects.hashCode(this.character);
        hash = 53 * hash + Objects.hashCode(this.place);
        hash = 53 * hash + Arrays.deepHashCode(this.person);
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
        final Girl other = (Girl) obj;
        if (!Objects.equals(this.girlName, other.girlName)) {
            return false;
        }
        if (!Objects.equals(this.location, other.location)) {
            return false;
        }
        if (!Objects.equals(this.character, other.character)) {
            return false;
        }
        if (!Objects.equals(this.place, other.place)) {
            return false;
        }
        if (!Arrays.deepEquals(this.person, other.person)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Girl{" + "girlName=" + girlName + ", location=" + location + ", character=" + character + ", place=" + place + ", person=" + person + '}';
    }

    
}
