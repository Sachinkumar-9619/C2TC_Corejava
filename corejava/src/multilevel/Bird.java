package multilevel;

public class Bird 
{
	void fly()
	{
		System.out.println("Iam a Bird");
	}
}
class Parrot extends Bird
{
	void WhatcolourAmI()
	{
		System.out.println("Iam Green!");
	}
}
class Singingparrot extends Parrot
{
	void WhatcanISing()
	{
		System.out.println("I can Sing Opera!");
	}



	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singingparrot  obj=new Singingparrot();
		obj.WhatcanISing();
		obj.WhatcolourAmI();
		obj.fly();

	}

}
