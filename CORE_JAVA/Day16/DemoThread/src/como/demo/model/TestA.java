package como.demo.model;
// Thread 
public class TestA extends Thread{

	public TestA() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void run() {
		print();
	}
	
	public void print() {
		
		for (int i = 0; i < 6; i++) {
			System.out.println(" Test A " + i);
			
			try {
				Thread.sleep(20);// sleep
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//  
		}
		
	}

}




