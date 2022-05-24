package test_Pk;
public class poly {
	private void add(int x,int y)
	{
		System.out.println("add 2 num"+(x+y));
	}
	void add(int x,int y,int z)
	{
		System.out.println("add 3 num"+(x+y+z));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       poly ob1= new poly();
       ob1.add(1, 2, 6);
       ob1.add(5, 6);
	}

}
