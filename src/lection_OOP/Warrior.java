package lection_OOP;

public class Warrior extends Hero {
    private String name = "Warrior";
    private String type;
    private int numHealthPotions;
    private int healthPotionHealAmount;
    private int healthPotionDropChance;

    public Warrior (){
        super(100,50);
        numHealthPotions=3;
        healthPotionHealAmount=30;
        type=name;
    }

    public Warrior(String name) {
        super(name);
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
