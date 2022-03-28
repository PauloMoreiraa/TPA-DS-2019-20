import java.util.Scanner;

public class Cachorro extends Animal implements AnimalDomesticado {
	
	boolean acordado;
	boolean brincando;
	
	public void passear() {
		if(acordado == true) {
			System.out.println("Vamos passear");
		}
		
	}
	
	public void brincar() {
		if(brincando == true) {
			System.out.println("Vamos brincar");
		}
		
	
	}
	
	
	

}
