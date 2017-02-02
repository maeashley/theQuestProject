/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.questGame.model;

import java.io.Serializable;
/**
 *
 * @author caleb
 */
public class Game implements Serializable {
    private int noPeople;

    public Game(int noPeople) {
        this.noPeople = noPeople;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + this.noPeople;
        return hash;
    }

    @Override
    public String toString() {
        return "Game{" + "noPeople=" + noPeople + '}';
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
        final Game other = (Game) obj;
        if (this.noPeople != other.noPeople) {
            return false;
        }
        return true;
    }
    
    

    public int getNoPeople() {
        return noPeople;
    }

    public void setNoPeople(int noPeople) {
        this.noPeople = noPeople;
    }
    
}
