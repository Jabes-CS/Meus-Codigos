num_base = int(input("Digite o número base: "))
num_expoente = int(input("Digite o número exponencial: "))

#Metodo recursivo
#Os valores de num_base e num_exponecial são armazenados pelas variaveis (base e exponencial)
def Exponencial(base, expoente):

#Aqui esses valores seram passados por um comparativo, para if-se expoente == 0 será retornado 1, por que todo número elevado a 0 é 1
    if expoente == 0:
        return 1

#O returno disso tudo vai-se dessa construção a baixo
    return base * Exponencial(base, expoente - 1)

#Você armazena os resultado das variaveis num_base e num_exponecial e lança ela para a função Exponencial(base, exponencial)
print(Exponencial(num_base, num_expoente))
