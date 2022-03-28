import java.util.Scanner;

public class Supermercado{

public static void main(String[] args) {

	Produto bebidas[] = new Produto[3];
	bebidas[0] = new Produto("Cerveja skol", 6.00, 30);
	bebidas[1] = new Produto("Água com gás", 2.99, 80);
	bebidas[2] = new Produto("Guarana Antartica", 9.00, 55);
	
	Produto alimentos[] = new Produto[3];
	alimentos[0] = new Produto("Ruffles", 7.89, 104);
	alimentos[1] = new Produto("Picanha(Kg)", 35.00, 24);
	alimentos[2] = new Produto("Hamburguer", 14.50, 46);
	
	Produto lanches[] = new Produto[3];
	lanches[0] = new Produto("Beirute", 8.99, 15);
	lanches[1] = new Produto("X-Salada", 5.00, 19);
	lanches[2] = new Produto("Pastel", 7.00, 20);
	
	bebidas[0].descricaoProduto();
	
	Pedido compras = new Pedido();
	compras.pagarConta();
	compras.imprimirCarrinho();
	compras.acrescentarCarrinho(bebidas[0], 5);
	compras.acrescentarCarrinho(alimentos[2], 1);
	compras.acrescentarCarrinho(lanches[0], 2);
	compras.imprimirCarrinho();
	compras.pagarConta();
	
	bebidas[0].descricaoProduto();
	
}

	
}
	
