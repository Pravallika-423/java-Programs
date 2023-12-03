package learningthreads;

public class MainClass2 {

	public static void main(String[] args) {
		
	
	Thread t1=new Thread();
	Thread t2=new Thread();
	System.out.println("thread id="+t1.getId());
	System.out.println("thread name="+t1.getName());
	System.out.println("thread priority="+t1.getPriority());
	
	System.out.println("thread id="+t2.getId());
	System.out.println("thread name="+t2.getName());
	System.out.println("thread priority="+t2.getPriority());
	
		t1.setName("new name of the thread");
		t1.setPriority(5);
		
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
	
	
	}
	
}
