
public class Testing2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Find the missing number in array
				int a[]= {1,2,3,4,6,7,8};
				int sum=0;
				for(int i=0;i<a.length;i++) {
					sum=sum+a[i];
					
				}
				System.out.println(sum);
				
				int sum1=0;
				for(int k=1;k<=8;k++) {
					sum1=sum1+k;
					
				}
			System.out.println(sum1);	
			System.out.println(sum1-sum);
	}

}
