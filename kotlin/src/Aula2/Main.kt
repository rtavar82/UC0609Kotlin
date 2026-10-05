package Aula2

    fun main() {

        println("exe1")
        print("Introduza um número: ")
        val n = readln().toInt()
        imprimirNumeros(n)

        println("-------------")
        println("exe2")
        imprimirSequencia(n)

        println("-------------")
        println("exe3")
        print("Primeiro número: ")
        val n1 = readln().toInt()
        print("Segundo número: ")
        val n2 = readln().toInt()
        print("Terceiro número: ")
        val n3 = readln().toInt()
        val resultado = somar(n1, n2, n3)
        println("A soma é: $resultado")

        println("-------------")
        println("exe4")
        print("Introduza um número: ")
        val numero = readln().toInt()
        val resultado2 = verificarNumero(numero)
        println(resultado2)

        println("-------------")
        println("exe5")
        print("Introduza o custo do produto: ")
        val custo = readln().toDouble()
        print("Introduza a taxa de imposto (%): ")
        val taxa = readln().toDouble()
        val custoFinal = somaImposto(taxa, custo)
        println("Preço com imposto: $custoFinal")

        println("-------------")
        println("exe6")
        var repetir: String

        do {

            print("Introduza a hora (0-23): ")
            val hora24 = readln().toInt()

            print("Introduza os minutos (0-59): ")
            val minutos = readln().toInt()

            if (hora24 in 0..23 && minutos in 0..59) {

                val periodo = charArrayOf('A')

                val hora12 = converterHora(hora24, periodo)

                mostrarHora(hora12, minutos, periodo[0])

            } else {
                println("Hora inválida.")
            }

            print("Deseja converter outra hora? (S/N): ")
            repetir = readln().uppercase()

        } while (repetir == "S")


        println("-------------")
        println("exe7")
        var quantidadePagamentos = 0
        var totalPago = 0.0

        while (true) {

            print("Valor da prestação (0 para terminar): ")
            val valorPrestacao = readln().toDouble()

            if (valorPrestacao == 0.0) {
                break
            }

            print("Dias em atraso: ")
            val diasAtraso = readln().toInt()

            val valorFinal = valorPagamento(valorPrestacao, diasAtraso)

            println("Valor a pagar: %.2f".format(valorFinal))
            println()

            quantidadePagamentos++
            totalPago += valorFinal
        }

        println("----- RELATÓRIO DO DIA -----")
        println("Quantidade de prestações pagas: $quantidadePagamentos")
        println("Valor total pago: %.2f".format(totalPago))

        println("-------------")
        println("exe8")
        print("Introduza um número inteiro: ")
        val numero2 = readln().toInt()
        val quantidade = quantidadeDigitos(numero2)
        println("O número tem $quantidade dígitos.")

        println("-------------")
        println("exe9")
        print("Introduza uma data (DD/MM/AAAA): ")
        val data = readln()
        println(dataPorExtenso(data))

    }