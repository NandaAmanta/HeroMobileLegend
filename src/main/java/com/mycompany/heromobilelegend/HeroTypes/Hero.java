/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.heromobilelegend.HeroTypes;

/**
 *
 * @author I Putu Nanda Amanta
 */
abstract public class Hero {

    private String name;
    private int maxHp;
    private int hp;
    private int level;
    private int pointDefense;
    private int pointAttack;

    public Hero(String name, int maxHp, int pointDefense, int pointAttack) {
        this.name = name;
        this.maxHp = maxHp;
        this.hp = maxHp;
        this.level = 1;
        this.pointDefense = pointDefense;
        this.pointAttack = pointAttack;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getPointDefense() {
        return pointDefense;
    }

    public void setPointDefense(int pointDefense) {
        this.pointDefense = pointDefense;
    }

    public int getPointAttack() {
        return pointAttack;
    }

    public void setPointAttack(int pointAttack) {
        this.pointAttack = pointAttack;
    }

    /**
     * Attacking the enemy
     *
     * @param enemy
     */
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

        System.out.println(this.name + " menyerang " + enemy.getName());
        int enemyCurrentHp = enemy.getHp() - (this.pointAttack - enemy.getPointDefense());
        if (enemyCurrentHp < 0) {
            enemyCurrentHp = 0;
            System.out.println(enemy.getName() + " telah mati");
            this.level++;
        } else {
            System.out.println("Sisa HP " + enemy.getName() + " adalah " + enemyCurrentHp);
        }
        enemy.setHp(enemyCurrentHp);
    }

    /**
     * Restore Hero's Hp
     */
    public void restoreHp() {
        if (this.getHp() <= 0) {
            System.out.println(this.getName() + " sudah mati, tidak bisa melakukan aksi.");
            return;
        }
        int newHp = this.getHp() + 15;
        if (newHp >= this.getMaxHp()) {
            newHp = this.getMaxHp();
        }
        this.setHp(newHp);

        System.out.println("Hp " + this.getName() + " : " + this.getHp() + "/" + this.getMaxHp());
    }

}
