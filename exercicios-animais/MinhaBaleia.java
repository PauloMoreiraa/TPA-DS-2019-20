import java.util.Scanner;

public class MinhaBaleia {
	
public static void main(String[] args) {
		
		Baleia baleinha = new Baleia();
		
	    baleinha.setCor("Azul");
	    baleinha.setTamanho("Grande");
	    baleinha.setTipo("Mamifero");
	    baleinha.setRaça("Baleia Azul");
	    
	    baleinha.atacar();
	    baleinha.caçar();
	    baleinha.morder();
	    
	    
	    baleinha.mostrar();
	    

		


		
		
	}


}
