class No:
    def __init__(self, dado):
        self.dado = dado  # Armazena o dado do nó
        self.proximo = None # Referência para o próximo nó 

#O uso de self permite que os métodos acessem e manipulem os atributos e métodos do próprio objeto em que estão sendo chamados.

class PilhaListaLigada:
    def __init__(self):
        self.topo = None  # Inicializa a pilha com o topo vazio

    def empilhar(self, dado):
        novo_no = No(dado)  # Cria um novo nó com o dado fornecido
        if self.topo is None:  # Se a pilha está vazia
            self.topo = novo_no  # O novo nó se torna o topo
        else:
            novo_no.proximo = self.topo  # O próximo do novo nó é o antigo topo
            self.topo = novo_no  # O novo nó se torna o topo

    def desempilhar(self):
        if self.topo is None:  # Se a pilha está vazia
            return None  # Retorna None
        else:
            no_desempilhado = self.topo  # Armazena o nó do topo a ser desempilhado
            self.topo = self.topo.proximo  # Atualiza o topo para o próximo nó
            no_desempilhado.proximo = None  # Remove a referência do nó desempilhado
            return no_desempilhado.dado  # Retorna o dado do nó desempilhado

    def esta_vazia(self):
        return self.topo is None  # Retorna True se o topo está vazio, False caso contrário


class VerificadorExpressao:
    def esta_expressao_valida(self, expressao):
        pilha = PilhaListaLigada()  # Cria uma instância da classe PilhaListaLigada
        simbolos_abertura = ['{', '[', '(']  # Lista de símbolos de abertura
        simbolos_fechamento = ['}', ']', ')']  # Lista de símbolos de fechamento

        for caractere in expressao:  # Percorre cada caractere na expressão
            if caractere in simbolos_abertura:  # Se o caractere é um símbolo de abertura
                pilha.empilhar(caractere)  # Empilha o caractere na pilha
            elif caractere in simbolos_fechamento:  # Se o caractere é um símbolo de fechamento
                if pilha.esta_vazia():  # Se a pilha está vazia
                    return False  # A expressão não está balanceada
                else:
                    simbolo_desempilhado = pilha.desempilhar()  # Desempilha um símbolo da pilha
                    if simbolos_abertura.index(simbolo_desempilhado) != simbolos_fechamento.index(caractere):
                        return False

        return pilha.esta_vazia()


# Testes
expressoes = [
    "(2+2) * 8",
    "(2+2",
    "{[(2*2) + 7] * 3}",
    "(2+2)*[4*3]",
    "([2+3)*9]",
    "((((((7+1)))))",
    "]7/2["
]