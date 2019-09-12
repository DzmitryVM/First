package lection_OOP;

public class Mage extends Hero {
    private String name = "Mage";
    private String type;
    private int numHealthPotions;
    private int healthPotionHealAmount;
    private int healthPotionDropChance;

    public Mage (){
        super(100,30);
        numHealthPotions=3;
        healthPotionHealAmount=30;
        type = name;
    }

    public Mage (String name) {
        super();
    }

    public void applyPotion(){
        health+=healthPotionHealAmount;
        numHealthPotions--;
    }

    public void pickUpHealthPotion(){
        numHealthPotions++;
    }

    public int getNumHealthPotions (){
    return numHealthPotions;
    }

    public int getHealthPotionHealAmount(){
        return healthPotionHealAmount;
    }

    @Override
    public void display(){}

    public int getHealth(){
        return health;
    }

    public String getName() {
        return type;
    }
}
