package set.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

	private Set<String> palavraUnicaSet;

	public ConjuntoPalavrasUnicas() {
		this.palavraUnicaSet = new HashSet<>();
	}
	
	public void adicionarPalavra(String palavra) {
		palavraUnicaSet.add(palavra);
	}

	public void removerPalavra(String palavra) {
		if (!palavra.isEmpty()) {
			if (palavraUnicaSet.contains(palavra)) {
				palavraUnicaSet.remove(palavra);
			} else {
				System.out.println("Palavra não encontrada.");
			}
		}
	}

	public boolean verificarPalavra(String palavra) {
		return palavraUnicaSet.contains(palavra);
	}
	
	public void exibirPalavrasUnicas() {
		if(!palavraUnicaSet.isEmpty()) {
			System.out.println(palavraUnicaSet);
		} else {
			System.out.println("O conjunto está vazio.");
		}
	}
	
	public static void main(String[] args) {
		
		ConjuntoPalavrasUnicas conjunto = new ConjuntoPalavrasUnicas();
		
		conjunto.adicionarPalavra("Java");
		conjunto.adicionarPalavra("Phyton");
		conjunto.adicionarPalavra("C++");
		conjunto.adicionarPalavra("C");
		conjunto.adicionarPalavra("Java");
		
		conjunto.exibirPalavrasUnicas();
		
		conjunto.removerPalavra("C");
		
		conjunto.exibirPalavrasUnicas();
		
		System.out.println(conjunto.verificarPalavra("Java"));
		
		
	}
	
}
