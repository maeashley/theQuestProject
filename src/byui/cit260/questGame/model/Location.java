/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.questGame.model;
import java.io.Serializable;

/**
 *
 * @author Harry
 */
public class Location implements Serializable {
    private int building;
    private int floor;
    private boolean visited;
    private Scene scene;

    public Location(int building, int floor) {
        this.building = building;
        this.floor = floor;
    }

    public Location(int building, int floor, boolean visited) {
        this.building = building;
        this.floor = floor;
        this.visited = visited;
    }

    public Location() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getBuilding() {
        return building;
    }

    public void setBuilding(int building) {
        this.building = building;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.building;
        hash = 59 * hash + this.floor;
        hash = 59 * hash + (this.visited ? 1 : 0);
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
        if (this.building != other.building) {
            return false;
        }
        if (this.floor != other.floor) {
            return false;
        }
        if (this.visited != other.visited) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "building=" + building + ", floor=" + floor + ", visited=" + visited + '}';
    }
    
}
