import java.util.Scanner;
public class Pessoa {
	
	private String nome;
	private String rg;
	private String endereco;
	private String numero;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public void mostrarPessoa() {
		
		System.out.println("Nome :"+getNome());
		System.out.println("Rg :"+getRg());
		System.out.println("Edereço :"+getEndereco());
		System.out.println("Numero telefone :"+getNumero());
		
	}
	

}
