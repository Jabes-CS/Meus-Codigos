/**
 * 
 * Estrutura que define quais informacoes deverao ser guardadas na lista.
 * Representa uma pessoa, com seu nome e idade.
 * 
 * ESTA CLASSE NAO DEVE SER ALTERADA.
 * 
 */
public class Pessoa {

	String nome;
	int idade;

	public Pessoa(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idade;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (idade != other.idade)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

}
