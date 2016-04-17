
package home.dp.fibonacci;

public class MemoizationBased {
	
	Integer[] memo = new Integer[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
	
	public int fibo(int n){
		if(n<=1){
			memo[n] = 1;
			return memo[n];
		}
		if(memo[n]!=-1){
			return memo[n];
		}
		int fibNo = fibo(n-1)+fibo(n-2);
		memo[n] = fibNo;
		return fibNo;
	}
	
	public static void main(String[] args) {
		MemoizationBased memoized = new MemoizationBased();
		
		int fibIdx = 40;
		long startTime = System.currentTimeMillis();
		int fibNo = memoized.fibo(fibIdx);
		System.out.println(fibIdx + "th"+ " Fibonacci number is "+fibNo);
		System.out.println("Time taken milli secs "+ (System.currentTimeMillis()-startTime));
	}

}
