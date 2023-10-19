class Palavra:
    def __init__(self, vogais, consoantes):
        self.vogais = vogais
        self.consoantes = consoantes

def criaPalavra(palavra):
    nova_palavra = Palavra([], [])

    # Cria um conjunto para armazenar as vogais e outro para as consoantes
    vogais = set()
    consoantes = set()

    # Percorre cada caractere da palavra recebida como parâmetro
    for letra in palavra:
        # Verifica se é uma vogal
        if letra.lower() in "aeiou":
            vogais.add(letra.lower())
        # Caso contrário, é uma consoante
        elif letra.isalpha():
            consoantes.add(letra.lower())

    # Converte os conjuntos em listas e ordena em ordem alfabética
    nova_palavra.vogais = sorted(list(vogais))
    nova_palavra.consoantes = sorted(list(consoantes))

    return nova_palavra
