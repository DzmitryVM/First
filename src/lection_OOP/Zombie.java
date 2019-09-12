package lection_OOP;

public class Zombie extends Enemy {

    private String name =  "Zombie";
    private String type2;
    private int health;
    private int attackDamage;


    public Zombie(){

        super(100,15);
        type2 = name;
    }

    public String getType(){
        return type2;
    }

    @Override
    public String getName() {
        return name;
    }
}