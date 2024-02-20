import decoratorPattern.Player;
import facadePattern.Facade;

public class Main {
    
    public static void main(String[] args) {
        
        //initialize variables
        int gym = 1, level = 1;
        boolean gameWon = false, victorious = false;
        Facade facade = new Facade();
        
        //begin game by creating player
        Player player = facade.generatePlayer();
        
        //begin crawling dungeons
        while (gym < 6) {
            victorious = facade.generateDungeon(player, gym, level);
            if (victorious) {
                level += 1;
                facade.generateRandomItem(player);
                if (level > 10) {
                    gym += 1;
                    level = 1;
                    System.out.println("Congrats you beat the gym!");
                    player = facade.generateTopFloor(player);
                } else if (player.getHealth() <= (player.getHitPoints() * 0.15)) {
                    System.out.println("You're running low on health, let's go to the PokeCenter!");
                    player = facade.generateTopFloor(player);
                }
            } else {
                if (gym == 5 && level == 10) {
                    //player lost on the final boss
                    break;
                }
                System.out.println("The PokeCenter will have you feeling better in no time!");
                player = facade.generateTopFloor(player);
            }
        }
        facade.generateGameOverMessage(player, gameWon);
    }
}