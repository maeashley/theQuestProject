package byui.cit260.questGame.view;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author caleb
 */
public class MainMenuView {
    
    public MainMenuView(){
        this.menu = "\n"
                + "\n-------------------"
                + "\n| Main Menu        |"
                + "\n-------------------"
                + "\nN- Start New Game"
                + "\nG- Get and start saved game"
                + "\nH- Get help on how to play the game"
                + "\nS- Save game"
                + "\nQ- Quit"
                + "\n---------------------";
    }

    void displayMainMenuView() {
        boolean done = false;
        do{
            String menuOption = this.getMenuOption();
            if(menuOption.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(menuOption);
        } while (!done);
    }
    private String menu;

    private String getMenuOption() {
        return "N";
    }

    private boolean doAction(String choice) {
        choice = choice.toUpperCase();
        
        switch (choice){
        case "N":
        this.startNewGame();
        break;
        case"G":
        this.startExistingGame
                break;
                
        case "H":
            this.displayHelpMenu();
            break;
            
        case "S":
            this.saveGame();
            break;
            
        default:
            System.out.println("\n***Invalid selection *** Try again")
                    break;
                }
        return false;
    }
    
}
