import java.util.Scanner;
public class Produto {
	
	private String nomeProduto;
	private double precoProduto;
	private int qntdEstoque;
	private int quantidade;
	
	public Produto(String nomeProduto, double precoProduto, int qntdEstoque) {
		this.nomeProduto = nomeProduto;
		this.precoProduto = precoProduto;
		this.qntdEstoque = qntdEstoque;
	}
	
	
	public void descricaoProduto() {
		System.out.println("--- " + this.getNomeProduto() + " ---");
		System.out.println(" Preço: " + this.getPrecoProduto());
		System.out.println(" Estoque: " + this.getQntdEstoque() + "\n");
	}
	
	public void tirarEstoque(int qntd) {
		this.setQntdEstoque(this.getQntdEstoque() - qntd);
		this.setQuantidade(qntd);
	}

	public String getNomeProduto() {
		return nomeProduto;
	}
	
	public double getPrecoProduto() {
		return precoProduto;
	}
	
	private int getQntdEstoque() {
		return qntdEstoque;
	}
	
	private void setQntdEstoque(int qntdEstoque) {
		this.qntdEstoque = qntdEstoque;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

}
