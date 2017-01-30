/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.questgame.model;

/**
 *
 * @author caleb
 */
public class ByuiCit260QuestGameModel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Game startGame = new Game(2);
        
        startGame.setNoPeople(2);
        
        String start= startGame.toString();
        System.out.println(start);
    }

}
