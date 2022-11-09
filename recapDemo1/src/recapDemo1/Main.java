package recapDemo1;

public class Main {

	public static void main(String[] args) {
		int number1 = 23;
		int number2 = 25;
		int number3 = 2;
		
		int numberMax = number1;
		
		if(number2>numberMax){
			numberMax = number2;
		}if(number3>numberMax){
			numberMax=number3;
		
		}
		System.out.println("The biggest number : " + numberMax);
		

	}

}
