/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.questGame.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author caleb
 */
public class RiddleControlTest {
    
    public RiddleControlTest() {
    }

    /**
     * Test of calcTemperature method, of class RiddleControl.
     */
    @Test
    public void testCalcTemperature() {
        System.out.println("calcTemperature");
        float celsius = 45F;
        RiddleControl instance = new RiddleControl();
        float expResult = 113F;
        float result = instance.calcTemperature(celsius);
        assertEquals(expResult, result, 0.0);
       
        //test 2
        celsius = -274F;
        expResult = -274F;
        result = instance.calcTemperature(celsius);
        assertEquals(expResult, result, 0.0);
        
        //test 3
        celsius = 30000F;
        expResult = -274F;
        result = instance.calcTemperature(celsius);
        assertEquals(expResult, result, 0.0);
        
       //test 4
        celsius = -300F;
        expResult = -274F;
        result = instance.calcTemperature(celsius);
        assertEquals(expResult, result, 0.0);
        
        //test 5
        celsius = -273.15F;
        expResult = -459.67F;
        result = instance.calcTemperature(celsius);
        assertEquals(expResult, result, 0.1);
        
        //test 6
        celsius = 3000F;
        expResult = 5432F;
        result = instance.calcTemperature(celsius);
        assertEquals(expResult, result, 0.0);
    }
    
}
