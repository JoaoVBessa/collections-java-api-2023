package list.pesquisa;

public class Biblioteca {

	public static void main(String[] args) {
		
		CatalogoLivros livroInteresse = new CatalogoLivros();
		
		livroInteresse.adicionarLivro("A bela e a fera", "autor 1", 1999);
		livroInteresse.adicionarLivro("Dragon Ball", "autor 2", 2015);
		livroInteresse.adicionarLivro("Esquadrão X", "autor 1", 2012);
		livroInteresse.adicionarLivro("Ben 10", "autor 3", 2020);
		
		System.out.println(livroInteresse.pesquisarPorAutor("autor 2"));
		System.out.println(livroInteresse.pesquisarPorTitulo("Ben 10"));
		System.out.println(livroInteresse.pesquisarPorIntervaloAnos(1999, 2015));
		
	}
}
