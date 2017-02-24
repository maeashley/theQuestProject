/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.questGame.view;

import java.util.Scanner;

/**
 *
 * @author Harry
 */
public class GameMenuView {

    private String menu;
    private String promptMessage;

    public GameMenuView() {
        this.menu = "V – View Map\n"
                + "B - BackPack Contents   \n"
                + "L – Current Location\n"
                + "H - Help \n"
                + "Q – return to previous menu";
        
        
        this.promptMessage = "\nEnter the option: ";
    }

    private String getGameOption() {
        
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        while (!valid){
            System.out.println(this.menu);
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
    void displayGameMenuView() {
        boolean done = false;
        do {
            String gameOption = this.getGameOption();
            if (gameOption.toUpperCase().equals("Q")) {
                return;
            }

            done = this.doAction(gameOption);
        } while (!done);
    }

    private boolean doAction(String choice) {
        choice = choice.toUpperCase();

        switch (choice) {
            case "V":
                this.map();
                break;

            case "B":
                this.backPack();
                break;

            case "L":
                this.location();
                break;

            case "H":
                this.help();
                break;
            
            default:
                System.out.println("\n***Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void backPack() {
       System.out.println("BackPack Option takes you to the BackPack Menu");
    }

    private void location() {
       System.out.println("Location takes you the Menu for your current Location"
               + "Provides options to solve riddle and Helps options in the BackPack");
    }

    private void help() {
       HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayHelpMenuView();
    }

    private void map() {
       System.out.println("Map");
    }

    void displayMenu() {
        
        System.out.println(menu);
         System.out.println(promptMessage);
    
    }
    

    
}
