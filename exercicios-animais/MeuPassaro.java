import java.util.Scanner;

public class MeuPassaro {
	
	public static void main(String[] args) {
		
		Passaro passarinho = new Passaro();
		
		passarinho.setCor("Preto");
		passarinho.setTamanho("Grande");
		passarinho.setTipo("Gavião");
		passarinho.setRaça(null);
		
		passarinho.mostrar();
	}

}
