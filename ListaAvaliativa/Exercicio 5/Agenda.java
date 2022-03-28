import java.util.Scanner;
public class Agenda {

	private String nome;
	private String numero;
	private String nome1;
	private String numero1;
	private String nome2;
	private String numero2;
	
	public String getNumero1() {
		return numero1;
	}
	public void setNumero1(String numero1) {
		this.numero1 = numero1;
	}
	public String getNome2() {
		return nome2;
	}
	public void setNome2(String nome2) {
		this.nome2 = nome2;
	}
	public String getNumero2() {
		return numero2;
	}
	public void setNumero2(String numero2) {
		this.numero2 = numero2;
	}
	public String getNome1() {
		return nome1;
	}
	public void setNome1(String nome1) {
		this.nome1 = nome1;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public void mostrar () {
		System.out.println("Nome: "+getNome());
		System.out.println("Número: "+getNumero());
		System.out.println("________");
		System.out.println("Nome: "+getNome1());
		System.out.println("Número: "+getNumero1());
		System.out.println("________");
		System.out.println("Nome: "+getNome2());
		System.out.println("Número: "+getNumero2());
		
		
		
	}
	
}