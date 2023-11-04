/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.heromobilelegend.HeroTypes;

/**
 *
 * @author ASUS ROG
 */
public class Mage extends Hero {

    private int mana;
    private int maxMana;

    public Mage(String name, int maxHp, int pointDefense, int pointAttack, int maxMana) {
        super(name, maxHp, pointDefense, pointAttack, maxMana);
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getMaxMana() {
        return maxMana;
    }

    public void setMaxMana(int maxMana) {
        this.maxMana = maxMana;
    }

    @Override
    public void attack(Hero enemy) {

        //validate enemy HP
        if (enemy.getHp() <= 0) {
            System.out.println(enemy.getName() + " telah mati");
            return;
        }

        // check mana
        if (this.getMana() < 10) {
            System.out.println("Jumlah mana " + this.getName() + " tidak cukup : " + this.getMana());
            return;
        }

        System.out.println(this.getName() + " menyerang dengan sihir ke " + enemy.getName());

        // Get enemy Hp after get damage;
        int enemyCurrentHp = enemy.getHp() - (this.getPointAttack() + (10 * this.getLevel()));
        
        // if enemyCurrentHp is lower or equal 0, it is died
        if (enemyCurrentHp <= 0) {
            enemyCurrentHp = 0;
            System.out.println(enemy.getName() + " telah mati");
            this.setLevel(this.getLevel() + 1);
        } else {
            System.out.println("Sisa HP " + enemy.getName() + " adalah " + enemyCurrentHp);
        }
        
        // mana cost
        this.mana -= 10;
        
        // set enemy hp
        enemy.setHp(enemyCurrentHp);
    }

    public void restoreMana() {
        int newMana = this.getMana() + 5;
        if (newMana >= this.getMaxMana()) {
            newMana = this.getMaxMana();
        }
        this.setMana(newMana);
        System.out.println("Mana " + this.getName() + " : " + this.getMana() + "/" + this.getMaxMana());
    }
}
