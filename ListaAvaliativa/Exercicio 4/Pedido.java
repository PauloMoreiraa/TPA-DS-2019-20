import java.util.ArrayList;
import java.util.Scanner;
public class Pedido {
	

Scanner in = new Scanner(System.in);
	
	
	
	private boolean statusPedido = false;
	private double total = 0;
	private ArrayList<Produto> carrinho = new ArrayList<Produto>();
	
	
	
	public void imprimirCarrinho() {
		if(this.isStatusPedido()) {
			System.out.println("------- Carrinho -------");
			for(int i = 0; i < carrinho.size(); i++) {
				System.out.println(" Produto: " + carrinho.get(i).getNomeProduto());
				System.out.printf(" Preço: R$%.2f\n", carrinho.get(i).getPrecoProduto());
				System.out.println(" Quantidade: " + carrinho.get(i).getQuantidade());
				System.out.printf(" Subtotal: R$%.2f\n\n", (carrinho.get(i).getQuantidade() * carrinho.get(i).getPrecoProduto()));
			}
			System.out.printf(" Total: R$%.2f \n\n", + this.getTotal());
		}else System.out.println(" Carrinho vazio! \n");
	}
	
	public void acrescentarCarrinho(Produto prod, int qntd) {
		this.setStatusPedido(true);
		prod.tirarEstoque(qntd);
		this.setTotal(this.getTotal() + (prod.getPrecoProduto() * qntd));
		carrinho.add(prod);
	}
	
	public void pagarConta() {
		if(this.isStatusPedido()) {
			while(true) {
				System.out.println("Deseja pagar de que maneira? 1 - Dinheiro | 2 - Cheque | 3 - Cartão");
				int opc = in.nextInt();
				if(opc > 0 && opc < 4) {
					switch(opc) {
						case 1:
						case 2:
						case 3:
							System.out.println("Pagamento realizado com sucesso! \n");
							break;
					}
					break;	
				}
			}
		}else System.out.println(" Carrinho vazio! \n");
	}
	
	
	private double getTotal() {
		return total;
	}

	private void setTotal(double total) {
		this.total = total;
	}

	private boolean isStatusPedido() {
		return statusPedido;
	}

	private void setStatusPedido(boolean statusPedido) {
		this.statusPedido = statusPedido;
	}

}

