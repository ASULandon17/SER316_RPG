import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import abstractfactory.Abra;
import abstractfactory.Alakazam;
import abstractfactory.Arcanine;
import abstractfactory.Boss;
import abstractfactory.Diglett;
import abstractfactory.Enemy;
import abstractfactory.Geodude;
import abstractfactory.Growlithe;
import abstractfactory.Henchman;
import abstractfactory.Kadabra;
import abstractfactory.Machoke;
import abstractfactory.Magnemite;
import abstractfactory.Nidoking;
import abstractfactory.Onix;
import abstractfactory.Peon;
import abstractfactory.Raichu;
import abstractfactory.Rapidash;
import abstractfactory.Rhydon;
import abstractfactory.Voltorb;
import decoratorpattern.Bulbasaur;
import decoratorpattern.Charmander;
import decoratorpattern.Experience;
import decoratorpattern.Player;
import decoratorpattern.PlayerClass;
import decoratorpattern.Squirtle;
import equipment.BronzeChestplate;
import equipment.BruiserGloves;
import equipment.BuckleShield;
import equipment.Equipment;
import equipment.FleetFootCharm;
import equipment.HermesLuckyTalisman;
import equipment.IronDagger;
import equipment.PolishedSilverBlade;
import equipment.RandomItemGenerator;
import equipment.ReinforcedKiteshield;
import equipment.SteelChainmail;
import facadepattern.CreatePlayer;
import facadepattern.Facade;
import facadepattern.TextBlocks;

import org.junit.Test;

public class TestSuite {
   
    /*
     * ABSTRACT FACTORY PACKAGE
     */
    
    @Test
    public void peonTest() {
        Peon diglett = new Diglett();
        diglett.setLuck(-1); //set luck to 0 to remove randomness
        
        int stat = diglett.generateRandomStat();
        int damage = diglett.takeTurn();
        assertTrue("Generate Random stat is incorrect", (stat >= 2 && stat <= 4));
        assertEquals("attack hits for correct amount", diglett.getAttack(), diglett.useAttack());
        assertTrue("Take turn is correct amount or miss", 
                (damage == 0) || (damage == diglett.getAttack()));
        
        diglett.setLuck(100); //set luck to 100 to remove randomness
        assertEquals("attack hits for correct amount when critical", 
                (int) (diglett.getAttack() * 1.5), diglett.useAttack());
    }
    
    @Test
    public void henchmanTest() {
        Henchman geodude = new Geodude();
        geodude.setLuck(-1); //set luck to 0 to remove randomness
        
        int stat = geodude.generateRandomStat();
        int damage = geodude.takeTurn();
        assertTrue("Generate Random stat is incorrect", (stat >= 4 && stat <= 6));
        assertTrue("Geodude uses potion when it has one", geodude.useHitPotion());
        assertFalse("Geodude doesn't use potion when it has none", geodude.useHitPotion());
        assertEquals("attack hits for correct amount", geodude.getAttack(), geodude.useAttack());
        assertTrue("Take turn is correct amount or miss", 
                (damage == 0) || (damage == geodude.getAttack()));
        
        geodude.setLuck(100); //set luck to 100 to remove randomness
        assertEquals("attack hits for correct amount when critical", 
                (int) (geodude.getAttack() * 1.5), geodude.useAttack());
    }
    
    @Test
    public void bossTest() {
        Boss onix = new Onix();
        onix.setLuck(-1); //set luck to 0 to remove randomness
        
        int stat = onix.generateRandomStat();
        assertTrue("Generate Random stat is incorrect", (stat >= 7 && stat <= 12));
        assertTrue("Geodude uses potion when it has one", onix.useHitPotion());
        assertFalse("Geodude doesn't use potion when it has none", onix.useHitPotion());
        assertEquals("attack hits for correct amount", onix.getAttack(), onix.useAttack());
        
        onix.setLuck(100); //set luck to 100 to remove randomness
        assertEquals("attack hits for correct amount when critical", 
                (int) (onix.getAttack() * 1.5), onix.useAttack());
    }
    
    @Test
    public void onixTest() {
        Boss onix = new Onix();
        onix.setLuck(-1); //set luck to 0 to remove randomness
        
        onix.setMana(0);
        assertEquals("Onix fails special att w/ 0 mana", -1, onix.useSpecialAttack());
        onix.setMana(10);
        assertEquals("Onix uses special att w/ mana", 
                (int) Math.floor(onix.useAttack() * 1.4), onix.useSpecialAttack());
        onix.setHealth(1);
        assertEquals("Onix uses potion when necessary", 0, onix.takeTurn());
    }
    
    @Test
    public void raichuTest() {
        Boss raichu = new Raichu();
        raichu.setLuck(-1); //set luck to 0 to remove randomness
        
        raichu.setMana(0);
        assertEquals("Raichu fails special att w/ 0 mana", -1, raichu.useSpecialAttack());
        raichu.setMana(10);
        assertEquals("Raichu uses special att w/ mana", 
                (int) Math.floor(raichu.useAttack() * 1.4), raichu.useSpecialAttack());
        raichu.setHealth(1);
        assertEquals("Raichu uses potion when necessary", 0, raichu.takeTurn());
    }
    
    @Test
    public void alakazamTest() {
        Boss alakazam = new Alakazam();
        alakazam.setLuck(0); //set luck to 0 to remove randomness
        
        alakazam.setMana(0);
        assertEquals("Alakazam fails special att w/ 0 mana", -1, alakazam.useSpecialAttack());
        alakazam.setMana(10);
        assertEquals("Alakazam uses special att w/ mana", 
                (int) Math.ceil(alakazam.useAttack() * 1.6), alakazam.useSpecialAttack());
        alakazam.setHealth(1);
        assertEquals("Alakazam uses potion when necessary", 0, alakazam.takeTurn());
    }
    
    @Test
    public void arcanineTest() {
        Boss arcanine = new Arcanine();
        arcanine.setLuck(-1); //set luck to 0 to remove randomness
        
        arcanine.setMana(0);
        assertEquals("Arcanine fails special att w/ 0 mana", -1, arcanine.useSpecialAttack());
        arcanine.setMana(10);
        assertEquals("Arcanine uses special att w/ mana", 
                (int) Math.ceil(arcanine.useAttack() * 1.4), arcanine.useSpecialAttack());
        arcanine.setHealth(1);
        assertEquals("Arcanine uses potion when necessary", 0, arcanine.takeTurn());
    }
    
    @Test
    public void nidokingTest() {
        Boss nidoking = new Nidoking();
        nidoking.setLuck(100); //set luck to 0 to remove randomness
        
        nidoking.setMana(0);
        assertEquals("Nidoking fails special att w/ 0 mana", -1, nidoking.useSpecialAttack());
        nidoking.setMana(10);
        assertEquals("Nidoking uses special att w/ mana", 
                (int) Math.floor(nidoking.useAttack() * 2), nidoking.useSpecialAttack());
        nidoking.setHealth(1);
        assertEquals("Nidoking uses potion when necessary", 0, nidoking.takeTurn());
    }
    
    @Test
    public void createEnemies() {
        //ensuring all pokemon build correctly
        Enemy kadabra = new Kadabra();
        Enemy rhydon = new Rhydon();
        Enemy rapidash = new Rapidash();
        Enemy voltorb = new Voltorb();
        Enemy growlithe = new Growlithe();
        Enemy abra = new Abra();
        Enemy machoke = new Machoke();
        Enemy magnemite = new Magnemite();
        
        assertEquals("kadabra correct exp", 20, kadabra.getExperience());
        assertEquals("rhydon correct exp", 80, rhydon.getExperience());
        assertEquals("rapidash correct exp", 40, rapidash.getExperience());
        assertEquals("voltorb correct exp", 10, voltorb.getExperience());
        assertEquals("growlithe correct exp", 15, growlithe.getExperience());
        assertEquals("abra correct exp", 10, abra.getExperience());
        assertEquals("machoke correct exp", 20, machoke.getExperience());
        assertEquals("magnemite correct exp", 5, magnemite.getExperience());
    }
    
    /*
     * EQUIPMENT PACKAGE
     */
    
    @Test
    public void randomItemGenerator() {
        //making sure it builds without failure
        //unable to test more than that item is equipment class family because of randomness
        Equipment item = RandomItemGenerator.getItem();
        assertEquals("Item is correct class", Equipment.class, item.getClass().getSuperclass());
    }
    
    /*
     * FACADE PACKAGE
     */
    
    @Test
    public void testTextBlocks() {
        //making sure all textblocks run
        Player player = new Squirtle("Landon", PlayerClass.ASSASSIN);
        Equipment item = RandomItemGenerator.getItem();
        Enemy kadabra = new Kadabra();
        
        TextBlocks.displayStats(player);
        TextBlocks.displayInventory(player);
        player.addEquipment(new BronzeChestplate());
        player.addEquipment(new BruiserGloves());
        player.addEquipment(new BuckleShield());
        player.addEquipment(new IronDagger());
        TextBlocks.displayInventory(player);
        TextBlocks.equipped(player, item);
        TextBlocks.gameWon(player);
        TextBlocks.gameLost(player);
        TextBlocks.dungeonStart(1, 1, kadabra);
        TextBlocks.dungeonStart(1, 5, kadabra);
        TextBlocks.dungeonStart(1, 10, kadabra);
        TextBlocks.enemyFainted(player, kadabra);
        TextBlocks.createdPlayer(player);
        TextBlocks.pokemonCenter();
        TextBlocks.evolve(player);
        TextBlocks.wonEquipment(player, item);
        TextBlocks.enemyHealthLeft(kadabra);
        TextBlocks.playerHealthLeft(player);
        TextBlocks.playerFainted(player, kadabra);
        TextBlocks.playerDoesDamage(player, 20);
        TextBlocks.enemyDoesDamage(kadabra, 20);
        TextBlocks.gymWon();
        TextBlocks.playersTurn(player);
        TextBlocks.enemiesTurn(kadabra);
        TextBlocks.lowOnHealth(player);
        TextBlocks.startGame(player);
    }
    
    @Test
    public void testCreatePlayer() {
        //choose player runs
        CreatePlayer.choosePlayer();
        Player bulbasaur = CreatePlayer.generatePlayer(0, 1, "char");
        Player charmander = CreatePlayer.generatePlayer(1, 1, "char");
        Player squirtle = CreatePlayer.generatePlayer(2, 1, "char");
        Player bulbasaur2 = CreatePlayer.generatePlayer(3, 1, "char");
        
        assertEquals("Returns bulbasaur", Bulbasaur.class, bulbasaur.getClass());
        assertEquals("Returns bulbasaur", Charmander.class, charmander.getClass());
        assertEquals("Returns bulbasaur", Squirtle.class, squirtle.getClass());
        assertEquals("Returns bulbasaur", Bulbasaur.class, bulbasaur2.getClass());
    }
    
    @Test
    public void testFacadeDungeons() {
        Facade facade = new Facade();
        Player player = facade.generatePlayer();
        
        
        //check that all dungeons and pokemon can be generated through method.
        facade.generateDungeon(player, 1, 1);
        facade.generateDungeon(player, 1, 5);
        facade.generateDungeon(player, 1, 10);
        facade.generateDungeon(player, 2, 1);
        facade.generateDungeon(player, 2, 5);
        facade.generateDungeon(player, 2, 10);
        facade.generateDungeon(player, 3, 1);
        facade.generateDungeon(player, 3, 5);
        facade.generateDungeon(player, 3, 10);
        facade.generateDungeon(player, 4, 1);
        facade.generateDungeon(player, 4, 5);
        facade.generateDungeon(player, 4, 10);
        facade.generateDungeon(player, 5, 1);
        facade.generateDungeon(player, 5, 5);
        facade.generateDungeon(player, 5, 10);
        facade.generateDungeon(player, 20, 20);
    }
    
    @Test
    public void testFacadeTopFloor() {
        //test that player will be fully healed, leveled up, and evolved.
        Facade facade = new Facade();
        Player player = facade.generatePlayer();
        
        player.setHealth(1);
        player.setExperience(500);
        assertTrue("Player health isn't full", player.getHealth() != player.getHitPoints());
        assertTrue("Player is level 1", player.getLevel() == 1);
        assertTrue("Player is evolution 1", player.getEvolution() == 1);
        player = facade.generateTopFloor(player);
        System.out.println("Player health: " + player.getHealth());
        System.out.println("Player hitpoints: " + player.getHitPoints());
        assertTrue("Player health is full", player.getHealth() == player.getHitPoints());
        assertTrue("Player is not level 1", player.getLevel() != 1);
        assertTrue("Player is not evolution 1", player.getEvolution() != 1);
    }
    
    @Test
    public void testGenerateItem() {
        Facade facade = new Facade();
        Player player = facade.generatePlayer();
        
        assertTrue("Inventory is empty", (player.getWeapon() == null)
                                      && (player.getAccessory() == null) 
                                      && (player.getArmor() == null) 
                                      && (player.getShield() == null));
        facade.generateRandomItem(player);
        assertFalse("Inventory is empty", (player.getWeapon() == null)
                && (player.getAccessory() == null) 
                && (player.getArmor() == null) 
                && (player.getShield() == null));
    }
    
    @Test
    public void testGameOverMessage() {
        Facade facade = new Facade();
        Player player = facade.generatePlayer();
        facade.generateGameOverMessage(player, false);
        facade.generateGameOverMessage(player, true);
    }
    
    /*
     * DECORATOR PACKAGE
     */
    
    @Test
    public void testLevelUpAndEvolve() {
        //start out with all level 1 pokemon
        Player player = new Squirtle("Landon", PlayerClass.ASSASSIN);
        Player player2 = new Squirtle("Landon", PlayerClass.TANK);
        Player player3 = new Squirtle("Landon", PlayerClass.MAGE);
        Player player4 = new Squirtle("Landon", PlayerClass.ELF);
        Player player5 = new Squirtle("Landon", PlayerClass.BRAWLER);
        Player player6 = new Squirtle("Landon", PlayerClass.JESTER);
        Player player7 = new Bulbasaur("Landon", PlayerClass.JESTER);
        Player player8 = new Charmander("Landon", PlayerClass.JESTER);
        
        player.setExperience(100);
        player2.setExperience(100);
        player3.setExperience(100);
        player4.setExperience(100);
        player5.setExperience(100);
        player6.setExperience(100);
        player7.setExperience(100);
        player8.setExperience(100);
        
        assertTrue("Player is level 1", player.getLevel() == 1);
        assertTrue("Player2 is level 1", player.getLevel() == 1);
        assertTrue("Player3 is level 1", player.getLevel() == 1);
        assertTrue("Player4 is level 1", player.getLevel() == 1);
        assertTrue("Player5 is level 1", player.getLevel() == 1);
        assertTrue("Player6 is level 1", player.getLevel() == 1);
        assertTrue("Player7 is level 1", player.getLevel() == 1);
        assertTrue("Player8 is level 1", player.getLevel() == 1);
        
        //give them enough experience to level up past 5
        player.levelUp();
        Experience.levelUp(player2);
        Experience.levelUp(player3);
        Experience.levelUp(player4);
        Experience.levelUp(player5);
        Experience.levelUp(player6);
        Experience.levelUp(player7);
        Experience.levelUp(player8);
        
        assertTrue("Player is not level 1", player.getLevel() != 1);
        assertTrue("Player2 is not level 1", player.getLevel() != 1);
        assertTrue("Player3 is not level 1", player.getLevel() != 1);
        assertTrue("Player4 is not level 1", player.getLevel() != 1);
        assertTrue("Player5 is not level 1", player.getLevel() != 1);
        assertTrue("Player6 is not level 1", player.getLevel() != 1);
        assertTrue("Player7 is not level 1", player.getLevel() != 1);
        assertTrue("Player8 is not level 1", player.getLevel() != 1);
        
        assertTrue("Player is evolution 1", player.getEvolution() == 1);
        assertTrue("Player7 is evolution 1", player7.getEvolution() == 1);
        assertTrue("Player8 is evolution 1", player8.getEvolution() == 1);
        
        player = Experience.evolve(player);
        player7 = Experience.evolve(player7);
        player8 = Experience.evolve(player8);
        
        assertTrue("Player is evolution 2", player.getEvolution() == 2);
        assertTrue("Player7 is evolution 2", player7.getEvolution() == 2);
        assertTrue("Player8 is evolution 2", player8.getEvolution() == 2);
        
        //give them more experience to pass level threshold (10)
        player.setExperience(500);
        player7.setExperience(500);
        player8.setExperience(500);
        
        Experience.levelUp(player);
        Experience.levelUp(player7);
        Experience.levelUp(player8);
        
        player = Experience.evolve(player);
        player7 = Experience.evolve(player7);
        player8 = Experience.evolve(player8);
        
        assertTrue("Player is evolution 3", player.getEvolution() == 3);
        assertTrue("Player7 is evolution 3", player7.getEvolution() == 3);
        assertTrue("Player8 is evolution 3", player8.getEvolution() == 3);
    }
    
    @Test
    public void testPlayerAddEquipment() {
        Player player = new Squirtle("Landon", PlayerClass.ASSASSIN);
        
        //generate each kind of equipment
        Equipment sword1 = new IronDagger();
        Equipment armor1 = new BronzeChestplate();
        Equipment shield1 = new BuckleShield();
        Equipment accessory1 = new FleetFootCharm();
        
        //make sure inventory is empty
        assertTrue("Inventory is empty", (player.getWeapon() == null)
                && (player.getAccessory() == null) 
                && (player.getArmor() == null) 
                && (player.getShield() == null));
        
        //add all level 1 equipment
        player.addEquipment(sword1);
        player.addEquipment(armor1);
        player.addEquipment(shield1);
        player.addEquipment(accessory1);
        
        //check to make sure each item was added in appropriate spot
        assertTrue("Sword was equipped", player.getWeapon() == sword1);
        assertTrue("Armor was equipped", player.getArmor() == armor1);
        assertTrue("Shield was equipped", player.getShield() == shield1);
        assertTrue("Accessory was equipped", player.getAccessory() == accessory1);
        
        //generate level 2 of each kind of equipment
        Equipment sword2 = new PolishedSilverBlade();
        Equipment armor2 = new SteelChainmail();
        Equipment shield2 = new ReinforcedKiteshield();
        Equipment accessory2 = new HermesLuckyTalisman();
        
        //add all level 2 equipment
        player.addEquipment(sword2);
        player.addEquipment(armor2);
        player.addEquipment(shield2);
        player.addEquipment(accessory2);
        
        //check to make sure each item properly replaced the former
        assertTrue("New sword was equipped", player.getWeapon() == sword2);
        assertTrue("New armor was equipped", player.getArmor() == armor2);
        assertTrue("New shield was equipped", player.getShield() == shield2);
        assertTrue("New accessory was equipped", player.getAccessory() == accessory2);        
    }
    
    @Test
    public void playerUsePotion() {
        Player player = new Squirtle("Landon", PlayerClass.ASSASSIN);
        player.setPotion(1);
        
        player.setHealth(player.getHealth() - 1);
        
        assertTrue("Player is not full health", player.getHealth() != player.getHitPoints());
        
        player.usePotion();
        
        assertTrue("Player is now back to full health", 
                player.getHealth() == player.getHitPoints());
    }
    
    @Test
    public void runRandomNumberMethodsToMakeSureTheyDontBreak() {
        Player player = new Squirtle("Landon", PlayerClass.ASSASSIN);
        Player player2 = new Charmander("Landon", PlayerClass.ASSASSIN);
        Player player3 = new Bulbasaur("Landon", PlayerClass.ASSASSIN);
        
        player.takeTurn();
        player2.takeTurn();
        player3.takeTurn();
        
        player.takeTurn();
        player2.takeTurn();
        player3.takeTurn();
        
        player.takeTurn();
        player2.takeTurn();
        player3.takeTurn();
        
        player.setExperience(100);
        player2.setExperience(100);
        player3.setExperience(100);
        
        player.levelUp();
        player2.levelUp();
        player3.levelUp();
        
        player = Experience.evolve(player);
        player2 = Experience.evolve(player2);
        player3 = Experience.evolve(player3);
        
        player.takeTurn();
        player2.takeTurn();
        player3.takeTurn();
        
        player.takeTurn();
        player2.takeTurn();
        player3.takeTurn();
        
        player.takeTurn();
        player2.takeTurn();
        player3.takeTurn();
        
        player.setExperience(500);
        player2.setExperience(500);
        player3.setExperience(500);
        
        player.levelUp();
        player2.levelUp();
        player3.levelUp();
        
        player = Experience.evolve(player);
        player2 = Experience.evolve(player2);
        player3 = Experience.evolve(player3);
        
        player.takeTurn();
        player2.takeTurn();
        player3.takeTurn();
        
        player.takeTurn();
        player2.takeTurn();
        player3.takeTurn();
        
        player.takeTurn();
        player2.takeTurn();
        player3.takeTurn();
    }
}