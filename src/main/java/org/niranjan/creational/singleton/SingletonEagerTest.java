package org.niranjan.creational.singleton;

public class SingletonEagerTest {
	public static void main(String[] args) {
		SingletonEager inst1 = SingletonEager.getEagerInstance();
		SingletonEager inst2 = SingletonEager.getEagerInstance();

		System.out.println(inst1);
		System.out.println(inst2);
	}
}
