/**
 * 
 * Classe principal da lista. Todas as alteracoes para resolucao devem ser
 * colocadas aqui.
 * 
 * Esta implementacao deverah considerar uma lista estatica, usando vetores como
 * implementacao interna, sendo que os seus elementos devem ser mantidos
 * ordenados pelo campo nome da classe Pessoa (tambem em anexo).
 * 
 * 
 */


/**import java.util.Array;
*/
public class Lista04 {

	Pessoa[] dados;
	int qtdePessoas = 0;

	/**
	 * 
	 * Definicao do tamanho da lista
	 * 
	 * *** NAO ALTERAR ESTE METODO. ***
	 * 
	 * @param tamanhoLista
	 */
	public Lista04(int tamanhoLista) {
		dados = new Pessoa[tamanhoLista];
	}

	/**
	 * 
	 * Este metodo deve tentar inserir um objeto do tipo Pessoa de forma 
	 * ordenada por nome nesta lista. Caso tenha inserido
	 * corretamente, o metodo deve retornar true. Caso contrario, deve retornar
	 * false.
	 * 
	 * DICA: estude e verifique o uso do metodo compareTo da classe String:
	 * http://docs.oracle.com/javase/6/docs/api/java/lang/String.html#compareTo(java.lang.String)
	 * 
	 * @param p
	 * @return
	 */
	public boolean inserir(Pessoa p) {
		if(qtdePessoas == dados.length){
			return false;
		}

		int posicao = 0;
		while (posicao < qtdePessoas && p.nome.compareTo(dados[posicao].nome) > 0){
			posicao++;
		}

		for (int i = qtdePessoas - 1; i >= posicao; i--){
			dados[i +1] = dados[i];
		}

		dados[posicao] = p;
		qtdePessoas++;

		return true;
	}

	/**
	 * 
	 * Este metodo deve retornar o numero de elementos existentes na lista neste
	 * momento.
	 * 
	 * @return
	 */
	public int getTamanho() {
		return qtdePessoas;
	}

	/**
	 * 
	 * Este metodo deve ser implementado de tal forma que ele retorne a Pessoa
	 * existente na posicao desejada, sendo que a primeira posicao deve comecar
	 * em zero. Caso seja informada uma posicao que nao esteja definida na
	 * lista, deve retornar null.
	 * 
	 * @param posicao
	 * @return
	 */
	public Pessoa getElemento(int posicao) {
		if (posicao < 0 || posicao >= qtdePessoas){
			return null;
		}

		return dados[posicao];
	}

	/**
	 * 
	 * O metodo imprimir deve retornar todos os nomes das pessoas existentes na
	 * lista, na ordem em que foram inseridos na lista. O formato deve seguir o
	 * padrao:
	 * 
	 * {Nome1, Nome2, ..., NomeN}
	 * 
	 * E caso a lista esteja vazia, deve retornar da seguinte forma: {}
	 * 
	 * @return
	 */
	public String imprimir() {
		if (qtdePessoas == 0){
			return "{}";
		}

		StringBuilder sb = new StringBuilder();
		sb.append("{");
		for (int i = 0; i < qtdePessoas; i++){
			sb.append(dados[i].nome);
			if (i < qtdePessoas - 1){
				sb.append(", ");
			}
		}

		sb.append("}");
		return sb.toString();
	}

	/**
	 * 
	 * O metodo remover deve retornar o objeto Pessoa existente na posicao
	 * informada como parametro e retirar o objeto da lista. Caso a posicao
	 * desejada nao exista na lista, deve ser retornado null.
	 * 
	 * @param posicao
	 * @return
	 */
	public Pessoa remover(int posicao) {
		if (posicao < 0 || posicao >= qtdePessoas){
			return null;
		}

		Pessoa removida = dados[posicao];

		for (int i = posicao; i < qtdePessoas - 1; i++){
			dados[i] = dados[i + 1];
		}

		dados[qtdePessoas - 1] = null;
		qtdePessoas--;

		return removida;
	}

	/**
	 * 
	 * O metodo posicaoNome procura dentre os elementos da lista se existe algum
	 * com o nome informado como parametro e retorna a posicao deste elemento na
	 * lista. Caso nao encontre nenhum elemento com este nome, deve retornar o
	 * valor -1.
	 * 
	 * @param nomeProcurado
	 * @return
	 */
	public int posicaoNome(String nomeProcurado) {
		for (int i = 0; i < qtdePessoas; i++){
			if (dados[i].nome.equals(nomeProcurado)){
				return i;
			}
		}

		return -1;
	}

}
