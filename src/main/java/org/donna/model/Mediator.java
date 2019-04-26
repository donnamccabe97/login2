package org.donna.model;

import java.util.ArrayList;
import java.util.List;

public class Mediator {                        

	static final int MAXQUEUE = 5;
	private List<String> users = new ArrayList<String>( );
   
	public synchronized void putMessage(int id) {
		while ( users.size( ) >= MAXQUEUE )
			try {
				wait( );
			} 
			catch( InterruptedException e ) { }
		String randomValue = ((Integer)((int)(Math.random()*100))).toString();
		users.add("p" + id + " Random value: " + randomValue + " Date: " + new java.util.Date( ).toString( ) );
		notifyAll( );
	}
		
	public synchronized String getMessage( ) {
		while ( users.size( ) == 0 )
			try {
				notify( );
				wait( );
			} 
			catch( InterruptedException e ) { }
		String message = (String)users.remove(0);
		notifyAll( );
		return message;
	}
}
