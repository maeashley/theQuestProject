/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/


package byui.cit260.questGame.control;
import java.lang.Math;

/**
 *
 * @author caleb
 */
public class RiddleControl {
    //We want to Calculate the temperature using the input values from the user.
    
    /* So we use the following solution for the problem:
    
            calcTemperature(Celsius) : float
                If (Celsius < -273.15) THEN 
                Return -274
                If (Celsius > 3000) THEN
                    Return -274
                Temperature = celsius * (9.0/5.0) + 32
                    Return temperature

    
    */
    public float calcTemperature(float celsius)
    {
        if (celsius < -273.15  || celsius > 3000)
            return -274;
        
        float temperature = (float)(celsius * 9.0/5.0+ 32.0);
        return temperature;
       
    }
    
    public float calcDensity(float mass, float volume)
    {
        if (mass <=0 || mass >5000){
            return -1;
        }
        if (volume<=0 || volume>25) {
            return -1;
        }
        
        float density= (float) (mass/volume);
        return density;
    
    }
    
    public float calcSide(float side1, float side2)
    {
        
        if(side1 < 0 || side1 > 50 || side2 < 0 || side2 > 50)
        {
            return -1;
        }
        
        if(side1 == 0 || side2 ==0)
            return 0;
        
        float side3 = (float) Math.sqrt((side1 * side1) + (side2 * side2));
        return side3;
    }
    
    
}
