
public class AddMissingNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ar[]= {1,2,3,4,5,6,7,9};
		int sum=0;
		for(int i=0;i<ar.length;i++) {
			sum=sum+ar[i];
		}
		System.out.println(sum);
		
		int sum1=0;
		for(int j=0;j<=9;j++) {
			sum1=sum1+j;
		}
		System.out.println(sum1);
		System.out.println(sum1-sum);

	}

}
