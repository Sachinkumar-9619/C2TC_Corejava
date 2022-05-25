package heirarchial;

public class Birds {
	void fly()
	{
		System.out.println("Iam a Bird");
	}

}
class Parrot extends Birds
{
	void WhatcolourAmI()
	{
		System.out.println("Iam Green!");
	}
}
class Crow extends Birds
{
	void WhatcolourAmI()
	{
		System.out.println("Iam Black!");
	}





	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parrot par = new Parrot();
		Crow cro = new Crow();
		par.WhatcolourAmI();
		par.fly();
		cro.WhatcolourAmI();
		cro.fly();

	}

}
