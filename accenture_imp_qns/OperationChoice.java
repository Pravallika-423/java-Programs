package accenture;
import java.util.Scanner;

public class OperationChoice {

	public static void print(int a ,int b,int c)
	{
		switch (c) {
		case 1:
			
			System.out.println(a+b);
			break;
		case 2:
			System.out.println(a-b);
			break;
		case 3:
			System.out.println(a*b);
			break;
		case 4:
			System.out.println(a/b);
			break;
		default:
				System.out.println("enter valid number");
				break;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number between 1 t0 4");
		int c=sc.nextInt();
		print(12,16,c);
	}
}
