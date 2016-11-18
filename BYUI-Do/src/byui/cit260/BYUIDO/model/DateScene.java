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
 * @author Scotty
 */
public enum DateScene implements Serializable{
    
    FC()
    
    private String title;
    private String interaction;
    private String foodbased;

    public DateScene() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInteraction() {
        return interaction;
    }

    public void setInteraction(String interaction) {
        this.interaction = interaction;
    }

    public String getFoodbased() {
        return foodbased;
    }

    public void setFoodbased(String foodbased) {
        this.foodbased = foodbased;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.title);
        hash = 29 * hash + Objects.hashCode(this.interaction);
        hash = 29 * hash + Objects.hashCode(this.foodbased);
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
        final DateScene other = (DateScene) obj;
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.interaction, other.interaction)) {
            return false;
        }
        if (!Objects.equals(this.foodbased, other.foodbased)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DateScene{" + super.toString() + "title=" + title + ", interaction=" + interaction + ", foodbased=" + foodbased + '}';
    }
    
    
}
