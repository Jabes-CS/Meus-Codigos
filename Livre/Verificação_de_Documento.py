import re

# Definir a estrutura de dados para armazenar as informações
dados_pessoais = {
    'nome': '',
    'email': '',
    'rg': '',
    'cpf': '',
    # outros documentos podem ser adicionados aqui
}

# Definir expressões regulares para validar os campos
regex_rg = r'^\d{1,2}\.\d{3}\.\d{3}-\d{1}$'
regex_cpf = r'^\d{3}\.\d{3}\.\d{3}-\d{2}$'
regex_email = r'^\w+@[a-zA-Z_]+?\.[a-zA-Z]{2,3}$'

# Solicitar ao usuário as informações e validar os campos
while not dados_pessoais['nome']:
    nome = input('Digite seu nome completo: ')
    if nome:
        dados_pessoais['nome'] = nome
    else:
        print('Nome é um campo obrigatório. Tente novamente.')

while not dados_pessoais['email']:
    email = input('Digite seu endereço de email: ')
    if re.match(regex_email, email):
        dados_pessoais['email'] = email
    else:
        print('Email inválido. Tente novamente.')

while not dados_pessoais['rg']:
    rg = input('Digite seu RG no formato XX.XXX.XXX-X: ')
    if re.match(regex_rg, rg):
        dados_pessoais['rg'] = rg
    else:
        print('RG inválido. Tente novamente.')

while not dados_pessoais['cpf']:
    cpf = input('Digite seu CPF no formato XXX.XXX.XXX-XX: ')
    if re.match(regex_cpf, cpf):
        dados_pessoais['cpf'] = cpf
    else:
        print('CPF inválido. Tente novamente.')

# Exibir os dados armazenados
print('Dados pessoais:')
for chave, valor in dados_pessoais.items():
    print(f'{chave}: {valor}')