//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    var nomes = arrayOf("Ana", "Maria", "Rita", "Joana", "Rui")

    println(nomes[0])

    println("---------------")
    println(nomes[4])
    // println(nomes[7]) <-- se idx não existir  ---> Erro

    println("---------------")
    println(nomes.get(2))

    println("---------------")
    println(nomes.size)

    println("---------------")
    nomes[0] ="Nuno"
    println(nomes[0])

    println("---------------")
    for (n in nomes) {
        println(n)
    }

    println ("---------------")
    nomes.forEach { nome -> println(nome) }

    println("---------------")
    nomes.forEach { println(it) }

    println("---------------")
    var teste = Array( size = 5) {" ---- " }
    println(teste.contentToString())

    println("------------------")
    val resp = nomes.filter { it.length > 3 }.toString()
    println(resp)

    println("------------------ array especifico int")
    var intArray_demo = intArrayOf(5,2,1,3,1,2,1)
    println(intArray_demo.contentToString())

    println()
    println("--------LISTAS----------")
    println()
    var lst = listOf("Ana", "Maria", "Rita", "Joana", "Rui")
    println(lst[0])

    //lst[0] = "Ana 2" --> dá erro porque não é possivel alterar valores
    //println(lst[0])

    println("------------------")
    var lst2 = lst.toTypedArray()
    println(lst2[1])

    println("------------------")
    lst2[1] = "Pedro"
    lst = lst2.toList()
    println(lst)

    println()
    println("--------Arrays mutaveis----------")
    println()
    var listaNomes = mutableListOf("Ana", "Maria", "Rita", "Joana", "Rui")
    println(listaNomes)
    println(listaNomes.size)
    println(listaNomes.get(2))
    println(listaNomes.getOrNull(19))
    println(listaNomes.getOrElse(2){"Idx invalido"})
    println(listaNomes.getOrElse(21){"Idx invalido"})


    /*
    String != String?
     */

    println("------------------editar")
    listaNomes.add("Novo Nome")
    println(listaNomes)


    listaNomes.add(index = 0,  "Novo Nome 2")
    println(listaNomes)


    println("------------------")
    listaNomes.addFirst(  "Novo Nome 22")
    println(listaNomes)

    listaNomes. addLast(  "Novo Nome 221")
    println(listaNomes)


    println("-----------------add")
    println(listaNomes.add("Novo Nome"))
    println(listaNomes.add(index = 0,  "Novo Nome 2" ))

    println(listaNomes.addFirst("Novo Nome"))
    println(listaNomes.addLast("Novo Nome"))


    println("-----------------remove")
    println(listaNomes.remove("Novo Nome" ))

    println("-----------------remove")
    println(listaNomes.remove("Novo Nome1212121212" ))

    println("-----------------removeAt")
    println(listaNomes.removeAt(2 ))

    println()
    println("------- receber inputs --------")
    println()

    print ("nome: ")
    var nome_in = readln()
    println("o nome é $nome_in")

    print("idade: ")
    var idade = readln().toInt()

    val dataNasc = 2026-idade
    println("a idade é $idade e nasceste no ano $dataNasc")

}