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
    
    public void generateRandomItem(Player player) {
        Equipment equipment = RandomItemGenerator.getItem();
        TextBlocks.wonEquipment(player, equipment);
        player.addEquipment(equipment);
    }
    
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
    
    public void generateGameOverMessage(Player player, boolean gameWon) {
        if (gameWon) {
            TextBlocks.gameWon(player);
        } else {
            TextBlocks.gameLost(player);
        }
    }
}