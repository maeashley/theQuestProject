/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.questGame.control;

import static byui.cit260.questGame.control.MapControl.movePlayerToStartingLocation;
import byui.cit260.questGame.exceptions.GameControlException;
import byui.cit260.questGame.model.Actor;
import byui.cit260.questGame.model.Backpack;
import byui.cit260.questGame.model.Game;
import byui.cit260.questGame.model.Map;
import byui.cit260.questGame.model.Player;
import byui.cit260.questGame.model.Scene;
import thequest.TheQuest;

/**
 * @author ashley
 */
public class GameControl {

    public static Player createPlayer(String playersName) throws GameControlException {
        if (playersName == null){
            throw new GameControlException("You must enter a"
                    + "valid Player name.");
            
        }
        
        Player player = new Player();
        player.setName(playersName);
        
        TheQuest.setPlayer(player);
        
        
        return player;
        
    
    }

    public static void createNewGame(Player player) {
            Game game = new Game();
            TheQuest.setCurrentGame(game);
            if(game.getPlayer() == null)
            {
                game.setPlayer(player);  
            
            }
            Map map = MapControl.createMap();
            
            Backpack backpack = BackpackControl.createBackPack();
            game.setBackpack(backpack);
            
            TheQuest.setCurrentGame(game);
            if(game.getPlayer() == null)
            {
                game.setPlayer(player);  
            
            }
          game.setNoPeople(1);
          game.setMap(map);
          
          
          MapControl.movePlayerToStartingLocation(map);

    }

    
    public static Actor searchForActor(String name) {

        for (Actor actor : Actor.values()) {
            if (actor.getName() == null ? name == null : actor.getName().equals(name)) {
                return actor;
            }

        }
        return null;
    }   
    
    
    
}
