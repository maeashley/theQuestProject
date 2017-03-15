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

    Ron_Anderson("Religion 1", new Location(1, 1), "Ron"),
    Rob_Coleman("Science 1", new Location(2, 1),"Rob"),
    Jen_Baxter("Mathematics 1", new Location(3, 1), "Jen"),
    Shane_Thompson("Technology 1", new Location(4, 1),"Shane"),
    Kristi_Ballif("Music 1", new Location(5, 1), "Kristi"),
    Curtis_Castillow("Religion 2", new Location(1, 2), "Curtis"),
    Joseph_Anderson("Science 2", new Location(2, 2), "Joseph"),
    Kent_Bessey("Mathematics 2", new Location(3, 2), "Kent"),
    Blaine_Robertson("Technology 2", new Location(4, 2), "Blaine"),
    Rebecca_Lord("Music 2", new Location(5, 2), "Rebecca"),
    Ross_Baron("Religion 3", new Location(1, 3), "Ross"),
    Gary_Baird("Science 3", new Location(2, 3), "Gary"),
    Dave_Brown("Mathematics 3", new Location(3, 3), "Dave"),
    Michael_McLaughlin("Technology 3", new Location(4, 3), "Michael"),
    Nadine_Luke("Music 3", new Location(5, 3), "Nadine"),
    Kristy_Linford("Religion 4", new Location(1, 4),"Kristy"),
    Lanning_Baker("Science 4", new Location(2, 4), "Lanning"),
    Larry_Chilton("Mathematics 4", new Location(3, 4), "Larry"),
    Lee_Barney("Technology 4", new Location(4, 4),"Lee"),
    David_Olsen("Music 4", new Location(5, 4),"David"),
    Chris_Allison("Religion 5", new Location(1, 5), "Chris"),
    Eric_Billman("Science 5", new Location(2, 5), "Eric"),
    Paul_Cox("Mathematics 5", new Location(3, 5), "Paul"),
    Bradley_Armstrong("Technology 5", new Location(4, 5),"Bradley"),
    David_Taylor("Music 5", new Location(5, 5), "David"),
    Rex_Butterfield("Religion 6", new Location(1, 6), "Rex Butterfield"),
    Steve_Christenson("Science 6", new Location(2, 6), "Steve"),
    Jackie_Nygaard("Mathematics 6", new Location(3, 6),"Jackie"),
    Rex_Barzee("Technology 6", new Location(4, 6), "Rex Barzee"),
    Diane_Soelberg("Music 6", new Location(5, 6), "Diane");

    private final String description;
    private Location location;
    private final String name;

    public String getName() {
        return name;
    }

    Actor(String description, Location l, String name) {
        this.description = description;
        this.location = l;
        this.name = name;

    }

    public String getDescription() {
        return description;
    }

    public Location getLocation() {
        return location;

    }

}
