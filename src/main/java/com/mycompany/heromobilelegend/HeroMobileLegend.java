/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.heromobilelegend;

import com.mycompany.heromobilelegend.HeroTypes.Mage;
import com.mycompany.heromobilelegend.HeroTypes.Marksman;

/**
 *
 * @author I Putu Nanda Amanta
 */
public class HeroMobileLegend {

    public static void main(String[] args) {
        Marksman layla = new Marksman("Layla", 1000, 10, 150);
        Mage eudora = new Mage("eudora", 750, 5, 300, 50);
        
        layla.attack(eudora);
        layla.attack(eudora);
        layla.attack(eudora);
        layla.attack(eudora);
        layla.attack(eudora);
    }
}
