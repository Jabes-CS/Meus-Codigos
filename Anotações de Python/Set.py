#Conhecendo set!
colecao = {11122233344, 22233344455, 33344455566}
#Para adicionar um elemento a um set devemos chamar a função add
colecao.add(44455566677) #vai adicionar pois não existe ainda
#Se usarmos um valor existente?
colecao.add(11122233344) #nao vai adicionar pois este CPF já existe!
#Testando!
for Cpf in colecao:
    print(Cpf) #Sera impresso fora de ordem, pois o set ele nã é ordenado.