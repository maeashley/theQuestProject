/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.questGame.view;

import byui.cit260.questGame.control.BackpackControl;
import byui.cit260.questGame.control.GameControl;
import byui.cit260.questGame.control.MapControl;
import byui.cit260.questGame.exceptions.GameControlException;
import byui.cit260.questGame.exceptions.MapControlException;
import byui.cit260.questGame.model.Actor;
import byui.cit260.questGame.model.Backpack;
import byui.cit260.questGame.model.Game;
import byui.cit260.questGame.model.Location;
import byui.cit260.questGame.model.Map;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.nio.file.FileSystemException;
import java.util.Scanner;
import thequest.TheQuest;

/**
 *
 * @author Harry
 */
public class GameMenuView extends View {


    public GameMenuView() {
        super ( "\n ----- Game Menu ------\n"
                + "V – View Map\n"
                + "M - Move to New Location\n"
                + "B - Test BackPack Contents   \n"
                + "A - Look for an actor\n"
                + "L – Current Location\n"
                + "R - View a Riddle\n"
                + "H - Help \n"
                + "P - Print Report\n"
                + "Q – return to previous menu\n"
                + "Enter the option: ");
        
    }

    
    @Override 
    public boolean doAction(String value) {
        value = value.toUpperCase();

        switch (value) {
            case "V":
                this.displayMap();
                break;
                
                case "A":
                this.getActor();
                break;

            case "Y":
                this.backpack();
                break;

            case "L":
                this.location();
                break;

            case "H":
                this.help();
                break;
                
            case "R":
                this.riddle();
                break;
              
            case "M":
                this.movePlayer();
                break;
            
            case "P":
                this.report();
                break;
                
                
            default:
                this.console.println("\n***Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void backpack() {
        
        Game game = TheQuest.getCurrentGame(); 
        Backpack backpack = game.getBackpack();
        
        // THIS IS JUST  A TEST TO ADD # CREDITS TO THE BACKPACK
        backpack.addCredits(3);
        backpack.addCredits(4);
        backpack.addCredits(2);
        backpack.addCredits(8);
        
        int sum = BackpackControl.sumCredits(backpack.getCredits());
        
        this.console.println("Sum of Credits: " + sum);
    }

    private void location() {
       this.console.println("Location takes you the Menu for your current Location"
               + "Provides options to solve riddle and Helps options in the BackPack");
    }

    private void help() {
       HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }
public void displayMap() {
  String leftIndicator;
  String rightIndicator;

  Game game = TheQuest.getCurrentGame(); // retreive the game
  Map map = game.getMap(); // retreive the map from game
  Location[][] locations = map.getLocations(); // retreive the locations from map
    // Build the heading of the map
    this.console.print("  |");
    for( int column = 0; column < locations[0].length; column++){
      // print col numbers to side of map
      this.console.print("  " + column + "  |"); 
    }
    // Now build the map.  For each row, show the column information
    this.console.println();
    for( int row = 0; row < locations.length; row++){
     this.console.print(row + " "); // print row numbers to side of map
      for( int column = 0; column < locations[row].length; column++){
        // set default indicators as blanks
        leftIndicator = " ";
        rightIndicator = " ";
        if(locations[row][column] == map.getCurrentLocation()){
          // Set star indicators to show this is the current location.
          leftIndicator = "*"; 
          rightIndicator = "*"; 
        } 
        else if(locations[row][column].isVisited()){
           // Set < > indicators to show this location has been visited.
           leftIndicator = ">"; // can be stars or whatever these are indicators showing visited
           rightIndicator = "<"; // same as above
        }
       this.console.print("|"); // start map with a |
        if(locations[row][column].getScene() == null)
        {
             // No scene assigned here so use ?? for the symbol
             this.console.print(leftIndicator + " ??" + rightIndicator);
        }
        else{
            String strSpace = "";
            if(locations[row][column].getScene().getSymbol().length()==2)
                strSpace = " ";
          this.console.print(strSpace + leftIndicator
             + locations[row][column].getScene().getSymbol()
             + rightIndicator);
        }
      }
     this.console.println("|");
    }
    this.console.println("\nCurrent Location: " + map.getCurrentLocation().getScene().getDescription());

 }
    
    
    
    
    
//    private void map() {
//        
//      //  Location [][] l = map.getLocations();
//      
//      Location[][] location = null;
//       this.console.println("      THE QUEST  ");
//        this.console.println("    1   2   3   4   5");
//         for(int i  = 0; i < 6; i++)
//        {   
//            this.console.println("-----------------------");
//            this.console.print(i + 1 + "| ");
//            for (int j = 0; j < 5; j++){
//                if(i == 5 && j== 0){
//                this.console.print(" S |");
//                }
//                else
//                {
//                     this.console.print(" " + location[i][j] + " ");
//                }
//            }
//            this.console.println();
//            
//        }
//          this.console.println("-----------------------");
//      
//    }

    
    public void startNewGame(){
        GameControl.createNewGame(TheQuest.getPlayer());
    }
    private void riddle() {
        RiddleView riddle = new RiddleView();
        riddle.display();
    }
    
private void getActor() {
        
        String savePrompt = this.promptMessage;
        this.promptMessage = "Please enter an actor's first name.";

        String searchActor = getInput();
        if (searchActor.length()>2){
            Actor actor = GameControl.searchForActor(searchActor);
            if(actor != null){
                this.console.println("Actor: " + actor.getName()+" - " + actor.getDescription());
            }
            else{
                this.console.println("Actor not found.");
            }
        }
        else{
            this.console.println("Invalid input");
        }
            this.promptMessage = savePrompt;
        
        
    }

    private void movePlayer() {
         int building;
         int floor;
         
         building = getInt("Enter the Building Number. 0 - 4.  (-1 to Cancel).");
         if (building == -1)
             return;
         floor = getInt("Enter the Floor Number. 0 - 5  (-1 to Cancel).");    
         if (floor == -1)
             return;
           Game game = TheQuest.getCurrentGame(); // retreive the game
            Map map = game.getMap(); // retreive the map from game
         
        try
        {
            MapControl.movePlayer(map, floor, building);
        }
        catch(MapControlException ex)
        {
       
             ErrorView.display(this.getClass().getName(),ex.getMessage());
         
        }
         displayMap();
    }

    private void report() {
        
        this.console.println("Enter the Output File Location: ");
        String filePath = "";
        try{
            filePath = keyboard.readLine();
        }
        catch(Exception ex){
            ErrorView.display(this.getClass().getName(),
                    "Error writing to file: '" + filePath + "'");
        }

        try {
            if(this.printReport(TheQuest.getCurrentGame(), filePath)){
                this.console.println("File Written!");
            }
            else{
                this.console.println("Report Writting Unsuccessful");
            }
        } 
        catch (Exception ex) {
            ErrorView.display("GameMenuView", ex.getMessage());
        }
    
    
    }
    



  public static boolean printReport(Game currentGame, String filePath)
  throws FileSystemException{
        
        String report = "";
      
        Map map = currentGame.getMap();
        Location[][] locations = map.getLocations();
        
        for (int i = 0; i < map.getFloorCount(); i++)
        {
            for (int j = 0; j < map.getBuildingCount(); j++)
            {
               report += locations[i][j].getScene().getDescription() + "\n";
               
            }
        }
        
        try(PrintWriter out = new PrintWriter(filePath)){
            
            out.println(report);            
            out.close();
        } catch (Exception e){
            ErrorView.display("GameMenuView",
                    "Error writing to file: '" + filePath + "'");

            return false;
        }
        
        return true;
    }
   
}