/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.questGame.view;

import java.util.Scanner;

public class RiddleView extends View {

   
    
    public RiddleView(){
        super("Please enter the mass.");
    }
    

    private int getRiddlePromptOne(int mass) {
        Scanner keyboard = new Scanner(System.in);
        int value;
        value = keyboard.nextInt();
        boolean valid = false;

        while (!valid) {
            System.out.println("Please enter the mass.");

            if ((int) value < 1) {
                System.out.println("\nInvalid value: value cannot be a"
                        + "negative integer");
            } else if ((int) value > 5000) {
                System.out.println("You have entered an invalid number."
                        + "Do not use values lower than 0.");
            } else {
                System.out.println("You have entered a valid mass.");
            }

        }
        return 0;
    }

    
    
    @Override
     public boolean doAction(String value) {
//        value = value.toUpperCase();
//
//        switch (value) {
//            case "H":
//                this.hints();
//                break;
//
//            case "G":
//                this.guesses();
//                break;
//
//            case "T":
//                this.tokens();
//                break;
//          
//            default:
//                System.out.println("\n***Invalid selection *** Try again");
//                break;
//              
//        }
        return false;
    }

    void displayRiddleView() {
        System.out.println("Please enter the volume.");
       

    }

}
