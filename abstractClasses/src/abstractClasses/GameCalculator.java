package abstractClasses;

public abstract class GameCalculator {
	public abstract void hesapla();
	
	public  void gameOver() {
		System.out.println("Oyunu kaybettiniz");
	}
}
