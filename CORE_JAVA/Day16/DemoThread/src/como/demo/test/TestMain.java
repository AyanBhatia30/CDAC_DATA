package como.demo.test;

import javax.swing.plaf.basic.BasicTableHeaderUI;

import como.demo.model.TestA;
import como.demo.model.TestB;

public class TestMain {
//os ==  3  TestMain  ta     tb 
	public static void main(String[] args) {
		
		//System.out.println("Main Start");
		//Menu Driven 
		TestA ta = new TestA();//Threads
		//ta.print();//completed 
		//OS  -  ready to run 
		ta.start();  // run -> print()
		ta.setName("Thread1");
		
		System.out.println(ta.getPriority());//
		
		TestB tb = new TestB();
		tb.setName("Thread2");
		tb.setPriority(10);
		
		//tb.print();
		tb.start();  // run -> print()
		System.out.println(tb.getPriority());
		
		//System.out.println("Main End");

	}

}
