package reCapDemo2;

public class Main {

	public static void main(String[] args) {
		double[] myList = {1.3,2.5,2.9};
		double total=0;
		double maks= myList[0];
		for(double number:myList) {
			if(maks<number) {
			maks=number;
			}
			total =  total + number ;	
			System.out.println(number);
		}
			
	System.out.println("Toplam = " + total);
	System.out.println(maks);
	}

}
