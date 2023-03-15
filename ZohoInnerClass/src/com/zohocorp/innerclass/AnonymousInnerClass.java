package com.zohocorp.innerclass;

//3
//Anonymous inner class
interface Age {
	int x = 21;
	void getAge();
}
class AnonymousInnerClass {
	public static void main(String[] args)
	{

		// There is a hidden inner class of Age interface
		// whose name is not written but an object(oj1) to it
		// is created.
		Age oj1 = new Age() //single object
		{
			@Override 
			public void getAge()
			{
				System.out.print("Age is " + x);
			}
		};
	
		oj1.getAge();
	}
}

