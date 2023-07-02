package com.abstractfactoryWithPrototype.aws;


import com.abstractfactoryWithPrototype.Instance;
import com.abstractfactoryWithPrototype.Storage;

// Represents a concrete instance in a family "Amazon Web services"
public class Ec2Instance extends Instance {

    public Ec2Instance(Instance.Capacity capacity) {
        // Map capacity to ec2 instance types. Use aws API to provision
        System.out.println("Created Ec2Instance");
    }

    @Override
    public void start() {
        System.out.println("Ec2Instance started");
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println("Attached " + storage + " to Ec2Instance");
    }

    @Override
    public void stop() {
        System.out.println("Ec2Instance stopped");
    }

    @Override
    public void reset() {
        System.out.println("Ec2Instance reset to be reused");
    }

    @Override
    public String toString() {
        return "EC2Instance";
    }
}
