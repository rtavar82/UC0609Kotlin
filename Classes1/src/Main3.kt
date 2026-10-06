@file:JvmName("MainKt")

package exercicio3

/*
Nome: Ricardo Tavares
Curso: TPSI
Turma: CAS022026
*/


//Classe Conta Corrente: Crie uma classe para implementar uma conta corrente. A classe deve possuir os seguintes atributos: número da conta, nome do correntista e saldo. Os métodos são os seguintes: alterarNome, depósito e saque; No construtor, saldo é opcional, com valor default zero e os demais atributos são obrigatórios.


// Decisão: numeroConta é declarado como 'val' porque o número da conta não deve mudar após ser criado.
// nomeCorrentista e saldo são 'var' para permitir alterações via métodos.
// O saldo tem valor default 0.0 no construtor primário, tornando-o opcional na instanciação.
class ContaCorrente(
    val numeroConta: String,
    private var nomeCorrentista: String,
    private var saldo: Double = 0.0
) {

    // Altera o nome do correntista caso a string não esteja em branco
    fun alterarNome(novoNome: String) {
        if (novoNome.isNotBlank()) {
            this.nomeCorrentista = novoNome
            println("Nome alterado para: $nomeCorrentista")
        } else {
            println("Erro: O nome não pode estar vazio.")
        }
    }

    // Adiciona valor ao saldo caso a quantia seja superior a zero
    fun deposito(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
            println("Depósito de €$valor efetuado. Saldo atual: €$saldo")
        } else {
            println("Erro: O valor do depósito deve ser maior que zero.")
        }
    }

    // Deduz valor do saldo se houver fundos suficientes e o montante for positivo
    fun saque(valor: Double) {
        if (valor <= 0) {
            println("Erro: O valor de saque deve ser superior a zero.")
        } else if (valor > this.saldo) {
            println("Erro: Saldo insuficiente para efetuar o saque de €$valor. Saldo disponível: €$saldo")
        } else {
            this.saldo -= valor
            println("Saque de €$valor realizado com sucesso. Saldo restante: €$saldo")
        }
    }

    // Método auxiliar para consultar o estado da conta
    fun mostrarDados() {
        println("Conta: $numeroConta | Titular: $nomeCorrentista | Saldo: €$saldo")
    }
}

fun main() {
    // 1. Instanciação omitindo o saldo (assume o valor default 0.0)
    println("--- Teste Conta 1 (Saldo default) ---")
    val conta1 = ContaCorrente(numeroConta = "PT50-0001", nomeCorrentista = "Ricardo Tavares")
    conta1.mostrarDados()

    // Teste de operações
    conta1.deposito(250.0)
    conta1.saque(50.0)
    conta1.saque(300.0) // Tentativa além do limite
    conta1.alterarNome("Ricardo M. Tavares")
    conta1.mostrarDados()

    // 2. Instanciação passando um saldo inicial
    println("\n--- Teste Conta 2 (Saldo inicial fornecido) ---")
    val conta2 = ContaCorrente(numeroConta = "PT50-0002", nomeCorrentista = "Maria Silva", saldo = 1000.0)
    conta2.mostrarDados()
    conta2.saque(200.0)
}

