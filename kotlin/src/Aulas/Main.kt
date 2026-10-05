package Aulas//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//fun Aulas.Aula1.main() {
//
//
//    val name = "Kotlin"
//    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
//    // to see how IntelliJ IDEA suggests fixing it.
//    println("Hello, " + name + "!")
//
//    for (i in 1..5) {
//        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//        println("i = $i")
//
//    }
//
//    var f1: Float = 0.1f;
//    var f2: Float = 0.2f;
//    println(f1 + f2)
//
//    val d1: Double = 0.1;
//    val d2: Double = 0.2;
//    println(f1 + f2)
//
//    //-----------------------
//
//    // verifique se v1 e maior 1que v2
//
//    // verifique qual dos 2 é maior (assuma que não são iguais)
//
//    // verifique qual dos 2 é maior, se forem iguais de essa info
//
//    val v1: Int =10;
//    val v2: Int  = 20;
//
//    if (v1 > v2) {
//        println("v1 é maior que v2")
//    }
//    else if (v1 < v2) {
//        println("v1 não é maior que v2")
//    }
//    else{
//        println("v1 e v2 são iguais")
//    }
//    //---------------
//
//    val mes = 1
//
//    when (mes) {
//        1 -> println("Jan")
//        2 -> {
//            println("Feb")
//        }
//        3 -> println("Mar")
//        4 -> println("Apr")
//        5 -> println("May")
//        6 -> println("Jun")
//        7 -> println("Jul")
//        8 -> println("Aug")
//        9 -> println("Sep")
//        10 -> println("Oct")
//        11 -> println("Nov")
//        12 -> println("Dec")
//        //else -> println("Mes invalido")
//    }
//    //----------------------------- exemplo em que o kotlin
//
//    val diaSemana = 8
//
//    val resposta = when (diaSemana) {
//        1 -> "Domingo"
//        2 -> "2f"
//        3 -> "3f"
//        4 -> "4f"
//        5 -> "5f"
//        6 -> "6f"
//        7 -> "Sab"
//        else -> "Dia invalido"
//    }
//    println(resposta)
//
//    //--------------------------------------
//
//
//    var i =-1;
//
//    i = 10
//    do {
//        println(i)
//        i--;
//
//    }while (i > 0)
//
//    println(" ---- ")
//
//    i = 1
//    println(i++)
//    println(i++)
//    println(++i);
//
//    //--------------------
//
//    println(" ---- do-while ----")
//    i = 10
//
//    do {
//        println(i)
//        // i-- //i-= 1;
//
//    }while (--i > 0)
//
//    println(" ---- ")
//    i= 1
//    println(i++)
//    println(i++)
//    println(++i)
//
//    // range
//    println(" ---- range ---- ")
//    println(1 .. 10)
//
//    // for
//    println("\n -- for range -- ")
//    for(i in 'a' .. 'z') {
//        print(i)
//    }
//
//    // for
//    println("\n -- for range -- ")
//    for(i in 1..< 10) {
//        println(i)
//    }
//
//    // for
//    println("\n -- for range -- ")
//    for(i in 1 until 10) {
//        println(i)
//    }
//
//    // for
//    println("\n -- for range -- ")
//    for(i in 1 ..  10 step 2) {
//        println(i)
//    }
//
//    // for
//    println("\n -- for range -- ")
//    for(i in 10 downTo 1) {
//        println(i)
//    }
//
//    // for
//    println("\n -- for range -- ")
//    for(i in 'A' .. 'z') {
//        print("$i")
//    }
//
//    i = 60;
//    println("\n -- while range -- ")
//    while (i < 100){
//        print("$i ")
//        if (i == 50){
//            break
//        }
//        if (i == 40){
//            continue
//        }
//        i++
//    }
// }

    fun main(){
        msg()
        msg(nome ="joão")
        msg(nome ="Goncalo")

        println(msg2( nome= "Gonçalo", ano= 2026))

        val teste = msg2(nome="rui", ano= 2026)

        println("--------------")

        println(msg2( nome= "Gonçalo 2", ano= 2027))
        println(msg2( ano= 2027, nome= "Gonçalo 2"))

        println(msg2(nome="gonçalo 2", ano= 2028))

        println("--------------")

        println(soma(2, b = 6))
        println(soma2(a = 20, b = 6))

        myMsg(nome = "Gonçalo")
        myMsg()

        println("--------------")




    }

    fun msg(){
        println("Hello World")
    }

    fun msg(nome: String){
        println("Hello $nome")
    }

    fun msg(nome: String, ano: Int){
        println("Hello $nome no ano $ano")
    }

    fun msg2(nome: String, ano: Int):String{
        return "Hello $nome no ano $ano"
    }

    fun soma(a: Int, b: Int): Int = a + b
    fun soma2(a: Int, b: Int): Int = a + b

    fun funcSemRetorno(){
        println("Sem retorno")
    }



    fun myMsg(nome: String = "Sem Nome"){
        println("ola $nome")
    }


    fun myMsg2(nome:String = "Sem Nome", ano:Int=3000){
        println("ola $nome no ano $ano")

    }
