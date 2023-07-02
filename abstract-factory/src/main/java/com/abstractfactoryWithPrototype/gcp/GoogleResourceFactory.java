package com.abstractfactoryWithPrototype.gcp;


import com.abstractfactoryWithPrototype.Instance;
import com.abstractfactoryWithPrototype.ResourceFactory;
import com.abstractfactoryWithPrototype.Storage;
import com.abstractfactoryWithPrototype.prototypeRegistry.InstancePrototypeRegistry;
import com.abstractfactoryWithPrototype.prototypeRegistry.StoragePrototypeRegistry;

// Factory implementation for Google cloud platform resources
public class GoogleResourceFactory implements ResourceFactory {

	@Override
	public Instance createInstance(Instance.Capacity capacity) {
		return InstancePrototypeRegistry.getPrototype("gcp");
	}

	@Override
	public Storage createStorage(int capMib) {
		return StoragePrototypeRegistry.getPrototype("gcp");
	}
	

}
