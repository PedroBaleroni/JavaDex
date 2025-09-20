![alt text][pokemon]

# JavaDex
Criando uma Pokedex em Java

## Estrutura Padrão

- Main
- Classes
- Model utilizando um vetor de elementos como uma simulação de Banco de Dados

## Classes:

### Pokemon
 - Numero: int => Numero do Pokemon na Pokedex
 - Nome: String => Nome do Pokemon
 - Tipo: Class => Tipo do Pokemon
 - Vida: int => Vida do Pokemon
 - Peso: float => Peso do Pokemon
 - Altura: int => Altura do Pokemon
 - Evolui: boolean => informa se o Pokemon Evolui ou não

### Tipo

- Indice: int => Utilizado para simular o Banco de Dados
- Nome: String => Nome do Tipo do Pokemon
- Fraquezas: List<Class>=> Lista os tipos que o pokemon tem Fraqueza
- Resistencias: List<Class>=> Lista os tipos que o pokemon tem Resistencia

***

## Refatorar

### Adicionar Classe "PokemonLocal":

- Nome: String => Nome do Pokemon do Treinador
- Especie: Class Pokemon => Especie Pokemon do Treinador
- Nivel: int => Nivel do Pokemon do Treinador (inicia em 1)
- Peso: float => Peso do Pokemon do Treinador
- Altura: int => Altura do Pokemon do Treinador
- Vida: int => Vida do Pokemon do Treinador

### Modificar Classe "Pokemon":

- Remover Tipo1
- Remover Tipo2
- Remover Peso
- Remover Altura
- Remover Vida
- Remover Evolui
- Criar:
    - Tipos: List<Class Tipo> => Lista de Tipos do Pokemon
    - EvoluiPara: Class Pokemon => Pokemon para qual o Pokemon evolui
    - EvoluiEm: int => Nivel que o Pokemon deve ter para evoluir
    - isLendario: boolean => informa se o Pokemon é Lendário/Mítico

### Modificar Tipo:
- Remover indice -> Só referenciar pelo Tipo

### DataBase:
- Criar Seeder para Tipos
    - Um construtor instanciado para cada especie
    - "Tipo normal = new Tipo("Normal")"
    - Após todos os Tipos construidos:
    - Adicionar Tipos Fraqueza e Resistencia para cada tipo.
- Criar Seeder para todos os Pokemons
    - Adicionar Evolucoes

[pokemon]:https://imguscdn.gamespress.com/cdn/files/PokemonAmerica/2019/07/09125735-7b00e266-d991-41da-9267-843e49ce62a7/Pokemon_Logo.jpg?w=240&mode=max&otf=y&quality=90&format=jpg&bgcolor=white&sky=943c262a0f612e64318817262f0963f21d043f231ba7bf27dea206304c70e2c7 "JavaDex"