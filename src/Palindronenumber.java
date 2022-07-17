import java.util.Scanner;

public class Palindronenumber {

	public static void main(int num) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any number: ");
		
		int r=0;
        int sum=0;
        int t;
        t=num;
        while(num>0){
            r=num%10;
            sum=(sum*10)+r;
            num=num/10;
        }
        if(t==sum)
            System.out.println("Palindrone number"); 
        else {
        	System.out.println("Its not a palindrone");
        }

	}

}
