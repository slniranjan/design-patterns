package org.niranjan.creational.singleton;

public class SingletonStaticBlockTest {
	public static void main(String[] args) {
		SingletonStaticBlock inst1 = SingletonStaticBlock.getInstance();
		SingletonStaticBlock inst2 = SingletonStaticBlock.getInstance();

		System.out.println(inst1);
		System.out.println(inst2);
	}
}
