package com.prototype.client;

import com.prototype.General;
import com.prototype.Particleman;
import com.prototype.PrototypeRegistry;
import com.prototype.Swordsman;
import javafx.geometry.Point3D;

public class RegistryClient {

    static {
        registerPrototypes();
    }

    public static void main(String[] args) throws CloneNotSupportedException {

        Swordsman swordsman = new Swordsman();
        swordsman.move(new Point3D(-10, 0, 0), 20);
        swordsman.attack();

        System.out.println(swordsman);
        Swordsman clonedSwordsman = (Swordsman) PrototypeRegistry.getPrototype("swordsman");
        System.out.println("Cloned swordsman" + clonedSwordsman);

        Particleman particleman = (Particleman) PrototypeRegistry.getPrototype("particleman");
        System.out.println(particleman);
    }

    private static void registerPrototypes() {
        PrototypeRegistry.addPrototype("swordsman", new Swordsman());
        PrototypeRegistry.addPrototype("particleman", new Particleman());
    }
}
