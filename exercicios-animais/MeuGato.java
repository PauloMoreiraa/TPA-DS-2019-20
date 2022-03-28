import java.util.Scanner;

public class MeuGato {
	
	public static void main(String [] args) {
		
		Gato cat = new Gato();
		
		cat.setCor("Caramelo");
		cat.setTamanho("Pequeno");
		cat.setRaça("Gato-de-Bengala");
		
		cat.passear();
		cat.brincar();
		
		cat.mostrar();
		
		
	}

}
