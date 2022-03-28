import java.util.Scanner;
public class Emprestimo extends Livro {
	
	private String data;
	private String devolucao;
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getDevolucao() {
		return devolucao;
	}
	public void setDevolucao(String devolucao) {
		this.devolucao = devolucao;
	}
	
	public void statusLivro() {
		if(status == true) {
			System.out.println("Livro não disponivel");
			
		}else {
			System.out.println("Livro disponivel");
		}
		
		
	}
	
	public void mostrarEmprestimo() {
		System.out.println("Data de retirada :"+getData());
		System.out.println("Data de devolução :"+getDevolucao());
	}

}
