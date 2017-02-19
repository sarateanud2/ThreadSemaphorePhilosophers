package com.thread.semaphore.philosopher;

import java.util.concurrent.Semaphore;

public class Main {

	public static void main(String[] args) {
		
		Semaphore semaphore = new Semaphore(2);
		
		for(int i = 1; i <=5; i++){
			new Philosopher(semaphore, i).start();
		}

	}

}
