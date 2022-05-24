package boolen;
import java.util.Scanner;

public class CheckToken {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter an Integer");
		boolean b = reader.hasNextInt();
		System.out.println("You entered an integer:"+ b);

	}

}
