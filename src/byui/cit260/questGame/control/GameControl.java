/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.questGame.control;

import byui.cit260.questGame.model.Backpack;
import byui.cit260.questGame.model.Game;
import byui.cit260.questGame.model.Map;
import byui.cit260.questGame.model.Player;
import thequest.TheQuest;

/**
 *
 * @author ashley
 */
public class GameControl {

    public static Player createPlayer(String playersName) {
        if (playersName == null){
            return null;
            
        }
        
        Player player = new Player();
        player.setName(playersName);
        
        TheQuest.setPlayer(player);
        
        
        return player;
        
    
    }

    public static void createNewGame(Player player) {
            Game game = new Game();
            
            Map map = MapControl.createMap();
            Backpack backpack = BackpackControl.createBackPack();
            
            TheQuest.setCurrentGame(game);
            game.setPlayer(player);  
            game.setNoPeople(1);
            game.setMap(map);
            game.setBackpack(backpack);
            
            
    }
    
}
