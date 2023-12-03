package runnableinterface;

public class PrintSequence3 extends Thread implements Runnable {

	public void run()
	{
		for(int i=0;i<=5;i++)
		{
		System.out.println("i="+i);
		}
		try {
			Thread.sleep(300);
		}
		catch (InterruptedException e) {
			System.out.println("interrupted error");
		}
	}
	
}
