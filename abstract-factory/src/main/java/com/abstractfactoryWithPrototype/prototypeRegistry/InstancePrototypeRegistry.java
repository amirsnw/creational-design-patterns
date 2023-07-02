package com.abstractfactoryWithPrototype.prototypeRegistry;

import com.abstractfactoryWithPrototype.Instance;

import java.util.HashMap;
import java.util.Map;

public class InstancePrototypeRegistry {
    private static Map<String, Instance> prototypes = new HashMap<>();

    public static void addPrototype(String key, Instance prototype) {
        prototypes.put(key, prototype);
    }

    public static Instance getPrototype(String key) {
        Instance prototype = prototypes.get(key);
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
