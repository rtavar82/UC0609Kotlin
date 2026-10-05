/*class Aluno {
    lateinit var nome: String
    var idade: Int = 0
}*/

//class Aluno (var nome: String, var idade: Int) {
//
//    init {
//        println("Aluno $nome com ${this.idade}anos foi criado com sucesso")
//    }
//
//    constructor(nome: String): this(nome, 0) {
//        println(" ---> Aluno $nome, idade $idade <--- ")
//    }
//
//    constructor(): this("Sem nome", 0)
//
//
//    fun apresentar(){
//        return
//    }
//
//
//}

class Aluno (private var _nome: String, idade: Int) {

    var nome: String
        get() = _nome
        set(value) {
            _nome = value.capitalize()
        }

    var idade: Int = idade
        get() = field
        set(value) {
            field = value
        }

    init {
        println("Aluno $nome com ${this.idade}anos foi criado com sucesso")
    }

    constructor(nome: String): this(nome, 0) {
        println(" ---> Aluno $nome, idade $idade <--- ")
    }

    constructor(): this("Sem nome", 0)


    fun apresentar(){
        return
    }


}