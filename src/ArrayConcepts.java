
public class ArrayConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum=0;
		int b[]= {1,2,3,4,5,7};
		int lent=b.length;
		System.out.println(lent);
		for(int i=0;i<b.length;i++) {
			sum=sum+b[i];//7
		}
		System.out.println(sum);
		int sum1=0;
		for(int j=1;j<=7;j++) {
			sum1=sum1+j;// sum1=1, sum1=3, sum1=6
			//sum1=10, sum1=14, sum1=20, sum1=27;
		}
		System.out.println(sum1);
		System.out.println(sum1-sum);

	}

}
