package org.donna.model;

public class MediatorDemo {
	   public static void main( String[] args ) {
	      Mediator mb = new Mediator();
	      new Thread(new Producer( mb )).start();
	      new Thread(new Producer( mb )).start();
	      new Thread(new Consumer( mb )).start();
	      new Thread(new Consumer( mb )).start();
	      new Thread(new Consumer( mb )).start();
	      new Thread(new Consumer( mb )).start();
	   }  
}