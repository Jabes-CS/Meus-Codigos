/**
 * 
 * Estrutura principal do exercicio. Deve fazer uso das demais estruturas para
 * implementar uma lista ligada ordenada com base nos nomes das pessoas
 * inseridas nela. Nomes menores no inicio da lista (mais proximos da raiz).
 * 
 * O atributo raiz define o inicio da lista ligada, sendo o ponto de acesso para
 * todos os demais itens da lista.
 * 
 */
public class Lista05 {

	/**
	 * NAO ALTERAR ESTA DEFINICAO
	 */
	Elemento raiz = null;
	int qtdePessoas = 0;

	/**
	 * 
	 * Adiciona uma nova pessoa na posicao correta da lista, considerando que
	 * esta deve estar ordenada por nome.
	 * 
	 * DICA: estude e verifique o uso do metodo compareTo da classe String:
	 * http://docs.oracle.com/javase/6/docs/api/java/lang/String.html#compareTo(java.lang.String)
	 * 
	 * @param p
	 */
	void inserir(Pessoa p) {
		// Cria um novo elemento e atribui o objeto Pessoa 'p' a ele
		Elemento novo = new Elemento();
		novo.pes = p;

		// Verifica se a raiz da lista está vazia
		if (raiz == null) {
			raiz = novo;
			
		} else {
			Elemento atual = raiz;
			Elemento anterior = null;

			// Loop para encontrar a posição correta para inserir o novo elemento
       	 	// com base na comparação dos nomes
			while (atual != null && p.nome.compareTo(atual.pes.nome) > 0) {
				anterior = atual;
				atual = atual.proximo;
			}

			// Verifica se o elemento anterior é nulo
			if (anterior == null) {
				// Se for nulo, significa que o novo elemento deve ser inserido no início da lista
				novo.proximo = raiz;
				raiz = novo;
			} else {
				// Se o elemento anterior não for nulo, o novo elemento é inserido entre o elemento anterior
            	// e o elemento atual
				novo.proximo = anterior.proximo;
				anterior.proximo = novo;
			}

		}
		// Incrementa a quantidade de pessoas na lista
		qtdePessoas++;
	}

	/**
	 * 
	 * Deve retornar a quantidade de pessoas existentes na lista neste momento.
	 * 
	 * @return
	 */
	int quantidadePessoas() {
		return qtdePessoas;
	}

	/**
	 * 
	 * Imprime os nomes das pessoas na lista, a partir da raiz da lista. O
	 * formato a ser seguido tem o padrao:
	 * 
	 * {nome1, nome2, ..., nomen}
	 * 
	 * Caso a lista esteja vazia no momento que este metodo foi invocado, deve
	 * imprimir {}.
	 * 
	 * @return
	 */
	String imprimir() {
		StringBuilder sb = new StringBuilder();
		sb.append("{");

		Elemento atual = raiz;
		while (atual != null){
			sb.append(atual.pes.nome);
			
			if(atual.proximo != null) {
				sb.append(", ");
			}
			atual = atual.proximo;
		}

		sb.append("}");
		return sb.toString();
	}

	Pessoa recuperarPorNome(String nomeProcurado) {
		Elemento atual = raiz;

		while (atual != null) {
			if (atual.pes.nome.equals(nomeProcurado)) {
				return atual.pes;
			}

			atual = atual.proximo;
		}

		return null;
	}

	/**
	 * 
	 * Tenta remover o noh indicado naquela posicao. Considere que o primeiro
	 * elemento estah na posica zero da lista. Caso a posicao indicada na exista
	 * na lista, nao faca nada.
	 * 
	 * @param posicaoParaRemover
	 */
	void remover(int posicaoParaRemover) {
		if (posicaoParaRemover >= 0 && posicaoParaRemover < qtdePessoas) {
			if (posicaoParaRemover == 0){
				raiz = raiz.proximo;
			} else {
				Elemento atual = raiz;
				Elemento anterior = null;
				int posicao = 0;

				while (posicao < posicaoParaRemover) {
					anterior = atual;
					atual = atual.proximo;
					posicao++;
				}

				anterior.proximo = atual.proximo;
			}

			qtdePessoas--;
		}

	}

	/**
	 * 
	 * Procura na lista a pessoa que possuir a maior idade e a retorna. Caso a
	 * lista esteja vazia, retorna null.
	 * 
	 * @return
	 */
	Pessoa pessoaMaisVelha() {
		if (raiz == null) {
			return null;
		}

		Elemento atual = raiz;
		Pessoa pessoaMaisVelha = atual.pes;

		while (atual != null) {
			if (atual.pes.idade > pessoaMaisVelha.idade) {
				pessoaMaisVelha = atual.pes;
			}

			atual = atual.proximo;
		}

		return pessoaMaisVelha;
	}
}
