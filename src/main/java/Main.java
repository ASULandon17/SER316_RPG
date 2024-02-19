import decoratorPattern.Experience;
import decoratorPattern.Player;
import equipment.Equipment;
import equipment.RandomItemGenerator;
import abstractFactory.Enemy;
import decoratorPattern.Evolution;
import decoratorPattern.Ivysaur;
import decoratorPattern.Venusaur;
import abstractFactory.Nidoking;
import abstractFactory.Boss;



public class Main {
    
    public static void main(String[] args) {
        
        /*Player player;
        int gameOver = -1;
        
        
        player = createCharacter();
        while (gameOver < 0) {
         */
        
        
        Player player = CreatePlayer.choosePlayer();
        System.out.println("\n\n" + player.getPlayerType());
        System.out.println(player.getPlayerClass());
        System.out.println(player.getName());
        System.out.println("Attack: " + player.getAttack());
        System.out.println("Defense: " + player.getDefense());
        System.out.println("Speed: " + player.getSpeed());
        System.out.println("Luck: " + player.getLuck());
        System.out.println("HP: " + player.getHitPoints());
        System.out.println("PP: " + player.getPowerPoints());
        Equipment item = RandomItemGenerator.getItem();

        System.out.println("\n\n" + item.getWeaponName());
        System.out.println("Item att: " + item.getAttackBuff());
        System.out.println("Item def: " + item.getDefenseBuff());
        System.out.println("Item spd: " + item.getSpeedBuff());
        System.out.println("Item luck: " + item.getLuckBuff());
        System.out.println("Item HP: " + item.getHitPointsBuff());
        System.out.println("Item PP: " + item.getPowerPointsBuff());
        player.addEquipment(item);
        System.out.println("\n\nNew stats with item equipped");
        System.out.println("Attack: " + player.getAttack());
        System.out.println("Defense: " + player.getDefense());
        System.out.println("Speed: " + player.getSpeed());
        System.out.println("Luck: " + player.getLuck());
        System.out.println("HP: " + player.getHitPoints());
        System.out.println("PP: " + player.getPowerPoints());
        
        System.out.println("\n\nPlayerClass: " + player.getPlayerClass() + "\n\n");
        
        player.addEquipment(RandomItemGenerator.getItem());
        player.addEquipment(RandomItemGenerator.getItem());
        player.addEquipment(RandomItemGenerator.getItem());
        player.addEquipment(RandomItemGenerator.getItem());
        player.addEquipment(RandomItemGenerator.getItem());
        player.addEquipment(RandomItemGenerator.getItem());
        player.addEquipment(RandomItemGenerator.getItem());
        player.addEquipment(RandomItemGenerator.getItem());
        if (player.getWeapon() != null && 
                player.getArmor() != null &&
                player.getShield() != null && 
                player.getAccessory() != null) {
        System.out.println("\nItems: " + player.getWeapon().getWeaponName() + ", "
                                       + player.getShield().getWeaponName() + ", "
                                       + player.getArmor().getWeaponName() + ", "
                                       + player.getAccessory().getWeaponName() + "\n");
        }
        
        player.setExperience(23);
        System.out.println("Experience: " + player.getExperience());
        
        System.out.println("\n\nPlayer leveled up!");
        System.out.println("\n\nPlayerClass: " + player.getPlayerClass() + "\n\n");
        player.levelUp();
        System.out.println("\n\nPlayerClass: " + player.getPlayerClass() + "\n\n");
        System.out.println("Player level: " + player.getLevel());
        System.out.println("New stats after level up");
        System.out.println("Attack: " + player.getAttack());
        System.out.println("Defense: " + player.getDefense());
        System.out.println("Speed: " + player.getSpeed());
        System.out.println("Luck: " + player.getLuck());
        System.out.println("HP: " + player.getHitPoints());
        System.out.println("PP: " + player.getPowerPoints());
        System.out.println("\nExperience: " + player.getExperience());
        
        System.out.println("\n\nPlayerClass: " + player.getPlayerClass() + "\n\n");
        player = Experience.evolve(player);
        System.out.println("\n\nPlayerClass: " + player.getPlayerClass() + "\n\n");
        System.out.println("Player evo: " + player.getEvolution());
        System.out.println("New stats after Evolution");
        System.out.println("Attack: " + player.getAttack());
        System.out.println("Defense: " + player.getDefense());
        System.out.println("Speed: " + player.getSpeed());
        System.out.println("Luck: " + player.getLuck());
        System.out.println("HP: " + player.getHitPoints());
        System.out.println("PP: " + player.getPowerPoints());
        System.out.println("PlayerType: " + player.getPlayerType());
        
        System.out.println("\nDungeon 1 end!\n\n\n");
        
        
        
        
        player.addEquipment(RandomItemGenerator.getItem());
        player.addEquipment(RandomItemGenerator.getItem());
        player.addEquipment(RandomItemGenerator.getItem());
        player.addEquipment(RandomItemGenerator.getItem());
        player.addEquipment(RandomItemGenerator.getItem());
        player.addEquipment(RandomItemGenerator.getItem());
        player.addEquipment(RandomItemGenerator.getItem());
        player.addEquipment(RandomItemGenerator.getItem());
        player.addEquipment(RandomItemGenerator.getItem());
        player.addEquipment(RandomItemGenerator.getItem());
        if (player.getWeapon() != null && 
                player.getArmor() != null &&
                player.getShield() != null && 
                player.getAccessory() != null) {
        System.out.println("\nItems: " + player.getWeapon().getWeaponName() + ", "
                                       + player.getShield().getWeaponName() + ", "
                                       + player.getArmor().getWeaponName() + ", "
                                       + player.getAccessory().getWeaponName() + "\n");
        }
        
        player.setExperience(player.getExperience() + 70);
        System.out.println("Experience: " + player.getExperience());
        
        System.out.println("\n\nPlayer leveled up!");
        System.out.println("\n\nPlayerClass: " + player.getPlayerClass() + "\n\n");
        player.levelUp();
        System.out.println("\n\nPlayerClass: " + player.getPlayerClass() + "\n\n");
        System.out.println("Player level: " + player.getLevel());
        System.out.println("New stats after level up");
        System.out.println("Attack: " + player.getAttack());
        System.out.println("Defense: " + player.getDefense());
        System.out.println("Speed: " + player.getSpeed());
        System.out.println("Luck: " + player.getLuck());
        System.out.println("HP: " + player.getHitPoints());
        System.out.println("PP: " + player.getPowerPoints());
        System.out.println("\nExperience: " + player.getExperience());
        
        player = Experience.evolve(player);
        System.out.println("Player evo: " + player.getEvolution());
        System.out.println("New stats after Evolution");
        System.out.println("Attack: " + player.getAttack());
        System.out.println("Defense: " + player.getDefense());
        System.out.println("Speed: " + player.getSpeed());
        System.out.println("Luck: " + player.getLuck());
        System.out.println("HP: " + player.getHitPoints());
        System.out.println("PP: " + player.getPowerPoints());
        System.out.println("PlayerClass: " + player.getPlayerClass());
        
        System.out.println("\nDungeon 2 end!\n\n\n");
        
        
        
        player.addEquipment(RandomItemGenerator.getItem());
        player.addEquipment(RandomItemGenerator.getItem());
        player.addEquipment(RandomItemGenerator.getItem());
        player.addEquipment(RandomItemGenerator.getItem());
        player.addEquipment(RandomItemGenerator.getItem());
        player.addEquipment(RandomItemGenerator.getItem());
        player.addEquipment(RandomItemGenerator.getItem());
        player.addEquipment(RandomItemGenerator.getItem());
        player.addEquipment(RandomItemGenerator.getItem());
        player.addEquipment(RandomItemGenerator.getItem());
        if (player.getWeapon() != null && 
                player.getArmor() != null &&
                player.getShield() != null && 
                player.getAccessory() != null) {
        System.out.println("\nItems: " + player.getWeapon().getWeaponName() + ", "
                                       + player.getShield().getWeaponName() + ", "
                                       + player.getArmor().getWeaponName() + ", "
                                       + player.getAccessory().getWeaponName() + "\n");
        }
        
        player.setExperience(player.getExperience() + 155);
        System.out.println("Experience: " + player.getExperience());
        
        System.out.println("\n\nPlayer leveled up!");
        player.levelUp();
        System.out.println("Player level: " + player.getLevel());
        System.out.println("New stats after level up");
        System.out.println("Attack: " + player.getAttack());
        System.out.println("Defense: " + player.getDefense());
        System.out.println("Speed: " + player.getSpeed());
        System.out.println("Luck: " + player.getLuck());
        System.out.println("HP: " + player.getHitPoints());
        System.out.println("PP: " + player.getPowerPoints());
        System.out.println("\nExperience: " + player.getExperience());
        
        player = Experience.evolve(player);
        System.out.println("Player evo: " + player.getEvolution());
        System.out.println("New stats after Evolution");
        System.out.println("Attack: " + player.getAttack());
        System.out.println("Defense: " + player.getDefense());
        System.out.println("Speed: " + player.getSpeed());
        System.out.println("Luck: " + player.getLuck());
        System.out.println("HP: " + player.getHitPoints());
        System.out.println("PP: " + player.getPowerPoints());
        System.out.println("PlayerClass: " + player.getPlayerClass());
        
        System.out.println("\nDungeon 3 end!\n\n\n");
        
        
        
        player.addEquipment(RandomItemGenerator.getItem());
        player.addEquipment(RandomItemGenerator.getItem());
        player.addEquipment(RandomItemGenerator.getItem());
        player.addEquipment(RandomItemGenerator.getItem());
        player.addEquipment(RandomItemGenerator.getItem());
        player.addEquipment(RandomItemGenerator.getItem());
        player.addEquipment(RandomItemGenerator.getItem());
        player.addEquipment(RandomItemGenerator.getItem());
        player.addEquipment(RandomItemGenerator.getItem());
        if (player.getWeapon() != null && 
                player.getArmor() != null &&
                player.getShield() != null && 
                player.getAccessory() != null) {
        System.out.println("\nItems: " + player.getWeapon().getWeaponName() + ", "
                                       + player.getShield().getWeaponName() + ", "
                                       + player.getArmor().getWeaponName() + ", "
                                       + player.getAccessory().getWeaponName() + "\n");
        }
        
        player.setExperience(player.getExperience() + 270);
        System.out.println("Experience: " + player.getExperience());
        
        System.out.println("\n\nPlayer leveled up!");
        player.levelUp();
        System.out.println("Player level: " + player.getLevel());
        System.out.println("New stats after level up");
        System.out.println("Attack: " + player.getAttack());
        System.out.println("Defense: " + player.getDefense());
        System.out.println("Speed: " + player.getSpeed());
        System.out.println("Luck: " + player.getLuck());
        System.out.println("HP: " + player.getHitPoints());
        System.out.println("PP: " + player.getPowerPoints());
        System.out.println("\nExperience: " + player.getExperience());
        
        player = Experience.evolve(player);
        System.out.println("Player evo: " + player.getEvolution());
        System.out.println("New stats after Evolution");
        System.out.println("Attack: " + player.getAttack());
        System.out.println("Defense: " + player.getDefense());
        System.out.println("Speed: " + player.getSpeed());
        System.out.println("Luck: " + player.getLuck());
        System.out.println("HP: " + player.getHitPoints());
        System.out.println("PP: " + player.getPowerPoints());
        System.out.println("PlayerClass: " + player.getPlayerClass());
        
        System.out.println("\nBefore bossfight!\n\n\n");
        
        
        Boss enemy = new Nidoking();
        System.out.println("Attack: " + enemy.getAttack());
        System.out.println("Defense: " + enemy.getDefense());
        System.out.println("Speed: " + enemy.getSpeed());
        System.out.println("Luck: " + enemy.getLuck());
        System.out.println("HP: " + enemy.getHitPoints());
        System.out.println("PP: " + enemy.getPowerPoints());
        Battle battle = new Battle(player, enemy);
        boolean victory = battle.conductBattle();
    }
}