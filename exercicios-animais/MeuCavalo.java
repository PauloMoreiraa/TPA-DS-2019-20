import java.util.Scanner;

public class MeuCavalo {
	
	public static void main(String[] args) {
		
		Cavalo cavalinho = new Cavalo();
		
		cavalinho.setCor("Marrom");
		cavalinho.setTamanho("Grande");
		cavalinho.setRa�a("Quarto de Milha");
		
		cavalinho.brincar();
		cavalinho.cavalgar();
		
		cavalinho.mostrar();
		
		
	}
	
	

}
