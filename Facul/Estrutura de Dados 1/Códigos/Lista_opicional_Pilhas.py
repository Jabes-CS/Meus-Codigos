class No:
    def __init__(self, dado):
        self.dado = dado
        self.proximo = None 

class PilhaListaLigada:
    def __init__(self):
        self.topo = None

    def empilhar(self, dado):
        novo_no = No(dado)
        if self.topo is None:
            self.topo = novo_no
        else:
            novo_no.proximo = self.topo
            self.topo = novo_no

    def desempilhar(self):
        if self.topo is None:
            return None
        else:
            no_desempilhado = self.topo
            self.topo = self.topo.proximo
            no_desempilhado.proximo = None
            return no_desempilhado.dado

    def esta_vazia(self):
        return self.topo is None


class VerificadorExpressao:
    def esta_expressao_valida(self, expressao):
        pilha = PilhaListaLigada()
        simbolos_abertura = ['{', '[', '(']
        simbolos_fechamento = ['}', ']', ')']

        for caractere in expressao:
            if caractere in simbolos_abertura:
                pilha.empilhar(caractere)
            elif caractere in simbolos_fechamento:
                if pilha.esta_vazia():
                    return False
                else:
                    simbolo_desempilhado = pilha.desempilhar()
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
    "((((((7+1))))))",
    "]7/2[",
    "{3 + { 5 + {2}}}",
    "7 + 7"
]

verificador = VerificadorExpressao()

for expressao in expressoes:
    resultado = verificador.esta_expressao_valida(expressao)
    print("Expressão: {}".format(expressao))
    print("Resultado: {}".format(resultado))
    print()
