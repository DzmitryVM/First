package lection_OOP;

public class Archer extends Hero{
    private String name = "Archer";
    private String type;
    private int numHealthPotions;
    private int healthPotionHealAmount;
    private int healthPotionDropChance;

    public Archer (){
        super(100,50);
        numHealthPotions=3;
        healthPotionHealAmount=30;
        type = name;
    }

    public Archer (String name) {
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

    public String getName(String name) {
        return name;
    }
}
