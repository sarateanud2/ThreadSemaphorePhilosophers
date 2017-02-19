package com.thread.semaphore.philosopher;

import java.util.concurrent.Semaphore;

public class Philosopher extends Thread{
	Semaphore semaphore;
	int num = 0;
	int id;
	public Philosopher(Semaphore semaphore, int id) {
		super();
		this.semaphore = semaphore;
		this.id = id;
	}
	
	public void run(){
		try {
			while(num < 3){
				semaphore.acquire();
				System.out.println("Philospher " + id + " sat at the table");
				//philosopher is eating
				sleep(500);
				num++;
				
				System.out.println("Philospher " + id + " get up from the table");
				semaphore.release();
				sleep(500);
			}
		} catch (Exception e) {
			System.out.println("Philospher " + id + " has health problems");
		}
	}
	
	
}

/*
     
    public void run()
    {
        try
        {
            while(num<3)// пока количество приемов пищи не достигнет 3
            {
                //Запрашиваем у семафора разрешение на выполнение
                sem.acquire(); 
                System.out.println ("Философ " + id+" садится за стол");
                // философ ест
                sleep(500);
                num++;
                     
                System.out.println ("Философ " + id+" выходит из-за стола");
                sem.release();
             
                // философ гуляет
                sleep(500);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println ("у философа " + id + " проблемы со здоровьем");
        }
    }
}
*/