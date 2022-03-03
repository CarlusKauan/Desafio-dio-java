package beans;

import java.util.List;

public class Banco {
	
	public String nome;
	// Lista de conta !
	private List<Conta> contas;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
