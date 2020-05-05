package week1.day1;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		int range=8;
		System.out.println("Printing Fibonacci series for input range "+range);
		int next;
		int a=0,b=1;
		System.out.print(a+"\t"+b);
		for(int i=1;i<=range-2;i++)
		{
			
			next=a+b;
			System.out.print("\t"+next);
			a=b;
			b=next;
		}
	}

}
