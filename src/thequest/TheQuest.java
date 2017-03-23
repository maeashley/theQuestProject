/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thequest;

import byui.cit260.questGame.exceptions.GameControlException;
import byui.cit260.questGame.model.Player;
import byui.cit260.questGame.model.Game;
import byui.cit260.questGame.view.StartProgramView;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TheQuest {

    /**
     * @param args the command line arguments
     */
    private static Game currentGame;
    private static Player player;

    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    private static PrintWriter logFile = null;

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        TheQuest.logFile = logFile;
    }

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

        try {

            TheQuest.inFile = new BufferedReader(new InputStreamReader(System.in));
            TheQuest.outFile = new PrintWriter(System.out, true);
            
            String filePath = "log.txt";
            TheQuest.logFile = new PrintWriter(filePath);

            StartProgramView startMenu = new StartProgramView();

            String name = startMenu.getPlayerName();
            startMenu.doAction(name);

        } catch (Throwable te) {
            System.out.println(te.getMessage());
            te.printStackTrace();

        } finally {

            try
            {
                if (TheQuest.inFile != null)
                {
                    TheQuest.inFile.close();
                }

                if (TheQuest.outFile != null) 
                {
                    TheQuest.outFile.close();
                }
                if (TheQuest.logFile !=null)
                        TheQuest.logFile.close();
            } 
            catch (IOException ex) 
            {
                System.out.println("Error closing files");
            }
        }
    }

    public static void setPlayer(Player playerObj) {
        player = playerObj;

    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outfile) {
        TheQuest.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        TheQuest.inFile = inFile;
    }

}
