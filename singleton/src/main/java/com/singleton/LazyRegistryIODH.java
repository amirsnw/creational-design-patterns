package com.singleton;

/**
 * Singleton pattern using lazy initialization holder class. This ensures that, we have a lazy initialization
 * without worrying about synchronization.
 */
public class LazyRegistryIODH {

	private LazyRegistryIODH() {
		System.out.println("LazyRegistryIODH singleton object initialized");
	}
	
	private static class RegistryHolder {
		static LazyRegistryIODH INSTANACE = new LazyRegistryIODH();
	}
	
	public static LazyRegistryIODH getInstance() {
		return RegistryHolder.INSTANACE;
	}
}