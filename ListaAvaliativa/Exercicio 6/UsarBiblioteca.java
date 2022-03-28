import java.util.Scanner;
public class UsarBiblioteca {
	
	public static void main(String[] args) {
		
		Livro livro = new Livro();
		livro.setNome("Percy Jackson");
		livro.setGenero("Ação");
		
		
		Emprestimo emprestimo = new Emprestimo();
		
		emprestimo.setData("10/06/2020");
		emprestimo.setDevolucao("29/06/2020");
		emprestimo.statusLivro();
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Kauê");
		pessoa.setRg("44.258.369-4");
		pessoa.setEndereco("Rua Almerinda");
		pessoa.setNumero("(11)96044-3925");
		
		livro.mostrarLivro();
		
		emprestimo.mostrarEmprestimo();
		
		pessoa.mostrarPessoa();
	
		
	}

}
