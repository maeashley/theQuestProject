/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thequest;

import byui.cit260.questGame.model.DiplomaPiece;
import byui.cit260.questGame.model.Riddle;

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
        
        
    }
    
}
