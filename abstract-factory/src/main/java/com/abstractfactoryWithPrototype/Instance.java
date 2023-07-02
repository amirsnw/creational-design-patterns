package com.abstractfactoryWithPrototype;

// Represents a prototype product
public abstract class Instance implements Cloneable {

    public enum Capacity{micro, small, large}

    public abstract void start();

    public abstract void attachStorage(Storage storage);

    public abstract void stop();

    public abstract void reset();

    @Override
    public Instance clone() throws CloneNotSupportedException {
        Instance instance = (Instance) super.clone();
        instance.reset();
        return instance;
    }
}
