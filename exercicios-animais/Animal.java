import java.util.Scanner;

public class Animal {
	
	private String raça;
	private String cor;
	private String tipo;
	private String tamanho;
	
	public String getRaça() {
		return raça;
	}

	public void setRaça(String raça) {
		this.raça = raça;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	
	public void mostrar() {
		System.out.println("Raça : "+getRaça());
		System.out.println("Tipo : "+getTipo());
		System.out.println("Tamanho : "+getTamanho());
		System.out.println("Cor : "+getCor());
		
	}
		

	public void passear() {
		
	}
	
	
	public void voar() {
		
	}
	
	public void nadar() {
		
	}
	
	public void correr() {
		
	}
	
	public void brincar() {
		
	}

} 
