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
     
    
        
        
        return religion;
    }

    
}
