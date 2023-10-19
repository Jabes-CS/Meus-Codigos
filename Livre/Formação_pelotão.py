n = int(input("digite um número: "))
linha = col = 1
for i in range(int(n/2)+1):
    if i*i == n:
        linha = col = i
        break
    elif (i*i) > n:
        linha = i
        col = i -1
        break

if (linha*col) > n:
    linha = linha -1
for i in range(linha):
    for j in range(col):
        print("*", end="")
    print()
resto = n - (linha)*col
if(resto):
    for k in range(resto):
        print("*", end="")
print(f"\n{linha}X{col}", end = '')
if resto:
    print(f" + {resto}")