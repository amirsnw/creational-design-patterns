package com.abstractfactoryWithPrototype;

// Represents a prototype product
public abstract class Storage implements Cloneable {

    public abstract String getId();

    public abstract void reset();

    @Override
    public Storage clone() throws CloneNotSupportedException {
        Storage storage = (Storage) super.clone();
        storage.reset();
        return storage;
    }
}
