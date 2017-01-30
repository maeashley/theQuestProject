/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.questGame.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Harry
 */
public class Scene implements Serializable{
    private String description;
    private int level;
    private boolean blockedLoaction;

    public Scene() {
    }

    public Scene(String description, int level, boolean blockedLoaction) {
        this.description = description;
        this.level = level;
        this.blockedLoaction = blockedLoaction;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public boolean isBlockedLoaction() {
        return blockedLoaction;
    }

    public void setBlockedLoaction(boolean blockedLoaction) {
        this.blockedLoaction = blockedLoaction;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.description);
        hash = 23 * hash + this.level;
        hash = 23 * hash + (this.blockedLoaction ? 1 : 0);
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
        if (this.level != other.level) {
            return false;
        }
        if (this.blockedLoaction != other.blockedLoaction) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Scene{" + "description=" + description + ", level=" + level + ", blockedLoaction=" + blockedLoaction + '}';
    }
    
    
 }
