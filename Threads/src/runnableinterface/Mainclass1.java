package runnableinterface;

public class Mainclass1 {

	public static void main(String[] args) {
		PrintSequence ps=new PrintSequence();
		
		Thread t1=new Thread (ps);
		
		t1.start();
		
		
	}
}
