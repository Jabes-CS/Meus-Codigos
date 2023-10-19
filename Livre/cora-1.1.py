# Autor: [Jabes]
# Data: [14/04/2023]
# Propósito: Desenhar um coração usando a biblioteca Turtle do Python

import math
from turtle import *

# Função para calcular a coordenada x do coração
def hearta(k):
    return 15 * math.sin(k) ** 3

# Função para calcular a coordenada y do coração
def heartb(k):
    return 12 * math.cos(k) - 5 * math.cos(2 * k) - 2 * math.cos(3 * k) - math.cos(4 * k)

# Configurações iniciais da tela
speed(5)
bgcolor("black")

# Desenha o coração
for i in range(100):
    goto(hearta(i) * 20, heartb(i) * 20)
    color("#f73487")
    
# Adiciona mais cores para melhorar a estética do desenho
    if i % 25 == 0:
        color("#FF1493")
    elif i % 50 == 0:
        color("#FF69B4")

# Retorna a tartaruga para o ponto inicial
    goto(0, 0)

# Exibe uma mensagem para o usuário
print("Desenho concluído!")

# Finaliza o programa
done()
