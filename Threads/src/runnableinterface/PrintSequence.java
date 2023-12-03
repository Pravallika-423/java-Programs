package runnableinterface;

public class PrintSequence implements Runnable {

	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println("i="+i);
		}
		try {
		
		Thread.sleep(1000);
		}
	catch(InterruptedException e)
		{
		System.out.println("error occured");
		}
	}
	
}
