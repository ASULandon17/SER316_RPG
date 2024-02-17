package equipment;

import java.util.ArrayList;
import java.util.List;

public class RandomItemGenerator {
    
    //Likelihood out of 100 that item will be chose
    private final static int TIER_FOUR_CHANCE = 2;
    private final static int TIER_THREE_CHANCE = 10;
    private final static int TIER_TWO_CHANCE = 20;
    
    //Lists of items of each tier
    List<Equipment> tierOneItems = new ArrayList<>();
    List<Equipment> tierTwoItems = new ArrayList<>();
    List<Equipment> tierThreeItems = new ArrayList<>();
    List<Equipment> tierFourItems = new ArrayList<>();
    
    /*
     * populates lists with their respective items
     */
    public RandomItemGenerator() {
        addTierOneItems();
        addTierTwoItems();
        addTierThreeItems();
        addTierFourItems();
    }
    
    /*
     * statically returns a random item.
     */
    public static Equipment getItem() {
        Equipment item = new RandomItemGenerator().generateRandomItem();
        return item;
    }
    
    /*
     * generates an item based on the likelihood of being chosen
     */
    public Equipment generateRandomItem() {
        if ((int) ((Math.random() * (100 - 1)) + 1) <= TIER_FOUR_CHANCE) {
            return tierFourItems.get((int) (Math.floor(Math.random() * tierFourItems.size())));
        } else if ((int) ((Math.random() * (100 - 1)) + 1) <= TIER_THREE_CHANCE) {
            return tierThreeItems.get((int) (Math.floor(Math.random() * tierThreeItems.size())));
        } else if ((int) ((Math.random() * (100 - 1)) + 1) <= TIER_TWO_CHANCE) {
            return tierTwoItems.get((int) (Math.floor(Math.random() * tierTwoItems.size())));
        } else {
            return tierOneItems.get((int) (Math.floor(Math.random() * tierOneItems.size())));
        }
    }
    
    /*
     * Adds correct items to the tier one list
     */
    private void addTierOneItems() {
        tierOneItems.add(new IronDagger());
        tierOneItems.add(new BuckleShield());
        tierOneItems.add(new BronzeChestplate());
        tierOneItems.add(new FleetFootCharm());
    }
    
    /*
     * Adds correct items to the tier two list
     */
    private void addTierTwoItems() {
        tierTwoItems.add(new PolishedSilverBlade());
        tierTwoItems.add(new ReinforcedKiteshield());
        tierTwoItems.add(new SteelChainmail());
        tierTwoItems.add(new HermesLuckyTalisman());
    }
    
    /*
     * Adds correct items to the tier three list
     */
    private void addTierThreeItems() {
        tierThreeItems.add(new LegendaryGildedBroadsword());
        tierThreeItems.add(new HalgrothsImpenetrableWall());
        tierThreeItems.add(new SkinOfTheGods());
        tierThreeItems.add(new BruiserGloves());
    }
    
    /*
     * Adds correct items to the tier four list
     */
    private void addTierFourItems() {
        tierFourItems.add(new TheOneRing());
    }
}