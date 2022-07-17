
public class PrimeNumberOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=4;
		int sum=0;
		
		for(int i=2;i<=(num/2);i++)
		{
		   if(num%i==0)
		   {
			   sum=sum+1;
		   }
		}
		if(sum==0)
		{
		System.out.println("Ptime numberr");
		}
		else
		{
		System.out.println("not a prime number");
		}
	

	}

}
