import java.util.Arrays;

public class EqualityOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,3,4,5,6,7,1,8};
		int b[]= {1,3,4,5,6,7,1,8};
		boolean status=Arrays.equals(a, b);
		if(status==true) {
			System.out.println("Arrays are equal");
		}
		else {
			System.out.println("Arrays are not equal");
		}

	}

}
