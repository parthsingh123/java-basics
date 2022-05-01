package work;

import java.util.ArrayList;
import java.util.List;

public class AvsL {

	public static void main(String[] args) {

		List number = new ArrayList();
		for(int i=1;i<10;i++) {
			number.add("No#"+i);
			
		}
		System.out.println("numbers"+number.size());
		System.out.println("First numbers is "+number.get(0));
	}

}
