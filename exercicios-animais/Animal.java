import java.util.Scanner;

public class Animal {
	
	private String ra�a;
	private String cor;
	private String tipo;
	private String tamanho;
	
	public String getRa�a() {
		return ra�a;
	}

	public void setRa�a(String ra�a) {
		this.ra�a = ra�a;
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
		System.out.println("Ra�a : "+getRa�a());
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
