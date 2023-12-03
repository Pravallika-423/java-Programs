package learningwrapperclass;

public class MainClass1 {

	public static void main(String[] args) {
		Integer i1=new Integer(10);
		Integer i2=new Integer(20);
		System.out.println((i1));
		System.out.println(i2);
		
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
		
		System.out.println(i1.equals(i2));
		
	}
}
