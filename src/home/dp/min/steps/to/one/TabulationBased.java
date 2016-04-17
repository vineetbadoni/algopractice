package home.dp.min.steps.to.one;

public class TabulationBased {

	Integer[] dp = new Integer[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	int getMinSteps(int n) {
		int i;
		dp[0]=0; dp[1] =1; // trivial case
		
		for (i = 2; i <= n; i++) {
			dp[i] = 1 + dp[i - 1];
			if (i % 2 == 0) {
				dp[i] = Math.min(dp[i], 1 + dp[i / 2]);
			}

			if (i % 3 == 0) {
				dp[i] = Math.min(dp[i], 1 + dp[i / 3]);
			}
		}
		return dp[n];
	}

	public static void main(String[] args) {
		TabulationBased bup = new TabulationBased();
		int minSteps = bup.getMinSteps(10);
		System.out.println("Minimum number of steps needed " + minSteps);
		
		bup.printDPValues();

	}

	public void printDPValues() {
		System.out.println("Memoized values ");
		int i = 1;
		while (dp[i] != -1) {
			System.out.println("n = " + i + " and saved value " + dp[i - 1]);
			i++;
		}
	}
}
