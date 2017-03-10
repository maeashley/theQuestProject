/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.questGame.model;

/**
 *
 * @author ashley
 */
public class Question {
    //class instance variables
    private String text;
    private String correctAnswer;
    private int reward;
    
    
    public void ReligionQuestions(){
        String religion[] = new String[10];
        religion[0]= "What is the first book in the Book of Mormon?";
        religion[1]= "How many years were Nephi andhis family in the wilderness?";
        religion[2]= "What does the iron rod symoblize?";
        religion[3]= "Which Book of Mormon character was famous for"
                + " preaching the gospel on a large wall";
        religion[4]= "Which King did Abinadi preach to?";
        religion[5]= "How many books are there in the Book of Mormon?";
        religion[6]= "What guided Lehi's family to the promised land?";
        religion[7]= "Which prophet laid the brass plates in Hill Cumorah?";
        religion[8]= "Which prophet (full name) saw the finger of the Lord"
                + " touch stones and give them light?";
        religion[9]= "Fill in the blank: \n ... and by the power of the Holy"
                + " Ghost, ye may know the ______ of all things.";
        
    
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

    
    
    public void setText(String text) {
        this.text = text;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public void setReward(int reward) {
        this.reward = reward;
    }

    
}
