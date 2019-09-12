package lection_OOP;

import java.util.Random;
import java.util.Scanner;

public class BattleGround {
    Random rand;
    Scanner in;

    private int healthPotionDropChance;
    boolean playing;

    public static void main(String[] args) {
        BattleGround game = new BattleGround();
        game.begin();
        System.out.println("Game over");
    }

    public BattleGround() {
        in = new Scanner(System.in);
        rand = new Random();
        System.out.println("\nLet's begin!");
        healthPotionDropChance = 50;
    }

    public void begin(){
        playing=true;
        while (playing){                                              // запускаем игру
            System.out.println("Go!");
            Mage player = new Mage();
            Enemy enemy = new Enemy();                                // создаем участников
            Zombie zombie = new Zombie();
            String playerName = player.getName();
            String enemyType = enemy.getType();
            String enemyType2 = zombie.getType();
            System.out.println("\t" + playerName + " is here.");
            System.out.println("\t" + enemyType + " is here.");
            System.out.println("\t" + enemyType2 + " is here.\n");

            while (enemy.getHealth()>0&&zombie.getHealth()>0) {       // выводим кол-во здоровья
                System.out.println("\t" + playerName + " health: " + player.getHealth());
                System.out.println("\t" + enemyType + " health: " + enemy.getHealth());
                System.out.println("\t" + enemyType2 + " health: " + zombie.getHealth());
                // начинаем атаки
                int damageTaken = enemy.attackEnemy();
                int damageTaken2 = zombie.attackEnemy();
                int damageProduced = player.attackEnemy();
                enemy.takeDamage(damageProduced);
                zombie.takeDamage(damageProduced);
                player.takeDamage(damageTaken);
                player.takeDamage(damageTaken2);
                // сообщаем о причиненном уроне
                System.out.println("\t> Hero strike the " + enemyType + " for " + damageProduced + " damage.");
                System.out.println("\t> Hero strike the " + enemyType2 + " for " + damageProduced + " damage.");
                System.out.println("\t> Hero receive " + (damageTaken + damageTaken2));

                if (player.getHealth()<1){
                    System.out.println(">t Game over for hero");
                    break;
                }
            }

            if (player.getHealth()<1){
                System.out.println("Hero too weak.");
                break;
            }

            System.out.println("");
            System.out.println(enemyType + " was defeated.");
            System.out.println(enemyType2 + " was defeated.");
            System.out.println("Hero have " + player.getHealth() + " health left.");

            if (rand.nextInt(100)<healthPotionDropChance) {
                player.pickUpHealthPotion();
                System.out.println("The " + enemyType + " dropped a health potion.");
                System.out.println("Hero now have " + player.getNumHealthPotions() + " health potions.");
            }
            break;
        }
    }
}
