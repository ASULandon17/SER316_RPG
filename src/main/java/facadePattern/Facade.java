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
import equipment.RandomItemGenerator;

public class Facade {
    
    public Player generatePlayer() {
        return CreatePlayer.choosePlayer();
    }
    
    public boolean generateDungeon(Player player, int gym, int level) {
        GymFactory factory = null;
        Enemy enemy = null;
        switch (gym) {
        case 1: 
            factory = new BrocksGym();
        case 2:
            factory = new LtSurgesGym();
        case 3:
            factory = new SabrinasGym();
        case 4:
            factory = new BlainesGym();
        case 5:
            factory = new GiovannisGym();
        }
        switch (level) {
        case 5:
            enemy = factory.getHenchman();
        case 10:
            enemy = factory.getBoss();
        default:
            enemy = factory.getPeon();
        }
        return new Battle(player, enemy).conductBattle();
    }
    
    public void generateRandomItem(Player player) {
        player.addEquipment(RandomItemGenerator.getItem());
    }
    
    public Player generateTopFloor(Player player) {
        TextBlocks.pokemonCenter();
        Experience.levelUp(player);
        player = Experience.evolve(player);
        Experience.fullHeal(player);
        TextBlocks.displayStats(player);
        TextBlocks.displayInventory(player);
        return player;
    }
    
    public void generateGameOverMessage(Player player, boolean gameWon) {
        if (gameWon) {
            TextBlocks.gameWon(player);
        } else {
            TextBlocks.gameLost(player);
        }
    }
}