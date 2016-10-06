/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.pkgdo;

import java.util.Objects;

/**
 *
 * @author Scotty
 */
public class BYUIDo implements Serializable{

    //class instance variables
    private String name;

    public BYUIDo() {
    }
 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public String toString() {
        return "BYUIDo{" + "name=" + name + '}';
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
        final BYUIDo other = (BYUIDo) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
