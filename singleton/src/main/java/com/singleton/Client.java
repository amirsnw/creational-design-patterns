package com.singleton;

public class Client {

	public static void main(String[] args) {
		// EagerRegistry eagerRegistry = new EagerRegistry(); // Doesn't complie
		EagerRegistry eagerRegistry = EagerRegistry.getInstance();
		EagerRegistry eagerRegistry2 = EagerRegistry.getInstance();
		System.out.println("Two eager registries are the same: "
				+ (eagerRegistry == eagerRegistry2)); // The same object

		LazyRegistryDCL lazySingletonDCL;
		LazyRegistryDCL lazySingletonDCL2;

		// ...

		lazySingletonDCL = LazyRegistryDCL.getInstance();
		lazySingletonDCL2 = LazyRegistryDCL.getInstance();
		System.out.println("Two lazy DCL registries are the same: "
				+ (lazySingletonDCL == lazySingletonDCL2)); // The same object


		LazyRegistryIODH lazySingletonIODH;
		LazyRegistryIODH lazySingletonIODH2;

		lazySingletonIODH = LazyRegistryIODH.getInstance();
		lazySingletonIODH2 = LazyRegistryIODH.getInstance();
		System.out.println("Two lazy IODH registries are the same: "
				+ (lazySingletonIODH == lazySingletonIODH2)); // The same object
	}

}
