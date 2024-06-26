package org.niranjan.creational.singleton;
/*
	better to use this implementation for a project
 */
public class SingletonThreadSafe {
	private static SingletonThreadSafe instance;

	private SingletonThreadSafe(){}

	public static SingletonThreadSafe getInstance(){
		synchronized (SingletonThreadSafe.class){
			if(instance == null){
				instance = new SingletonThreadSafe();
			}
		}
		return instance;
	}
}
