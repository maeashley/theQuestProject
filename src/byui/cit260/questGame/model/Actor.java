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
public enum Actor implements Serializable{
   
    private String description;

    
    
    public Actor(String description) {
           this.description = description;
    }

    public Actor(String name, String description) {
        this.name = name;
        this.description = description;
    }

    }

    public String getDescription() {
        return description;
    }
    
    private final String description;

    

}
