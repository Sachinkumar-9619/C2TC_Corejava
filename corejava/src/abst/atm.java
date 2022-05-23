package abst;

abstract class data 
{
abstract void withdraw();
}

public class atm extends data
{
void withdraw()
{
	System.out.println("withdraw Succesfull");
}


public static void main(String[] args)
{
		// TODO Auto-generated method stub
		atm ob1 = new atm();
		ob1.withdraw();

	}

}

