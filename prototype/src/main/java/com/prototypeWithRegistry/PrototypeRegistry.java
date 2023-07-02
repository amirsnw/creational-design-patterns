package com.prototypeWithRegistry;

import com.prototype.GameUnit;

import java.util.HashMap;
import java.util.Map;

public class PrototypeRegistry {
    private static Map<String, GameUnit> prototypes = new HashMap<>();

    public static void addPrototype(String key, GameUnit prototype) {
        prototypes.put(key, prototype);
    }

    public static GameUnit getPrototype(String key) throws CloneNotSupportedException {
        GameUnit prototype = prototypes.get(key);
        if (prototype == null) {
            throw new IllegalArgumentException("Invalid prototype key: " + key);
        }
        return prototype.clone();
    }
}
