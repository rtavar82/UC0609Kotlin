package exercicio2


/*
Nome: Ricardo Tavares
Curso: TPSI
Turma: CAS022026
*/

//Classe Pessoa: Crie uma classe que modele uma pessoa:
//Atributos: nome, idade, peso e altura
//Métodos: Envelhercer, engordar, emagrecer, crescer. Obs: Por padrão, a cada ano que nossa pessoa envelhece, sendo a idade dela menor que 21 anos, ela deve crescer 0,5 cm.

// Decisão: O nome é imutável (val) após a criação.
// Os atributos idade, peso e altura são privados para proteger os dados contra alterações diretas.
// A altura é mantida em centímetros (Double) para permitir somar 0.5 cm sem perda de precisão.
class Pessoa(
    val nome: String,
    private var idade: Int,
    private var peso: Double,
    private var altura: Double // em centímetros
) {

    // Envelhece 1 ano. Se tiver menos de 21 anos antes de fazer anos, cresce 0.5 cm
    fun envelhecer() {
        if (this.idade < 21) {
            crescer(0.5)
        }
        this.idade++
        println("$nome fez anos! Idade atual: $idade anos.")
    }

    // Aumenta o peso em quilogramas
    fun engordar(quilos: Double) {
        if (quilos > 0) {
            this.peso += quilos
            println("$nome engordou $quilos kg. Peso atual: $peso kg")
        } else {
            println("O valor para engordar deve ser superior a zero.")
        }
    }

    // Reduz o peso em quilogramas garantindo que o peso final permanece positivo
    fun emagrecer(quilos: Double) {
        if (quilos > 0 && (this.peso - quilos) > 0) {
            this.peso -= quilos
            println("$nome emagreceu $quilos kg. Peso atual: $peso kg")
        } else {
            println("Valor de emagrecimento inválido.")
        }
    }

    // Aumenta a altura em centímetros
    fun crescer(centimetros: Double) {
        if (centimetros > 0) {
            this.altura += centimetros
            println("$nome cresceu $centimetros cm. Altura atual: $altura cm")
        } else {
            println("O valor de crescimento deve ser positivo.")
        }
    }

    // Mostra o resumo dos atributos atuais da pessoa
    fun exibirDados() {
        println("Nome: $nome | Idade: $idade anos | Peso: ${peso}kg | Altura: ${altura}cm")
    }
}

fun main() {
    println("--- Teste da Classe Pessoa ---")

    // Pessoa com 19 anos
    val pessoa = Pessoa(nome = "Lucas", idade = 19, peso = 70.0, altura = 175.0)
    pessoa.exibirDados()

    // 1. Envelhecer aos 19 anos (deve crescer 0.5 cm e passar a ter 20 anos)
    println("\n-> Envelhecer 1º ano:")
    pessoa.envelhecer()
    pessoa.exibirDados()

    // 2. Envelhecer aos 20 anos (deve crescer 0.5 cm e passar a ter 21 anos)
    println("\n-> Envelhecer 2º ano:")
    pessoa.envelhecer()
    pessoa.exibirDados()

    // 3. Envelhecer aos 21 anos (já tem 21, portanto não deve crescer)
    println("\n-> Envelhecer 3º ano (já não deve crescer automaticamente):")
    pessoa.envelhecer()
    pessoa.exibirDados()

    // 4. Testes de peso e crescimento manual
    println("\n-> Testes de peso e crescimento direto:")
    pessoa.engordar(3.5)
    pessoa.emagrecer(1.2)
    pessoa.crescer(1.0)

    println("\n--- Estado Final ---")
    pessoa.exibirDados()
}