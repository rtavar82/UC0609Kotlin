package exercicio1

/*
Nome: Ricardo Tavares
Curso: TPSI
Turma: CAS022026
*/

//
//Classe Retangulo: Crie uma classe que modele um retangulo:
//Atributos: LadoA, LadoB (ou Comprimento e Largura, ou Base e Altura, a escolher)
//Métodos: Mudar valor dos lados, Retornar valor dos lados, calcular Área e calcular Perímetro;
//Crie um programa que utilize esta classe. Ele deve pedir ao usuário que informe as medidades de um local. Depois, deve criar um objeto com as medidas e calcular a quantidade de pisos e de rodapés necessárias para o local.

// Decisão: Atributos privados para garantir encapsulamento.
// As medidas são manipuladas através de métodos específicos.
class Retangulo(private var base: Double, private var altura: Double) {

    fun mudarLados(novaBase: Double, novaAltura: Double) {
        if (novaBase > 0 && novaAltura > 0) {
            this.base = novaBase
            this.altura = novaAltura
        } else {
            println("As medidas devem ser superiores a zero.")
        }
    }

    fun retornarLados(): Pair<Double, Double> {
        return Pair(this.base, this.altura)
    }

    fun calcularArea(): Double {
        val (b, h) = retornarLados()
        return b * h
    }

    fun calcularPerimetro(): Double {
        val (b, h) = retornarLados()
        return 2 * (b + h)
    }
}

fun main() {
    println("--- Medidas da Divisão (Local) ---")
    print("Largura do local (metros): ")
    val largLocal = readln().toDouble()
    print("Comprimento do local (metros): ")
    val compLocal = readln().toDouble()

    // 1. Criação do primeiro objeto: a divisão
    val local = Retangulo(largLocal, compLocal)

    println("\n--- Medidas de Cada Peça de Piso ---")
    print("Largura da cerâmica/piso (metros, ex: 0.5): ")
    val largPiso = readln().toDouble()
    print("Comprimento da cerâmica/piso (metros, ex: 0.5): ")
    val compPiso = readln().toDouble()

    // 2. Criação do segundo objeto Retangulo: a placa de piso
    val pecaPiso = Retangulo(largPiso, compPiso)

    println("\n--- Medida do Rodapé ---")
    print("Comprimento de cada barra de rodapé (metros, ex: 1.0): ")
    val compRodape = readln().toDouble()

    // Cálculos usando os métodos dos objetos
    val areaTotal = local.calcularArea()
    val perimetroTotal = local.calcularPerimetro()

    val areaUmaPeca = pecaPiso.calcularArea()

    // Quantidades necessárias
    val qtdPisos = Math.ceil(areaTotal / areaUmaPeca).toInt()
    val qtdRodapes = Math.ceil(perimetroTotal / compRodape).toInt()

    println("\n--- Resultados ---")
    println("Área do local: $areaTotal m²")
    println("Perímetro do local: $perimetroTotal m lineares")
    println("Quantidade de peças de piso necessárias: $qtdPisos unidades")
    println("Quantidade de barras de rodapé necessárias: $qtdRodapes unidades")
}