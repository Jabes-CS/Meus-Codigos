def transposta(matriz):

    if matriz is None:
        return None
    
    else:
        linhas = len(matriz)
        colunas = len(matriz[0])
        matriz_transposta = []

        for j in range(colunas):
            nova_linha = []
            
            for i in range(linhas):
                nova_linha.append(matriz[i][j])
            matriz_transposta.append(nova_linha)
        return matriz_transposta

A = [[5, 7, 3], 
     [1, 0, 8], 
     [2, 2, 2]]

A_transposta = transposta(A)
print(A_transposta)
