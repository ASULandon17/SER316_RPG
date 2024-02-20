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
            if (round == 1 && player.getSpeed() > enemy.getSpeed()) {
               damage = takeDamage(player.takeTurn(), enemy);
               System.out.println(enemy.getName() + " took " + damage + " damage!");
               if (damage != 0) {
                   System.out.println(enemy.getName() + " has " + enemy.getHealth() + " health left!");
               }
               if (enemy.getHealth() < 1) {
                   victory = true;
                   break;
               }
            }
            damage = takeDamage(enemy.takeTurn(), player);
            System.out.println(player.getName() + " took " + damage + " damage!");
            if (damage != 0) {
                System.out.println(player.getName() + " has " + player.getHealth() + " health left!");
            }
            if (player.getHealth() < 1) {
                victory = false;
                break;
            }
            damage = takeDamage(player.takeTurn(), enemy);
            System.out.println(enemy.getName() + " took " + damage + " damage!");
            if (damage != 0) {
                System.out.println(enemy.getName() + " has " + enemy.getHealth() + " health left!");
            }
            if (enemy.getHealth() < 1) {
                victory = true;
            }
            round += 1;
        }
        String message = victory ? player.getName() + " won!" : player.getName() + " fainted!";
        System.out.println(message);
        if (victory) {
            player.setExperience(player.getExperience() + enemy.getExperience());
        } else {
            player.setExperience(player.getExperience() + 20);
        }
        return victory;
    }
    
    public int takeDamage(int damage, Enemy enemy) {
        if (damage == 0) {
            return 0;
        }
        //factor in characters defense
        int calculatedDamage = (int) Math.ceil(damage - (.1 * enemy.getDefense()));
        System.out.println("Initial damage: " + damage);
        System.out.println("Defense: " + enemy.getDefense());
        
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
        System.out.println("Initial damage: " + damage);
        System.out.println(player.getDefense());
        
        if (calculatedDamage < 1) {
            calculatedDamage = 1;
        }
        player.setHealth(player.getHealth() - calculatedDamage);
        return calculatedDamage;
    }
}