/**
 * 
 * Classe de testes.
 * 
 * A correcao final irah considerar a execucao de todos os casos.
 * 
 */
public class TestesLista04 {

	public static void main(String[] args) {
		TestesLista04 testes = new TestesLista04();

		boolean caso01 = testes.testeCaso01();

		boolean caso02 = testes.testeCaso02();

		boolean caso03 = testes.testeCaso03();

		boolean caso04 = testes.testeCaso04();

		boolean caso05 = testes.testeCaso05();

		boolean caso06 = testes.testeCaso06();

		boolean caso07 = testes.testeCaso07();

		boolean caso08 = testes.testeCaso08();

		boolean caso09 = testes.testeCaso09();

		boolean caso10 = testes.testeCaso10();

		boolean caso11 = testes.testeCaso11();

		boolean caso12 = testes.testeCaso12();

		if (
				caso01 &&
				caso02 && 
				caso03 && 
				caso04 && 
				caso05 && 
				caso06 && 
				caso07 && 
				caso08 && 
				caso09 && 
				caso10 && 
				caso11 && 
				caso12 &&
				true) {
			System.out.println("Todos os testes executados com sucesso.");
		} else {
			System.err.println("Algum teste falhou.");
		}

	}

	private boolean testeCaso01() {
		Lista04 lista = new Lista04(3);

		Pessoa a = new Pessoa("Joao", 40);
		lista.inserir(a);

		Pessoa b = new Pessoa("Marcelo", 31);
		lista.inserir(b);

		Pessoa c = new Pessoa("Maria", 50);
		lista.inserir(c);

		int tamanho = lista.getTamanho();
		if (tamanho != 3) {
			System.err.println("testeCaso01 - 1");
			return false;
		}

		Pessoa d = new Pessoa("Pedro", 60);
		lista.inserir(d);

		tamanho = lista.getTamanho();
		if (tamanho != 3) {
			System.err.println("testeCaso01 - 2");
			return false;
		}

		return true;
	}

	private boolean testeCaso02() {
		Lista04 lista = new Lista04(3);

		Pessoa a = new Pessoa("Joao", 40);
		lista.inserir(a);

		Pessoa b = new Pessoa("Marcelo", 31);
		lista.inserir(b);

		Pessoa c = new Pessoa("Maria", 50);
		lista.inserir(c);

		Pessoa novaA = lista.getElemento(0);

		if (novaA == null) {
			System.err.println("testeCaso02 - 1");
			return false;
		}

		if (!novaA.equals(a)) {
			System.err.println("testeCaso02 - 2");
			return false;
		}

		int tamanho = lista.getTamanho();
		if (tamanho != 3) {
			System.err.println("testeCaso02 - 3");
			return false;
		}

		return true;
	}

	private boolean testeCaso03() {
		Lista04 lista = new Lista04(3);

		Pessoa c = new Pessoa("Maria", 50);
		lista.inserir(c);

		Pessoa a = new Pessoa("Joao", 40);
		lista.inserir(a);

		Pessoa b = new Pessoa("Marcelo", 31);
		lista.inserir(b);

		Pessoa nova = lista.getElemento(0);

		if (nova == null) {
			System.err.println("testeCaso03 - 1");
			return false;
		}

		if (!nova.equals(a)) {
			System.err.println("testeCaso03 - 2");
			return false;
		}

		return true;
	}

	private boolean testeCaso04() {
		Lista04 lista = new Lista04(1);

		Pessoa a = new Pessoa("Joao", 40);
		lista.inserir(a);

		Pessoa novaA = lista.getElemento(0);

		if (novaA == null) {
			System.err.println("testeCaso04 - 1");
			return false;
		}

		if (!novaA.equals(a)) {
			System.err.println("testeCaso04 - 2");
			return false;
		}

		Pessoa b = new Pessoa("Artur", 40);
		lista.inserir(b);

		Pessoa novaB = lista.getElemento(0);

		if (novaB == null) {
			System.err.println("testeCaso04 - 3");
			return false;
		}

		if (!novaB.equals(a)) {
			System.err.println("testeCaso04 - 4");
			return false;
		}

		return true;
	}

	private boolean testeCaso05() {
		Lista04 lista = new Lista04(3);

		Pessoa a = new Pessoa("Joao", 40);
		lista.inserir(a);

		Pessoa b = new Pessoa("Marcelo", 31);
		lista.inserir(b);

		Pessoa c = new Pessoa("Maria", 50);
		lista.inserir(c);

		String nomes = lista.imprimir();

		if (nomes == null) {
			System.err.println("testeCaso05 - 1");
			return false;
		}

		if (!nomes.equals("{Joao, Marcelo, Maria}")) {
			System.err.println("testeCaso05");
			return false;
		}

		return true;
	}

	private boolean testeCaso06() {
		Lista04 lista = new Lista04(1);

		Pessoa a = new Pessoa("Joao", 40);
		lista.inserir(a);

		Pessoa novaA = lista.getElemento(2);

		if (novaA != null) {
			System.err.println("testeCaso06 - 1");
			return false;
		}

		String nomes = lista.imprimir();
		if (nomes == null) {
			System.err.println("testeCaso06 - 2");
			return false;
		}

		if (!nomes.equals("{Joao}")) {
			System.err.println("testeCaso06 - 3");
			return false;
		}

		return true;
	}

	private boolean testeCaso07() {
		Lista04 lista = new Lista04(3);

		Pessoa a = new Pessoa("Joao", 40);
		lista.inserir(a);

		Pessoa b = new Pessoa("Joao", 31);
		lista.inserir(b);

		Pessoa c = new Pessoa("Joao", 50);
		lista.inserir(c);

		String nomes = lista.imprimir();

		if (nomes == null) {
			System.err.println("testeCaso07 - 1");
			return false;
		}

		if (!nomes.equals("{Joao, Joao, Joao}")) {
			System.err.println("testeCaso07 - 2");
			return false;
		}

		Pessoa novoB = lista.getElemento(1);
		if (novoB == null) {
			System.err.println("testeCaso07 - 3");
			return false;
		}

		if (!novoB.equals(b)) {
			System.err.println("testeCaso07 - 4");
			return false;
		}

		return true;
	}

	private boolean testeCaso08() {
		Lista04 lista = new Lista04(3);

		Pessoa a = new Pessoa("Joao", 40);
		lista.inserir(a);

		Pessoa b = new Pessoa("Marcelo", 31);
		lista.inserir(b);

		Pessoa c = new Pessoa("Maria", 50);
		lista.inserir(c);

		lista.remover(0);
		int tamanho = lista.getTamanho();

		if (tamanho != 2) {
			System.err.println("testeCaso08 - 1");
			return false;
		}

		lista.remover(0);
		tamanho = lista.getTamanho();

		if (tamanho != 1) {
			System.err.println("testeCaso08 - 2");
			return false;
		}

		lista.remover(0);
		tamanho = lista.getTamanho();

		if (tamanho != 0) {
			System.err.println("testeCaso08 - 3");
			return false;
		}

		lista.remover(0);
		tamanho = lista.getTamanho();

		if (tamanho != 0) {
			System.err.println("testeCaso08 - 4");
			return false;
		}

		return true;
	}

	private boolean testeCaso09() {
		Lista04 lista = new Lista04(3);

		Pessoa a = new Pessoa("Joao", 40);
		lista.inserir(a);

		Pessoa b = new Pessoa("Marcelo", 31);
		lista.inserir(b);

		Pessoa c = new Pessoa("Maria", 50);
		lista.inserir(c);

		Pessoa novaC = lista.remover(2);

		if (novaC == null) {
			System.err.println("testeCaso09 - 1");
			return false;
		}

		if (!novaC.equals(c)) {
			System.err.println("testeCaso09 - 2");
			return false;
		}

		return true;
	}

	private boolean testeCaso10() {
		Lista04 lista = new Lista04(3);

		Pessoa a = new Pessoa("Joao", 40);
		lista.inserir(a);

		Pessoa b = new Pessoa("Marcelo", 31);
		lista.inserir(b);

		Pessoa c = new Pessoa("Maria", 50);
		lista.inserir(c);

		Pessoa nova = lista.remover(5);

		if (nova != null) {
			System.err.println("testeCaso10 - 1");
			return false;
		}

		int tamanho = lista.getTamanho();

		if (tamanho != 3) {
			System.err.println("testeCaso10 - 2");
			return false;
		}

		return true;
	}

	private boolean testeCaso11() {
		Lista04 lista = new Lista04(3);

		Pessoa a = new Pessoa("Joao", 40);
		lista.inserir(a);

		Pessoa b = new Pessoa("Marcelo", 31);
		lista.inserir(b);

		Pessoa c = new Pessoa("Maria", 50);
		lista.inserir(c);

		lista.remover(1);

		String nomes = lista.imprimir();

		if (nomes == null) {
			System.err.println("testeCaso11 - 1");
			return false;
		}

		if (!nomes.equals("{Joao, Maria}")) {
			System.err.println("testeCaso11 - 2");
			return false;
		}

		return true;
	}

	private boolean testeCaso12() {
		Lista04 lista = new Lista04(3);

		Pessoa a = new Pessoa("Joao", 40);
		lista.inserir(a);

		Pessoa b = new Pessoa("Marcelo", 31);
		lista.inserir(b);

		Pessoa c = new Pessoa("Maria", 50);
		lista.inserir(c);

		int posC = lista.posicaoNome("Maria");

		if (posC != 2) {
			System.err.println("testeCaso12 - 1");
			return false;
		}

		int posNaoExiste = lista.posicaoNome("Pedro");

		if (posNaoExiste != -1) {
			System.err.println("testeCaso12 - 2");
			return false;
		}

		return true;
	}

}
