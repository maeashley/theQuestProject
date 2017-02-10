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
}
