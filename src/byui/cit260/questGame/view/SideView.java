///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package byui.cit260.questGame.view;
//
//import byui.cit260.questGame.control.QuestionControl;
//import static java.lang.Integer.parseInt;
//import java.util.InputMismatchException;
//import java.util.Scanner;
//
///**
// *
// * @author Harry
// */
//public class SideView extends View {
//
//    private String prompt1;
//    private String prompt2;
//
//    public SideView() {
//        // Default constructor
//
//        super("Please Enter the Sides: ");
//        this.prompt1 = "Enter Side 1: ";
//        this.prompt2 = "Enter Side 2: ";
//
//    }
//
//    @Override
//    public boolean doAction(String value) {
//       
//
//        QuestionControl r1 = new QuestionControl();
//
//       // Scanner keyboard = new Scanner(System.in);
//        
//        int value1 = 0;
//        int value2 = 0;
//        boolean valid = false;
//
//        while (!valid) {
//            while (!valid) {
//
//                this.console.println(this.prompt1);
//                
//                try
//                {
//                    String input = this.keyboard.readLine();
//                }
//                catch(Exception ex){
//                    
//                }
//               
//               // input = Integer.parseInt(input);
//                
//                
//                valid = true;
//
//                if (value1 < 0 || value1 > 50) {
//                    this.console.println("Please enter a number between 0 - 50");
//                    valid = false;
//                }
//
//            }
//            valid = false;
//
//            while (!valid) {
//
//                this.console.println(this.prompt2);
//                value2 = keyboard.nextInt();
//                valid = true;
//                if (value2 < 0 || value2 > 50) {
//                    this.console.println("Please enter a number between 0 - 50");
//                    valid = false;
//                }
//            }
//
//            valid = false;
//
//            /*float side3 = r1.calcSide(value1, value2);
//            if (side3 < 0) {
//                this.console.println("Please enter valid values");
//            } else {
//                this.console.println("Side 3: " + side3);
//                valid = true;
//            }
//*/
//
//        }
//        return true;     
//    }
//}
