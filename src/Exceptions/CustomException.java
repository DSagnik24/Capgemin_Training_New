package Exceptions;

public class CustomException {
	public static void calcResult(double percentage) {
		if(percentage > 0 && percentage <=100) {
			if(percentage > 45) {
				System.out.println("Passed");
			}
		}
		else {
			throw new InvalidPercentageException("Percentage is invalid");
		}
	}
	
	public static void main(String[] args) {
		
		try {
			calcResult(-79);
		}
		catch(InvalidPercentageException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
