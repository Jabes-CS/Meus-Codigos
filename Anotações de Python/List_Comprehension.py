#A palavra_secreta armazenara todos os caracteres da resposta do usúario com letras MAIUSCULA 
#palavra_secreta = "maça".upper()
#Essa construção, faz com que a quantidade de caracteres almente altomaticamente conforme o tamanho da palavra_secreta
#Onde letras acertadas é igual ao tamanho de espaços de caracteres!
#Sendo assim, se letra estiver dentro da palavra_secreta 
#ela retorna a ocupação de um espaço de letras acertadas correspondente ao tamanho da palavra_secreta.
#letras_acertadas = ["_" for letra in palavra_secreta]

#Forma normal de se fazer um .upper()
frutas = ["maçã", "banana", "laranja", "melancia"]
lista = []
for fruta in frutas:
    lista.append(fruta.upper())
print(lista)



#Outra forma de se fazer, agoa usando o Loop de Lista Comprehesion
frutas = ["maçã", "banana", "laranja", "melancia"]
lista = [fruta.upper() for fruta in frutas]
print(lista)



#Calculo do quadrados de números inteiros com list Comprehension
inteiros = [1,3,4,5,7,8]
quadrados = [n*n for n in inteiros]
print(quadrados)

#Calculo de exponencial de números inteiros com list Comprehension
#Calculo do quadrados de números inteiros com list Comprehension
inteiros = [1,3,4,5,7,8]
quadrados = [n**n for n in inteiros]
print(quadrados)

#Descobrindo qual numero de uma lista é par!
inteiros = [1,3,4,5,7,8,9]
pares = []

for numero in inteiros:
    if numero % 2 == 0:
        pares.append(numero)
print(pares)

#Agora usando List Comprehension
inteiros = [1,3,4,5,7,8,9]
pares = [numero for numero in inteiros if numero % 2 == 0]
impar = [numero for numero in inteiros if numero % 2 != 0]
print("Números Par: {}".format(pares))
print("Número Impar: {}".format(impar))

#Descobrindo valor maximo e minimo de uma lista
Temperatura = [68, 23, 81]
print(min(Temperatura))
print(max(Temperatura))
#Ou pode se armazanar o valor em outra variavel
Clacificacao = [1, 5, 9, 3]
#Armazenando o valor maximo e minimo dentro de uma variavel
max_Clacificacao = max(Clacificacao)
min_Clacificacao = min(Clacificacao)
#Chamando o resultado a travez da variavel que tem o valor e passando a traves da função .format()
print("Ultima clacificação da lista: {}".format(max_Clacificacao))
print("Primeira clacificação na lista: {}".format(min_Clacificacao))
