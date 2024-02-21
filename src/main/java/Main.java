import decoratorpattern.Player;
import facadepattern.Facade;
import facadepattern.TextBlocks;

public class Main {
    
    public static void main(String[] args) {
        
        //initialize variables
        int gym = 1;
        int level = 1;
        boolean gameWon = false;
        boolean victorious = false;
        Facade facade = new Facade();
        
        //begin game by creating player
        Player player = facade.generatePlayer();
        
        //begin crawling dungeons
        while (gym < 6) {
            victorious = facade.generateDungeon(player, gym, level);
            //if level is won
            if (victorious) {
                level += 1;
                facade.generateRandomItem(player);
                //if gym is won
                if (level > 10) {
                    gym += 1;
                    //if game is won
                    if (gym == 6) {
                        gameWon = true;
                    } else {
                        level = 1;
                        TextBlocks.gymWon();
                        player = facade.generateTopFloor(player);
                    }
                //if level is won but health is below 25%
                } else if (player.getHealth() <= (player.getHitPoints() * 0.25)) {
                    TextBlocks.lowOnHealth(player);
                    player = facade.generateTopFloor(player);
                }
            } else {
                //if final battle is lost
                if (gym == 5 && level == 10) {
                    break;
                }
                //if battle is lost but its not the final battle
                player = facade.generateTopFloor(player);
            }
        }
        //if final battle has occurred
        facade.generateGameOverMessage(player, gameWon);
    }
}