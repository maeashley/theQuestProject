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
                + "Q – return to previous menu";
        
        
        this.promptMessage = "\nEnter the option: ";
    }

    private String getHelpOption() {
        
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
                

            default:
                System.out.println("\n***Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void goals() {
       System.out.println("The goal of the game is to answer all of the riddles"
               + "and challenges correctly with the highest amount of tokens"
               + "still available in your backpack.");
    }

    private void moves() {
       System.out.println("You can move left and from building to building but"
               + "you cannot move up and down through the levels without"
               + "having bypassed the riddle that was given to you in that scene");
    }

    private void tokens() {
       System.out.println("Tokens reference the amount of reward you have"
               + "earned from the levels you have passed throughout the game. "
               + "You can find your tokens by going to a current scene.");
    }

    private void map() {
       System.out.println("Map");
    }

    private void backpack() {
       System.out.println("In your Backpack, you have three things: Tokens,"
               + " Hints, and Guesses. Each is stored here and can be retrieved"
               + "when answering a riddle or challenge." );
    }

}
