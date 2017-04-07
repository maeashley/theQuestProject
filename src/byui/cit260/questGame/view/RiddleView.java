/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.questGame.view;

import byui.cit260.questGame.control.QuestionControl;
import java.util.Scanner;
import byui.cit260.questGame.exceptions.QuestionControlException;
import byui.cit260.questGame.model.Location;
import byui.cit260.questGame.control.MapControl;
import byui.cit260.questGame.model.Game;
import thequest.TheQuest;

public class RiddleView extends View {

    private Location location;
    public RiddleView() {
        super("\n-----------------"
            + "\nV - View your corresponding riddle and the amount "
            + "\n of tokens it is worth"
            + "\nQ - Return to previous menu"
            + "\n-----------------"
            + "Please enter an option: ");
        location = null;
    }
    
    public RiddleView(Location currentLocation)
    { 
        this.location = currentLocation;  
    }
    

    

    @Override
    public boolean doAction(String value) {
        switch(value){
            case "V":
            this.askQuestion();
            break;
            
            
                }return false;
    }
    
    
    
    
    public void askQuestion(){
        Game game = TheQuest.getCurrentGame();
            
        if(this.location == null){
            return;
        }    
       else
        {
               //display this
          this.console.println(location.getScene().getQuestion().getText());
            int tokens = location.getScene().getQuestion().getReward();
            //get their response and compare to .getCorrectAnswer()
                String value = this.getInput().toUpperCase();
                this.console.println(value);
                
             if(value == location.getScene().getQuestion().getCorrectAnswer()){
                       game.getBackpack().setTokens(tokens + game.getBackpack().getToken());
                  
                      this.console.println("Correct! You have recieved "
                              + tokens + " tokens!"); 
                     
             }          
                  else{
                      this.console.println("That is incorrect. Try again!");
                  }    
            }
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

    private void newRiddle() {
        this.console.println("This will display the associated riddle and"
                + "the amount of tokens it is worth.");
        /*
        getCurrentLocation
        */
        
        
    }

    

}
