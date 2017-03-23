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

    //private String promptMessage;
    private String menu;

    public MainMenuView() {
        super("\n"
                + "\n-------------------"
                + "\n| Main Menu        |"
                + "\n-------------------"
                + "\nN- Start New Game"
                + "\nG- Get and start saved game"
                + "\nH- Get help on how to play the game"
                + "\nS- Save game"
                + "\nQ- Quit"
                + "\n---------------------"
                + "\nEnter the option:"
        );
    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();

        switch (value) {
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
                this.console.println("\n***Invalid selection *** Try again");
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
        this.console.println("\n\nEnter the file Path for the file where the Game"
                + " is saved.");

        String filePath = "";
        try{
            filePath = keyboard.readLine();
        }
        catch(Exception ex){
            ErrorView.display(this.getClass().getName(),
                    "Error Retrieving game from file: '" + filePath + "'");
        }

        try {
            GameControl.getSavedGame(filePath);
        } catch (Exception ex) {
            ErrorView.display(this.getClass().getName(),
                    "Error Retrieving game from file: '" + filePath + "'");
        }
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void saveGame() {
        this.console.println("\n\nEnter the file path for file where the game"
                + "is to be saved");

        String filePath = "";
        try{
            filePath = keyboard.readLine();
        }
        catch(Exception ex){
            ErrorView.display(this.getClass().getName(),
                    "Error Retrieving game from file: '" + filePath + "'");
        }

        try {
            GameControl.saveGame(TheQuest.getCurrentGame(), filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

}
