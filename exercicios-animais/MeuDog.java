import java.util.Scanner;

public class MeuDog {
	
	public static void main(String[] args) {
		
		Cachorro cao = new Cachorro();
		
		cao.setCor("Branco");
		cao.setRaça("Poodle");
		cao.setTamanho("Médio");
		cao.brincar();
		cao.correr();
		
		
		cao.mostrar();
		
		
	}

}
