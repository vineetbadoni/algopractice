package home.dp.min.steps.to.one;

/**
 * In computing, memoization is an optimization technique used primarily to
 * speed up computer programs by storing the results of expensive function calls
 * and returning the cached result when the same inputs occur again.
 * 
 * @author badvi02
 * 
 */

public class MemoizationBased {
	Integer[] memo = new Integer[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	int getMinSteps(int n) {
		int arrayIdx = n - 1;
		if (n == 1 || n == 0) {
			memo[arrayIdx] = 0;
			return 0; // base case
		}
		if (memo[arrayIdx] != -1) {
			return memo[arrayIdx]; // we have solved it already :)
		}

		int r = 1 + getMinSteps(n - 1); // '-1' step . 'r' will contain the
										// optimal answer finally
		if (n % 2 == 0) {
			r = Math.min(r, 1 + getMinSteps(n / 2)); // '/2' step
		}
		if (n % 3 == 0) {
			r = Math.min(r, 1 + getMinSteps(n / 3)); // '/3' step
		}

		memo[arrayIdx] = r; // save the result. If you forget this step, then
							// its
		// same as plain recursion.
		return r;

	}

	public static void main(String[] args) {
		MemoizationBased bup = new MemoizationBased();
		int minSteps = bup.getMinSteps(10);
		System.out.println("Minimum number of steps needed " + minSteps);

		bup.printMemoizedValues();
	}

	public void printMemoizedValues() {
		System.out.println("Memoized values ");
		int i = 1;
		while (memo[i] != -1) {
			System.out.println("n = " + i + " and saved value " + memo[i - 1]);
			i++;
		}
	}
}
