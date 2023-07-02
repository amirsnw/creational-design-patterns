package com.abstractfactoryWithPrototype.aws;

import com.abstractfactoryWithPrototype.Instance;
import com.abstractfactoryWithPrototype.ResourceFactory;
import com.abstractfactoryWithPrototype.Storage;
import com.abstractfactoryWithPrototype.prototypeRegistry.InstancePrototypeRegistry;
import com.abstractfactoryWithPrototype.prototypeRegistry.StoragePrototypeRegistry;

// Factory implementation for AWS platform resources
public class AwsResourceFactory implements ResourceFactory {

	@Override
	public Instance createInstance(Instance.Capacity capacity) {
		return InstancePrototypeRegistry.getPrototype("aws");
	}

	@Override
	public Storage createStorage(int capMib) {
		return StoragePrototypeRegistry.getPrototype("aws");
	}


}
