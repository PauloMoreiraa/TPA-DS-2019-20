import java.util.Scanner;
public class UsarArvoreGeneológica {
	
	public static void main(String [] args) {
		
		Familia familia = new Familia();
		
		familia.setNomePai("Kauan Reymond");
		familia.setIdadePai(45);
		familia.setNomeMae("Lucinda Dolores");
		familia.setIdadeMae(43);
		
		Pessoa pessoa = new Pessoa();
		pessoa.setSeuNome("Steve Rogers");
		pessoa.setIdade(12);
		
		familia.mostrar();
		pessoa.apresentar();
	}

}
