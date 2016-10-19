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
public class Character implements Serializable {
    
    private String charName;
    private Integer charisma;
    private Integer stress;
    private Integer confide;
    private String gender;
    private Integer personalityQual;
    
    public Character() {
    
}
    

    public String getCharName() {
        return charName;
    }

    public Integer getStress() {
        return stress;
    }

    public Integer getCharisma() {
        return charisma;
    }

    public void setCharisma(Integer charisma) {
        this.charisma = charisma;
    }
    
    public Integer getConfide() {
        return confide;
    }

    public String getGender() {
        return gender;
    }

    public Integer getPersonalityQual() {
        return personalityQual;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public void setStress(Integer stress) {
        this.stress = stress;
    }

    public void setConfide(Integer confide) {
        this.confide = confide;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPersonalityQual(Integer personalityQual) {
        this.personalityQual = personalityQual;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.charName);
        hash = 47 * hash + Objects.hashCode(this.stress);
        hash = 47 * hash + Objects.hashCode(this.confide);
        hash = 47 * hash + Objects.hashCode(this.gender);
        hash = 47 * hash + Objects.hashCode(this.personalityQual);
        hash = 47 * hash + Objects.hashCode(this.charisma);
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
        final Character other = (Character) obj;
        if (!Objects.equals(this.charName, other.charName)) {
            return false;
        }
        if (!Objects.equals(this.gender, other.gender)) {
            return false;
        }
        if (!Objects.equals(this.stress, other.stress)) {
            return false;
        }
        if (!Objects.equals(this.confide, other.confide)) {
            return false;
        }
        if (!Objects.equals(this.personalityQual, other.personalityQual)) {
            return false;
        }
        if (!Objects.equals(this.charisma, other.charisma)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Character{" + "charName=" + charName + ", stress=" + stress + ", confide=" + confide + ", gender=" + gender + ", personalityQual=" + personalityQual + ", charisma=" + charisma + '}';
    }

    
    
    
}