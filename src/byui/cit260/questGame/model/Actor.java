/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.questGame.model;

import java.io.Serializable;
import java.util.Objects;
import byui.cit260.questGame.model.Location;

/**
 *
 * @author Harry
 */
public enum Actor implements Serializable {

    Ron_Anderson("Religion 1", new Location(1, 1)),
    Rob_Coleman("Science 1", new Location(2, 1)),
    Jen_Baxter("Mathematics 1", new Location(3, 1)),
    Shane_Thompson("Technology 1", new Location(4, 1)),
    Kristi_Ballif("Music 1", new Location(5, 1)),
    Curtis_Castillow("Religion 2", new Location(1, 2)),
    Joseph_Anderson("Science 2", new Location(2, 2)),
    Kent_Bessey("Mathematics 2", new Location(3, 2)),
    Blaine_Robertson("Technology 2", new Location(4, 2)),
    Rebecca_Lord("Music 2", new Location(5, 2)),
    Ross_Baron("Religion 3", new Location(1, 3)),
    Gary_Baird("Science 3", new Location(2, 3)),
    Dave_Brown("Mathematics 3", new Location(3, 3)),
    Michael_McLaughlin("Technology 3", new Location(4, 3)),
    Nadine_Luke("Music 3", new Location(5, 3)),
    Kristy_Linford("Religion 4", new Location(1, 4)),
    Lanning_Baker("Science 4", new Location(2, 4)),
    Larry_Chilton("Mathematics 4", new Location(3, 4)),
    Lee_Barney("Technology 4", new Location(4, 4)),
    David_Olsen("Music 4", new Location(5, 4)),
    Chris_Allison("Religion 5", new Location(1, 5)),
    Eric_Billman("Science 5", new Location(2, 5)),
    Paul_Cox("Mathematics 5", new Location(3, 5)),
    Bradley_Armstrong("Technology 5", new Location(4, 5)),
    David_Taylor("Music 5", new Location(5, 5)),
    Rex_Butterfield("Religion 6", new Location(1, 6)),
    Steve_Christenson("Science 6", new Location(2, 6)),
    Jackie_Nygaard("Mathematics 6", new Location(3, 6)),
    Rex_Barzee("Technology 6", new Location(4, 6)),
    Diane_Soelberg("Music 6", new Location(5, 6));

    private final String description;
    private Location location;

    Actor(String description, Location l) {
        this.description = description;
        this.location = l;

    }

    public String getDescription() {
        return description;
    }

    public Location getLocation() {
        return location;

    }

}
