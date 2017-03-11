/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.questGame.view;

import byui.cit260.questGame.control.QuestionControl;
import java.util.Scanner;

public class RiddleView extends View {

   
    
    public RiddleView(){
        super();
        
    }

    
    
    @Override
     public boolean doAction(String value) {
        boolean valid = false;
        int massValue = Integer.parseInt(value);

        while (!valid) {
            System.out.println("Please enter the mass.");

            if (massValue < 1) {
                System.out.println("\nInvalid value: value cannot be a"
                        + "negative integer");
                return false;
            } else if (massValue > 5000) {
                System.out.println("You have entered an invalid number."
                        + "Do not use values larger than 5000.");
                return false;
            } else {
                System.out.println("You have entered a valid mass.");
                valid = true;
            }

        }
        
        return true;
    }

}
