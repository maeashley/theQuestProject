/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.questGame.control;

import byui.cit260.questGame.model.Backpack;
import java.util.ArrayList;

/**
 *
 * @author ashley
 */
public class BackpackControl {

    static Backpack createBackPack() {
        Backpack backpack = new Backpack();
        return backpack;
    }
    


 static public int sumCredits(ArrayList<Integer>  array){
        int sum = 0;
        for(int a: array){
            sum += a;
        }
        return sum;
    }
 
}