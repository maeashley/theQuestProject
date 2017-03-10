/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/


package byui.cit260.questGame.control;
import byui.cit260.questGame.model.Question;
import java.lang.Math;

/**
 *
 * @author caleb
 */
public class QuestionControl {
   
    
    public QuestionControl(){
        //
    }
    
    
    public static Question[] createReligiousQuestionList(){
        Question[] religion = new Question[10];
        
        Question zero = new Question();
        zero.setText("What is the first book in the Book of Mormon?");
        zero.setCorrectAnswer("Nephi");
        zero.setReward(1);
        
        
        Question one = new Question();
        one.setText("How many years were Nephi andhis family in the wilderness?");
        one.setCorrectAnswer("8");
        one.setReward(1);
        
        Question two = new Question();
        two.setText("What does the iron rod symoblize?");
        two.setCorrectAnswer("the word of God");
        two.setReward(1);
        
        Question three = new Question();
        three.setText("Which Book of Mormon character was famous for"
                + " preaching the gospel on a large wall");
        three.setCorrectAnswer("Samuel the Lamanite");
        three.setReward(1);
        
        Question four = new Question();
        four.setText("Which King did Abinadi preach to?");
        four.setCorrectAnswer("Noah");
        four.setReward(1);
        
        Question five = new Question();
        five.setText("How many books are there in the Book of Mormon?");
        five.setCorrectAnswer("13");
        five.setReward(2);
        
        Question six = new Question();
        six.setText("What guided Lehi's family to the promised land?");
        six.setCorrectAnswer("Liahona");
        six.setReward(2);
        
        Question seven = new Question();
        seven.setText("Which prophet laid the brass plates in Hill Cumorah?");
        seven.setCorrectAnswer("Moroni");
        seven.setReward(2);
        
        Question eight= new Question();
        eight.setText("Which prophet (full name) saw the finger of the Lord"
                + " touch stones and give them light?");
        eight.setCorrectAnswer("Mahonrimoriancumr");
        eight.setReward(3);
        
        Question nine = new Question();
        nine.setText("Fill in the blank: \n ... and by the power of the Holy"
                + " Ghost, ye may know the ______ of all things.");
        nine.setCorrectAnswer("truth");
        nine.setReward(1);
    
        
        
        return religion;
    }
    












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
    
    /***
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
    
    **/ 
}
