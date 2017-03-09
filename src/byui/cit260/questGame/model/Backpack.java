/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.questGame.model;

import java.io.Serializable;
/**
 *
 * @author ashley
 */
public class Backpack implements Serializable{
    private int tokens;
    private int hints;
    private int guesses;

    public Backpack() {
    }
    

    public int getToken() {
        return tokens;
    }
public int getHints(){
    return hints;
}
//    public void setTokenHints(int tokenHints) {
//        this.tokenHints = tokenHints;
//    }

    public int getGuesses() {
        return guesses;
    }

    public void setGuesses(int guesses) {
        this.guesses = guesses;
    }

    @Override
    public int hashCode() {
        int hash = 7;
       // hash = 13 * hash + this.tokenHints;
        hash = 13 * hash + this.guesses;
        return hash;
    }

    @Override
    public String toString() {
        return "Backpack{" + "tokenHints=" + hints + ", guesses=" + guesses + '}';
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
        final Backpack other = (Backpack) obj;
        if (this.tokens != other.tokens) {
            return false;
        }
        if (this.guesses != other.guesses) {
            return false;
        }
        return true;
    }
}
