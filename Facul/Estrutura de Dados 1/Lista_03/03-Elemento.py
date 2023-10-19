def buscaMatriz(matriz, valor):
    #Verificação de tamanho da matriz na linha e coluna!
    linhas = len(matriz)
    colunas = len(matriz[0])
    
    for i in range(linhas):
        for j in range(colunas):
            if matriz[i][j] == valor:
                return [i, j]
    
    return [-1, -1]

# Exemplo:
matriz = [[1, 2, 3], 
          [4, 5, 6], 
          [7, 8, 9]]

valor1 = 5
valor2 = 10

posicao1 = buscaMatriz(matriz, valor1)
posicao2 = buscaMatriz(matriz, valor2)

print("Matriz: {}".format(matriz))
print("Busca pelo valor {}: {}".format(valor1, posicao1))
print("Busca pelo valor {}: {}".format(valor2, posicao2))
