package pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompra {

	private List<Item> item;
	
	public CarrinhoDeCompra() {
		this.item = new ArrayList<>();
	}
	
	public void adicionarItem(String nome, double preco, int quantidade) {
		item.add(new Item(nome, preco, quantidade));
	}
	
	public void exibirItens() {
		System.out.println(item);
	}
	
	public double valorTotal() {
		double valorTotal = 0;
		for(Item t: item) {
			valorTotal += t.getPreco() * t.getQuantidade();
		}
		return valorTotal;
	}
	
	public void removerItem(String nome) {
		item.removeIf(t -> t.getNome().equalsIgnoreCase(nome));
	}
	
}
