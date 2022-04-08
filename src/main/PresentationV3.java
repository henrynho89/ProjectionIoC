package main;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import metier.IMetier;

public class PresentationV3 {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("file:config.xml");
		IMetier metier = ctx.getBean("metier",IMetier.class);
		System.out.println(metier.getCalcul());
		Date now = ctx.getBean("now", Date.class);
	    System.out.println(now);
	}

}
