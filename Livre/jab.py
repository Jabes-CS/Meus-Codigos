import turtle
import random

# Configuração da tela
screen = turtle.Screen()
screen.bgcolor("white")

# Lista de cores
colors = ["red", "blue", "green", "orange", "purple", "pink", "yellow"]

# Configurações da tartaruga
t = turtle.Turtle()
t.speed(0)  # Define a velocidade máxima
t.penup()
t.goto(-50, 0)
t.pendown()
t.color("black")
t.write("Jabes", font=("Arial", 30, "normal"))

# Loop de mudança de cores
while True:
    random_color = random.choice(colors)
    screen.bgcolor(random_color)
    turtle.delay(500)  # Aguarda 0,5 segundos antes de mudar a cor novamente

# Finalização
turtle.done()
