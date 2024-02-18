package decoratorPattern;

//Classes affect the rate at which your mon levels up
//Some have distinct advantages over the others
public class Experience {
    
    /*
     * Stats have a 25% chance of increasing by twice as much normally.
     * This chance changes depending on class. Listed above each class is change in 
     * percentage of the chance that the stat increases by double.
     */
    public static void levelUp(Player player) {
        switch (player.getPlayerClass()) {
        
        //Att: 50%, Speed: 50%
        case ASSASSIN: 
            player.setAttack(player.getAttack() + (Math.random() < 0.5 ? 2 : 1));
            player.setDefense(player.getDefense() + (Math.random() < 0.25 ? 2 : 1));
            player.setSpeed(player.getSpeed() + (Math.random() < 0.5 ? 2 : 1));
            player.setLuck(player.getLuck() + (Math.random() < 0.25 ? 2 : 1));
            player.setHitPoints(player.getHitPoints() + (Math.random() < 0.25 ? 6 : 3));
            player.setPowerPoints(player.getPowerPoints() + (Math.random() < 0.25 ? 2 : 1));
            break;

        //Def: 50%, HP: 50%
        case TANK: 
            player.setAttack(player.getAttack() + (Math.random() < 0.25 ? 2 : 1));
            player.setDefense(player.getDefense() + (Math.random() < 0.5 ? 2 : 1));
            player.setSpeed(player.getSpeed() + (Math.random() < 0.25 ? 2 : 1));
            player.setLuck(player.getLuck() + (Math.random() < 0.25 ? 2 : 1));
            player.setHitPoints(player.getHitPoints() + (Math.random() < 0.5 ? 6 : 3));
            player.setPowerPoints(player.getPowerPoints() + (Math.random() < 0.25 ? 2 : 1));
            break;
            
        //Luck: 50%, PP: 50%
        case MAGE: 
            player.setAttack(player.getAttack() + (Math.random() < 0.25 ? 2 : 1));
            player.setDefense(player.getDefense() + (Math.random() < 0.25 ? 2 : 1));
            player.setSpeed(player.getSpeed() + (Math.random() < 0.25 ? 2 : 1));
            player.setLuck(player.getLuck() + (Math.random() < 0.5 ? 2 : 1));
            player.setHitPoints(player.getHitPoints() + (Math.random() < 0.25 ? 6 : 3));
            player.setPowerPoints(player.getPowerPoints() + (Math.random() < 0.5 ? 2 : 1));
            break;
            
        //Speed: 50%, Luck: 50%
        case ELF: 
            player.setAttack(player.getAttack() + (Math.random() < 0.25 ? 2 : 1));
            player.setDefense(player.getDefense() + (Math.random() < 0.25 ? 2 : 1));
            player.setSpeed(player.getSpeed() + (Math.random() < 0.5 ? 2 : 1));
            player.setLuck(player.getLuck() + (Math.random() < 0.5 ? 2 : 1));
            player.setHitPoints(player.getHitPoints() + (Math.random() < 0.25 ? 6 : 3));
            player.setPowerPoints(player.getPowerPoints() + (Math.random() < 0.25 ? 2 : 1));
            break;
            
        //Attack: 40%, Def: 40%, Luck: 40%, PP: 10% 
        case BRAWLER: 
            player.setAttack(player.getAttack() + (Math.random() < 0.4 ? 2 : 1));
            player.setDefense(player.getDefense() + (Math.random() < 0.4 ? 2 : 1));
            player.setSpeed(player.getSpeed() + (Math.random() < 0.25 ? 2 : 1));
            player.setLuck(player.getLuck() + (Math.random() < 0.4 ? 2 : 1));
            player.setHitPoints(player.getHitPoints() + (Math.random() < 0.25 ? 6 : 3));
            player.setPowerPoints(player.getPowerPoints() + (Math.random() < 0.1 ? 2 : 1));
            break;
            
        //Speed: 40%, HP: 40%, PP: 40%, Defense: 15% 
        case JESTER: 
            player.setAttack(player.getAttack() + (Math.random() < 0.25 ? 2 : 1));
            player.setDefense(player.getDefense() + (Math.random() < 0.15 ? 2 : 1));
            player.setSpeed(player.getSpeed() + (Math.random() < 0.4 ? 2 : 1));
            player.setLuck(player.getLuck() + (Math.random() < 0.25 ? 2 : 1));
            player.setHitPoints(player.getHitPoints() + (Math.random() < 0.4 ? 6 : 3));
            player.setPowerPoints(player.getPowerPoints() + (Math.random() < 0.4 ? 2 : 1));
            break; 
        }
        
        player.setExperience(player.getExperience() - player.getNextLevelExp());
        player.setNextLevelExp((int) Math.floor(player.getNextLevelExp() * 1.5));
        player.setLevel(player.getLevel() + 1);
        System.out.println(player.getName() + " has leveled up to " + player.getLevel() + "!");
    }
    
    public static Player evolve(Player player) {
        if (player.getLevel() > 4 && player.getEvolution() == 1) {
            System.out.println("What?!\n" + player.getName() + " is evolving!");
            player.setEvolution(2);
            switch (player.getPlayerType()) {
            case BULBASAUR: 
                player = new Ivysaur(player);
                break;
            case CHARMANDER:
                player = new Charmeleon(player);
                break;
            case SQUIRTLE:
                player = new Wartortle(player);
                break;
            default:
                System.out.println("Something went wrong");
            }
        }
        if (player.getLevel() > 10 && player.getEvolution() == 2) {
            System.out.println("What?!\n" + player.getName() + " is evolving!");
            player.setEvolution(3);
            switch (player.getPlayerType()) {
            case IVYSAUR: 
                player = new Venusaur(player);
                break;
            case CHARMELEON:
                player = new Charizard(player);
                break;
            case WARTORTLE:
                player = new Blastoise(player);
                break;
            default:
                System.out.println("Something went wrong");
            }
        }
        return player;
    }
}