/**
 * 
 * Classe com os testes automaticos que serao utilizados para validar se o
 * exercicio estah correto ou nao.
 * 
 * ESTA CLASSE NAO DEVE SER ALTERADA.
 * 
 */
public class ListaLigadaOrdenadaTestes {

	public static void main(String[] args) {
		boolean teste01 = testeListaLigadaOrdenada01();

		boolean teste02 = testeListaLigadaOrdenada02();

		boolean teste03 = testeListaLigadaOrdenada03();

		boolean teste04 = testeListaLigadaOrdenada04();

		boolean teste05 = testeListaLigadaOrdenada05();

		boolean teste06 = testeListaLigadaOrdenada06();

		boolean teste07 = testeListaLigadaOrdenada07();

		boolean teste08 = testeListaLigadaOrdenada08();

		boolean teste09 = testeListaLigadaOrdenada09();

		boolean teste10 = testeListaLigadaOrdenada10();

		boolean teste11 = testeListaLigadaOrdenada11();

		boolean teste12 = testeListaLigadaOrdenada12();

		boolean teste13 = testeListaLigadaOrdenada13();

		boolean teste14 = testeListaLigadaOrdenada14();

		boolean teste15 = testeListaLigadaOrdenada15();

		boolean teste16 = testeListaLigadaOrdenada16();

		boolean teste17 = testeListaLigadaOrdenada17();

		boolean teste18 = testeListaLigadaOrdenada18();

		if (teste01 && teste02 && teste03 && teste04 && teste05 && teste06
				&& teste07 && teste08 && teste09 && teste10 && teste11
				&& teste12 && teste13 && teste14 && teste15 && teste16
				&& teste17 && teste18 && true) {
			System.out.println("Todos os testes realizados com sucesso");
		} else {
			System.err.println("Algum teste falhou!");
			
		}

	}

	private static boolean testeListaLigadaOrdenada01() {
		Lista05 lista = new Lista05();

		Pessoa a = new Pessoa("Joao", 10);
		lista.inserir(a);

		Pessoa b = new Pessoa("Maria", 20);
		lista.inserir(b);

		Pessoa c = new Pessoa("Pedro", 30);
		lista.inserir(c);
	
		if (lista.quantidadePessoas() != 3) {
			System.err.println("Erro testeListaLigadaOrdenada01 - 1");
			return false;
		}

		String nomes = lista.imprimir();
		if (!nomes.equals("{Joao, Maria, Pedro}")) {
			System.err.println("Erro testeListaLigadaOrdenada01 - 2");
			return false;
		}

		return true;
	}

	private static boolean testeListaLigadaOrdenada02() {
		Lista05 lista = new Lista05();

		Pessoa a = new Pessoa("Joao", 10);
		lista.inserir(a);

		if (lista.quantidadePessoas() != 1) {
			System.err.println("Erro testeListaLigadaOrdenada02 - 1");
			return false;
		}

		String nomes = lista.imprimir();
		if (!nomes.equals("{Joao}")) {
			System.err.println("Erro testeListaLigadaOrdenada02 - 2");
			return false;
		}

		return true;
	}

	private static boolean testeListaLigadaOrdenada03() {
		Lista05 lista = new Lista05();

		if (lista.quantidadePessoas() != 0) {
			System.err.println("Erro testeListaLigadaOrdenada03 - 1");
			return false;
		}

		String nomes = lista.imprimir();
		if (!nomes.equals("{}")) {
			System.err.println("Erro testeListaLigadaOrdenada03 - 2");
			return false;
		}

		return true;
	}

	private static boolean testeListaLigadaOrdenada04() {
		Lista05 lista = new Lista05();

		Pessoa a = new Pessoa("Pedro", 30);
		lista.inserir(a);

		Pessoa b = new Pessoa("Joao", 10);
		lista.inserir(b);

		Pessoa c = new Pessoa("Maria", 20);
		lista.inserir(c);

		if (lista.quantidadePessoas() != 3) {
			System.err.println("Erro testeListaLigadaOrdenada04 - 1");
			return false;
		}

		String nomes = lista.imprimir();
		if (!nomes.equals("{Joao, Maria, Pedro}")) {
			System.err.println("Erro testeListaLigadaOrdenada04 - 2");
			return false;
		}

		return true;
	}

	private static boolean testeListaLigadaOrdenada05() {
		Lista05 lista = new Lista05();

		Pessoa a = new Pessoa("Pedro", 30);
		lista.inserir(a);

		Pessoa b = new Pessoa("Maria", 20);
		lista.inserir(b);

		if (lista.quantidadePessoas() != 2) {
			System.err.println("Erro testeListaLigadaOrdenada05 - 1");
			return false;
		}

		String nomes = lista.imprimir();
		if (!nomes.equals("{Maria, Pedro}")) {
			System.err.println("Erro testeListaLigadaOrdenada05 - 2");
			return false;
		}

		return true;
	}

	private static boolean testeListaLigadaOrdenada06() {
		Lista05 lista = new Lista05();

		Pessoa a = new Pessoa("Joao", 10);
		lista.inserir(a);

		Pessoa recuperada = lista.recuperarPorNome("Joao");

		if (recuperada == null) {
			System.err.println("Erro testeListaLigadaOrdenada06 - 1");
			return false;
		}

		if (!recuperada.equals(a)) {
			System.err.println("Erro testeListaLigadaOrdenada06 - 2");
			return false;
		}

		return true;
	}

	private static boolean testeListaLigadaOrdenada07() {
		Lista05 lista = new Lista05();

		Pessoa a = new Pessoa("Joao", 10);
		lista.inserir(a);

		Pessoa b = new Pessoa("Maria", 20);
		lista.inserir(b);

		Pessoa c = new Pessoa("Pedro", 30);
		lista.inserir(c);

		Pessoa recuperada = lista.recuperarPorNome("Maria");

		if (recuperada == null) {
			System.err.println("Erro testeListaLigadaOrdenada07 - 1");
			return false;
		}

		if (!recuperada.equals(b)) {
			System.err.println("Erro testeListaLigadaOrdenada07 - 2");
			return false;
		}

		return true;
	}

	private static boolean testeListaLigadaOrdenada08() {
		Lista05 lista = new Lista05();

		Pessoa a = new Pessoa("Pedro", 30);
		lista.inserir(a);

		Pessoa b = new Pessoa("Joao", 10);
		lista.inserir(b);

		Pessoa c = new Pessoa("Maria", 20);
		lista.inserir(c);

		Pessoa recuperada = lista.recuperarPorNome("Pedro");

		if (recuperada == null) {
			System.err.println("Erro testeListaLigadaOrdenada08 - 1");
			return false;
		}

		if (!recuperada.equals(a)) {
			System.err.println("Erro testeListaLigadaOrdenada08 - 2");
			return false;
		}

		return true;
	}

	private static boolean testeListaLigadaOrdenada09() {
		Lista05 lista = new Lista05();

		Pessoa recuperada = lista.recuperarPorNome("Pedro");

		if (recuperada != null) {
			System.err.println("Erro testeListaLigadaOrdenada09 - 1");
			return false;
		}

		return true;
	}

	private static boolean testeListaLigadaOrdenada10() {
		Lista05 lista = new Lista05();

		Pessoa a = new Pessoa("Joao", 10);
		lista.inserir(a);

		Pessoa b = new Pessoa("Maria", 20);
		lista.inserir(b);

		Pessoa c = new Pessoa("Pedro", 30);
		lista.inserir(c);

		if (lista.quantidadePessoas() != 3) {
			System.err.println("Erro testeListaLigadaOrdenada10 - 1");
			return false;
		}

		String nomes1 = lista.imprimir();
		if (!nomes1.equals("{Joao, Maria, Pedro}")) {
			System.err.println("Erro testeListaLigadaOrdenada10 - 2");
			return false;
		}

		lista.remover(0);

		String nomes2 = lista.imprimir();
		if (!nomes2.equals("{Maria, Pedro}")) {
			System.err.println("Erro testeListaLigadaOrdenada10 - 3");
			return false;
		}

		return true;
	}

	private static boolean testeListaLigadaOrdenada11() {
		Lista05 lista = new Lista05();

		Pessoa a = new Pessoa("Joao", 10);
		lista.inserir(a);

		Pessoa b = new Pessoa("Maria", 20);
		lista.inserir(b);

		Pessoa c = new Pessoa("Pedro", 30);
		lista.inserir(c);

		lista.remover(2);

		String nomes2 = lista.imprimir();
		if (!nomes2.equals("{Joao, Maria}")) {
			System.err.println("Erro testeListaLigadaOrdenada11 - 1");
			return false;
		}

		return true;
	}

	private static boolean testeListaLigadaOrdenada12() {
		Lista05 lista = new Lista05();

		Pessoa a = new Pessoa("Joao", 10);
		lista.inserir(a);

		Pessoa b = new Pessoa("Maria", 20);
		lista.inserir(b);

		Pessoa c = new Pessoa("Pedro", 30);
		lista.inserir(c);

		lista.remover(1);

		String nomes2 = lista.imprimir();
		if (!nomes2.equals("{Joao, Pedro}")) {
			System.err.println("Erro testeListaLigadaOrdenada12 - 1");
			return false;
		}

		return true;
	}

	private static boolean testeListaLigadaOrdenada13() {
		Lista05 lista = new Lista05();

		Pessoa a = new Pessoa("Joao", 10);
		lista.inserir(a);

		Pessoa b = new Pessoa("Maria", 20);
		lista.inserir(b);

		Pessoa c = new Pessoa("Pedro", 30);
		lista.inserir(c);

		lista.remover(0);
		lista.remover(0);
		lista.remover(0);

		String nomes2 = lista.imprimir();
		if (!nomes2.equals("{}")) {
			System.err.println("Erro testeListaLigadaOrdenada13 - 1");
			return false;
		}

		return true;
	}

	private static boolean testeListaLigadaOrdenada14() {
		Lista05 lista = new Lista05();

		lista.remover(0);

		String nomes = lista.imprimir();
		if (!nomes.equals("{}")) {
			System.err.println("Erro testeListaLigadaOrdenada14 - 1");
			return false;
		}

		return true;
	}

	private static boolean testeListaLigadaOrdenada15() {
		Lista05 lista = new Lista05();

		Pessoa a = new Pessoa("Joao", 10);
		lista.inserir(a);

		lista.remover(-10);

		String nomes1 = lista.imprimir();
		if (!nomes1.equals("{Joao}")) {
			System.err.println("Erro testeListaLigadaOrdenada15 - 1");
			return false;
		}

		lista.remover(100);

		String nomes2 = lista.imprimir();
		if (!nomes2.equals("{Joao}")) {
			System.err.println("Erro testeListaLigadaOrdenada15 - 2");
			return false;
		}

		return true;
	}

	private static boolean testeListaLigadaOrdenada16() {
		Lista05 lista = new Lista05();

		Pessoa a = new Pessoa("Joao", 10);
		lista.inserir(a);

		Pessoa b = new Pessoa("Maria", 20);
		lista.inserir(b);

		Pessoa c = new Pessoa("Pedro", 30);
		lista.inserir(c);

		Pessoa maisVelha = lista.pessoaMaisVelha();

		if (maisVelha == null) {
			System.err.println("Erro testeListaLigadaOrdenada16 - 1");
			return false;
		}

		if (!maisVelha.equals(c)) {
			System.err.println("Erro testeListaLigadaOrdenada16 - 2");
			return false;
		}

		return true;
	}

	private static boolean testeListaLigadaOrdenada17() {
		Lista05 lista = new Lista05();

		Pessoa a = new Pessoa("Joao", 10);
		lista.inserir(a);

		Pessoa maisVelha = lista.pessoaMaisVelha();

		if (maisVelha == null) {
			System.err.println("Erro testeListaLigadaOrdenada17 - 1");
			return false;
		}

		if (!maisVelha.equals(a)) {
			System.err.println("Erro testeListaLigadaOrdenada17 - 2");
			return false;
		}

		return true;
	}

	private static boolean testeListaLigadaOrdenada18() {
		Lista05 lista = new Lista05();

		Pessoa maisVelha = lista.pessoaMaisVelha();

		if (maisVelha != null) {
			System.err.println("Erro testeListaLigadaOrdenada18 - 1");
			return false;
		}

		return true;
	}

}
