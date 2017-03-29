/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.questGame.view;

import byui.cit260.questGame.control.QuestionControl;
import java.util.Scanner;
import byui.cit260.questGame.exceptions.QuestionControlException;

public class RiddleView extends View {

    public RiddleView() {
        super("You need to create a function that calls each question.");

    }

    @Override
    public boolean doAction(String value) {
        ///
        return true;
    }
    
    

    public boolean getMass()
            throws QuestionControlException {
        boolean valid = false;
        int massValue = getInt("Please enter the mass.");

        if (massValue < 1) {
            throw new QuestionControlException("\nInvalid value: value cannot be a negative integer");

        } else if (massValue > 5000) {
            this.console.println("You have entered an invalid number."
                    + "Do not use values larger than 5000.");
            return false;
        } else {
            this.console.println("You have entered a valid mass.");
            valid = true;
        }
        
        return valid;

    }


}
