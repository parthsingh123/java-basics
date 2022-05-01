package work;

public class BreackJumpOutLoop {

	public static void main(String[] args) {

		int[] intery = {22,223,333,2233,223333,5444,};
		int no = 223333;
		int i= 0;
		boolean found = false;
		
		for(;i<intery.length;i++) {
			if(intery[i] == no) {
				found = true ;
				break;
			}
		}
		if(found) {
			System.out.println("found the no.:"+no+"at index :"+i);
			
		}else {
			System.out.println(no+"is not found");
		}
		
	}

}
