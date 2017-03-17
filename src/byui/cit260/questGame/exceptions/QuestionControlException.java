/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.questGame.exceptions;

/**
 *
 * @author ashley
 */
public class QuestionControlException extends Exception{

    public QuestionControlException() {
    }

    public QuestionControlException(String string) {
        super(string);
    }

    public QuestionControlException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public QuestionControlException(Throwable thrwbl) {
        super(thrwbl);
    }

    public QuestionControlException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
}
