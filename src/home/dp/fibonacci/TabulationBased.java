package home.dp.fibonacci;

public class TabulationBased {
	Integer[] memo = new Integer[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
	
	public int fibo(int n){
		int idx = n-1;
		for(int i=0;i<=idx;i++){
			if(i<=1){
				memo[i] = 1;
			}else{
				if(memo[i]==-1){
					memo[i]=memo[i-1] + memo[i-2];
				}
			}
		}
		return memo[idx];
	}
	
	public static void main(String[] args) {
		TabulationBased memoized = new TabulationBased();
		
		int fibIdx =40;
		long startTime = System.currentTimeMillis();
		int fibNo = memoized.fibo(fibIdx);
		System.out.println(fibIdx + "th"+ " Fibonacci number is "+fibNo);
		System.out.println("Time taken milli secs "+ (System.currentTimeMillis()-startTime));
	}


}
