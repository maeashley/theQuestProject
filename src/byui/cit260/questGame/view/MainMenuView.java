package byui.cit260.questGame.view;

import byui.cit260.questGame.control.GameControl;
import java.util.Scanner;
import thequest.TheQuest;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class MainMenuView extends View {

    private String promptMessage;
     private String menu;

    public MainMenuView() {
        super( "\n"
                + "\n-------------------"
                + "\n| Main Menu        |"
                + "\n-------------------"
                + "\nN- Start New Game"
                + "\nG- Get and start saved game"
                + "\nH- Get help on how to play the game"
                + "\nS- Save game"
                + "\nQ- Quit"
                + "\n---------------------");
    
        
        this.promptMessage = "\nEnter the option: ";
    
    
    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();

        switch (value) 
        {
            case "N":
                this.startNewGame();
                break;

            case "G":
                this.startExistingGame();
                break;

            case "H":
                this.displayHelpMenu();
                break;

            case "S":
                this.saveGame();
                break;

            default:
                System.out.println("\n***Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void startNewGame() {
        GameControl.createNewGame(TheQuest.getPlayer());
        
        
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
        
        
    }

    private void startExistingGame() {
        System.out.println("StartExistingGame");
    }

    private void saveGame() {
        System.out.println("SaveGame");
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }
        
    private void displayRiddleView() {
        RiddleView riddle = new RiddleView();
        riddle.displayRiddleView();
    }
    
   }


