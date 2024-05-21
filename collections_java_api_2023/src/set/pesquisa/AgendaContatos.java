package set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

	private Set<Contato> contatosSet;

	public AgendaContatos() {
		this.contatosSet = new HashSet<>();
	}

	public void adicionarContato(String nome, int numero) {
		contatosSet.add(new Contato(nome, numero));
	}

	public void exibirContatos() {
		System.out.println(contatosSet);
	}

	public Set<Contato> pesquisarPorNome(String nome) {
		Set<Contato> contatosPorNome = new HashSet<>();
		if (!contatosSet.isEmpty()) {
			for (Contato c : contatosSet) {
				if (c.getNome().startsWith(nome)) {
					contatosPorNome.add(c);
				}
			}
			return contatosPorNome;
		} else {
			throw new RuntimeException("O conjunto está vazio!");
		}
	}

	public Contato atualizarNumeroContato(String nome, int novoNumero) {
		Contato contatoAtualizado = null;
		for (Contato c : contatosSet) {
			if (c.getNome().equalsIgnoreCase(nome)) {
				c.setNumero(novoNumero);
				contatoAtualizado = c;
				break;
			}
		}
		return contatoAtualizado;
	}

	public static void main(String[] args) {
		
		AgendaContatos agenda = new AgendaContatos();
		
		agenda.adicionarContato("João M", 4542);
		agenda.adicionarContato("João B", 4582);
		agenda.contatosSet.add(new Contato("João V", 4565));
		agenda.adicionarContato("Mariana", 7854);
		agenda.adicionarContato("Giovanna", 7686);
		
		agenda.exibirContatos();
		
		System.out.println(agenda.pesquisarPorNome("João"));
		
		System.out.println(agenda.atualizarNumeroContato("João M", 4544));
		
		agenda.exibirContatos();
	}
}
