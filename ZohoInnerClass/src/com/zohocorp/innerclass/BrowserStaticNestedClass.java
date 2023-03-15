package com.zohocorp.innerclass;
import java.io.*;
import java.util.*;

class Browser1 {
	private static ArrayList<String> url = new ArrayList<>();
	
//	Browser1()
//	{
//	}
//	
//	Browser1(String urlHistory[])	
//	{
//		int l=urlHistory.length;
//		for(int i=0;i<l;i++)
//			addURL(urlHistory[i]);
//	}

	public static void addURL(String s) //static method
	{
		url.add(s); 
	}
	
	static class History
	{  
		History(String urlHistory[])//constructor
		{
			int l=urlHistory.length;
			for(int i=0;i<l;i++)
				addURL(urlHistory[i]);
		}
		
		public void display()  //non static method so we need instance of static nested class
		{  
			System.out.println("Browser1 History \n");
			for(int i=0;i<url.size();i++)
				System.out.println(url.get(i)+"\n");
		}
		
	}  
}

 class BrowserStaticNestedClass 
{
	public static void main(String[] args)throws IOException
	{
		
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		Scanner in = new Scanner(System.in);
		
		char c='Y' ;
		//String browserName;
		int urlNumber;
		
		do
		{
//			System.out.println("Enter the browser whose history you want to enter: ");
//			browserName = reader.readLine(); /*Scanner not used because it reads everything 
//			in the buffer up to the text end-of-line,and returns an empty String. */
			
			System.out.println("Enter the number of urls you want to add: ");
			urlNumber = in.nextInt();
			String[] urlName= new String[urlNumber];
			
			System.out.println("Enter the URLS you want to add: ");
			for(int i=0;i<urlNumber;i++)
			{
				urlName[i] = reader.readLine();
			}
			
			Browser1.History googleChrome=new Browser1.History(urlName);
			googleChrome.display();
			
			System.out.println("Do you want to enter more history(Y/N): ");
			c=in.next().charAt(0);
			
		}while(c=='Y');
		System.out.println("Goodbye");
		in.close();

	}

}