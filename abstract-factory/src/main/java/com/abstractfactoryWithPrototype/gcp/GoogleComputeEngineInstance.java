package com.abstractfactoryWithPrototype.gcp;


import com.abstractfactoryWithPrototype.Instance;
import com.abstractfactoryWithPrototype.Storage;

// Represents a concrete instance in a family "Google Cloud Platform"
public class GoogleComputeEngineInstance extends Instance {

    public GoogleComputeEngineInstance(Capacity capacity) {
        // Map capacity to GCP compute instance types. Use GCP API to provision
        System.out.println("Created Google Compute Engine instance");
    }

    @Override
    public void start() {
        System.out.println("Compute engine instance started");
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println("Attached " + storage + " to Compute engine instance");
    }

    @Override
    public void stop() {
        System.out.println("Compute engine instance stopped");
    }

    @Override
    public void reset() {
        System.out.println("GoogleComputeEngineInstance reset to be reused");
    }

    @Override
    public String toString() {
        return "GoogleComputeEngineInstance";
    }
}
