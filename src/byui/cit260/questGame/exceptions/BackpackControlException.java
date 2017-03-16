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
public class BackpackControlException extends Exception {

    public BackpackControlException() {
    }

    public BackpackControlException(String string) {
        super(string);
    }

    public BackpackControlException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public BackpackControlException(Throwable thrwbl) {
        super(thrwbl);
    }

    public BackpackControlException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }

    
}
