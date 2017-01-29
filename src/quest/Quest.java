/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quest;

import byui.cit260.questGame.model.Player;
import byui.cit260.questGame.model.Location;
import byui.cit260.questGame.model.Actor;
import byui.cit260.questGame.model.Scene;
import byui.cit260.questGame.model.Map;


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
        
        /*******************************************/
        Player p1 = new Player();
        p1.setName("Harry"); 
        String playerValue = p1.toString();
        System.out.println(playerValue);
        
        /*******************************************/
        Actor a1 = new Actor("Harry", "Student in CIT 260");
        System.out.println(a1.toString());
        
        /*******************************************/
        Location l1 = new Location(1,1,true);
        System.out.println(l1.toString());
        
        /*******************************************/
        Map m1 = new Map(6,6);
        System.out.println(m1.toString());
        
        /*******************************************/
        Scene s1 = new Scene("Austin Level 1", 1, false);   
        System.out.println(s1.toString());
        
    }
    
}
