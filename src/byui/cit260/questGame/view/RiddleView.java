/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.questGame.view;

import java.util.Scanner;

public class RiddleView {

    private String promptOne;
    private String promptTwo;
    
    public RiddleView(){
        this.promptOne="Please enter the mass.";
        this.promptTwo="Please enter the volume.";
    }
    

    private int getRiddlePromptOne(int mass) {
        Scanner keyboard = new Scanner(System.in);
        int value;
        value = -1;
        boolean valid = false;

        while (!valid) {
            System.out.println(this.promptOne);

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

    private int getRiddlePromptTwo(int volume) {
        Scanner keyboard = new Scanner(System.in);
        int value;
        value = -1;
        boolean valid = false;

        while (!valid) {
            System.out.println(this.promptOne);

            if ((int) value < 1) {
                System.out.println("\nInvalid value: value cannot be a"
                        + "negative integer");
            } else if ((int) value > 25) {
                System.out.println("You have entered an invalid number."
                        + "Do not use values lower than 0.");
            } else {
                System.out.println("You have entered a valid volume.");
            }

        }
        return 0;

    }

    void displayRiddleView() {
        System.out.println(this.promptOne);
        System.out.println(this.promptTwo);

    }

}
