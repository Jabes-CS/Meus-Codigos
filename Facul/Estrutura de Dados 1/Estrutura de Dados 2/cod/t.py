def hash_function(city_name, table_size):
    # Constante de escala (geralmente um valor decimal entre 0 e 1)
    A = 0.61803398875

    hash_value = 0
    for char in city_name:
        hash_value += ord(char)

    # Aplica a técnica de multiplicação
    hash_value = (hash_value * A) % 1

    # Calcula o índice na tabela hash
    index = int(table_size * hash_value)

    return index

# Tamanho da tabela hash
table_size = 5570

# Exemplo de uso:
city_name1 = "Sao Paulo"
city_name2 = "BH"
city_name3 = "MG"

index = hash_function(city_name1, table_size)
print(f"A cidade '{city_name1}' será armazenada no índice {index} da tabela hash.")

index = hash_function(city_name2, table_size)
print(f"A cidade '{city_name2}' será armazenada no índice {index} da tabela hash.")

index = hash_function(city_name3, table_size)
print(f"A cidade '{city_name3}' será armazenada no índice {index} da tabela hash.")

