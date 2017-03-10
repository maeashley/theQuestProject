/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.questGame.model;

/**
 *
 * @author ashley
 */
public class Question {
    //class instance variables
    private String text;
    private String correctAnswer;
    private int reward;
    
    public void setText(String text) {
        this.text = text;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public void setReward(int reward) {
        this.reward = reward;
    }

    
}