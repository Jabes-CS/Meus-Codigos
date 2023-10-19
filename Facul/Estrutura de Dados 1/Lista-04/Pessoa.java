/**
 * 
 * Classe auxiliar.
 * 
 * *** NAO ALTERAR ESTA CLASSE. ***
 *
 */
public class Pessoa {

	String nome;
	int idade;

	Pessoa(String n, int i) {
		this.nome = n;
		this.idade = i;
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

	@Override
	public String toString() {
		return "Pessoa [idade=" + idade + ", nome=" + nome + "]";
	}
	
}
