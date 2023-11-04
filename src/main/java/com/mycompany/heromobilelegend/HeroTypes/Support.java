package com.mycompany.heromobilelegend.HeroTypes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author I Putu Nanda Amanta
 */
public class Support extends Hero {

    public Support(String name, int maxHp, int pointDefense, int pointAttack) {
        super(name, maxHp, pointDefense, pointAttack);
    }

    /**
     * Revive Hero
     *
     * @param hero
     */
    public void revive(Hero hero) {
        if (this.getHp() <= 0) {
            System.out.println(this.getName() + " sudah mati, tidak bisa melakukan aksi.");
            return;
        }
        
        if (hero.getHp() > 0) {
            System.out.println(this.getName() + "tidak bisa membangkitkan " + hero.getName() + ", karena masih hidup");
            return;
        }
        hero.setHp(hero.getMaxHp() / 2);
        System.out.println(hero.getName() + " berhasil dibangkitkan oleh " + this.getName());
    }

}
