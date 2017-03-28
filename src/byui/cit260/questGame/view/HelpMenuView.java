/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.questGame.view;

import byui.cit260.questGame.control.GameControl;
import java.util.Scanner;
import thequest.TheQuest;
import java.io.PrintWriter;
import java.io.BufferedReader;

/**
 *
 * @author Harry
 */
public class HelpMenuView extends View {

    private String menu;
    //private String promptMessage;

    public HelpMenuView() {
        super("G – Goal of the game\n"
                + "M - How to move   \n"
                + "T – Tokens you have\n"
                + "X – Map\n"
                + "B – Backpack contents\n"
                + "P - Print a report\n"
                + "Q – return to previous menu"
                + "\nEnter the option: ");
        
    }

   
    @Override
    public boolean doAction(String choice) {
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
                
            case "P":
                this.printReport();
                break;
                

            default:
                this.console.println("\n***Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void goals() {
      this.console.println("The goal of the game is to answer all of the riddles "
               + "and challenges correctly with the highest amount of tokens "
               + "still available in your backpack.");
    }

    private void moves() {
       this.console.println("You can move left and from building to building but "
               + "you cannot move up and down through the levels without "
               + "having bypassed the riddle that was given to you in that scene");
    }

    private void tokens() {
       this.console.println("Tokens reference the amount of reward you have "
               + "earned from the levels you have passed throughout the game. "
               + "You can find your tokens by going to a current scene.");
    }

    private void map() {
        this.console.println("      THE QUEST  ");
        this.console.println("    1   2   3   4   5");
         for(int i  = 0; i < 6; i++)
        {   
            this.console.println("-----------------------");
            this.console.print(i + 1 + "| ");
            for (int j = 0; j < 5; j++){
                if(i == 5 && j== 0){
                this.console.print(" S |");
                }
                else
                {
                     this.console.print(" X |");
                }
            }
            this.console.println();
            
        }
          this.console.println("-----------------------");
      
    }

    private void backpack() {
       this.console.println("In your Backpack, you have three things: Tokens, "
               + " Hints, and Guesses. Each is stored here and can be retrieved "
               + "when answering a riddle or challenge." );
    }

    private void printReport() {
        this.console.println("\n\nEnter the file path for file where the game"
                + "is to be saved");

        String filePath = "";
        try{
            filePath = keyboard.readLine();
            BackpackMenuView report = new BackpackMenuView();
            report.printList(filePath);
        }
        catch(Exception ex){
            ErrorView.display(this.getClass().getName(),
                    "Error Retrieving game from file: '" + filePath + "'");
    
        }
        
        try {
           // BackpackMenuView.printList(filePath)
        } catch (Exception ex) {
            ErrorView.display("HelpMenuView", ex.getMessage());
        }
    }
}
