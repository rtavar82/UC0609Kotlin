package exercicio6

/*
Nome: Ricardo Tavares
Curso: TPSI
Turma: CAS022026
*/

//Classe Macaco: Desenvolva uma classe Macaco,que possua os atributos nome e bucho (estomago) e pelo menos os métodos comer(), verBucho() e digerir(). Faça um programa ou teste interativamente, criando pelo menos dois macacos, alimentando-os com pelo menos 3 alimentos diferentes e verificando o conteúdo do estomago a cada refeição. Experimente fazer com que um macaco coma o outro. É possível criar um macaco canibal?


// Decisão:
// 1. O estômago (bucho) é implementado como uma MutableList<Any>.
//    Usar o tipo genérico 'Any' permite que o macaco coma alimentos comuns (String)
//    ou instâncias completas de outros objetos, incluindo outros objetos da classe Macaco.
// 2. Resposta à pergunta: Sim, é perfeitamente possível criar um macaco canibal em POO,
//    pois em linguagens orientadas a objetos um objeto pode receber e armazenar referências
//    a outros objetos do mesmo tipo (ou do tipo pai Any).
class Macaco(val nome: String) {

    // Bucho privado para garantir que a manipulação de alimentos
    // ocorre exclusivamente através dos métodos comer() e digerir()
    private val bucho = mutableListOf<Any>()

    // Método para ingerir alimentos ou outros objetos
    fun comer(alimento: Any) {
        // Validação para evitar que o macaco se coma a si próprio
        if (alimento === this) {
            println("Aviso: $nome não pode comer-se a si próprio!")
            return
        }

        bucho.add(alimento)
        println("$nome comeu: ${formatarNomeAlimento(alimento)}")
    }

    // Exibe o conteúdo atual do estômago
    fun verBucho() {
        if (bucho.isEmpty()) {
            println("O bucho de $nome está completamente vazio.")
        } else {
            val conteudoFormatado = bucho.map { formatarNomeAlimento(it) }
            println("Bucho de $nome contém: $conteudoFormatado")
        }
    }

    // Esvazia completamente a lista de alimentos
    fun digerir() {
        if (bucho.isNotEmpty()) {
            bucho.clear()
            println("$nome fez a digestão completa. O bucho voltou a estar vazio.")
        } else {
            println("$nome tentou digerir, mas não tem nada no estômago.")
        }
    }

    // Função auxiliar privada para identificar se o alimento ingerido é outro Macaco
    private fun formatarNomeAlimento(alimento: Any): String {
        return if (alimento is Macaco) {
            "Macaco(${alimento.nome})"
        } else {
            alimento.toString()
        }
    }
}

fun main() {
    println("--- Teste da Classe Macaco e Canibalismo ---")

    // 1. Criação de dois macacos
    val macaco1 = Macaco("Rui")
    val macaco2 = Macaco("Sara")

    // 2. Alimentar o Macaco 1 com 3 alimentos diferentes e verificar o bucho a cada refeição
    println("\n-> Alimentando o Macaco 1 (${macaco1.nome}):")
    macaco1.comer("Banana")
    macaco1.verBucho()

    macaco1.comer("Maçã")
    macaco1.verBucho()

    macaco1.comer("Manga")
    macaco1.verBucho()

    // 3. Alimentar o Macaco 2 com 3 alimentos diferentes e verificar o bucho
    println("\n-> Alimentando o Macaco 2 (${macaco2.nome}):")
    macaco2.comer("Noz")
    macaco2.verBucho()

    macaco2.comer("Folha de bambu")
    macaco2.verBucho()

    macaco2.comer("Inseto")
    macaco2.verBucho()

    // 4. Experiência de Canibalismo: fazer um macaco comer o outro
    println("\n-> Teste de Canibalismo:")
    println("Rui vai comer a Sara...")
    macaco1.comer(macaco2)
    macaco1.verBucho()

    // 5. Teste do processo de digestão
    println("\n-> Digestão:")
    macaco1.digerir()
    macaco1.verBucho()
}