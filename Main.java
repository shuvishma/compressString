import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {

		Scanner sc = new Scanner(System.in) ;
		int test = sc.nextInt() ;

		while(test-- > 0) {
			String str = sc.next() ;
			int n = str.length() ;
			for(int i=0; i<n; i++) {
				int count = 1;
				while(i<n-1 && str.charAt(i)==str.charAt(i+1)){
					count++ ;
					i++ ;
				}
				System.out.print(str.charAt(i)) ;
				System.out.print(count) ;
			}
			System.out.println() ;
		}
                      // Your code here
	}
}