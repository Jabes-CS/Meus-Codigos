import logging
import threading
import time

def thread_function(name):
    # Registra mensagem de log indicando que o thread está iniciando
    logging.info("Thread %s: starting", name)  
    # Pausa a execução do código por 2 segundos
    time.sleep(2)  
    # Registra mensagem de log indicando que o thread está finalizando
    logging.info("Thread %s: finishing", name)  

if __name__ == "__main__":
    format = "%(asctime)s: %(message)s"
    # Configura o formato e nível das mensagens de log a serem registradas
    logging.basicConfig(format=format, level=logging.INFO, datefmt="%H:%M:%S")

# Registra mensagem de log indicando que o thread principal está prestes a criar um thread
logging.info("Main : before creating thread")  
# Cria um objeto Thread que chama thread_function, passando um argumento de número inteiro "1"
x = threading.Thread(target=thread_function, args=(1,))  
# Registra mensagem de log indicando que o thread principal está prestes a iniciar o thread criado
logging.info("Main : before running thread")  
# Inicia a execução do thread criado
x.start()  
# Registra mensagem de log indicando que o thread principal está esperando a conclusão do thread criado
logging.info("Main : wait for the thread to finish") 
# Registra mensagem de log final indicando que tudo está concluído 
logging.info("Main : all done")  
