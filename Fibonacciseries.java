package work;

public class Fibonacciseries {

	public static void main(String[] args) {

		int n= 20 ;
	   int 	firstterm=0;
	  int  secondterm=1;
	  for(int i=1;i<=n;i++) {
		  System.out.print(firstterm+",");
		  int nextterm = firstterm+secondterm;
		  firstterm= secondterm;
		  secondterm = nextterm;
		  
	  }
	    
	}

}
