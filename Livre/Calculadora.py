def Calculadora():
    n1 = int(input("Digite o primeiro número: "))
    n2 = int(input("Digite o segundo número: "))

    soma = n1 + n2
    mult = n1 * n2
    
    print(soma)
    print(mult)
    
    

    if soma % 2 == 0 or soma % 2 == 0:
        print("Esse número é par!".format(soma, mult))
    elif soma % 2 != 0 or mult % 2 != 0:
        print(f"{soma, mult}Esse número é impar!")
    else:
        print("Verifique o código novamente pois algo deu errado. ksksksk")
        

Calculadora()
