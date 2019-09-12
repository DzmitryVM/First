package lection_OOP;

import java.util.Random;
import java.util.Scanner;

public abstract class Hero {

    Random rand;
    int attackDamage;
    int health;

    public Hero(){}

    public Hero(int health, int attackDamage) {
        rand=new Random();
        this.health=health;
        this.attackDamage=attackDamage;
    }

    public void takeDamage (int damage) {
        health-=damage;
    }

    public int getDamage(){
        return attackDamage;
    }

    private String name;
    public Hero(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public int getHealth(){
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public  abstract void display();

    public int attackEnemy(){return attackDamage;}
}
