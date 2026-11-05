package com.demo.model;

public class Demo implements Runnable{
	
	int i1 , i2 ;
	
	Thread t1 , t2 ;
	
		public Demo() {
			// TODO Auto-generated constructor stub
			
			t1 = new Thread(this , "t1");
			t2 = new Thread(this , "t2");
			t1.start();
			t2.start();
		}
	
	public  void inci1() {
		for(i1 = 0 ; i1<60 ; i1++){
			if(i1 ==50) {
				synchronized (this) {
				notify();
				}
			}
			try {
				Thread.sleep(200);
				System.out.println(Thread.currentThread().getName() + " " +  i1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
	}
	
	public synchronized void  inci2() {
	//	for(i2 = 0 ; i2<100 ; i2++);
		while(i2 != 69){
			try {
				Thread.sleep(100);
				if(i2 == 50 ) {
					wait();
				}
				System.out.println( Thread.currentThread().getName() + " " + i2);
				i2++;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Demo();

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		if(Thread.currentThread().getName().equals("t1")) {
			inci1();
		}
		
		if(Thread.currentThread().getName().equals("t2")) {
			inci2();
		}
	}

}
