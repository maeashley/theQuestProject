/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.questGame.view;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
import thequest.TheQuest;

/**
 *
 * @author ashley
 */
public abstract class View implements ViewInterface {

    protected String promptMessage;
    
    protected final BufferedReader keyboard = TheQuest.getInFile();
    protected final PrintWriter console = TheQuest.getOutFile();
    

    public View() {
    }

    public View(String message) {
        this.promptMessage = message;
    }

    @Override
    public void display() {
        boolean done = false;
        do {
            
            String value = this.getInput();
            if (value.toUpperCase().equals("Q")) {
                return;
            }

            done = this.doAction(value);
        } while (!done);

    }

    @Override
    public String getInput() {
        //Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        String value = null;

        while (!valid) {
            this.console.println("\n" + this.promptMessage);

            try
            {
                value = keyboard.readLine();
            }
            catch(Exception ex)
            {
                System.out.println("Invalid Input!");
            }
            value = value.trim();

            if (value.length() < 1) {
                this.console.println("\n*** You must enter a value ***");
                continue;
            }
            break;
        }
        return value;
    }
    
    
    public int getInt(String prompt)
    {
       // Scanner keyboard = new Scanner(System.in);
        int number = 0;
        String value = "";
        
        while (number == 0)
        {
            this.console.println(prompt);
            try
            {
                value = keyboard.readLine();
            }
            catch(Exception ex)
            {
                System.out.println("Invalid Input!");
            }
            value = value.trim();
            
            try{
                number = Integer.parseInt(value);
            }
            catch(NumberFormatException ex){
                 System.out.println("Invalid Entry, You must enter a Integer");
                number = 0;
            }
            
        }
        return number;
    }
    // BUILD THE PARSE FUNCTIONS

}
