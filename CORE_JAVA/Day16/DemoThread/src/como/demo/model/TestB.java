package como.demo.model;
//  2 thread  -  seperate 
public class TestB extends Thread {

	public TestB() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void run() {
		print();
		
		//code 
	}
	
	public void print() {
		
		for (int i = 0; i < 6; i++) {
System.out.print(Thread.currentThread().getName());
			System.out.println(" Test B " + i);
			
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
