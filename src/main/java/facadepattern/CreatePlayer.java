package facadepattern;

import decoratorpattern.Bulbasaur;
import decoratorpattern.Charmander;
import decoratorpattern.Player;
import decoratorpattern.PlayerClass;
import decoratorpattern.PlayerType;
import decoratorpattern.Squirtle;

import java.util.ArrayList;
import java.util.List;

/**
 * Method for creating a player at the start of the game.
 */
public class CreatePlayer {
 
    /**
     * populates classes list with appropriate choices.
     */
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
    
    /**
     * populates types list with appropriate choices.
     */
    private static List<PlayerType> types = new ArrayList<>() {
        {
            add(PlayerType.BULBASAUR);
            add(PlayerType.CHARMANDER);
            add(PlayerType.SQUIRTLE);

        }
    };
    
    /**
     * nothing here, just making sure there isn't default constructor.
     */
    public CreatePlayer() {
        
    }
    
    /**
     * Method that returns the pokemon/player based on simulation or user input.
     * @return player that was chosen by simulation or user input
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
    
    /**
     * Method that generates the pokemon based on what was entered in the choosePlayer method.
     * @param chosenType Type that was chosen
     * @param chosenClass Class that was chosen
     * @param playerName Name that was chosen
     * @return Pokemon that was generated
     */
    public static Player generatePlayer(int chosenType, int chosenClass, String playerName) {
        Player player;
        switch (chosenType) {
            case 0: 
                player = new Bulbasaur(playerName, classes.get(chosenClass));
                break;
            case 1:
                player = new Charmander(playerName, classes.get(chosenClass));
                break;
            case 2:
                player = new Squirtle(playerName, classes.get(chosenClass));
                break;
            default:
                player = new Bulbasaur(playerName, classes.get(chosenClass));
        }
        TextBlocks.createdPlayer(player);
        TextBlocks.displayStats(player);
        TextBlocks.startGame(player);
        return player;
    }
}