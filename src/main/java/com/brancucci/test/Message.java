package com.brancucci.test;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "message", eager = true)
@RequestScoped
public class Message {
   private String message = "Hello World!";
   
   public Message(){
	   System.out.println("Message created");
   }
	
   public String getMessage() {
	   System.out.println("Message: getting message");
      return message;
   }
   public void setMessage(String message) {
	   System.out.println("Message: setting message");
      this.message = message;
   }
}