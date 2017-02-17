/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.questGame.view;

/**
 *
 * @author caleb
 */
public class StartProgramView {
    public void displayStartProgramView(){
        banner();
        System.out.println("This text based game is a quest of knowledge and endurance.\n"
                + "The goal of the game is to answer all riddles or puzzles correctly "
                + "with the most tokens possible. \n"
                + "The riddles, challenges, and puzzles become more difficult "
                + "as the game progresses. Good luck!");
        System.out.println("Start Menu\nB - New Game\nH- Help Menu\nC- Continue Save Game\nE- Exit Game");
    }
    public void banner(){
        System.out.println("████████╗██╗  ██╗███████╗     ██████╗ ██╗   ██╗███████╗███████╗████████╗\n" +
"╚══██╔══╝██║  ██║██╔════╝    ██╔═══██╗██║   ██║██╔════╝██╔════╝╚══██╔══╝\n" +
"   ██║   ███████║█████╗      ██║   ██║██║   ██║█████╗  ███████╗   ██║   \n" +
"   ██║   ██╔══██║██╔══╝      ██║▄▄ ██║██║   ██║██╔══╝  ╚════██║   ██║   \n" +
"   ██║   ██║  ██║███████╗    ╚██████╔╝╚██████╔╝███████╗███████║   ██║   \n" +
"   ╚═╝   ╚═╝  ╚═╝╚══════╝     ╚══▀▀═╝  ╚═════╝ ╚══════╝╚══════╝   ╚═╝   \n" +
"                                                                        ");
    }
    
}
