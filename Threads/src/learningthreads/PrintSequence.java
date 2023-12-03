package learningthreads;

public class PrintSequence extends Thread {

	public void run()
	{
		for(int i=0;i<=50;i++)
		{
			System.out.println("i="+i);
			try
			{
			Thread.sleep(400);	
			}
			catch(InterruptedException e)
			{
				System.out.println("interruputException");
			}
		}
	}
}
