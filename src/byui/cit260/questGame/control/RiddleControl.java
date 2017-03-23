/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.questGame.control;

import byui.cit260.questGame.exceptions.QuestionControlException;
import byui.cit260.questGame.view.ErrorView;
import byui.cit260.questGame.view.RiddleView;

/**
 *
 * @author ashley
 */
public class RiddleControl {
    
    
    public RiddleControl(){
   
    }
    public void getMassQuestion(){
        RiddleView Question = new RiddleView();
        
        try {
            Question.getMass();
            
        }catch(QuestionControlException ex)
        {
        ErrorView.display(this.getClass().getName(),ex.getMessage());
        }
    }
    
    
}

