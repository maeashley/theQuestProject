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
public class HelpMenuView {

    private String menu;
    private String promptMessage;

    public HelpMenuView() {
        this.menu = "G – Goal of the game\n"
                + "M - How to move   \n"
                + "T – Tokens you have\n"
                + "X – Map\n"
                + "B – Backpack contents\n"
                + "R – Return to previous menu\n"
                + "Q – quit to main menu";
        
        
        this.promptMessage = "\nEnter the option: ";
    }

    private String getHelpOption() {
        
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
    void displayHelpMenuView() {
        boolean done = false;
        do {
            String helpOption = this.getHelpOption();
            if (helpOption.toUpperCase().equals("Q")) {
                return;
            }

            done = this.doAction(helpOption);
        } while (!done);
    }

    private boolean doAction(String choice) {
        choice = choice.toUpperCase();

        switch (choice) {
            case "G":
                this.goals();
                break;

            case "M":
                this.moves();
                break;

            case "T":
                this.tokens();
                break;

            case "X":
                this.map();
                break;
                
            case "B":
                this.backpack();
                break;
                
            case "R":
                this.previousMenu();
                break;

            default:
                System.out.println("\n***Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void goals() {
       System.out.println("Goals");
    }

    private void moves() {
       System.out.println("Moves");
    }

    private void tokens() {
       System.out.println("Tokens");
    }

    private void map() {
       System.out.println("Map");
    }

    private void backpack() {
       System.out.println("Backpack");
    }

    private void previousMenu() {
       System.out.println("Previous Menu");
    }

}
