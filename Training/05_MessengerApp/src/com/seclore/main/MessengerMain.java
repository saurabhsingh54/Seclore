package com.seclore.main;

import java.util.Scanner;

import com.seclore.application.MessengerApp;
import com.seclore.factory.MessageFactory;
import com.seclore.pojo.MessengerType;



public class MessengerMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		MessengerType messageObject = null;
		MessengerApp messengerApp = null;
		MessageFactory factory = new MessageFactory();
		
		int messageChoice;
		String to, body;
		System.out.println("Welcome to Messager App.");
		System.out.println("Enter the Address to send : ");
		to = scanner.next();
		scanner.nextLine();
		System.out.println("Enter the body of message : ");
		body = scanner.nextLine();
		
		System.out.println("***************MENU*****************");
		System.out.println(" 1. SMS message \n 2. Email \n 3. Courrier \n 4. Voice Message\n \nEnter Your Choice");
		messageChoice = scanner.nextInt();
		
		messageObject = factory.createMassage(messageChoice);
		messengerApp = new MessengerApp(messageObject);
		messengerApp.send(to, body);
		scanner.close();
	}

}
