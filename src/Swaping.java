
public class Swaping {

	public static void main(String[] args) {
		// Swapping of two integer without using third variable
		
		int x=10;
		int y=15;
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("Value of x is "+x);
		System.out.println("Value of y is "+y);
		System.out.println("---------------------------------------------");
		//Swapping of two string
		String a="Hello";
		String b="World";
		a=a+b;
		b=a.substring(0, a.length()-b.length());
		System.out.println("Value of b is "+b);
		a=a.substring(b.length());
		System.out.println("Value of a is "+a);
		System.out.println("---------------------------------------------");
		//Screenshot Code
		// TakesScreenshot scrShot =((TakesScreenshot)webdriver);
		//File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		System.out.println("----------------------------------------------");
		//Check if a string is Palindrome or not
		String str="SPS";
		String reverse = new StringBuffer(str).reverse().toString();
		if(str.equalsIgnoreCase(reverse)) {
			System.out.println("Its a palindrone");
		}
		else {
			System.out.println("Not a palindrone");
		}
		
		
		
		

	}


}
