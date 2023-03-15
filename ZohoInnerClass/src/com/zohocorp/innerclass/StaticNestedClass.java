package com.zohocorp.innerclass;

class StaticNestedClassExample
{  
	  static int data=30;  
	  private static void outerMethod()
	    {
	        System.out.println("inside outerMethod");
	    }
	  
	  static class Inner
	  {  
		   void msg()
		   {
			   System.out.println("data is "+data);
			   outerMethod(); //can access only static methods or members in outer class
		   }  
	  }  
	  
}  

//2 nested interface
interface Showable
{  
	  void show();  
	  interface Message
	  {  
	   void msg();  
	  }  
}  
class TestNestedInterface1 implements Showable.Message
{
	 public void msg()
	 {
		 System.out.println("Hello nested interface");
	 }  
	  
}  
	
class StaticNestedClass{
	public static void main(String args[])
	  {  
		  //1 Static Nested Class
		  StaticNestedClassExample.Inner obj=new StaticNestedClassExample.Inner();  
		  //instance of static nested class needed because it has instance method msg()
		  //no need object of the Outer class as nested class is static can be accessed without an object
		  System.out.println("Static Nested Class");
		  obj.msg(); 
		  
		  //2 Nested Interface
		  Showable.Message message=new TestNestedInterface1();//upcasting here  
		  System.out.println("\n Static Nested Class");
		  message.msg(); 
	  }  
}