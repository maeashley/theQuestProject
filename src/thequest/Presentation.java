/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thequest;
import byui.cit260.questGame.view.SideView;

/**
 *
 * @author Harry
 */
public class Presentation {
    
    public int s;
    public static void main(String[] args) {
 
        //SideView s1 = new SideView();
  //      s1.side3();
    
        
        Presentation p = new Presentation();
        int a = 20;
        int b = 30;
        
        int c = p.add(a,b);
        
        
        System.out.println(c);
         System.out.println(a);
         
         
         
         p.changePresentation(p);
         System.out.println(p.s);
    }
    
    public void changePresentation(Presentation p)
    {
        p.s = 20;
    }

    public int add(int a, int b)
    {
        a = 10;
        
         System.out.println(a);
        return a + b;
    }
}