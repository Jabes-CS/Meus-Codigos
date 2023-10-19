import numpy as np 

A = np.array([[7,3], [15,-2]])
B = np.array([[23],[24]])


for lista in (A):
    coeficientes = len(lista)
    break

resultados = 0

for valor in (B):
    resultados += 1
    
if coeficientes != resultados:
    print('O sistema deve ser quadrado')
    print('****************************')
    print("\n\n\n\n")
    
determinante = np.linalg.det(A)

if determinante != 0:
    
    A_inversa = np.linalg.inv(A)
    
    incogtas = np.dot(A_inversa, B)
    
    print('****************************************')
    print('A MATRIZ DIGITADA COM OS COEFICIENTES É:')
    print(A)
    print('****************************************')
    print('A MATRIZ DIGITADA COM AS RESPOSTAS É: ')
    print(B)
    print('****************************************')
    print('AS INCOGTAS EM ORDEM RESPECTIVA SÃO: ')
    print(incogtas)
    
else:
    print('O SISTEMA É IMPOSSÍVEL OU INDETERMINADO')