package org.niranjan.structural.bridge;

public class Instagram implements App {
	PhoneOs os;

	public Instagram(PhoneOs os) {
		this.os = os;
	}

	@Override
	public void runApp() {
		System.out.println();
		os.display("cached data");
		os.upload("instagram.com");
		os.display("instagram data");
		os.display("fresh data");
		System.out.println();
	}
}
