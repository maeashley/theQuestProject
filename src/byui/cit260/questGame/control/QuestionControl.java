/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.questGame.control;

import byui.cit260.questGame.model.Question;
import byui.cit260.questGame.view.ErrorView;
import java.lang.Math;
import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author ashley
 */
public class QuestionControl {

    public QuestionControl() {

    }
    
    public static Question[] createReligiousQuestionList() {
        Question[] religion = new Question[10];
        
        for(int i = 0; i < 10 ; i++)
        {
            religion[i] = new Question();
        }
        
        religion[0].setText("What is the first book in the Book of Mormon?");
        religion[0].setCorrectAnswer("Nephi");
        religion[0].setReward(1);

        
        
        religion[1].setText("How many years were Nephi andhis family in the"
                + " wilderness?");
        religion[1].setCorrectAnswer("8");
        religion[1].setReward(1);

        religion[2].setText("What does the iron rod symoblize?");
        religion[2].setCorrectAnswer("Word of God");
        religion[2].setReward(1);

        religion[3].setText("Which Book of Mormon character was famous for"
                + " preaching the gospel on a large wall");
        religion[3].setCorrectAnswer("Samuel");
        religion[3].setReward(1);

        religion[4].setText("Which King did Abinadi preach to?");
        religion[4].setCorrectAnswer("Noah");
        religion[4].setReward(1);

        religion[5].setText("How many books are there in the Book of Mormon?");
        religion[5].setCorrectAnswer("13");
        religion[5].setReward(2);

        religion[6].setText("What guided Lehi's family to the promised land?");
        religion[6].setCorrectAnswer("Liahona");
        religion[6].setReward(2);

        religion[7].setText("Which prophet laid the brass plates in Hill Cumorah?");
        religion[7].setCorrectAnswer("Moroni");
        religion[7].setReward(2);

        religion[8].setText("Which prophet full name) saw the finger of the "
                + "Lord touch stones and give them light?");
        religion[8].setCorrectAnswer("Mahonrimoriancumr");
        religion[8].setReward(3);

        religion[9].setText("Fill in the blank: \n ... and by the power of "
                + "the Holy Ghost, ye may know the ______ of all things.");
        religion[9].setCorrectAnswer("truth");
        religion[9].setReward(1);

        return religion;
    }


    public static Question[] createMathQuestionList() {
        Question[] math = new Question[10];
        for(int i = 0; i < 10 ; i++)
        {
            math[i] = new Question();
        }
        math[0].setText("20 % of 2 is equal to");
        math[0].setCorrectAnswer("0.4");
        math[0].setReward(1);

        math[1].setText("The population of a country increased by an average of "
                + "2% per year from 2000 to 2003. If the population of this "
                + "country was 2 000 000 on December 31, 2003, then the "
                + "population of this country on January 1, 2000, to the "
                + "nearest thousand would have been ");
        math[1].setCorrectAnswer("1846000");
        math[1].setReward(2);

        math[2].setText("A school committee consists of 2 teachers and 4 students. "
                + "The number of different committees that can be formed from 5 "
                + "teachers and 10 students is ");
        math[2].setCorrectAnswer("2100");
        math[2].setReward(2);

        math[3].setText("Five different books (A, B, C, D and E) are to be "
                + "arranged on a shelf. Books C and D are to be arranged first "
                + "and second starting from the right of the shelf. The number "
                + "of different orders in which books A, B and E may be "
                + "arranged is ");
        math[3].setCorrectAnswer("6");
        math[3].setReward(3);

        math[4].setText("The exam scores of all 500 students were recorded and"
                + " it was determined that these scores were normally distributed."
                + " If Jane's score is 0.8 standard deviation above the mean, "
                + "then how many, to the nearest unit, students scored "
                + "above Jane? ");
        math[4].setCorrectAnswer("106");
        math[4].setReward(3);

        math[5].setText("When a metallic ball bearing is placed inside a "
                + "cylindrical container, of radius 2 cm, the height of the"
                + " water, inside the container, increases by 0.6 cm. The "
                + "radius, to the nearest tenth of a centimeter, of the "
                + "ball bearing is ");
        math[5].setCorrectAnswer("1.2");
        math[5].setReward(3);

        math[6].setText("The probability that an electronic device produced "
                + "by a company does not function properly is equal to 0.1. "
                + "If 10 devices are bought, then the probability, to the "
                + "nearest thousandth, that 7 devices function properly is ");
        math[6].setCorrectAnswer("0.057");
        math[6].setReward(4);

        math[7].setText("What is 22893365487/3?");
        math[7].setCorrectAnswer("7631121829");
        math[7].setReward(2);

        math[8].setText("Without using a calulator, multiply the age of "
                + "President Monson to the year 2017. The product is _____");
        math[8].setCorrectAnswer("179513");
        math[8].setReward(3);

        math[9].setText("Name the greatest common factor between 45 and 90.");
        math[9].setCorrectAnswer("45");
        math[9].setReward(2);

        return math;
    }

    public static Question[] createMusicQuestionList() {

        Question[] music = new Question[10];
        for(int i = 0; i < 10 ; i++)
        {
            music[i] = new Question();
        }
        music[0].setText("The live album Beauty and the Beat featured pianist "
                + "George Shearring and which singer?");
        music[0].setCorrectAnswer("Peggy Lee");
        music[0].setReward(3);

        music[1].setText("Whose band was the Tijuana Brass? ");
        music[1].setCorrectAnswer("Herb Alpert");
        music[1].setReward(3);

        music[2].setText("Who were Cliff Richard's backing group through the 60s? ");
        music[2].setCorrectAnswer("The Shadows");
        music[2].setReward(3);

        music[3].setText("Who were the famous backing singers on most of Elvis"
                + " Presley's early hits? ");
        music[3].setCorrectAnswer("The Jordanaires");
        music[3].setReward(3);

        music[4].setText("The Stratocaster is a model of which guitar maker?");
        music[4].setCorrectAnswer("Fender");
        music[4].setReward(3);

        music[5].setText("Which piano-playing singer's first hit was The Fat Man?");
        music[5].setCorrectAnswer("Fats Domino");
        music[5].setReward(3);

        music[6].setText("Which American rock'n'roll star caused controversy "
                + "when he married a young teenager? ");
        music[6].setCorrectAnswer("Jerry Lee Lewis");
        music[6].setReward(3);

        music[7].setText("Who made the highly rated 1959 jazz album Kind of Blue? ");
        music[7].setCorrectAnswer("Nephi");
        music[7].setReward(3);

        music[8].setText("Which iconic British female singer made the highly "
                + "regarded album titled '(her first name) in Memphis' ? ");
        music[8].setCorrectAnswer("Dusty Springfield");
        music[8].setReward(3);

        music[9].setText("Whose band was the All Stars? ");
        music[9].setCorrectAnswer("Junior Walker");
        music[9].setReward(3);

        return music;
    }

    public static Question[] createScienceQuestionList() {

        Question[] science = new Question[10];
        for(int i = 0; i < 10 ; i++)
        {
            science[i] = new Question();
        }
        science[0].setText("Optical Phenomenon in the fringe pattern of CD is");
        science[0].setCorrectAnswer("Interference");
        science[0].setReward(2);

        science[1].setText("Celsius and Fahrenheit show the same temperature at");
        science[1].setCorrectAnswer("40");
        science[1].setReward(1);

        science[2].setText("Exchange particle in Quark-Quark Interaction");
        science[2].setCorrectAnswer("Gluon");
        science[2].setReward(2);

        science[3].setText("The working of a rockets based on the principle of: ");
        science[3].setCorrectAnswer("Conservation of momentum");
        science[3].setReward(2);

        science[4].setText("The pollutants which move downward with percolating "
                + "groundwater are called ______");
        science[4].setCorrectAnswer("Leachates");
        science[4].setReward(3);

        science[5].setText("Hasdo Valley in Chhattisgarh is famous for ");
        science[5].setCorrectAnswer("Coal mines");
        science[5].setReward(3);

        science[6].setText("Special Theory of Relative was proposed in");
        science[6].setCorrectAnswer("1905");
        science[6].setReward(1);

        science[7].setText("Black hole is an object to be found in ");
        science[7].setCorrectAnswer("Sky");
        science[7].setReward(1);

        science[8].setText("Boiling point of water is (c) ");
        science[8].setCorrectAnswer("100");
        science[8].setReward(2);

        science[9].setText("Fraction of volume of ice seen outside when immersed"
                + " in water? (int Percent).");
        science[9].setCorrectAnswer("10.5");
        science[9].setReward(2);

        return science;
    }

    public static Question[] createTechnologyQuestionList() {

        Question[] tech = new Question[10];
        for(int i = 0; i < 10 ; i++)
        {
            tech[i] = new Question();
        }
        tech[0].setText("The fathers of the Internet is ");
        tech[0].setCorrectAnswer("Vint Cerf");
        tech[0].setReward(1);

        tech[1].setText("Which is the news search engine introduced by Rediff.com in 2012?");
        tech[1].setCorrectAnswer("Realtime News Search");
        tech[1].setReward(3);

        tech[2].setText("The inventor of the World Wide Web?");
        tech[2].setCorrectAnswer("Tim Berners-Lee");
        tech[2].setReward(3);

        tech[3].setText("The founder of Netscape Communications?");
        tech[3].setCorrectAnswer("Marc Andreessen");
        tech[3].setReward(2);

        tech[4].setText("Where was the first computer installed in India?");
        tech[4].setCorrectAnswer("Indian Statistical Institute, Kolkata");
        tech[4].setReward(3);

        tech[5].setText("In internet terminology IP means");
        tech[5].setCorrectAnswer("Internet Protocol");
        tech[5].setReward(1);

        tech[6].setText("The first page of a website is called the ");
        tech[6].setCorrectAnswer("Home page");
        tech[6].setReward(1);

        tech[7].setText("A website addresss is a unique name that identifies a "
                + "specific ____________ on the web.");
        tech[7].setCorrectAnswer("Link");
        tech[7].setReward(1);

        tech[8].setText("A ______ is a computer attached to the internet that"
                + " runs a special web server software and can send web pages"
                + " out to the other computer over the internet.");
        tech[8].setCorrectAnswer("Web sever");
        tech[8].setReward(2);

        tech[9].setText("Which software application is used for accessing"
                + " sites or information on a network ( as the world wide web)?");
        tech[9].setCorrectAnswer("Web browser");
        tech[9].setReward(1);

        return tech;
    }

}
