package com.cervantes.andres;

public class SplQueueTest {

	public static void main(String[] args) {
		SplQueue splQ = new SplQueue();

		splQ.addInQueue( "Andres" );
		splQ.addInQueue( "Michael" );
		splQ.addInQueue( "Janis" );
		splQ.addInQueue( "Blah" );
		
		splQ.printQueue();
		splQ.removeFront();
		splQ.removeBack();
		splQ.printQueue();
	}

}
