import decoratorPattern.Player;
import facadePattern.Facade;
import facadePattern.TextBlocks;

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
                    if (gym == 6) {
                        gameWon = true;
                    } else {
                        level = 1;
                        TextBlocks.gymWon();
                        player = facade.generateTopFloor(player);
                    }
                } else if (player.getHealth() <= (player.getHitPoints() * 0.25)) {
                    TextBlocks.lowOnHealth(player);
                    player = facade.generateTopFloor(player);
                }
            } else {
                if (gym == 5 && level == 10) {
                    //player lost on the final boss
                    break;
                }
                player = facade.generateTopFloor(player);
            }
        }
        facade.generateGameOverMessage(player, gameWon);
    }
}