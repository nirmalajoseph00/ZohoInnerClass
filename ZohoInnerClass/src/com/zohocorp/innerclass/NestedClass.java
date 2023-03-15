package com.zohocorp.innerclass;


//1
//Inner class declared within a method of outer class
//Local Inner class

class Outer {

	void outerMethod()
	{
		System.out.println("inside outerMethod");
		// Inner class is local to outerMethod()
		class Inner {
			void innerMethod()
			{
				System.out.println("inside innerMethod");
			}
		}
		// object of inner class
		Inner y = new Inner();
		y.innerMethod();
	}
}



//2
//Type of Non Static Inner class - Member class
class TestMemberOuter1{  
	 private int data=30;  
	 class Inner
	 {  
		  void msg()
		  {
		  System.out.println("data is "+data);
		  }  
	 }  
	}  




public class NestedClass {

	public static void main(String[] args) {
		
		System.out.println("Local Inner Class");
		//1 Local Inner Class
		//  object of outer class 
		Outer x = new Outer();
		x.outerMethod();
			
		System.out.println("\n Member Class");
		//2
		TestMemberOuter1 obj=new TestMemberOuter1();  
		TestMemberOuter1.Inner in=obj.new Inner();  //object or instance of a member's inner class 
			  											//always exists within an object of its outer class
		in.msg();  

	}

}
