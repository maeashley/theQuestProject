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
public class BackpackMenuView extends View {
    private String menu;
    private String promptMessage;
    
    public BackpackMenuView(){
        super( "\n H- Number of hints"
                + "\n T- Number of tokens"
                + "\n G- Guesses available"
                + "\n Q- Quit to previous menu"
                + "\nEnter the option: ");
       
}
    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();

        switch (value) {
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
