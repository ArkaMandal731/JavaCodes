import java.util.HashSet;
import java.util.Set;

public class FindDublicateElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String names[]= {"Arkas","Mandals","Arkas"};
		Set<String> store=new HashSet<String>();
		for(String name:names) {
			if(store.add(name)==false) {
				System.out.println("Dublicate: "+name);
			}
		}

	}

}
