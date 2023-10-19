def calcular(a):
    if a == 1:
        return 1
    else:
        return a * calcular(a - 1)

calcular(5)
print(calcular(5))
