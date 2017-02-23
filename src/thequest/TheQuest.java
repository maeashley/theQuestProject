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
import byui.cit260.questGame.view.StartProgramView;

/**
 *
 * @author MMorley
 */
public class TheQuest {

    /**
     * @param args the command line arguments
     */
    private static Game currentGame = null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        TheQuest.currentGame = currentGame;
    }
      private static Player player = null;

    public static Player getPlayer() {
        return player;
    }
      
    public static void main(String[] args) {
      
        
        StartProgramView startMenu = new StartProgramView();
        
       startMenu.displayStartProgramView();
     
       
    }

    public static void setPlayer(Player playerObj) {
        player = playerObj;
    }
    
}
