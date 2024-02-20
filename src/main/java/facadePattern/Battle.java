package facadePattern;
import abstractFactory.Enemy;
import decoratorPattern.Player;

public class Battle {
    
    Player player;
    Enemy enemy;
    
    public Battle(Player player, Enemy enemy) {
        this.player = player;
        this.enemy = enemy;
    }
    
    //stages a battle until one is victorious
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