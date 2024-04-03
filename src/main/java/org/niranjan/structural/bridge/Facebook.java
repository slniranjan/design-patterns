package org.niranjan.structural.bridge;

public class Facebook implements App{

	private PhoneOs os;

	public Facebook(PhoneOs os){
		this.os = os;
	}

	@Override
	public void runApp() {
		System.out.println();
		os.upload("Facebook data upload");
		os.download("facebook.com");
		os.display("Facebook data");
		System.out.println();
	}
}
