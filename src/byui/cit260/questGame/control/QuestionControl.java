/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.questGame.control;

import byui.cit260.questGame.model.Question;
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

    public static void readFile(String fileName, Question[] question) {

        // This will reference one line at a time
        String line = null;
        String answer = null;
        String reward = null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader
                    = new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader
                    = new BufferedReader(fileReader);

            for (int count = 0; count < 10; count++) {
                line = bufferedReader.readLine();
                question[count].setText(line);

                answer = bufferedReader.readLine();
                question[count].setCorrectAnswer(answer);

                reward = bufferedReader.readLine();
                question[count].setReward(Integer.parseInt(reward));

            }
            // Always close files.
            bufferedReader.close();
        } catch (FileNotFoundException ex) {
            System.out.println(
                    "Unable to open file '"
                    + fileName + "'");
        } catch (IOException ex) {
            System.out.println(
                    "Error reading file '"
                    + fileName + "'");
            // Or we could just do this: 
            // ex.printStackTrace();
        }
    }

    public static Question[] createReligiousQuestionList() {
        Question[] religion = new Question[10];
        readFile("religion.txt", religion);

        return religion;
    }

    public static Question[] createMathQuestionList() {
        Question[] math = new Question[10];
        readFile("mathematics.txt", math);

        return math;
    }

    public static Question[] createMusicQuestionList() {

        Question[] music = new Question[10];
        readFile("music.txt", music);

        return music;
    }

    public static Question[] createScienceQuestionList() {

        Question[] science = new Question[10];
        readFile("science.txt", science);

        return science;
    }

    public static Question[] createTechnologyQuestionList() {

        Question[] tech = new Question[10];
        readFile("technology.txt", tech);

        return tech;
    }

}
