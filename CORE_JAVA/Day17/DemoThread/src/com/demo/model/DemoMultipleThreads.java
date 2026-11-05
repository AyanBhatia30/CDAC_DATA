package com.demo.model;

// GUI   awt    swing 

//Game  move   pause   Thread 

// ThreadGroup ---- Collection of Thread  

public class DemoMultipleThreads implements Runnable{
	
	int i1 , i2 ; 	
	Thread t1 , t2;
	ThreadGroup tg;// private 

	public DemoMultipleThreads() {	
		
		//tg = 
		t1 = new Thread(this , "t1" );//  run method current class 
		t1.start();  /// run  Thread 
		
		t2 = new Thread(this, "t2");
		t2.start();
	}
	
	// Devloper 
	// thread   run 
	public void inc1() {
		for ( i1 = 0; i1 < 30 ; i1++) {
			
System.out.println(Thread.currentThread().getName() + "  "  + i1);

		if(i1 == 15)
			try {
				
				synchronized (this) {				
					wait();
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		}
	}
	
	public void inc2() {
		for ( i2 = 0; i2 < 30 ; i2++) {
			
System.out.println(Thread.currentThread().getName() + "         "  + i2);
	

	if(i2 == 15) {
		
		synchronized (this) {
			notify();/// wait  1 thread  
			//notifyAll(); /// 
		}
		
	}
try {
	Thread.sleep(100);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
			
		}
	}
	
	@Override
	public void run() {
		
		if(Thread.currentThread().getName().equals("t1")) {
			inc1();//0-29
		}
		if(Thread.currentThread().getName().equals("t2")) {
			inc2();
		}
		
		
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new DemoMultipleThreads();

	}


	

}
