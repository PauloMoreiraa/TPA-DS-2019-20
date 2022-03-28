import java.util.Scanner;
public class Familia {
	
	private String nomePai;
	private String nomeMae;
	private int idadePai;
	private int idadeMae;
	
	public String getNomePai() {
		return nomePai;
	}
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public int getIdadePai() {
		return idadePai;
	}
	public void setIdadePai(int idadePai) {
		this.idadePai = idadePai;
	}
	public int getIdadeMae() {
		return idadeMae;
	}
	public void setIdadeMae(int idadeMae) {
		this.idadeMae = idadeMae;
	}
	
	public void mostrar () {
		System.out.println("Nome do Pai: "+getNomePai());
		System.out.println("Idade do Pai: "+getIdadePai());
		System.out.println("________");
		System.out.println("Nome da Mãe: "+getNomeMae());
		System.out.println("Idade da Mãe: "+getIdadeMae());
	
		
	}
	
	
	
	

}
