
public class Testing4 {

	
		// TODO Auto-generated method stub
		public static void isPalindroneNumber(int num) {
		
		int r=0;
        int sum=0;
        int t;
        t=num;
        while(num>0){
            r=num%10;
            sum=(sum*10)+r;
            num=num/10;
        }
        if(t==sum) {
            System.out.println("Palindrone number"); 
        } else {
        	System.out.println("Its not a palindrone");
        }

	}
		public static void main(String []args) {
			isPalindroneNumber(121);
		}

}
