/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thequest;

import byui.cit260.questGame.exceptions.GameControlException;
import byui.cit260.questGame.model.DiplomaPiece;
import byui.cit260.questGame.model.Riddle;
import byui.cit260.questGame.model.Player;
import byui.cit260.questGame.model.Location;
import byui.cit260.questGame.model.Actor;
import byui.cit260.questGame.model.Scene;
import byui.cit260.questGame.model.Map;
import byui.cit260.questGame.model.Backpack;
import byui.cit260.questGame.model.Game;
import byui.cit260.questGame.view.RiddleView;
import byui.cit260.questGame.view.StartProgramView;
import java.util.ArrayList;

public class TheQuest {

    /**
     * @param args the command line arguments
     */
    private static Game currentGame;
    private static Player player;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        TheQuest.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    // MAIN CLASS
    public static void main(String[] args) throws GameControlException {

        StartProgramView startMenu = new StartProgramView();

        String name = startMenu.getPlayerName();

        try {

            startMenu.doAction(name);

        } catch (Throwable te) {
            System.out.println(te.getMessage());
            te.printStackTrace();
            startMenu.doAction(name);

        }
    }

    public static void setPlayer(Player playerObj) {
        player = playerObj;
    }

}
