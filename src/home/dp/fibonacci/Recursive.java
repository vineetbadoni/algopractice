package home.dp.fibonacci;

public class Recursive {
	
	int fib(int n){
		if(n <= 1){
			return 1;
		}
		return fib(n-1)+fib(n-2);
	}
	
	public static void main(String[] args) {
		Recursive recurse = new Recursive();
		
		int fibIdx = 40;
		long startTime = System.currentTimeMillis();
		int fibNo = recurse.fib(fibIdx);
		System.out.println(fibIdx + "th"+ " Fibonacci number is "+fibNo);
		System.out.println("Time taken milli secs "+ (System.currentTimeMillis()-startTime));
	}

}
