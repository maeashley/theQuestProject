/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.questGame.view;

import java.util.Scanner;

/**
 *
 * @author caleb
 */
public class RiddleView {
    private String promptOne;
    private String promptTwo;
    
    public RiddleView(){
        this.promptOne="Please enter the mass.";
        this.promptTwo="Please enter the volume.";
    }
    
    private int getRiddlePrompt(){
        Scanner keyboard = new Scanner(System.in);
        int value;
        value = -1;
        boolean valid = false;
        
        while (!valid){
            System.out.println(this.promptOne);
            System.out.println("\n" + this.promptTwo);
                       
            if ((int)value<1){
               System.out.println("\nInvalid value: value cannot be a"
                        + "negative integer");
            } 
            else {
                System.out.println("You have entered two valid numbers."
                        + "Do not use values lower than 0.");
            }
            
        }
       return -1;
    }

    public void displayRiddleView() {
        System.out.println("stuff here.");
    }
    
}
