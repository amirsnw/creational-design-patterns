package com.abstractfactory.gcp;

import com.abstractfactory.Instance;
import com.abstractfactory.Instance.Capacity;
import com.abstractfactory.ResourceFactory;
import com.abstractfactory.Storage;

// Factory implementation for Google cloud platform resources
public class GoogleResourceFactory implements ResourceFactory {

	@Override
	public Instance createInstance(Capacity capacity) {
		return new GoogleComputeEngineInstance(capacity);
	}

	@Override
	public Storage createStorage(int capMib) {
		return new GoogleCloudStorage(capMib);
	}
	

}
