package week1.day2.homework;


public class FibonacciSeries {

	public static void main(String[] args) {
		int num =8;
		int n1=0;
		int n2=1;
           int n3;
          
       
				//System.out.println(n1);
				//System.out.println(n2);
				
		for (int i = 2; i < num;i++) {
			
			n3=n1+n2;  
			  System.out.println( n3);  
			  n1=n2;  
			  n2=n3;  
			
		}
			
		}

}
