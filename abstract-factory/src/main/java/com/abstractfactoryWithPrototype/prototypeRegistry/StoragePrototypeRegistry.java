package com.abstractfactoryWithPrototype.prototypeRegistry;

import com.abstractfactoryWithPrototype.Storage;

import java.util.HashMap;
import java.util.Map;
public class StoragePrototypeRegistry {
    private static Map<String, Storage> prototypes = new HashMap<>();

    public static void addPrototype(String key, Storage prototype) {
        prototypes.put(key, prototype);
    }

    public static Storage getPrototype(String key) {
        Storage prototype = prototypes.get(key);
        if (prototype == null) {
            throw new IllegalArgumentException("Invalid prototype key: " + key);
        }
        try {
            return prototype.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
