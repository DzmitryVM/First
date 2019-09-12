package lection_OOP;

public class Enemy extends Hero implements Mortal{
    private String name = "Evil";
    private String type;

    public Enemy(){
        super(50,10);
        type=name;
    }

    public Enemy (int health, int attackDamage) {
        super(health, attackDamage);
    }

    @Override
    public void display() { }

    public String getType(){
        return type;
    }

    @Override
    public boolean isAlive () {
        return health > 0;
    }

}
