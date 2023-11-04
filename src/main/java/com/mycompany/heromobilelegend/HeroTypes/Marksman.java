/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.heromobilelegend.HeroTypes;

/**
 *
 * @author ASUS ROG
 */
public class Marksman extends Hero {

    public Marksman(String name, int maxHp, int pointDefense, int pointAttack) {
        super(name, maxHp, pointDefense, pointAttack);
    }

    public void attack(Hero enemy) {
        if (this.getHp() <= 0) {
            System.out.println(this.getName() + " sudah mati, tidak bisa melakukan aksi.");
            return;
        }
        
        //validate enemy HP
        if (enemy.getHp() <= 0) {
            System.out.println(enemy.getName() + " telah mati");
            return;
        }

        System.out.println(this.getHp() + " Menembak " + enemy.getName());

        // Get Enemy Hp after get damage
        int enemyCurrentHp = enemy.getHp() - (this.getPointAttack() - enemy.getPointDefense() + (10 * this.getLevel()));

        // if enemyCurrentHp is lower or equal 0 , it is died
        if (enemyCurrentHp <= 0) {
            enemyCurrentHp = 0;
            System.out.println(enemy.getName() + " telah mati");
            this.setLevel(this.getLevel() + 1);
        } else {
            System.out.println("Sisa HP " + enemy.getName() + " adalah " + enemyCurrentHp);
        }

        // set enemy current HP
        enemy.setHp(enemyCurrentHp);
    }
}
