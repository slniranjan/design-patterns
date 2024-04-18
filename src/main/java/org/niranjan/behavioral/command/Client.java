package org.niranjan.behavioral.command;

public class Client {
	public static void main(String[] args) {
		CommandProcessor processor = new CommandProcessor();
		processor
				.addCommand(new OrderAddCommand(1, 12.99))
				.addCommand(new OrderAddCommand(2, 15.99))
				.addCommand(new OrderExecuteCommand(1))
				.addCommand(new OrderExecuteCommand(2))
				.processCommands();
	}
}
