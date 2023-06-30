package com.prototype.client;


import com.prototype.General;
import com.prototype.Swordsman;
import javafx.geometry.Point3D;

public class RegularClient {

    public static void main(String[] args) throws CloneNotSupportedException {

        Swordsman swordsman = new Swordsman();
        swordsman.move(new Point3D(-10, 0, 0), 20);
        swordsman.attack();

        System.out.println(swordsman);
        Swordsman clonedSwordsman = (Swordsman) swordsman.clone();
        System.out.println("Cloned swordsman" + clonedSwordsman);

        General general = new General();
        general.move(new Point3D(5, 5, 5), 10);
        general.boostMorale();

        System.out.println(general);

        try {
            general.clone();
        } catch (CloneNotSupportedException e) {
            general = new General();
        }
        System.out.println(general);
    }
}
