import java.util.Scanner;

public class UsarConta {
	
	public static void main(String[] args) {
		
		Conta continha = new Conta();
		
		continha.setNomeTitular("Edmundo Oliveira");
		continha.setNumeroConta(0123456);
		continha.setAgencia("08450-4");
		continha.setSaldo(80.0);
		continha.setDataAbertura("29/06/2018");
		
		continha.sacar(20.0);
		continha.depositar(10.0);
		continha.calcularRendimento();
		continha.recuperarDadosParaImpressao();
		
		continha.mostrar();
	}

}
