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
public class Map implements Serializable {

    private int buildingCount;
    private int floorCount;

    public int getFloorCount() {
        return floorCount;
    }

    public void setFloorCount(int floorCount) {
        this.floorCount = floorCount;
    }
    private int currentBuilding;
    private int currentFloor;
    private int currentScene;

    private Location[][] locations;

    public Map() {
        
       
    }
    
    public Map(int floor, int building)
    {
        
        if (floor < 1 || building < 1)
        {
            System.out.println("The Number of Buldings and Floors myst be > 0");
            return;
        }
        this.buildingCount = building;
        this.floorCount = floor;
        this.locations = new Location[this.floorCount][this.buildingCount];
        
        for(int i  = 0; i < floor; i++)
        {       
            for (int j = 0; j < building; j++){
              Location location = new Location();
              location.setBuilding(j);
              location.setFloor(i);
              location.setVisited(false);
              
              
              locations[i][j] = location;
                
            }
           
        }
       
      
    
    
    
    }

    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }

   

    public int getBuildingCount() {
        return buildingCount;
    }

    public void setBuildingCount(int buildingCount) {
        this.buildingCount = buildingCount;
    }

    public int getCurrentBuilding() {
        return currentBuilding;
    }

    public void setCurrentBuilding(int currentBuilding) {
        this.currentBuilding = currentBuilding;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + this.buildingCount;
        hash = 89 * hash + this.floorCount;
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
        if (this.buildingCount != other.buildingCount) {
            return false;
        }
        if (this.floorCount != other.floorCount) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "buildingCount=" + buildingCount + ", floorCount=" + floorCount + '}';
    }

}
