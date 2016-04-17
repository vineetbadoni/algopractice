package home.spiral.string;

public class PrintSpiral {
	public static void main(String[] args) {
		
	}
	
	public char[][] getSpiral(String input){
		

		
		//Calculate the spiral size
		
		char[] inputArray = input.toCharArray();
		double spiralDimension = Math.ceil(Math.sqrt(input.length()));
		
		char[][] output = new char[(int)spiralDimension][(int)spiralDimension];
		
		int startIdxX =(int)Math.ceil(spiralDimension/2);
		int startIdxY =(int)Math.ceil(spiralDimension/2);
		
		
		for(char c:inputArray){
			output[startIdxX][startIdxY] = c;
			
		}
		
		return output;
	}
}
