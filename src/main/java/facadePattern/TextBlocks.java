package facadePattern;

import decoratorPattern.Player;

public class TextBlocks {
    
    public static void pokemonCenter() {
        System.out.println("Welcome to the Pokemon Center!");
        System.out.println("While you're here you'll be restored back to full health and "
                + "powerpoints and have the opportunity to level up!\n");
    }
    
    public static void evolve(Player player) {
        System.out.println("Congrats! " + player.getName() + " evolved into a " 
                            + player.getPlayerType().name().toLowerCase() + "!");
    }
    
    public static void displayStats(Player player) {
        System.out.println("Your stats are: ");
        System.out.println("Attack: " + player.getAttack());
        System.out.println("Defense: " + player.getDefense());
        System.out.println("Speed: " + player.getSpeed());
        System.out.println("Luck: " + player.getLuck());
        System.out.println("HitPoints: " + player.getHitPoints());
        System.out.println("Health (available hitpoints: " + player.getHealth());
        System.out.println("PowerPoints: " + player.getPowerPoints());
        System.out.println("Mana (available powerpoints): " + player.getMana());
        System.out.println("You are on evolution #" + player.getEvolution());
        System.out.println("You are level " + player.getLevel() + " and have " + 
                  (player.getExperience() - player.getNextLevelExp()) + " until your next level");
    }
    
    public static void displayInventory(Player player) {
        System.out.println("Your inventory contains the following:");
        System.out.println("Weapon: " + (player.getWeapon() == null ? "none" : player.getWeapon()));
        System.out.println("Shield: " + (player.getShield() == null ? "none" : player.getShield()));
        System.out.println("Armor: " + (player.getArmor() == null ? "none" : player.getArmor()));
        System.out.println("Accessory: " + (player.getAccessory() == null ? "none" : player.getAccessory()));
        System.out.println("Potions: " + player.getPotion());
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