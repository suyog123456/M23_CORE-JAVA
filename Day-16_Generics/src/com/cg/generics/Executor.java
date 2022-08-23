package com.cg.generics;

public class Executor {

	public static void main(String[] args) {
		//create a sender to send a string message
		Sender<String> obj=new Sender<>();
		obj.setMessage("GENERIC CLASS DEMO");
		obj.sendMessage();
		
		//create an email object to be send using sender
		Email em=new Email();
		em.setFrom("sandeshmerkhed@gmail.com");
		em.setTo("sandeshmerkhed26@gmail.com");
		em.setSubject("JAVA FULL STACK");
		em.setBody("ABOUT TRAINING AND PLACEMENT");
		System.out.println(em.getBody());
		
		//create a sender to send this mail
		Sender<Email> obj1=new Sender<>();
		obj1.setMessage(em);
		obj1.sendMessage();

	}

}