package org.niranjan.creational.singleton;
/*
	for legacy java code. no need for modern versions
 */
public class SingletonBillPugh {
	private SingletonBillPugh() {

	}

	private static class InnerStaticClass {
		private static final SingletonBillPugh billPughInstance = new SingletonBillPugh();
	}

	public static SingletonBillPugh getInstance() {
		return InnerStaticClass.billPughInstance;
	}
}
