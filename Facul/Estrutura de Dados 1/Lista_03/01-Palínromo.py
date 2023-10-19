def ehPalindromo(palavra):
    # Estou usando .lower() para caso ouver, converte algum caractere de maiúscula para minúscula, para assim evitar problemas de comparação
    palavra = palavra.lower()
    
    # Variaveis de inicialização dos índices de início e do fim das palavras
    inicio = 0
    fim = len(palavra) - 1
    
    # Verifica se os caracteres nos índices correspondentes são iguais
    while inicio < fim:
        if palavra[inicio] != palavra[fim]:
            return False
        inicio += 1
        fim -= 1
    
    return True

print("\nSegue a baixo exemplos de palavras PALÍNDROMAS como (True e False). \nE enseguidda escreva palavras para verificar se é PALÍNDROMAS ou não.\n")

# Palavras já determinadas
palavra1 = "ama"
resultado1 = ehPalindromo(palavra1)
# Primeiro modelo de formatação
print(f"{palavra1}, é Palíndromo ? {resultado1}")

palavra2 = "abbccbba"
resultado2 = ehPalindromo(palavra2)
# Segundo modelo de fomatação "este é o que eu mais gosto".
print("{}, é Palíndromo ? {}".format(palavra2, resultado2))

palavra3 = "seres"
resultado3 = ehPalindromo(palavra3)
print("{}, é Palíndromo ? {}".format(palavra3, resultado3))

palavra4 = "ovo"
resultado4 = ehPalindromo(palavra4)
print("{}, é Palíndromo ? {}".format(palavra4, resultado4))

palavra5 = "reviver"
resultado5 = ehPalindromo(palavra5)
print("{}, é Plíndromo ? {}".format(palavra5, resultado5))

palavra6 = "programacao"
resultado6 = ehPalindromo(palavra6)
print("{}, é Palíndromo ? {}\n".format(palavra6, resultado6))


# Palavras escritas pelo usuário
palavra7 = input("Digite uma palavra Palíndroma: ")
resultado7 = ehPalindromo(palavra7)
print("{}, é Palíndromo ? {}".format(palavra7, resultado7))

palavra8 = input("Digite uma palavra Palíndroma: ")
resultado8 = ehPalindromo(palavra8)
print("{}, é Palíndromo ? {}".format(palavra8, resultado8))

palavra9 = input("Digite uma palavra Palíndroma: ")
resultado9 = ehPalindromo(palavra9)
print("{}, é Palíndromo ? {}".format(palavra9, resultado9))

palavra10 = input("Digite uma palavra Palíndroma: ")
resultado10 = ehPalindromo(palavra10)
print("{}, é Palíndromo ? {}".format(palavra10, resultado10))
