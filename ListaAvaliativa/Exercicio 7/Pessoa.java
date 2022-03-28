import java.util.Scanner;
public class Pessoa extends Familia {
	
	private String seuNome;
	private int idade;

	public String getSeuNome() {
		return seuNome;
	}
	public void setSeuNome(String seuNome) {
		this.seuNome = seuNome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void apresentar() {
		    System.out.println("________");
			System.out.println("Seu nome: "+getSeuNome());
			System.out.println("Sua idade: "+getIdade());
			
		}
		
	}
	
