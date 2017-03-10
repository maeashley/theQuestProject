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
 * @author ashley
 */
public class RiddleControlTest {
    
    public RiddleControlTest() {
    }

    /**
     * Test of calcTemperature method, of class QuestionControl.
     */
    @Test
    public void testCalcTemperature() {
        System.out.println("calcTemperature");
        float celsius = 45F;
        QuestionControl instance = new QuestionControl();
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

    /**
     * Test of calcDensity method, of class QuestionControl.
     */
    @Test
    public void testCalcDensity() {
        System.out.println("calcDensity");
        float mass = 25F;
        float volume = 1.5F;
        QuestionControl instance = new QuestionControl();
        float expResult = 16.6F;
        float result = instance.calcDensity(mass, volume);
        assertEquals(expResult, result, 0.1);
        
        //test 2
        mass = 0F;
        volume = 2.3F;
        expResult = -1F;
        result = instance.calcDensity(mass, volume);
        assertEquals(expResult, result, 0.0);
        
        //test 3
        mass = -50F;
        volume = 8F;
        expResult = -1F;
        result = instance.calcDensity(mass, volume);
        assertEquals(expResult, result, 0.0);
        
        //test 4
        mass = 100F;
        volume = 0F;
        expResult = -1F;
        result = instance.calcDensity(mass, volume);
        assertEquals(expResult, result, 0.0);
        
        //test 5
        mass = .01F;
        volume = 0.1F;
        expResult = 0.1F;
        result = instance.calcDensity(mass, volume);
        assertEquals(expResult, result, 0.1);
        
       //test 6
        mass = 5000F;
        volume = 25F;
        expResult = 200F;
        result = instance.calcDensity(mass, volume);
        assertEquals(expResult, result, 0.0);
        
        
    }

    /**
     * Test of calcSide method, of class QuestionControl.
     */
    @Test
    public void testCalcSide() {
        System.out.println("calcSide");
        float side1 = 3F;
        float side2 = 4F;
        QuestionControl instance = new QuestionControl();
        float expResult = 5F;
        float result = instance.calcSide(side1, side2);
        assertEquals(expResult, result, 0.0);
       
        side1 = -10F;
        side2 = 20F;
        expResult = -1F;
        result = instance.calcSide(side1, side2);
        assertEquals(expResult, result, 0.0);
        
        side1 = 45F;
        side2 = -20F;
        expResult = -1F;
        result = instance.calcSide(side1, side2);
        assertEquals(expResult, result, 0.0);
        
        side1 = 45F;
        side2 = 5000F;
        expResult = -1F;
        result = instance.calcSide(side1, side2);
        assertEquals(expResult, result, 0.0);
        
        side1 = 0F;
        side2 = 12F;
        expResult = 0F;
        result = instance.calcSide(side1, side2);
        assertEquals(expResult, result, 0.0);
        
        side1 = 24F;
        side2 = 0F;
        expResult = 0F;
        result = instance.calcSide(side1, side2);
        assertEquals(expResult, result, 0.0);
        
        side1 = 50F;
        side2 = 50F;
        expResult = 70.71F;
        result = instance.calcSide(side1, side2);
        assertEquals(expResult, result, 0.1);
    }
    
}
