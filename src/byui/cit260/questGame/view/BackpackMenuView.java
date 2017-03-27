/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.questGame.view;

import byui.cit260.questGame.exceptions.BackpackControlException;
import byui.cit260.questGame.model.Actor;
import java.io.FileNotFoundException;
import java.io.PrintWriter;


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
                
            case "C":
                this.credits();
                break;
          
            default:
                this.console.println("\n***Invalid selection *** Try again");
                break;
              
        }
        return false;
    }
       private void hints() {
        this.console.println("You have 3 hints.");
    }

    private void guesses() {
        this.console.println("You have 2 guesses.");
    }

    private void tokens() {
        this.console.println("You do not have any tokens.");
}

    private void credits() {
       
       
       this.console.print("Credits Earned: ");
       
       this.console.print("Credits Still needed: ");

    }
    
    /*
    public void printList(Actor actor, String filePath) throws BackpackControlException{
           
        try (PrintWriter = new PrintWriter(filePath)){
            this.console.println("\n\n     List of Actors         ");
            this.console.printf("%n%-10s%20s%10s", "Name", "Description",
                                "Location");
            this.console.printf("%n%-10s%20s%10s", "----", "-----------",
                                "--------");
        for(Actor : actor){
            this.console.printf("", actor.getName()
                                 , actor.getDescription()
                                 , actor.getLocation());
            }
        }
            this.console.println("Print successful.");
    
    }*/
    }
    
    
  


