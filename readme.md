# Conversor Binário-Decimal em Kotlin

Este projeto implementa um programa simples de conversão entre números binários e decimais utilizando a linguagem Kotlin. Ele permite que o usuário escolha se deseja converter um número binário para decimal ou um número decimal para binário. O programa faz as validações necessárias para garantir que as entradas do usuário estejam corretas.

## Funcionalidades

- **Conversão de Binário para Decimal**: Converte um número binário (composto apenas por dígitos 0 e 1) em um número decimal.
- **Conversão de Decimal para Binário**: Converte um número decimal positivo em um número binário.
- **Validação de Entradas**: O programa verifica se os números binários e decimais fornecidos pelo usuário são válidos, solicitando a correção em caso de erro.
- **Loop de Execução**: O programa permite realizar várias conversões até que o usuário decida sair.

## Como Usar

1. **Execução do Programa**: Ao executar o programa, você verá um menu inicial com as seguintes opções:
    ```
    Escolha a conversão:
    0 - Sair
    1 - Binário para Decimal
    2 - Decimal para Binário
    ```

2. **Escolha uma Opção**:
    - Digite `1` para converter um número binário em decimal.
    - Digite `2` para converter um número decimal em binário.
    - Digite `0` para encerrar o programa.

3. **Conversão de Binário para Decimal**:
    - Se você escolher a opção `1`, o programa solicitará que você insira um número binário (composto apenas por `0` e `1`).
    - Exemplo de entrada válida: `1011`
    - O programa então exibirá a conversão desse número binário para decimal.
    - Exemplo de saída: `O Número binário: 1011 convertido é: 11`

4. **Conversão de Decimal para Binário**:
    - Se você escolher a opção `2`, o programa solicitará que você insira um número decimal positivo.
    - Exemplo de entrada válida: `13`
    - O programa então exibirá a conversão desse número decimal para binário.
    - Exemplo de saída: `O Número decimal: 13 convertido é: 1101`

5. **Repetição de Conversão**:
    - Após cada conversão, o programa perguntará se você deseja fazer outra conversão:
      ```
      Deseja fazer outra conversão? (s/n)
      ```
    - Digite `s` para continuar ou `n` para finalizar o programa.

## Métodos Implementados

### `fun conversaoBinarioDecimal(numeroBinario: String): Int`
Este método converte um número binário (fornecido como uma `String` contendo apenas os caracteres `0` e `1`) para seu valor decimal correspondente.

- **Parâmetro**:
    - `numeroBinario`: O número binário a ser convertido.
- **Retorno**:
    - Retorna o valor decimal como um `Int`.

**Exemplo**:
````kotlin
val resultado = conversaoBinarioDecimal("1011")
println(resultado)  // Saída: 11
````
### `fun conversaoDecimalBinario(numeroDecimal: Int): String`

Este método converte um número decimal (fornecido como um Int) para seu valor binário correspondente, retornando o binário como uma String.

- **Parâmetro**:
numeroDecimal: O número decimal a ser convertido.
Retorno:
Retorna o valor binário como uma String.
Exemplo:
````kotlin
val resultado = conversaoDecimalBinario(13)
println(resultado)  // Saída: 1101`
````

## Requisitos
Kotlin: Certifique-se de ter o Kotlin instalado em seu sistema.
Ambiente de Execução: Um ambiente de desenvolvimento Kotlin, como IntelliJ IDEA ou o compilador de linha de comando Kotlin.
Como Executar
Clone o repositório:


````
git clone <link_do_repositorio>
````
Compile e execute o programa utilizando o ambiente de sua preferência (IDE ou linha de comando):

````
kotlinc Main.kt -include-runtime -d Main.jar
java -jar Main.jar
````
### Melhorias Futuras
- Adicionar suporte a números binários com ponto flutuante.
- Permitir a conversão de números negativos.

#### Autor:
Kennedy Klaydm
#### Licença: 
Este projeto é distribuído sob a licença MIT.