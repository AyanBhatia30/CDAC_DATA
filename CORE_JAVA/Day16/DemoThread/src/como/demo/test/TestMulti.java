package como.demo.test;

import como.demo.model.TestB;

public class TestMulti {

	public static void main(String[] args) {
		
		TestB t1 = new TestB(); // Normal 5 
		t1.setName("t1");
		TestB t2 = new TestB();
		t2.setName("t2");
		TestB t3 = new TestB();
		t3.setName("t3");
		t1.start();
		t2.start();
		t3.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
