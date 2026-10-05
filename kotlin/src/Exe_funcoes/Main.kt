package Exe_funcoes

//exe1. Faça um programa para imprimir:
//```
//    1
//    2   2
//    3   3   3
//    .....
//    n   n   n   n   n   n  ... n
//```
//   para um n informado pelo usuário. Use uma função que receba um valor n inteiro e imprima até a n-ésima linha.
fun imprimirNumeros(n: Int) {
    for (i in 1..n) {
        for (j in 1..i) {
            print("$i\t")
        }
        println()
    }
}

//exe2. Faça um programa para imprimir:
//```
//    1
//    1   2
//    1   2   3
//    .....
//    1   2   3   ...  n
//```
//  para um n informado pelo usuário. Use uma função que receba um valor n inteiro imprima até a n-ésima linha.
fun imprimirSequencia(n: Int) {
    for (i in 1..n) {
        for (j in 1..i) {
            print("$j\t")
        }
        println()
    }
}

//exe3. Faça um programa, com uma função que necessite de três argumentos, e que forneça a soma desses três argumentos.
fun somar(a: Int, b: Int, c: Int): Int {
    return a + b + c
}

//exe4. Faça um programa, com uma função que necessite de um argumento. A função retorna ‘P’, se seu argumento for positivo, e ‘N’, se seu argumento for zero ou negativo.
fun verificarNumero(numero: Int): Char {
    return if (numero > 0) {
        'P'
    } else {
        'N'
    }
}

//exe5. Faça um programa com uma função chamada somaImposto. A função possui dois parâmetros formais: taxaImposto, que é a quantia de imposto sobre vendas expressa em porcentagem e custo, que é o custo de um item antes do imposto. A função “altera” o valor de custo para incluir o imposto sobre vendas.
fun somaImposto(taxaImposto: Double, custo: Double): Double {
    val imposto = custo * taxaImposto / 100
    return custo + imposto
}

//exe6. Faça um programa que converta da notação de 24 horas para a notação de 12 horas. Por exemplo, o programa deve converter 14:25 em 2:25 P.M. A entrada é dada em dois inteiros. Deve haver pelo menos duas funções: uma para fazer a conversão e uma para a saída. Registre a informação A.M./P.M. como um valor ‘A’ para A.M. e ‘P’ para P.M. Assim, a função para efetuar as conversões terá um parâmetro formal para registrar se é A.M. ou P.M. Inclua um loop que permita que o usuário repita esse cálculo para novos valores de entrada todas as vezes que desejar.

fun converterHora(hora24: Int, periodo: CharArray): Int {
    periodo[0] = if (hora24 < 12) {
        'A'
    } else {
        'P'
    }
    return when {
        hora24 == 0 -> 12
        hora24 > 12 -> hora24 - 12
        else -> hora24
    }
}


fun mostrarHora(hora: Int, minutos: Int, periodo: Char) {
    if (periodo == 'A') {
        println("$hora:${minutos.toString().padStart(2, '0')} A.M.")
    } else {
        println("$hora:${minutos.toString().padStart(2, '0')} P.M.")
    }
}


//exe7. Faça um programa que use a função valorPagamento para determinar o valor a ser pago por uma prestação de uma conta. O programa deverá solicitar ao usuário o valor da prestação e o número de dias em atraso e passar estes valores para a função valorPagamento, que calculará o valor a ser pago e devolverá este valor ao programa que a chamou. O programa deverá então exibir o valor a ser pago na tela. Após a execução o programa deverá voltar a pedir outro valor de prestação e assim continuar até que seja informado um valor igual a zero para a prestação. Neste momento o programa deverá ser encerrado, exibindo o relatório do dia, que conterá a quantidade e o valor total de prestações pagas no dia. O cálculo do valor a ser pago é feito da seguinte forma. Para pagamentos sem atraso, cobrar o valor da prestação. Quando houver atraso, cobrar 3% de multa, mais 0,1% de juros por dia de atraso.

fun valorPagamento(valorPrestacao: Double, diasAtraso: Int): Double {

    if (diasAtraso <= 0) {
        return valorPrestacao
    }

    val multa = valorPrestacao * 0.03
    val juros = valorPrestacao * 0.001 * diasAtraso

    return valorPrestacao + multa + juros
}

//exe8. Faça uma função que informe a quantidade de dígitos de um determinado número inteiro informado.
fun quantidadeDigitos(numero2: Int): Int {
    return numero2.toString().replace("-", "").length
}

//exeData com mês por extenso. Construa uma função que receba uma data no formato DD/MM/AAAA e devolva uma string no formato D de mesPorExtenso de AAAA. Opcionalmente, valide a data e retorne Unit caso a data seja inválida.
fun dataPorExtenso(data: String): String {
    val partes = data.split("/")
    val dia = partes[0].toInt()
    val mes = partes[1].toInt()
    val ano = partes[2].toInt()
    val meses = arrayOf(
        "janeiro",
        "fevereiro",
        "março",
        "abril",
        "maio",
        "junho",
        "julho",
        "agosto",
        "setembro",
        "outubro",
        "novembro",
        "dezembro"
    )
    return "$dia de ${meses[mes - 1]} de $ano"
}