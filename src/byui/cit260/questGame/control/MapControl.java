/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.questGame.control;

import byui.cit260.questGame.exceptions.MapControlException;
import byui.cit260.questGame.model.Actor;
import byui.cit260.questGame.model.Location;
import byui.cit260.questGame.model.Map;
import byui.cit260.questGame.model.Player;
import byui.cit260.questGame.model.Question;
import byui.cit260.questGame.model.Scene;
import byui.cit260.questGame.model.SceneType;
import thequest.TheQuest;

/**
 *
 * @author ashley
 */
public class MapControl {

    public static void movePlayerToStartingLocation(Map map) {
        // If starting location is not supposed to be 0,0 then use the correct values here.
        try 
        {
            movePlayer(map, 0, 0);
        } 
        catch (MapControlException ex)
        {
            // PROBLEM 

        }
    }

//    public static int movePlayerToLocation(Player player,  Location location)
//    throws MapControlException
//    {
//        Map map = TheQuest.getCurrentGame().getMap();
//        
//        
//        int newFloor = location.getFloor()-1;
//        int newBuilding = location.getBuilding()-1;
//        
//        if (newFloor < 0 || newFloor >= map.getCurrentFloor() || 
//                newBuilding < 0 || newBuilding >= map.getCurrentBuilding())
//        {
//           
//            throw new MapControlException("Cannot Move Actorto location "
//            + location.getFloor() + ", " + location.getBuilding()
//            + " because that location is outside "
//            + "the bounds of the Map.");
//        }
//        
//     
//        return 0;
//    }
    public static void movePlayer(Map map, int row, int column)
            throws MapControlException {
        if (row < 0 || row > map.getFloorCount()) {
            throw new MapControlException("Invalid FLoor Number. FLoor should be between 0 and "
                    + map.getFloorCount());
        }
        if (column < 0 || column > map.getBuildingCount()) {
            throw new MapControlException("Invalid Building Number. FLoor should be between 0 and "
                    + map.getBuildingCount());
        }
        map.setCurrentLocation(map.getLocations()[row][column]);
        map.getCurrentLocation().setVisited(true);
        map.setCurrentFloor(row);
        map.setCurrentBuilding(column);

    }

    public int building;
    public int floor;

    public static Map createMap() {
        Map map = new Map(5, 6);

        Scene[] scene = createScenes();

        assignScenesToLocations(map, scene);

        return map;
    }

    
    //  INCLUDE CREATE QUESTIONLIST FOR EACH CLASSS
    private static Scene[] createScenes() {
        Scene[] scenes = new Scene[SceneType.values().length];

        Question[] questions = QuestionControl.createReligiousQuestionList();
        //SCENE 1
        Scene scene = new Scene();
        scene.setSymbol("R0");
        scene.setDescription("Welcome to Ron Anderson's religion class.");
        scene.setBlockedLocation(false);
        scene.setQuestion(questions[0]);
        scene.setActor(Actor.Ron_Anderson);
        scenes[SceneType.religion0.ordinal()] = scene;

        //SCENE 2
        scene = new Scene();
        scene.setSymbol("R1");
        scene.setDescription("Welcome to Brother Castillow's religion class.");
        scene.setBlockedLocation(true);
        scene.setQuestion(questions[1]);
        scene.setActor(Actor.Curtis_Castillow);
        scenes[SceneType.religion1.ordinal()] = scene;

        //SCENE 3
        scene = new Scene();
        scene.setSymbol("R2");
        scene.setDescription("Welcome to Brother Baron's religion class.");
        scene.setBlockedLocation(true);
        scene.setQuestion(questions[2]);
        scene.setActor(Actor.Ross_Baron);
        scenes[SceneType.religion2.ordinal()] = scene;

        //SCENE 4
        scene = new Scene();
        scene.setSymbol("R3");
        scene.setDescription("Welcome to Sister Linford's religion class.");
        scene.setBlockedLocation(true);
        scene.setQuestion(questions[3]);
        scene.setActor(Actor.Kristy_Linford);
        scenes[SceneType.religion3.ordinal()] = scene;

        //SCENE 5
        scene = new Scene();
        scene.setSymbol("R4");
        scene.setDescription("Welcome to Brother Allison's religion class.");
        scene.setBlockedLocation(true);
        scene.setQuestion(questions[4]);
        scene.setActor(Actor.Chris_Allison);
        scenes[SceneType.religion4.ordinal()] = scene;

        //SCENE 6
        scene = new Scene();
        scene.setSymbol("R5");
        scene.setDescription("Welcome to Brother Butterfield's religion class.");
        scene.setBlockedLocation(true);
        scene.setQuestion(questions[5]);
        scene.setActor(Actor.Rex_Butterfield);
        scenes[SceneType.religion5.ordinal()] = scene;

        //SCENE 7
        questions = QuestionControl.createMathQuestionList();
        
        
        
        scene = new Scene();
        scene.setSymbol("MA1");
        scene.setDescription("Welcome to Sister Baxter's math class.");
        scene.setBlockedLocation(false);
        scene.setQuestion(questions[0]);
        scene.setActor(Actor.Jen_Baxter);
        scenes[SceneType.mathematics0.ordinal()] = scene;

        //SCENE 8
        scene = new Scene();
        scene.setSymbol("MA2");
        scene.setDescription("Welcome to Brother Bessey's math class.");
        scene.setBlockedLocation(true);
        scene.setQuestion(questions[1]);
        scene.setActor(Actor.Kent_Bessey);
        scenes[SceneType.mathematics1.ordinal()] = scene;

        //SCENE 9
        scene = new Scene();
        scene.setSymbol("MA3");
        scene.setDescription("Welcome to Brother Brown's math class.");
        scene.setBlockedLocation(true);
        scene.setQuestion(questions[2]);
        scene.setActor(Actor.Dave_Brown);
        scenes[SceneType.mathematics2.ordinal()] = scene;

        //SCENE 10
        scene = new Scene();
        scene.setSymbol("MA4");
        scene.setDescription("Welcome to Brother Chilton's math class.");
        scene.setBlockedLocation(true);
        scene.setQuestion(questions[3]);
        scene.setActor(Actor.Larry_Chilton);
        scenes[SceneType.mathematics3.ordinal()] = scene;

        //SCENE 11
        scene = new Scene();
        scene.setSymbol("MA5");
        scene.setDescription("Welcome to Brother Cox's math class.");
        scene.setBlockedLocation(true);
        scene.setQuestion(questions[4]);
        scene.setActor(Actor.Paul_Cox);
        scenes[SceneType.mathematics4.ordinal()] = scene;

        //SCENE 12
        scene = new Scene();
        scene.setSymbol("MA6");
        scene.setDescription("Welcome to Brother Nygaard's math class.");
        scene.setBlockedLocation(true);
        scene.setQuestion(questions[5]);
        scene.setActor(Actor.Jackie_Nygaard);
        scenes[SceneType.mathematics5.ordinal()] = scene;

        
        
        questions = QuestionControl.createScienceQuestionList();
        //SCENE 13
        scene = new Scene();
        scene.setSymbol("SC1");
        scene.setDescription("Welcome to brother Coleman's science class.");
        scene.setBlockedLocation(false);
        scene.setQuestion(questions[0]);
        scene.setActor(Actor.Rob_Coleman);
        scenes[SceneType.science0.ordinal()] = scene;

        //SCENE 14
        scene = new Scene();
        scene.setSymbol("SC2");
        scene.setDescription("Welcome to Brother Joesph Anderson's science class.");
        scene.setBlockedLocation(true);
        scene.setQuestion(questions[1]);
        scene.setActor(Actor.Joseph_Anderson);
        scenes[SceneType.science1.ordinal()] = scene;

        //SCENE 15
        scene = new Scene();
        scene.setSymbol("SC3");
        scene.setDescription("Welcome to Brother Baird's science class.");
        scene.setBlockedLocation(true);
        scene.setQuestion(questions[2]);
        scene.setActor(Actor.Gary_Baird);
        scenes[SceneType.science2.ordinal()] = scene;

        //SCENE 16
        scene = new Scene();
        scene.setSymbol("SC4");
        scene.setDescription("Welcome to Brother Baker's science class.");
        scene.setBlockedLocation(true);
        scene.setQuestion(questions[3]);
        scene.setActor(Actor.Lanning_Baker);
        scenes[SceneType.science3.ordinal()] = scene;

        //SCENE 17
        scene = new Scene();
        scene.setSymbol("SC5");
        scene.setDescription("Welcome to brother Billman's science class.");
        scene.setBlockedLocation(true);
        scene.setQuestion(questions[4]);
        scene.setActor(Actor.Eric_Billman);
        scenes[SceneType.science4.ordinal()] = scene;

        //SCENE 18 
        scene = new Scene();
        scene.setSymbol("SC6");
        scene.setDescription("Welcome to Brother Christenson's science class.");
        scene.setBlockedLocation(true);
        scene.setQuestion(questions[5]);
        scene.setActor(Actor.Steve_Christenson);
        scenes[SceneType.science5.ordinal()] = scene;

        
        questions = QuestionControl.createTechnologyQuestionList();
        //SCENE 19
        scene = new Scene();
        scene.setSymbol("T1");
        scene.setDescription("Welcome to Brother Thompson's technology class.");
        scene.setBlockedLocation(false);
        scene.setQuestion(questions[0]);
        scene.setActor(Actor.Shane_Thompson);
        scenes[SceneType.technology0.ordinal()] = scene;

        //SCENE 20
        scene = new Scene();
        scene.setSymbol("T2");
        scene.setDescription("Welcome to Brother Roberston's technology class.");
        scene.setBlockedLocation(true);
        scene.setQuestion(questions[1]);
        scene.setActor(Actor.Blaine_Robertson);
        scenes[SceneType.technology1.ordinal()] = scene;

        //SCENE 21
        scene = new Scene();
        scene.setSymbol("T3");
        scene.setDescription("Welcom to Brother McLaughlin's technology class.");
        scene.setBlockedLocation(true);
        scene.setQuestion(questions[2]);
        scene.setActor(Actor.Michael_McLaughlin);
        scenes[SceneType.technology2.ordinal()] = scene;

        //SCENE 22
        scene = new Scene();
        scene.setSymbol("T4");
        scene.setDescription("Welcome to Brother Barney's technology class.");
        scene.setBlockedLocation(true);
        scene.setQuestion(questions[3]);
        scene.setActor(Actor.Lee_Barney);
        scenes[SceneType.technology3.ordinal()] = scene;

        //SCENE 23
        scene = new Scene();
        scene.setSymbol("T5");
        scene.setDescription("Welcome to Brother Armstrong's technology class.");
        scene.setBlockedLocation(true);
        scene.setQuestion(questions[4]);
        scene.setActor(Actor.Bradley_Armstrong);
        scenes[SceneType.technology4.ordinal()] = scene;

        //SCENE 24
        scene = new Scene();
        scene.setSymbol("T6");
        scene.setDescription("Welcome to Brother Barzee's technology class.");
        scene.setBlockedLocation(true);
        scene.setQuestion(questions[5]);
        scene.setActor(Actor.Rex_Barzee);
        scenes[SceneType.technology5.ordinal()] = scene;

        
        questions = QuestionControl.createMusicQuestionList();
        
        //SCENE 25
        scene = new Scene();
        scene.setSymbol("MU1");
        scene.setDescription("Welcome to Sister Ballif's music class.");
        scene.setBlockedLocation(false);
        scene.setQuestion(questions[0]);
        scene.setActor(Actor.Kristi_Ballif);
        scenes[SceneType.music0.ordinal()] = scene;

        //SCENE 26
        scene = new Scene();
        scene.setSymbol("MU2");
        scene.setDescription("Welcome to Sister Lord's music class.");
        scene.setBlockedLocation(true);
        scene.setQuestion(questions[1]);
        scene.setActor(Actor.Rebecca_Lord);
        scenes[SceneType.music1.ordinal()] = scene;

        //SCENE 27
        scene = new Scene();
        scene.setSymbol("MU3");
        scene.setDescription("Welcome to Sister Luke's music class.");
        scene.setBlockedLocation(true);
        scene.setQuestion(questions[2]);
        scene.setActor(Actor.Nadine_Luke);
        scenes[SceneType.music2.ordinal()] = scene;

        //SCENE 28
        scene = new Scene();
        scene.setSymbol("MU4");
        scene.setDescription("Welcome to Brother Olsen's music class.");
        scene.setBlockedLocation(true);
        scene.setQuestion(questions[3]);
        scene.setActor(Actor.David_Olsen);
        scenes[SceneType.music3.ordinal()] = scene;

        //SCENE 29
        scene = new Scene();
        scene.setSymbol("MU5");
        scene.setDescription("Welcome to Brother Taylor's music class.");
        scene.setBlockedLocation(true);
        scene.setQuestion(questions[4]);
        scene.setActor(Actor.David_Taylor);
        scenes[SceneType.music4.ordinal()] = scene;

        //SCENE 30
        scene = new Scene();
        scene.setSymbol("MU6");
        scene.setDescription("Welcome to Sister Soelberg's music class.");
        scene.setBlockedLocation(true);
        scene.setQuestion(questions[5]);
        scene.setActor(Actor.Diane_Soelberg);
        scenes[SceneType.music5.ordinal()] = scene;

        return scenes;
    }

    private static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();

        locations[0][0].setScene(scenes[SceneType.religion0.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.religion1.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.religion2.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.religion3.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.religion4.ordinal()]);
        locations[0][5].setScene(scenes[SceneType.religion5.ordinal()]);
        locations[1][0].setScene(scenes[SceneType.science0.ordinal()]);
        locations[1][1].setScene(scenes[SceneType.science1.ordinal()]);
        locations[1][2].setScene(scenes[SceneType.science2.ordinal()]);
        locations[1][3].setScene(scenes[SceneType.science3.ordinal()]);
        locations[1][4].setScene(scenes[SceneType.science4.ordinal()]);
        locations[1][5].setScene(scenes[SceneType.science5.ordinal()]);
        locations[2][0].setScene(scenes[SceneType.mathematics0.ordinal()]);
        locations[2][1].setScene(scenes[SceneType.mathematics1.ordinal()]);
        locations[2][2].setScene(scenes[SceneType.mathematics2.ordinal()]);
        locations[2][3].setScene(scenes[SceneType.mathematics3.ordinal()]);
        locations[2][4].setScene(scenes[SceneType.mathematics4.ordinal()]);
        locations[2][5].setScene(scenes[SceneType.mathematics5.ordinal()]);
        locations[3][0].setScene(scenes[SceneType.technology0.ordinal()]);
        locations[3][1].setScene(scenes[SceneType.technology1.ordinal()]);
        locations[3][2].setScene(scenes[SceneType.technology2.ordinal()]);
        locations[3][3].setScene(scenes[SceneType.technology3.ordinal()]);
        locations[3][4].setScene(scenes[SceneType.technology4.ordinal()]);
        locations[3][5].setScene(scenes[SceneType.technology5.ordinal()]);
        locations[4][0].setScene(scenes[SceneType.music0.ordinal()]);
        locations[4][1].setScene(scenes[SceneType.music1.ordinal()]);
        locations[4][2].setScene(scenes[SceneType.music2.ordinal()]);
        locations[4][3].setScene(scenes[SceneType.music3.ordinal()]);
        locations[4][4].setScene(scenes[SceneType.music4.ordinal()]);
        locations[4][5].setScene(scenes[SceneType.music5.ordinal()]);

    }

}
