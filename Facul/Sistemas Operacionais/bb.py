import time, random  
from atpbar import atpbar, flush  
import threading  

def run_with_threading():
    # Define o número de threads
    nthreads = 100  
    # Define a função task que será executada por cada thread
    def task(n, name):  
        # Itera sobre um range de 0 até n, exibindo um progress bar com o nome da thread
        for i in atpbar(range(n), name=name):  
            # Pausa a execução do código por um pequeno intervalo de tempo
            time.sleep(0.0001)  
    # Cria uma lista para armazenar as threads
    threads = [] 
    # Loop para criar e iniciar as threads
    for i in range(nthreads):  
        # Define o nome da thread
        name = 'thread {}'.format(i)  
        # Gera um número inteiro aleatório entre 5 e 10000
        n = random.randint(5, 10000)  
        # Cria um objeto Thread que chama a função task, passando o número n e o nome como argumentos
        t = threading.Thread(target=task, args=(n, name))  
        # Inicia a execução da thread
        t.start()  
        # Adiciona a thread à lista de threads
        threads.append(t)  
        # Loop para esperar que todas as threads terminem
    for t in threads:  
        # Aguarda a finalização de cada thread
        t.join() 
        # Limpa a saída da barra de progresso
    flush()  

# Chama a função run_with_threading para executar o código
run_with_threading()  
