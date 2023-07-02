package com.abstractfactoryWithPrototype.gcp;


import com.abstractfactoryWithPrototype.Storage;

// Represents a concrete storage in a family "Google Cloud Platform"
public class GoogleCloudStorage extends Storage {

    public GoogleCloudStorage(int capacityInMib) {
        //Use gcp api
        System.out.println("Allocated " + capacityInMib + " on Google Cloud Storage");
    }

    @Override
    public String getId() {
        return "gcpcs1";
    }

    @Override
    public void reset() {
        System.out.println("GoogleCloudStorage reset to be reused");
    }

    @Override
    public String toString() {
        return "Google cloud storage";
    }
}
