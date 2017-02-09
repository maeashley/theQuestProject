/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.questGame.control;

/**
 *
 * @author caleb
 */
public class RiddleControl {
    public float calcTemperature(float celsius)
    {
        if (celsius < -273.15  || celsius > 3000)
            return -274;
        
        float temperature = (float)(celsius * 9.0/5.0+ 32.0);
        return temperature;
    }
    
}
