package lection_OOP;

public class TrainingGround {
     public static void main(String[] args) {

         Warrior bobWarrior = new Warrior("Bob");
         bobWarrior.attackEnemy();

         Mage starMage = new Mage("Star");
         starMage.attackEnemy();

         Archer robinHoodArcher = new Archer("Robin Hood");
         robinHoodArcher.attackEnemy();
     }
 }
