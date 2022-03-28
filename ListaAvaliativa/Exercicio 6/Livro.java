import java.util.Scanner;
public class Livro {
	
	private String nome;
	private String genero;
	public boolean status;
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public void mostrarLivro() {
		System.out.println("Nome do Livro: "+getNome());
		System.out.println("Genero do Livro: "+getGenero());
		
		
	}

}
