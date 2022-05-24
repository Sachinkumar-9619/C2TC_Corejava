package Scanner;
import java.util.*;
public class student
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a1=new Scanner(System.in);
	
		
		System.out.println("Enter Student Name");
		char c = a1.next().charAt(5);
		System.out.println("c = "+c);
		String n =a1.nextLine();
		
		
		System.out.println("Enter Student id");
		int i = a1.nextInt();
		
		System.out.println("Enter Student marks 1");
		float a = a1.nextFloat();
		
		System.out.println("Enter Student marks 2");
		float b = a1.nextFloat();
		
	    System.out.println("name"+n+"ID"+i+"marks 1="+a+"marks 2 ="+b+"total="+(a+b));
		
	
				

	}

}
