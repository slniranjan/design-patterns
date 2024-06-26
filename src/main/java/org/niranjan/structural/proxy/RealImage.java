package org.niranjan.structural.proxy;

/**
 * imagine this class is a third party library
 */
public class RealImage implements Image{
	private String filename;

	public RealImage(String filename) {
		System.out.println("Real image: loading file " + filename);
		this.filename = filename;
	}

	@Override
	public void display() {
		System.out.println("Real image: displaying image " + filename);
	}
}
