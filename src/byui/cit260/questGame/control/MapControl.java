/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.questGame.control;

import byui.cit260.questGame.model.Location;
import byui.cit260.questGame.model.Map;
import byui.cit260.questGame.model.Question;
import byui.cit260.questGame.model.Scene;
import byui.cit260.questGame.model.SceneType;

/**
 *
 * @author ashley
 */
public class MapControl {
    public int building;
    public int floor;

    public static Map createMap() {
        Map map = new Map(6,5);
        
        
        System.out.println("Create Map Called");
        return map;
    }
    
    private static Scene[] createScenes(){
        Scene[] scenes = new Scene[SceneType.values().length];
        
        Question[] questions = QuestionControl.createReligiousQuestionList();
        //SCENE 1
        Scene scene = new Scene();
        scene.setSymbol("R0");
        scene.setDescription("Welcome to Ron Anderson's class.");
        scene.setBlockedLocation(false);
        scene.setQuestion(questions[0]);
        //scene.setActor
        scenes[SceneType.religion0.ordinal()] = scene;
        
        //SCENE 2
        scene = new Scene();
        scene.setSymbol("R1");
        scene.setDescription("Welcome to Brother Castillow's class.");
        scene.setBlockedLocation(true);
        scene.setQuestion(questions[1]);
        //scene.setActor
        scenes[SceneType.religion1.ordinal()] = scene;
        
        //SCENE 3
        scene = new Scene();
        scene.setSymbol("R2");
        scene.setDescription("Welcome to Brother Baron's class.");
        scene.setBlockedLocation(true);
        scene.setQuestion(questions[2]);
        //scene.setActor
        scenes[SceneType.religion2.ordinal()] = scene;
        
        //SCENE 4
        scene = new Scene();
        scene.setSymbol("R3");
        scene.setDescription("Welcome to Sister Linford's class.");
        scene.setBlockedLocation(true);
        scene.setQuestion(questions[3]);
        //scene.setActor
        scenes[SceneType.religion3.ordinal()] = scene;
        
        //SCENE 5
        scene = new Scene();
        scene.setSymbol("R4");
        scene.setDescription("Welcome to Brother Allison's class.");
        scene.setBlockedLocation(true);
        scene.setQuestion(questions[4]);
        //scene.setActor
        scenes[SceneType.religion4.ordinal()] = scene;
        
        //SCENE 6
        scene = new Scene();
        scene.setSymbol("R5");
        scene.setDescription("Welcome to Brother Butterfield's class.");
        scene.setBlockedLocation(true);
        scene.setQuestion(questions[5]);
        //scene.setActor
        scenes[SceneType.religion5.ordinal()] = scene;
        
        //SCENE 7
        questions = QuestionControl.createMathQuestionList();
        scene = new Scene();
        scene.setSymbol("MA1");
        scene.setDescription("Welcome to Sister Baxter's class.");
        scene.setBlockedLocation(false);
        scene.setQuestion(questions[0]);
        //scene.setActor
        scenes[SceneType.mathematics1.ordinal()] = scene;
        
        //SCENE 8
        scene = new Scene();
        scene.setSymbol("R1");
        scene.setDescription("religion one");
        scene.setBlockedLocation(true);
        scene.setQuestion(questions[0]);
        //scene.setActor
        scenes[SceneType.religion1.ordinal()] = scene;
        
        //SCENE 9
        scene = new Scene();
        scene.setSymbol("R1");
        scene.setDescription("religion one");
        scene.setBlockedLocation(false);
        scene.setQuestion(questions[0]);
        //scene.setActor
        scenes[SceneType.religion1.ordinal()] = scene;
        
        //SCENE 10
        scene = new Scene();
        scene.setSymbol("R1");
        scene.setDescription("religion one");
        scene.setBlockedLocation(false);
        scene.setQuestion(questions[0]);
        //scene.setActor
        scenes[SceneType.religion1.ordinal()] = scene;
        
        //SCENE 11
        scene = new Scene();
        scene.setSymbol("R1");
        scene.setDescription("religion one");
        scene.setBlockedLocation(false);
        scene.setQuestion(questions[0]);
        //scene.setActor
        scenes[SceneType.religion1.ordinal()] = scene;
        
        //SCENE 12
        scene = new Scene();
        scene.setSymbol("R1");
        scene.setDescription("religion one");
        scene.setBlockedLocation(false);
        scene.setQuestion(questions[0]);
        //scene.setActor
        scenes[SceneType.religion1.ordinal()] = scene;
        
        //SCENE 13
        scene = new Scene();
        scene.setSymbol("R1");
        scene.setDescription("religion one");
        scene.setBlockedLocation(false);
        scene.setQuestion(questions[0]);
        //scene.setActor
        scenes[SceneType.religion1.ordinal()] = scene;
        
        //SCENE 14
        scene = new Scene();
        scene.setSymbol("R1");
        scene.setDescription("religion one");
        scene.setBlockedLocation(false);
        scene.setQuestion(questions[0]);
        //scene.setActor
        scenes[SceneType.religion1.ordinal()] = scene;
        
        //SCENE 15
        scene = new Scene();
        scene.setSymbol("R1");
        scene.setDescription("religion one");
        scene.setBlockedLocation(false);
        scene.setQuestion(questions[0]);
        //scene.setActor
        scenes[SceneType.religion1.ordinal()] = scene;
        
        //SCENE 16
        scene = new Scene();
        scene.setSymbol("R1");
        scene.setDescription("religion one");
        scene.setBlockedLocation(false);
        scene.setQuestion(questions[0]);
        //scene.setActor
        scenes[SceneType.religion1.ordinal()] = scene;
        
        //SCENE 17
        scene = new Scene();
        scene.setSymbol("R1");
        scene.setDescription("religion one");
        scene.setBlockedLocation(false);
        scene.setQuestion(questions[0]);
        //scene.setActor
        scenes[SceneType.religion1.ordinal()] = scene;
        
        //SCENE 18 
        scene = new Scene();
        scene.setSymbol("R1");
        scene.setDescription("religion one");
        scene.setBlockedLocation(false);
        scene.setQuestion(questions[0]);
        //scene.setActor
        scenes[SceneType.religion1.ordinal()] = scene;
        
        //SCENE 19
        scene = new Scene();
        scene.setSymbol("R1");
        scene.setDescription("religion one");
        scene.setBlockedLocation(false);
        scene.setQuestion(questions[0]);
        //scene.setActor
        scenes[SceneType.religion1.ordinal()] = scene;
        
        //SCENE 20
        scene = new Scene();
        scene.setSymbol("R1");
        scene.setDescription("religion one");
        scene.setBlockedLocation(false);
        scene.setQuestion(questions[0]);
        //scene.setActor
        scenes[SceneType.religion1.ordinal()] = scene;
        
        //SCENE 21
        scene = new Scene();
        scene.setSymbol("R1");
        scene.setDescription("religion one");
        scene.setBlockedLocation(false);
        scene.setQuestion(questions[0]);
        //scene.setActor
        scenes[SceneType.religion1.ordinal()] = scene;
        
        //SCENE 22
        scene = new Scene();
        scene.setSymbol("R1");
        scene.setDescription("religion one");
        scene.setBlockedLocation(false);
        scene.setQuestion(questions[0]);
        //scene.setActor
        scenes[SceneType.religion1.ordinal()] = scene;
        
        //SCENE 23
        scene = new Scene();
        scene.setSymbol("R1");
        scene.setDescription("religion one");
        scene.setBlockedLocation(false);
        scene.setQuestion(questions[0]);
        //scene.setActor
        scenes[SceneType.religion1.ordinal()] = scene;
        
        //SCENE 24
        scene = new Scene();
        scene.setSymbol("R1");
        scene.setDescription("religion one");
        scene.setBlockedLocation(false);
        scene.setQuestion(questions[0]);
        //scene.setActor
        scenes[SceneType.religion1.ordinal()] = scene;
        
        //SCENE 25
        scene = new Scene();
        scene.setSymbol("R1");
        scene.setDescription("religion one");
        scene.setBlockedLocation(false);
        scene.setQuestion(questions[0]);
        //scene.setActor
        scenes[SceneType.religion1.ordinal()] = scene;
        
        //SCENE 26
        scene = new Scene();
        scene.setSymbol("R1");
        scene.setDescription("religion one");
        scene.setBlockedLocation(false);
        scene.setQuestion(questions[0]);
        //scene.setActor
        scenes[SceneType.religion1.ordinal()] = scene;
        
        //SCENE 27
        scene = new Scene();
        scene.setSymbol("R1");
        scene.setDescription("religion one");
        scene.setBlockedLocation(false);
        scene.setQuestion(questions[0]);
        //scene.setActor
        scenes[SceneType.religion1.ordinal()] = scene;
        
        //SCENE 28
        scene = new Scene();
        scene.setSymbol("R1");
        scene.setDescription("religion one");
        scene.setBlockedLocation(false);
        scene.setQuestion(questions[0]);
        //scene.setActor
        scenes[SceneType.religion1.ordinal()] = scene;
        
        //SCENE 29
        scene = new Scene();
        scene.setSymbol("R1");
        scene.setDescription("religion one");
        scene.setBlockedLocation(false);
        scene.setQuestion(questions[0]);
        //scene.setActor
        scenes[SceneType.religion1.ordinal()] = scene;
        
        //SCENE 30
        scene = new Scene();
        scene.setSymbol("R1");
        scene.setDescription("religion one");
        scene.setBlockedLocation(false);
        scene.setQuestion(questions[0]);
        //scene.setActor
        scenes[SceneType.religion1.ordinal()] = scene;
        
        
      return scenes;  
    } 
    
    
    
    
//    public static Location[] createLocations(){
//        Location scene = new Location();
//        
//        Location religionBuilding = new Location();
//        religionBuilding.setRow(1);
//        religionBuilding.setColumn(1);
//        
//        
//    }return scene;
    
}
