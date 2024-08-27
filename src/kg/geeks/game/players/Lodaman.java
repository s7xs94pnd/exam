package kg.geeks.game.players;

import kg.geeks.game.logic.RPG_Game;

import java.util.Random;

public class Lodaman extends Hero{

    public Lodaman(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.LODIK);
    }


    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int fstBone=RPG_Game.random.nextInt(6)+1;
        int secBone=RPG_Game.random.nextInt(6)+1;
     if (fstBone==secBone){
         boss.setHealth(boss.getHealth()-(fstBone*secBone));
         System.out.println("-----------------LODAMAN------------------ boss get damage ");
     }
     else {
         int randomMate=RPG_Game.random.nextInt(heroes.length);
         heroes[randomMate].setHealth(getDamage()-(secBone*fstBone));
         System.out.println("----------------------------------"+heroes[randomMate].getName()+" GEt damdge from lodaman "+(fstBone*secBone)+" points---------------------------------");
             }
         }

     }



