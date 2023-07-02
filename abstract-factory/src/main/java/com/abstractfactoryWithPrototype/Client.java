package com.abstractfactoryWithPrototype;

import com.abstractfactoryWithPrototype.aws.AwsResourceFactory;
import com.abstractfactoryWithPrototype.aws.Ec2Instance;
import com.abstractfactoryWithPrototype.aws.S3Storage;
import com.abstractfactoryWithPrototype.gcp.GoogleCloudStorage;
import com.abstractfactoryWithPrototype.gcp.GoogleComputeEngineInstance;
import com.abstractfactoryWithPrototype.gcp.GoogleResourceFactory;
import com.abstractfactoryWithPrototype.prototypeRegistry.InstancePrototypeRegistry;
import com.abstractfactoryWithPrototype.prototypeRegistry.StoragePrototypeRegistry;

public class Client {

	static {
		InstancePrototypeRegistry.addPrototype("aws", new Ec2Instance(Instance.Capacity.micro));
		InstancePrototypeRegistry.addPrototype("gcp", new GoogleComputeEngineInstance(Instance.Capacity.micro));
		StoragePrototypeRegistry.addPrototype("aws", new S3Storage(20480));
		StoragePrototypeRegistry.addPrototype("gcp", new GoogleCloudStorage(20480));
		System.out.println("***************************************");
	}

	private ResourceFactory factory;
	
	public Client(ResourceFactory factory) {
		this.factory = factory;
	}
	
	public Instance createServer(Instance.Capacity cap, int storageMib) {
		Instance instance = factory.createInstance(cap);
		Storage storage = factory.createStorage(storageMib);
		instance.attachStorage(storage);
		return instance;
	}
	
    public static void main(String[] args) {
    	Client aws = new Client(new AwsResourceFactory());
    	Instance i1 = aws.createServer(Instance.Capacity.micro, 20480);
    	i1.start();
    	i1.stop();
    	
    	System.out.println("***************************************");
    	Client gcp = new Client(new GoogleResourceFactory());
    	i1 = gcp.createServer(Instance.Capacity.micro, 20480);
    	i1.start();
    	i1.stop();
    }
}
