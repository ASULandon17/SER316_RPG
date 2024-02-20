package facadePattern;
import abstractFactory.Enemy;
import decoratorPattern.Player;

/**
 * class for simulating a battle between two pokemon.
 */
public class Battle {
    
    //the pokemon in the battle
    Player player;
    Enemy enemy;
    
    /**
     * Constructor for populating the pokemon in the battle.
     * @param player players pokemon
     * @param enemy enemy that players pokemon will be fighting
     */
    public Battle(Player player, Enemy enemy) {
        this.player = player;
        this.enemy = enemy;
    }
    
    /**
     * players take turns until one has 0 or less health.
     * @return boolean based on whether or not player won
     */
    public boolean conductBattle() {
        boolean victory = false;
        int round = 1;
        int damage;
        while (victory == false) {
            if (round == 1 && (player.getSpeed() > enemy.getSpeed())) {
               TextBlocks.playersTurn(player);
               damage = takeDamage(player.takeTurn(), enemy);
               if (damage != 0) {
                   TextBlocks.playerDoesDamage(player, damage);
                   if (enemy.getHealth() > 0) {
                       TextBlocks.enemyHealthLeft(enemy);
                   } else {
                       TextBlocks.enemyFainted(player, enemy);
                   }
               }
               if (enemy.getHealth() < 1) {
                   victory = true;
                   break;
               }
            }
            TextBlocks.enemiesTurn(enemy);
            damage = takeDamage(enemy.takeTurn(), player);
            if (damage != 0) {
                TextBlocks.enemyDoesDamage(enemy, damage);
                if (player.getHealth() > 0) {
                    TextBlocks.playerHealthLeft(player);
                } else {
                    TextBlocks.playerFainted(player, enemy);
                }
            }
            if (player.getHealth() < 1) {
                victory = false;
                break;
            }
            TextBlocks.playersTurn(player);
            damage = takeDamage(player.takeTurn(), enemy);
            if (damage != 0) {
                TextBlocks.playerDoesDamage(player, damage);
                if (enemy.getHealth() > 0) {
                    TextBlocks.enemyHealthLeft(enemy);
                } else {
                    TextBlocks.enemyFainted(player, enemy);
                }
            }
            if (enemy.getHealth() < 1) {
                victory = true;
            }
            round += 1;
        }
        if (victory) {
            player.setExperience(player.getExperience() + enemy.getExperience());
        } else {
            player.setExperience(player.getExperience() + 1);
        }
        return victory;
    }
    
    /**
     * Method for calculating damage an enemy takes based on its defense stat.
     * @param damage the initial amount of damage dealt
     * @param enemy the pokemon that is taking the damage
     * @return amount of damage sustained after defense is factored in
     */
    public int takeDamage(int damage, Enemy enemy) {
        if (damage == 0) {
            return 0;
        }
        //factor in characters defense
        int calculatedDamage = (int) Math.ceil(damage - (.1 * enemy.getDefense()));
        
        if (calculatedDamage < 1) {
            calculatedDamage = 1;
        }
        enemy.setHealth(enemy.getHealth() - calculatedDamage);
        return calculatedDamage;
    }
    
    /**
     * Method for calculating damage a player takes based on its defense stat.
     * @param damage the initial amount of damage dealt
     * @param enemy the pokemon that is taking the damage
     * @return amount of damage sustained after defense is factored in
     */
    public int takeDamage(int damage, Player player) {
        if (damage == 0) {
            return 0;
        }
        //factor in characters defense
        int calculatedDamage = (int) Math.ceil(damage - (.1 * player.getDefense()));
        
        if (calculatedDamage < 1) {
            calculatedDamage = 1;
        }
        player.setHealth(player.getHealth() - calculatedDamage);
        return calculatedDamage;
    }
}