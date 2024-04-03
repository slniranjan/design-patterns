package org.niranjan.creational.singleton;

public class SingletonThreadSafeTest {
	public static void main(String[] args) {
		SingletonThreadSafe inst1 = SingletonThreadSafe.getInstance();
		SingletonThreadSafe inst2 = SingletonThreadSafe.getInstance();

		System.out.println(inst1);
		System.out.println(inst2);
	}
}
