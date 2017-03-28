/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.questGame.view;

import byui.cit260.questGame.exceptions.BackpackControlException;
import byui.cit260.questGame.model.Actor;
import byui.cit260.questGame.model.Location;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import byui.cit260.questGame.view.ErrorView;

/**
 *
 * @author caleb
 */
public class BackpackMenuView extends View {

    private String menu;
    private String promptMessage;

    public BackpackMenuView() {
        super("\n H- Number of hints"
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
    // PrintWriter = new printWriter;

    public void printList(String filePath) {

        try (PrintWriter printWriter = new PrintWriter(filePath)) {
            printWriter.println("\n\n     List of Actors         ");
            printWriter.printf("%n%-10s%20s%10s", "Name", "Description",
                    "Location");
            printWriter.printf("%n%-10s%20s%10s", "----", "-----------",
                    "--------");
            for (Actor actor : Actor.values()) {

                Location location = actor.getLocation();
                printWriter.printf("%n%-10s%20s %d,%d", actor.getName(),
                         actor.getDescription(),
                         location.getBuilding(),
                         location.getFloor());
            }
            this.console.println("Print successful.");
        } catch (FileNotFoundException ex) {

            ErrorView.display(this.getClass().getName(), ex.getMessage());

        } catch (IOException ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());

        }

    }
}
