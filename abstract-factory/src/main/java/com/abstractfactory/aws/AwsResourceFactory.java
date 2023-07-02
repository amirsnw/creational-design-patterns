package com.abstractfactory.aws;

import com.abstractfactory.Instance;
import com.abstractfactory.Instance.Capacity;
import com.abstractfactory.ResourceFactory;
import com.abstractfactory.Storage;
// Factory implementation for AWS platform resources
public class AwsResourceFactory implements ResourceFactory {

	@Override
	public Instance createInstance(Capacity capacity) {
		return new Ec2Instance(capacity);
	}

	@Override
	public Storage createStorage(int capMib) {
		return new S3Storage(capMib);
	}


}
