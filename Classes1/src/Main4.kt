package exercicio4

/*
Nome: Ricardo Tavares
Curso: TPSI
Turma: CAS022026
*/

//4 . Classe TV: Faça um programa que simule um televisor criando-o como um objeto. O usuário deve ser capaz de informar o número do canal e aumentar ou diminuir o volume. Certifique-se de que o número do canal e o nível do volume permanecem dentro de faixas válidas.

// Decisão: Atributos privados para garantir que o canal e o volume só são modificados
// através dos métodos de controlo, assegurando a permanência dentro dos intervalos válidos.
// Limites definidos: Canais de 1 a 99; Volume de 0 (mudo) a 100 (máximo).
class Televisor(
    canalInicial: Int = 1,
    volumeInicial: Int = 10
) {
    // Constantes para os limites de operação
    private val canalMinimo = 1
    private val canalMaximo = 99
    private val volumeMinimo = 0
    private val volumeMaximo = 100

    // Atributos internos validados
    private var canal: Int = canalInicial.coerceIn(canalMinimo, canalMaximo)
    private var volume: Int = volumeInicial.coerceIn(volumeMinimo, volumeMaximo)

    // Método para mudar o canal diretamente para um número informado
    fun mudarCanal(novoCanal: Int) {
        if (novoCanal in canalMinimo..canalMaximo) {
            this.canal = novoCanal
            println("Canal sintonizado: $canal")
        } else {
            println("Erro: Canal $novoCanal inválido! Escolha um canal entre $canalMinimo e $canalMaximo.")
        }
    }

    // Aumenta o volume em uma unidade até ao limite máximo
    fun aumentarVolume() {
        if (this.volume < volumeMaximo) {
            this.volume++
            println("Volume aumentado para: $volume")
        } else {
            println("Aviso: Volume já se encontra no nível máximo ($volumeMaximo).")
        }
    }

    // Diminui o volume em uma unidade até ao limite mínimo
    fun diminuirVolume() {
        if (this.volume > volumeMinimo) {
            this.volume--
            println("Volume diminuído para: $volume")
        } else {
            println("Aviso: Televisor está sem som (Mudo - $volumeMinimo).")
        }
    }

    // Exibe o estado operacional atual do televisor
    fun mostrarEstado() {
        println("Estado atual -> Canal: $canal | Volume: $volume")
    }
}

fun main() {
    // 1. Criação do televisor como um objeto
    val tv = Televisor(canalInicial = 1, volumeInicial = 15)
    tv.mostrarEstado()

    var continuar = true

    // Menu interativo para permitir ao utilizador operar o televisor
    while (continuar) {
        println("\n--- Comando da TV ---")
        println("1. Mudar canal")
        println("2. Aumentar volume")
        println("3. Diminuir volume")
        println("4. Ver estado atual")
        println("0. Desligar TV (Sair)")
        print("Escolha uma opção: ")

        when (readln().trim()) {
            "1" -> {
                print("Informe o número do canal desejado (1 a 99): ")
                val canalInput = readln().toIntOrNull()
                if (canalInput != null) {
                    tv.mudarCanal(canalInput)
                } else {
                    println("Entrada inválida. Digite um número inteiro.")
                }
            }
            "2" -> tv.aumentarVolume()
            "3" -> tv.diminuirVolume()
            "4" -> tv.mostrarEstado()
            "0" -> {
                println("A desligar o televisor...")
                continuar = false
            }
            else -> println("Opção inválida! Tente novamente.")
        }
    }
}