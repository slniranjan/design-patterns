package org.niranjan.creational.singleton;

public class SingletonLazyTest {
	public static void main(String[] args) {
		SingletonLazy inst1 = SingletonLazy.getInstance();
		SingletonLazy inst2 = SingletonLazy.getInstance();

		System.out.println(inst1);
		System.out.println(inst2);
	}
}
