/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/


package byui.cit260.questGame.control;
import byui.cit260.questGame.model.Question;
import java.lang.Math;
import java.util.Scanner;

/**
 *
 * @author ashley
 */
public class QuestionControl {
   
    
    public QuestionControl(){
        
    }
    public void display() {
        boolean done = false;
        do {
            
            String value = this.getInput();
            if (value.toUpperCase().equals("Q")) {
                return;
            }

          //  done = Question.getText();
        } while (!done);

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
    
public static Question[] createMathQuestionList(){
        Question[] math = new Question[10];
        
        Question zero = new Question();
        zero.setText("Name the greatest common factor between 45 and 90.");
        zero.setCorrectAnswer("45");
        zero.setReward(1);
        
        
        Question one = new Question();
        one.setText("What is 2/3 + 5/6 + 1/12?(Write in fraction form.)");
        one.setCorrectAnswer("19/12");
        one.setReward(1);
        
        Question two = new Question();
        two.setText("What is the first variable in the quadratic formula?");
        two.setCorrectAnswer("-b");
        two.setReward(2);
        
        Question three = new Question();
        three.setText("What is the formula for Pythagorean's theorem? (Use"
                + " the carrot symbol.)");
        three.setCorrectAnswer("a^2+b^2=c^2");
        three.setReward(2);
        
        Question four = new Question();
        four.setText("What is the square root of 82? (Round to the nearest"
                + " tenth)");
        four.setCorrectAnswer("9.1");
        four.setReward(1);
        
        Question five = new Question();
        five.setText("True or False: 8*8-12/6+225 = 233.67");
        five.setCorrectAnswer("False");
        five.setReward(2);
        
        Question six = new Question();
        six.setText("What is 3^5?");
        six.setCorrectAnswer("243");
        six.setReward(3);
        
        Question seven = new Question();
        seven.setText("What is 0.0000124893655 in scientific notation?");
        seven.setCorrectAnswer("1.25^-5");
        seven.setReward(3);
        
        Question eight= new Question();
        eight.setText("What is 22893365487/3?");
        eight.setCorrectAnswer("7631121829");
        eight.setReward(3);
        
        Question nine = new Question();
        nine.setText("Without using a calulator, multiply the age of President"
                + " Monson to the year 2017. The product is _____");
        nine.setCorrectAnswer("179513");
        nine.setReward(2);
    
        
        
        return math;
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

 public String getInput() {
        Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        String value = null;

        while (!valid) {
           // System.out.println("\n" + this.promptMessage);

            value = keyboard.nextLine();
            value = value.trim();

            if (value.length() < 1) {
                System.out.println("\n*** You must enter a value ***");
                continue;
            }
            break;
        }
        return value;
    }
}
