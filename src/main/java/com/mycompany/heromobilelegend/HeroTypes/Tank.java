/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.heromobilelegend.HeroTypes;

/**
 *
 * @author I Putu Nanda Amanta
 */
public class Tank extends Hero {
    
    public Tank(String name, int maxHp, int pointDefense, int pointAttack) {
        super(name, maxHp, pointDefense, pointAttack);
    }

    @Override
    public void restoreHp() {
        int newHp = this.getHp() + 25;
        if (newHp >= this.getMaxHp()) {
            newHp = this.getMaxHp();
        }
        this.setHp(newHp);
        System.out.println("Hp " + this.getName() + " : " + this.getHp() + "/" + this.getMaxHp());
    }

}
