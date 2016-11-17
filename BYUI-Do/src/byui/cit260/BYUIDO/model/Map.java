/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.BYUIDO.model;

import java.io.Serializable;

/**
 *
 * @author Nick
 */
public class Map implements Serializable {
    
    private double columnCount;
    private double rowCount;

    private Location local;
    private Game[] map;
    
    public Map() {
    }

    public double getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(double columnCount) {
        this.columnCount = columnCount;
    }

    public double getRowCount() {
        return rowCount;
    }

    public void setRowCount(double rowCount) {
        this.rowCount = rowCount;
    }

    public Location getLocal() {
        return local;
    }

    public void setLocal(Location local) {
        this.local = local;
    }

    public Game[] getMap() {
        return map;
    }

    public void setMap(Game[] map) {
        this.map = map;
    }
    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.columnCount) ^ (Double.doubleToLongBits(this.columnCount) >>> 32));
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.rowCount) ^ (Double.doubleToLongBits(this.rowCount) >>> 32));
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
        final Map other = (Map) obj;
        if (Double.doubleToLongBits(this.columnCount) != Double.doubleToLongBits(other.columnCount)) {
            return false;
        }
        if (Double.doubleToLongBits(this.rowCount) != Double.doubleToLongBits(other.rowCount)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "columnCount=" + columnCount + ", rowCount=" + rowCount + '}';
    }
    
    
    
}
