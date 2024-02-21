import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import abstractfactory.Alakazam;
import abstractfactory.Arcanine;
import abstractfactory.Boss;
import abstractfactory.Diglett;
import abstractfactory.Enemy;
import abstractfactory.Geodude;
import abstractfactory.Henchman;
import abstractfactory.Nidoking;
import abstractfactory.Onix;
import abstractfactory.Peon;
import abstractfactory.Raichu;

import org.junit.Test;

public class AbstractFactoryTest {
   
    
    
    @Test
    public void peonTest() {
        Peon diglett = new Diglett();
        diglett.setLuck(0); //set luck to 0 to remove randomness
        
        int stat = diglett.generateRandomStat();
        assertTrue("Generate Random stat is incorrect", (stat >= 2 && stat <= 4));
        assertEquals("attack hits for correct amount", diglett.getAttack(), diglett.useAttack());
        assertTrue("Take turn is correct amount or miss", (diglett.takeTurn() == 0) || (diglett.takeTurn() == diglett.getAttack()));
        
        diglett.setLuck(100); //set luck to 100 to remove randomness
        assertEquals("attack hits for correct amount when critical", (int) (diglett.getAttack() * 1.5), diglett.useAttack());
    }
    
    @Test
    public void henchmanTest() {
        Henchman geodude = new Geodude();
        geodude.setLuck(0); //set luck to 0 to remove randomness
        
        int stat = geodude.generateRandomStat();
        assertTrue("Generate Random stat is incorrect", (stat >= 4 && stat <= 6));
        assertTrue("Geodude uses potion when it has one", geodude.useHitPotion());
        assertFalse("Geodude doesn't use potion when it has none", geodude.useHitPotion());
        assertEquals("attack hits for correct amount", geodude.getAttack(), geodude.useAttack());
        assertTrue("Take turn is correct amount or miss", (geodude.takeTurn() == 0) || (geodude.takeTurn() == geodude.getAttack()));
        
        geodude.setLuck(100); //set luck to 100 to remove randomness
        assertEquals("attack hits for correct amount when critical", (int) (geodude.getAttack() * 1.5), geodude.useAttack());
    }
    
    @Test
    public void bossTest() {
        Boss onix = new Onix();
        onix.setLuck(0); //set luck to 0 to remove randomness
        
        int stat = onix.generateRandomStat();
        assertTrue("Generate Random stat is incorrect", (stat >= 7 && stat <= 12));
        assertTrue("Geodude uses potion when it has one", onix.useHitPotion());
        assertFalse("Geodude doesn't use potion when it has none", onix.useHitPotion());
        assertEquals("attack hits for correct amount", onix.getAttack(), onix.useAttack());
        
        onix.setLuck(100); //set luck to 100 to remove randomness
        assertEquals("attack hits for correct amount when critical", (int) (onix.getAttack() * 1.5), onix.useAttack());
    }
    
    @Test
    public void onixTest() {
        Boss onix = new Onix();
        onix.setLuck(0); //set luck to 0 to remove randomness
        
        onix.setMana(0);
        assertEquals("Onix fails special att w/ 0 mana", -1, onix.useSpecialAttack());
        onix.setMana(10);
        assertEquals("Onix uses special att w/ mana", (int) Math.floor(onix.useAttack() * 1.4), onix.useSpecialAttack());
        onix.setHealth(1);
        assertEquals("Onix uses potion when necessary", 0, onix.takeTurn());
    }
    
    @Test
    public void raichuTest() {
        Boss raichu = new Raichu();
        raichu.setLuck(0); //set luck to 0 to remove randomness
        
        raichu.setMana(0);
        assertEquals("Raichu fails special att w/ 0 mana", -1, raichu.useSpecialAttack());
        raichu.setMana(10);
        assertEquals("Raichu uses special att w/ mana", (int) Math.floor(raichu.useAttack() * 1.4), raichu.useSpecialAttack());
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
        assertEquals("Alakazam uses special att w/ mana", (int) Math.ceil(alakazam.useAttack() * 1.6), alakazam.useSpecialAttack());
        alakazam.setHealth(1);
        assertEquals("Alakazam uses potion when necessary", 0, alakazam.takeTurn());
    }
    
    @Test
    public void arcanineTest() {
        Boss arcanine = new Arcanine();
        arcanine.setLuck(0); //set luck to 0 to remove randomness
        
        arcanine.setMana(0);
        assertEquals("Arcanine fails special att w/ 0 mana", -1, arcanine.useSpecialAttack());
        arcanine.setMana(10);
        assertEquals("Arcanine uses special att w/ mana", (int) Math.floor(arcanine.useAttack() * 1.4), arcanine.useSpecialAttack());
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
        assertEquals("Nidoking uses special att w/ mana", (int) Math.floor(nidoking.useAttack() * 2), nidoking.useSpecialAttack());
        nidoking.setHealth(1);
        assertEquals("Nidoking uses potion when necessary", 0, nidoking.takeTurn());
    }
}