package home.suneet.rope.problem;

/**
 * 
 * Problem : There a rope of length 'n'. We need to put minimum number of cuts
 * so that all the lengths from 1 to n can be generated
 * 
 * @author badvi02
 * 
 */
public class RopeProblem {

	public int getMinCuts(int ropeLength) {
		int dividedLength = ropeLength;
		int noOfCuts = 0;
		while(dividedLength/2>0){
			noOfCuts++;
			int partitions[] = new int[2];
			if(dividedLength%2==0){
				partitions[0] = partitions[1] = dividedLength/2;
			}else{
				partitions[0] = (dividedLength/2)+1;
				partitions[1] = dividedLength/2;
			}
			if(solutionFound(partitions)){
				return noOfCuts;
			}
		}
		return 0;
	}
	
	public boolean solutionFound(int[] partitions){
		return true;
	}

	public static void main(String[] args) {
		int ropeLength = 1;
		
		RopeProblem prob = new RopeProblem();
		
		System.out.println("Minimum number of cuts required to generated all lengths "+prob.getMinCuts(ropeLength));
	}
}
