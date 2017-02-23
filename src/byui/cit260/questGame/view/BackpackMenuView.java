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
public class BackpackMenuView {
    private String menu;
    private String promptMessage;
    
    public BackpackMenuView(){
        this.menu= "\n H- Number of hints"
                + "\n T- Number of tokens"
                + "\n G- Guesses available"
                + "\n Q- Quit to previous menu";
        this.promptMessage="\n Enter your desired option: ";
}
    private String getBackpackOption(){
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
        return value;}
    
    private boolean doAction(String choice) {
        choice = choice.toUpperCase();

        switch (choice) {
            case "H":
                this.hints();
                break;

            case "G":
                this.guesses();
                break;

            case "T":
                this.tokens();
                break;
          
            default:
                System.out.println("\n***Invalid selection *** Try again");
                break;
              
        }
        return false;
    }
       private void hints() {
        System.out.println("You have 3 hints.");
    }

    private void guesses() {
        System.out.println("You have 2 guesses.");
    }

    private void tokens() {
        System.out.println("You do not have any tokens.");
}

}
