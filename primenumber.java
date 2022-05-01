package work;

public class primenumber {

	public static void main(String[] args) {

		int n= 6;
		boolean prim = false;
		
		for(int i=2;i<=n/2;++i) {
			if(n%i==0) {
				prim = true;
				
			}
		}
		if(!prim)
			System.out.println(n+"is prime number ");
		else
			System.out.println(n+"is not a prime number ");
	}

}
