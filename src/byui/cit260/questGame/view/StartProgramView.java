/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
package byui.cit260.questGame.view;
import byui.cit260.questGame.control.GameControl;
import byui.cit260.questGame.exceptions.GameControlException;
import byui.cit260.questGame.model.Player;
import java.io.BufferedReader;
import java.io.PrintWriter;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import thequest.TheQuest;

/**
 *
 * @author ashley
 */
public class StartProgramView{
    //private String promptMessage;
    private String prompt;
    private BufferedReader keyboard = TheQuest.getInFile();
    private PrintWriter console = TheQuest.getOutFile();
   
    public StartProgramView(){
          prompt = "Enter your Name: ";
          banner();
        
        
    }
    
    
   
    public void banner(){
        this.console.println("████████╗██╗  ██╗███████╗     ██████╗ ██╗   ██╗███████╗███████╗████████╗\n" +
"╚══██╔══╝██║  ██║██╔════╝    ██╔═══██╗██║   ██║██╔════╝██╔════╝╚══██╔══╝\n" +
"   ██║   ███████║█████╗      ██║   ██║██║   ██║█████╗  ███████╗   ██║   \n" +
"   ██║   ██╔══██║██╔══╝      ██║▄▄ ██║██║   ██║██╔══╝  ╚════██║   ██║   \n" +
"   ██║   ██║  ██║███████╗    ╚██████╔╝╚██████╔╝███████╗███████║   ██║   \n" +
"   ╚═╝   ╚═╝  ╚═╝╚══════╝     ╚══▀▀═╝  ╚═════╝ ╚══════╝╚══════╝   ╚═╝   \n" +
"                                                                        ");
        
        
        this.console.println("This text based game is a quest of knowledge and endurance.\n"
                + "The goal of the game is to answer all riddles or puzzles correctly "
                + "with the most tokens possible. \n"
                + "The riddles, challenges, and puzzles become more difficult "
                + "as the game progresses. Good luck!");
    }
    
  

    public String getPlayerName() {
      //  Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        while (!valid){
            this.console.println("\n" + prompt);
            try
            {
                value = keyboard.readLine();
            }
            catch(Exception ex)
            {
                this.console.println("Invalid Input!");
            }
            value = value.trim();
            valid = true;
            if (value.length()<2){
            this.console.println("\nInvalid players name: " + value +
                    " \nThe name must be greater than one character in length");
            valid = false;
            
            }
        }
                
        return value;
         
    }

    
    

    public boolean doAction(String value) throws GameControlException {
    
        Player player;
        try {
            player = GameControl.createPlayer(value);
        } catch (GameControlException ex) {
             ErrorView.display(this.getClass().getName(),ex.getMessage());
             player = GameControl.createPlayer(value);
        }
        
        
        //display next view
        this.displayNextView(player);
    
    return true;
    
}

    private void displayNextView(Player player) {
        this.console.println("\n========================="
                + "\n Welcome to the game " + player.getName()
        + "\n We hope you have a lot of fun!"
        +"\n===============================");
   
        MainMenuView mainMenuView = new MainMenuView();
        
        mainMenuView.display();
    }
    
}
