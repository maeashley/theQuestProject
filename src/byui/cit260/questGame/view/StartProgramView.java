/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.questGame.view;

import byui.cit260.questGame.control.GameControl;
import byui.cit260.questGame.model.Player;
import java.util.Scanner;

/**
 *
 * @author ashley
 */
public class StartProgramView {
    private String promptMessage;
    
    public StartProgramView(){
        this.promptMessage = "\nPlease enter your name.";
        this.banner();
    }
    
    
    public void displayStartProgramView(){
        boolean done = false;
        do{
            String playersName = this.getPlayerName();
            if (playersName.toUpperCase().equals("Q"))
                return;
            done = this.doAction(playersName);
        } while (!done);
        
        
        

        
       // displayView();
       
    }
   
    public void banner(){
        System.out.println("████████╗██╗  ██╗███████╗     ██████╗ ██╗   ██╗███████╗███████╗████████╗\n" +
"╚══██╔══╝██║  ██║██╔════╝    ██╔═══██╗██║   ██║██╔════╝██╔════╝╚══██╔══╝\n" +
"   ██║   ███████║█████╗      ██║   ██║██║   ██║█████╗  ███████╗   ██║   \n" +
"   ██║   ██╔══██║██╔══╝      ██║▄▄ ██║██║   ██║██╔══╝  ╚════██║   ██║   \n" +
"   ██║   ██║  ██║███████╗    ╚██████╔╝╚██████╔╝███████╗███████║   ██║   \n" +
"   ╚═╝   ╚═╝  ╚═╝╚══════╝     ╚══▀▀═╝  ╚═════╝ ╚══════╝╚══════╝   ╚═╝   \n" +
"                                                                        ");
        
        
        System.out.println("This text based game is a quest of knowledge and endurance.\n"
                + "The goal of the game is to answer all riddles or puzzles correctly "
                + "with the most tokens possible. \n"
                + "The riddles, challenges, and puzzles become more difficult "
                + "as the game progresses. Good luck!");
    }
    
    public void displayView(){
      System.out.println("Start Menu\nB - New Game\nH- Help Menu\nC- Continue Save Game\nE- Exit Game");   
    }

    private String getPlayerName() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        while (!valid){
            System.out.println("\n" + this.promptMessage);
            value = keyboard.nextLine();
            value = value.trim();
            
            if (value.length()<1){
            System.out.println("\nInvalid value: value cannot be blank");
            continue;
            }
            break;
        }
                
        return value;
         
    }

    private boolean doAction(String playersName) {
        if (playersName.length()<2){
            System.out.println("\nInvalid players name: " + playersName +
                    " \nThe name must be greater than one character in length");
            return false;
        }
        
        
        Player player = GameControl.createPlayer(playersName);
        
        if (player== null){
            System.out.println("\nError creating the player.");
            return false;
        }
        
        //display next view
        this.displayNextView(player);
    
    return true;
    
}

    private void displayNextView(Player player) {
        System.out.println("\n========================="
                + "\n Welcome to the game " + player.getName()
        + "\n We hope you have a lot of fun!"
        +"\n===============================");
   
        MainMenuView mainMenuView = new MainMenuView();
        
        mainMenuView.displayMainMenuView();
    }
    
}
