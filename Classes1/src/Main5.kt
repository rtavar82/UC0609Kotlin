package exercicio5

/*
Nome: Ricardo Tavares
Curso: TPSI
Turma: CAS022026
*/

//Classe Bichinho Virtual:Crie uma classe que modele um Tamagushi (Bichinho Eletrônico):
//Atributos: Nome, Fome, Saúde e Idade b. Métodos: Alterar Nome, Fome, Saúde e Idade; Retornar Nome, Fome, Saúde e Idade Obs: Existe mais uma informação que devemos levar em consideração, o Humor do nosso tamagushi, este humor é uma combinação entre os atributos Fome e Saúde, ou seja, um campo calculado, então não devemos criar um atributo para armazenar esta informação por que ela pode ser calculada a qualquer momento.


// Decisão: Atributos privados para garantir o encapsulamento.
// Fome e Saúde são geridos numa escala de 0 a 100.
// Fome: 0 = sem fome, 100 = faminto.
// Saúde: 0 = muito doente, 100 = perfeitamente saudável.
// O Humor é implementado sem atributo dedicado, sendo calculado sob demanda via getter.
class Tamagushi(
    private var nome: String,
    private var fome: Int = 0,
    private var saude: Int = 100,
    private var idade: Int = 0
) {

    // Métodos para alterar atributos (Setters com validação de limites)
    fun alterarNome(novoNome: String) {
        if (novoNome.isNotBlank()) {
            this.nome = novoNome
        }
    }

    fun alterarFome(novaFome: Int) {
        this.fome = novaFome.coerceIn(0, 100)
    }

    fun alterarSaude(novaSaude: Int) {
        this.saude = novaSaude.coerceIn(0, 100)
    }

    fun alterarIdade(novaIdade: Int) {
        if (novaIdade >= 0) {
            this.idade = novaIdade
        }
    }

    // Métodos para retornar atributos (Getters)
    fun retornarNome(): String = this.nome
    fun retornarFome(): Int = this.fome
    fun retornarSaude(): Int = this.saude
    fun retornarIdade(): Int = this.idade

    // Humor como campo calculado: não ocupa espaço de atributo em memória
    // Combina Saúde e Fome (quanto maior a saúde e menor a fome, melhor o humor)
    fun calcularHumor(): String {
        val indiceHumor = saude - fome
        return when {
            indiceHumor >= 60 -> "Muito Feliz"
            indiceHumor >= 20 -> "Contente"
            indiceHumor >= -20 -> "Neutro"
            indiceHumor >= -60 -> "Triste"
            else -> "Muito Doente / Faminto"
        }
    }

    // Exibe o painel de status completo
    fun mostrarStatus() {
        println(
            "Bichinho: ${retornarNome()} | Idade: ${retornarIdade()} | " +
                    "Fome: ${retornarFome()} | Saúde: ${retornarSaude()} | Humor: ${calcularHumor()}"
        )
    }
}

fun main() {
    println("--- Teste do Bichinho Virtual (Tamagushi) ---")

    // 1. Criação do bichinho
    val pet = Tamagushi(nome = "Dino")
    pet.mostrarStatus()

    // 2. Modificações de atributos usando os métodos dedicados
    println("\n-> A passar tempo e a alterar o estado do bichinho...")
    pet.alterarIdade(2)
    pet.alterarFome(75) // Muita fome
    pet.alterarSaude(40) // Saúde degradada
    pet.mostrarStatus()

    // 3. Teste de consulta individual
    println("\n-> Consulta individual via métodos de retorno:")
    println("Nome consultado: ${pet.retornarNome()}")
    println("Nível de Fome: ${pet.retornarFome()}")
    println("Nível de Saúde: ${pet.retornarSaude()}")
    println("Humor calculado: ${pet.calcularHumor()}")

    // 4. Melhoria dos cuidados
    println("\n-> A cuidar do bichinho (alimentar e curar)...")
    pet.alterarFome(10)
    pet.alterarSaude(95)
    pet.mostrarStatus()
}