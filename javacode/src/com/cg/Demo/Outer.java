public class Outer {
	int x=10;
	static int y=200;
	static class inner
	{
		public void method_demo()
		{
			System.out.println("I am inner class ");
			y=100;
			System.out.println(y);
		}
		
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer.inner obj=new Outer.inner();
		obj.method_demo();

	}

}
