package list.desafio_1;

public class Mercado {

	public static void main(String[] args) {
		
		CarrinhoDeCompra carrinho = new CarrinhoDeCompra();
		
		carrinho.adicionarItem("Calculadora", 1000.0, 1);
		carrinho.adicionarItem("Carregador", 200.0, 4);
		carrinho.adicionarItem("Microfone", 100.0, 2);
		
		System.out.println(carrinho.valorTotal());
		
		carrinho.exibirItens();
		
		carrinho.removerItem("Carregador");
		
		carrinho.exibirItens();
		
		System.out.println(carrinho.valorTotal());
		
	}
	
}
