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
public class GameMenuView extends View {


    public GameMenuView() {
        super ( "\n ----- Game Menu ------\n"
                + "V – View Map\n"
                + "B - BackPack Contents   \n"
                + "L – Current Location\n"
                + "R - View a Riddle\n"
                + "H - Help \n"
                + "Q – return to previous menu\n"
                + "Enter the option: ");
        
    }

    
    @Override 
    public boolean doAction(String value) {
        value = value.toUpperCase();

        switch (value) {
            case "V":
                this.map();
                break;

            case "Y":
                this.backPack();
                break;

            case "L":
                this.location();
                break;

            case "H":
                this.help();
                break;
                
            case "R":
                this.riddle();
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
        helpMenu.display();
    }

    private void map() {
       System.out.println("Map");
    }

    

    private void riddle() {
        RiddleView riddle = new RiddleView();
        riddle.display();
    }
    

    
}
