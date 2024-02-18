import java.util.ArrayList;
import java.util.List;

import decoratorPattern.Bulbasaur;
import decoratorPattern.Charmander;
import decoratorPattern.Player;
import decoratorPattern.PlayerClass;
import decoratorPattern.PlayerType;
import decoratorPattern.Squirtle;

public class CreatePlayer {
 
    private static List<PlayerClass> classes = new ArrayList<>() {
        {
            add(PlayerClass.ASSASSIN);
            add(PlayerClass.TANK);
            add(PlayerClass.MAGE);
            add(PlayerClass.ELF);
            add(PlayerClass.BRAWLER);
            add(PlayerClass.JESTER);
        }
    };
    private static List<PlayerType> types = new ArrayList<>() {
        {
            add(PlayerType.BULBASAUR);
            add(PlayerType.CHARMANDER);
            add(PlayerType.SQUIRTLE);

        }
    };
    
    public CreatePlayer() {
        //nothing here so just making sure there isn't default constructor
    }
    
    /*System.out.println("This would normally be the place where I list out all the options"
            + "of what Types and Classes are available to choose from, and the pros and cons"
            + "of each, but because we're automating this I'll just take a random input and let"
            + "the 'Player' know what they have 'chosen'");
            */
    public static Player choosePlayer() {
        /*System.out.println("This would normally be the place where I list out all the options"
        + "of what Types and Classes are available to choose from, and the pros and cons"
        + "of each, but because we're automating this I'll just take a random input and let"
        + "the 'Player' know what they have 'chosen'");
        */
        //instead of scanners, simulating input
        int chosenType = (int) Math.floor(Math.random() * types.size());
        int chosenClass = (int) Math.floor(Math.random() * classes.size());
        String playerName = "Dr. Mehlhase";
        return generatePlayer(chosenType, chosenClass, playerName);
    }
    
    
    public static Player generatePlayer(int chosenType, int chosenClass, String playerName) {
        Player player = null;
        switch(chosenType) {
        case 0: 
            player = new Bulbasaur(playerName, classes.get(chosenClass));
            break;
        case 1:
            player = new Charmander(playerName, classes.get(chosenClass));
            break;
        case 2:
            player = new Squirtle(playerName, classes.get(chosenClass));
            break;
        }
        return player;
    }
}