package com.klaydm

fun main() {
    var opcao: Int?

    while (true) {
        println("Escolha a conversão: ")
        println("0 - Sair")
        println("1 - Binário para Decimal")
        println("2 - Decimal para Binário")
        opcao = readln().toIntOrNull()

        if (opcao == 0) {
            println("Programa finalizado.")
            break
        }

        when (opcao) {
            1 -> {
                var numeroBinario: String
                while (true) {
                    println("Digite o número binário a ser convertido: ")
                    numeroBinario = readln()
                    if (numeroBinario.all { it == '0' || it == '1' }) {
                        val numeroDecimal = conversaoBinarioDecimal(numeroBinario)
                        println("O Número binário: $numeroBinario convertido é: $numeroDecimal")
                        break
                    } else {
                        println("Entrada inválida. Certifique-se de inserir apenas dígitos 0 ou 1.")
                    }
                }
            }
            2 -> {
                var numeroDecimal: Int?
                while (true) {
                    println("Digite o número decimal a ser convertido: ")
                    numeroDecimal = readln().toIntOrNull()
                    if (numeroDecimal != null && numeroDecimal >= 0) {
                        val numeroBinario = conversaoDecimalBinario(numeroDecimal)
                        println("O Número decimal: $numeroDecimal convertido é: $numeroBinario")
                        break
                    } else {
                        println("Entrada inválida. Certifique-se de inserir um número decimal válido.")
                    }
                }
            }
            else -> println("Opção inválida! Escolha entre 0, 1 ou 2.")
        }

        println("Deseja fazer outra conversão? (s/n)")
        val continuar = readln().lowercase()
        if (continuar != "s") {
            println("Programa finalizado.")
            break
        }
    }
}

fun conversaoBinarioDecimal(numeroBinario: String): Int {
    return numeroBinario.toInt(2)
}

fun conversaoDecimalBinario(numeroDecimal: Int): String {
    return numeroDecimal.toString(2)
}
