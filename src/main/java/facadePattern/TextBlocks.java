package facadePattern;

import abstractFactory.Enemy;
import decoratorPattern.Player;
import equipment.Equipment;

public class TextBlocks {
    
    public static void createdPlayer(Player player) {
        System.out.println("Nice! You chose the " + player.getPlayerType().name().toLowerCase()
                + " with the " + player.getPlayerClass().name().toLowerCase() + " nature!");
    }
    
    public static void startGame(Player player) {
        System.out.println("\nThere's no time to waste, let's start off on your adventure!\n");
    }
    
    public static void dungeonStart(int gym, int level, Enemy enemy) {
        System.out.println("\n" + enemy.getName() + " approaches and wants to fight!");
        if (level == 5) {
            System.out.println("Ah! A Henchman! Better take this one serious!");
        } else if (level == 10) {
            System.out.println("Oh no! It's the Boss! Give it everything you've got!");
        }
        System.out.println("Beginning battle " + gym + "-" + level + "!\n");
    }
    
    public static void wonEquipment(Player player, Equipment equipment) {
        System.out.println(player.getName() + " found a " + 
                           equipment.getWeaponName() + " after the battle!\n");
    }
    
    public static void equipped(Player player, Equipment equipment) {
        System.out.println(player.getName() + " equipped " + equipment.getWeaponName() + "!");
        System.out.println("It's a level " + equipment.getLevel()
                            + " " + equipment.getSlot().name().toLowerCase() + ".");
        System.out.println("It's stats are: ");
        System.out.println("Attack buff: " + equipment.getAttackBuff());
        System.out.println("Defense buff: " + equipment.getDefenseBuff());
        System.out.println("Speed buff: " + equipment.getSpeedBuff());
        System.out.println("Luck buff: " + equipment.getLuckBuff());
        System.out.println("HitPoints buff: " + equipment.getHitPointsBuff());
        System.out.println("PowerPoints buff: " + equipment.getPowerPointsBuff() + "\n");
    }
    
    public static void playersTurn(Player player) {
        System.out.println(player.getName() + "'s turn!");
    }
    
    public static void enemiesTurn(Enemy enemy) {
        System.out.println(enemy.getName() + "'s turn!");
    }
    
    public static void playerDoesDamage(Player player, int damage) {
        System.out.println(player.getName() + " did " + damage + " damage!");
    }
    
    
    public static void enemyDoesDamage(Enemy enemy, int damage) {
        System.out.println(enemy.getName() + " did " + damage + " damage!");
    }
    
    public static void enemyHealthLeft(Enemy enemy) {
        System.out.println(enemy.getName() + " has " + enemy.getHealth() + " health left!\n");
    }
    
    public static void playerHealthLeft(Player player) {
        System.out.println(player.getName() + " has " + player.getHealth() + " health left!\n");
    }
    
    public static void enemyFainted(Player player, Enemy enemy) {
        System.out.println(enemy.getName() + " fainted! " + player.getName() + " won!");
        System.out.println(player.getName() + " gained " + enemy.getExperience() + " exp!\n");
    }
    
    public static void playerFainted(Player player, Enemy enemy) {
        System.out.println(enemy.getName() + " dealt the final blow! " 
                            + player.getName() + " fainted!\n");
    }
    
    public static void gymWon() {
        System.out.println("Congrats you beat the gym!");
        System.out.println("Let's head back to the PokeCenter to get ready for the next one!\n");
    }
    
    public static void lowOnHealth(Player player) {
        System.out.println(player.getName() + " is running low on health, let's go to the PokeCenter!\n");
    }
    
    public static void displayStats(Player player) {
        System.out.println("Your stats are: ");
        System.out.println("Attack: " + player.getAttack());
        System.out.println("Defense: " + player.getDefense());
        System.out.println("Speed: " + player.getSpeed());
        System.out.println("Luck: " + player.getLuck());
        System.out.println("HitPoints: " + player.getHitPoints());
        System.out.println("Health (available hitpoints): " + player.getHealth());
        System.out.println("PowerPoints: " + player.getPowerPoints());
        System.out.println("Mana (available powerpoints): " + player.getMana());
        System.out.println("You are on evolution #" + player.getEvolution());
        System.out.println("You are level " + player.getLevel() + " with " + player.getExperience()
                            + " exp. You need " + player.getNextLevelExp()
                            + " to level up\n");
    }
    
    public static void displayInventory(Player player) {
        System.out.println("Your inventory contains the following:");
        System.out.println("Weapon: " + (player.getWeapon() == null ? "none" : player.getWeapon().getWeaponName()));
        System.out.println("Shield: " + (player.getShield() == null ? "none" : player.getShield().getWeaponName()));
        System.out.println("Armor: " + (player.getArmor() == null ? "none" : player.getArmor().getWeaponName()));
        System.out.println("Accessory: " + (player.getAccessory() == null ? "none" : player.getAccessory().getWeaponName()));
        System.out.println("Potions: " + player.getPotion() + "\n");
    }
    
    public static void pokemonCenter() {
        System.out.println("Welcome to the Pokemon Center!");
        System.out.println("While you're here you'll be restored back to full health and "
                + "powerpoints and have the opportunity to level up!");
        System.out.println("We even gave you an extra HP potion for stopping in!\n");
    }
    
    public static void evolve(Player player) {
        System.out.println("Congrats! " + player.getName() + " evolved into a " 
                            + player.getPlayerType().name().toLowerCase() + "!");
    }
    
    public static void gameWon(Player player) {
        System.out.println("\nCongratulations " + player.getName() + "! "
                + "You defeated all the gyms and became the pokemon master!\n");
        System.out.println("Here's a final look at the victor:");
        System.out.println("Pokemon: " + player.getPlayerType());
        System.out.println("Nature: " + player.getPlayerClass());
        TextBlocks.displayStats(player);
        TextBlocks.displayInventory(player);
        System.out.println("Great job!!!!");
    }
    
    public static void gameLost(Player player) {
        System.out.println("\nOh no " + player.getName() + "! "
                + "You lost the final battle and you were so close!\n");
        System.out.println("Here's what your little buddy looked like before you let it die:");
        System.out.println("Pokemon: " + player.getPlayerType());
        System.out.println("Nature: " + player.getPlayerClass());
        TextBlocks.displayStats(player);
        TextBlocks.displayInventory(player);
        System.out.println("\nBetter luck next time!");
    }
}