
public class ApresentaEmpregado {
	public static void main(String[] args) {

		Empregado trabalhador1 = new Empregado("Kauê", "Shelby", 8000);
		Empregado trabalhador2 = new Empregado("Paulo", "Shelby", 25000);
		
		trabalhador1.mostraTrabalhador();
		trabalhador2.mostraTrabalhador();
		
		trabalhador1.reduzirSalario(40);
		trabalhador2.aumentarSalario(10);
		
		trabalhador1.mostraTrabalhador();
		trabalhador2.mostraTrabalhador();
		
	}
}
