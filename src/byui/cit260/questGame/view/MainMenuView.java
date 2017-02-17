package byui.cit260.questGame.view;

import byui.cit260.questGame.control.GameControl;
import java.util.Scanner;
import thequest.TheQuest;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class MainMenuView {

    private String promptMessage;

    public MainMenuView() {
        this.menu = "\n"
                + "\n-------------------"
                + "\n| Main Menu        |"
                + "\n-------------------"
                + "\nN- Start New Game"
                + "\nG- Get and start saved game"
                + "\nH- Get help on how to play the game"
                + "\nS- Save game"
                + "\nQ- Quit"
                + "\n---------------------";
    
        
        this.promptMessage = "\nEnter the option: ";
    
    
    }

    void displayMainMenuView() {
        boolean done = false;
        do {
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) {
                return;
            }

            done = this.doAction(menuOption);
        } while (!done);
    }
    private String menu;

    private String getMenuOption() {
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

    private boolean doAction(String choice) {
        choice = choice.toUpperCase();

        switch (choice) {
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
        gameMenu.displayMenu();
        
        
    }

    private void startExistingGame() {
        System.out.println("StartExistingGame");
    }

    private void saveGame() {
        System.out.println("SaveGame");
    }

    private void displayHelpMenu() {
        System.out.println("DisplayHelpMenu");
    }

}
