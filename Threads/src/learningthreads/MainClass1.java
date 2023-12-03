package learningthreads;

public class MainClass1 {

	public static void main(String[] args) {
		System.out.println("main method started");
		PrintSequence ps1=new PrintSequence();
		PrintSequence2 ps2=new PrintSequence2();
		
		ps1.start();
		ps2.start();
		
		System.out.println("mian method ended");
	}
}
