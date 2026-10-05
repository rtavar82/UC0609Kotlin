package Aula1

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val name = "Kotlin"
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    println("Hello, " + name + "!")

    for (i in 1..5) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        println("i = $i")

    }

    var f1: Float = 0.1f;
    var f2: Float = 0.2f;
    println(f1 + f2)

    val d1: Double = 0.1;
    val d2: Double = 0.2;
    println(f1 + f2)

    //-----------------------

    // verifique se v1 e maior 1que v2

    // verifique qual dos 2 é maior (assuma que não são iguais)

    // verifique qual dos 2 é maior, se forem iguais de essa info

    val v1: Int =10;
    val v2: Int  = 20;

    if (v1 > v2) {
        println("v1 é maior que v2")
    }
    else if (v1 < v2) {
        println("v1 não é maior que v2")
    }
    else{
        println("v1 e v2 são iguais")
    }
    //---------------

    val mes = 1

    when (mes) {
        1 -> println("Jan")
        2 -> {
            println("Feb")
        }
        3 -> println("Mar")
        4 -> println("Apr")
        5 -> println("May")
        6 -> println("Jun")
        7 -> println("Jul")
        8 -> println("Aug")
        9 -> println("Sep")
        10 -> println("Oct")
        11 -> println("Nov")
        12 -> println("Dec")
        //else -> println("Mes invalido")
    }
    //----------------------------- exemplo em que o kotlin

    val diaSemana = 8

    val resposta = when (diaSemana) {
        1 -> "Domingo"
        2 -> "2f"
        3 -> "3f"
        4 -> "4f"
        5 -> "5f"
        6 -> "6f"
        7 -> "Sab"
        else -> "Dia invalido"
    }
    println(resposta)




}