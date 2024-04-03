package org.niranjan.creational.builder;

import org.niranjan.creational.builder.Apartment;
import org.niranjan.creational.builder.ApartmentBuilder;

public class Client {
	public static void main(String[] args) {
		ApartmentBuilder builder = new ApartmentBuilder();
		Apartment apartment1 = builder
				.setSqm(25)
				.setRooms(2)
				.setCity("London")
				.setArea("Kensington")
				.setKitchen(true)
				.build();

		apartment1.display();

		Apartment ap2 = builder.setRooms(3).setCity("Paris").build();
		ap2.display();
	}

}
