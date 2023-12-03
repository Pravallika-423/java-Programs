package learningthreads;

public class PrintSequence2 extends Thread{

	public void run()
	{
//		System.out.println("print sequence of j");
		for(int j=50;j<=100;j++)
		{
			System.out.println("j="+j);
		
		try {
			Thread.sleep(400);
		}
		catch(InterruptedException e)
		{
			System.out.println("Ie exp");
		}
		}
	}
	
}
