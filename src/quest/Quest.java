/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quest;

import byui.cit260.questGame.model.Player;

/**
 *
 * @author Harry
 */
public class Quest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Player p1 = new Player();
        p1.setName("Ashley");
        
        
        String playerValue = p1.toString();
        
        System.out.println(playerValue);
        
    }
    
}
