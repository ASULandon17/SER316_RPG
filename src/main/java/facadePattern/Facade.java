package facadePattern;

import abstractFactory.BlainesGym;
import abstractFactory.BrocksGym;
import abstractFactory.Enemy;
import abstractFactory.GiovannisGym;
import abstractFactory.GymFactory;
import abstractFactory.LtSurgesGym;
import abstractFactory.SabrinasGym;
import decoratorPattern.Experience;
import decoratorPattern.Player;
import equipment.Equipment;
import equipment.RandomItemGenerator;

/**
 * Facade class for loosening coupling between objects and games implementation.
 * These are the methods called in main that run the logic of the game.
 */
public class Facade {
    
    /**
     * Generates a pokemon based on user input/simulation.
     * @return the pokemon generated
     */
    public Player generatePlayer() {
        return CreatePlayer.choosePlayer();
    }
    
    /**
     * Generates a 'dungeon'/'gym level' and the battle that happens within.
     * @param player User's Pokemon
     * @param gym The gym/world level
     * @param level The level of the gym
     * @return boolean that is true if battle is won/false if lost
     */
    public boolean generateDungeon(Player player, int gym, int level) {
        GymFactory factory = null;
        Enemy enemy = null;
        switch (gym) {
        case 1: 
            factory = new BrocksGym();
            break;
        case 2:
            factory = new LtSurgesGym();
            break;
        case 3:
            factory = new SabrinasGym();
            break;
        case 4:
            factory = new BlainesGym();
            break;
        case 5:
            factory = new GiovannisGym();
        }
        switch (level) {
        case 5:
            enemy = factory.getHenchman();
            break;
        case 10:
            enemy = factory.getBoss();
            break;
        default:
            enemy = factory.getPeon();
        }
        TextBlocks.dungeonStart(gym, level, enemy);
        return new Battle(player, enemy).conductBattle();
    }
    
    /**
     * Generates a random item for when a battle is won.
     * Adds item to pokemons inventory if it is better than currently equipped.
     * @param player User's Pokemon
     */
    public void generateRandomItem(Player player) {
        Equipment equipment = RandomItemGenerator.getItem();
        TextBlocks.wonEquipment(player, equipment);
        player.addEquipment(equipment);
    }
    
    /**
     * Generates the 'top floor'/pokecenter.
     * @param player User's Pokemon
     * @return User's Pokemon (incase it evolves)
     */
    public Player generateTopFloor(Player player) {
        TextBlocks.pokemonCenter();
        Experience.levelUp(player);
        player = Experience.evolve(player);
        Experience.fullHeal(player);
        player.setPotion(player.getPotion() + 1);
        TextBlocks.displayStats(player);
        TextBlocks.displayInventory(player);
        return player;
    }
    
    /**
     * Generates message when game is over.
     * @param player User's Pokemon
     * @param gameWon boolean true if game is won/false if game is lost
     */
    public void generateGameOverMessage(Player player, boolean gameWon) {
        if (gameWon) {
            TextBlocks.gameWon(player);
        } else {
            TextBlocks.gameLost(player);
        }
    }
}