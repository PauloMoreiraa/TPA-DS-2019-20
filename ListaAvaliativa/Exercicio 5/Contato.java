import java.util.Scanner;

public class Contato {
	public static void main (String[]args) {
		
		Agenda lista = new Agenda();
		lista.setNome("Ricardo Gaspar");
		lista.setNumero("(11) 91546-2573");
		
		Agenda lista2 = new Agenda();
		lista.setNome1("Kauê Loviz");
		lista.setNumero1("(11) 96044-3925");
		
		Agenda lista3 = new Agenda();
		lista.setNome2("Paulo Sala");
		lista.setNumero2("(11) 98545-3698");
		
		
		
		lista.mostrar();
		
		
	}
}