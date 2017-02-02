/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thequest;

import byui.cit260.questGame.model.DiplomaPiece;
import byui.cit260.questGame.model.Riddle;
import byui.cit260.questGame.model.Player;
import byui.cit260.questGame.model.Location;
import byui.cit260.questGame.model.Actor;
import byui.cit260.questGame.model.Scene;
import byui.cit260.questGame.model.Map;
import byui.cit260.questGame.model.Backpack;
import byui.cit260.questGame.model.Game;

/**
 *
 * @author MMorley
 */
public class TheQuest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Riddle riddleOne = new Riddle();
        DiplomaPiece diplomaPieceOne = new DiplomaPiece();
        
       // riddleOne.setName("Fred Flinstone");
        //riddleOne.setBestTime(7.00);
        
        diplomaPieceOne.setName("Barney Rubble");
        diplomaPieceOne.setBestTime(7.00);
        
       // String playerInfo = riddleOne.toString();
        //System.out.println(playerInfo);
        
        String playerInfo = diplomaPieceOne.toString();
        System.out.println(playerInfo);
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
        
        //test Game
        Game startGame = new Game(2);
        
        startGame.setNoPeople(2);
        
        String start= startGame.toString();
        System.out.println(start);
        
        //test Backpack
        
        
    }
    
}
