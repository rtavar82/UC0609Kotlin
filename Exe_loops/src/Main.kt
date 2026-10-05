fun main(){

// Programa que leia uma lista de 5 números inteiros e mostre-os.
    val numbers1 = mutableListOf<Int>()
    //val numbers1 = listOf<Int>()
    for (i in 1..5) {
        print("Digite o número $i: ")
        numbers1.add(readln().toInt())
    }

    println("Os números são: $numbers1")

    println("--------------")
// Programa que leia uma lista de 10 números reais e mostre-os na ordem inversa.
    val numbers2 = mutableListOf<Double>()
    for (i in 1..10) {
        print("Digite o número $i: ")
        numbers2.add(readln().toDouble())
    }
    println("Os números na ordem inversa são: ${numbers2.reversed()}")

    println("--------------")
// Programa que leia 4 notas, mostre as notas e a média na tela.
    var grades = mutableListOf<Double>()
    for (i in 1..4) {
        print("Digite a nota $i: ")
        grades.add(readLine()!!.toDouble())
    }
    var average = grades.average()
    println("As notas são: $grades")
    println("A média é: $average")

    println("--------------")
// Programa que leia 20 números inteiros e armazene-os num lista. Armazene os números pares no vetor PAR e os números IMPARES no vetor impar. Imprima os três vetores.
    val numbers3 = mutableListOf<Int>()
    val evenNumbers = mutableListOf<Int>()
    val oddNumbers = mutableListOf<Int>()
    for (i in 1..20) {
        print("Digite o número $i: ")
        val number = readln().toInt()
        numbers3.add(number)
        if (number % 2 == 0) {
            evenNumbers.add(number)
        } else {
            oddNumbers.add(number)
        }
    }
    println("Todos os números: $numbers3")
    println("Números pares: $evenNumbers")
    println("Números ímpares: $oddNumbers")

    println("--------------")
    // Programa que leia uma lista de 5 números inteiros, mostre a soma, a multiplicação e os números.
    val numbers4 = mutableListOf<Int>()
    var sum = 0
    var product = 1
    for (i in 1..5) {
        print("Digite o número $i: ")
        val number = readln().toInt()
        numbers4.add(number)
        sum += number
        product *= number
    }
    println("Os números são: $numbers4")
    println("A soma é: $sum")
    println("O produto é: $product")

    println("--------------")
    // Programa que peça a idade e a altura de 5 pessoas, armazene cada informação no seu respectivo vetor. Imprima a idade e a altura na ordem inversa a ordem lida.
    val ages = mutableListOf<Int>()
    val heights = mutableListOf<Double>()
    for (i in 1..5) {
        print("Digite a idade da pessoa $i: ")
        ages.add(readln().toInt())
        print("Digite a altura da pessoa $i: ")
        val height = readln().toDouble()
        heights.add(height)
    }
    println("Idades na ordem inversa: ${ages.reversed()}")
    println("Alturas na ordem inversa: ${heights.reversed()}")

    println("--------------")
    // Programa que leia um vetor A com 10 números inteiros, calcule e mostre a soma dos quadrados dos elementos do lista.
    val numbers5 = mutableListOf<Int>()
    var sumOfSquares = 0
    for (i in 1..10) {
        print("Digite o número $i: ")
        val number = readln().toInt()
        numbers5.add(number)
        sumOfSquares += number * number
    }
    println("Os números são: $numbers5")
    println("A soma dos quadrados é: $sumOfSquares")

    println("--------------")
    // Programa que leia dois vetores com 10 elementos cada. Gere um terceiro vetor de 20 elementos, cujos valores deverão ser compostos pelos elementos intercalados dos dois outros vetores.
    val vector1 = mutableListOf<Int>()
    val vector2 = mutableListOf<Int>()
    val interleavedVector = mutableListOf<Int>()
    for (i in 1..10) {
        print("Digite o elemento $i do primeiro vetor: ")
        vector1.add(readln().toInt())
        print("Digite o elemento $i do segundo vetor: ")
        vector2.add(readln().toInt())
    }
    for (i in 0 until vector1.size) {
        interleavedVector.add(vector1[i])
        interleavedVector.add(vector2[i])
    }
    println("Vetor intercalado: $interleavedVector")

    println("--------------")
    // Altere o programa anterior, intercalando 3 vetores de 10 elementos cada.
    val vector3 = mutableListOf<Int>()
    val vector4 = mutableListOf<Int>()
    val vector5 = mutableListOf<Int>()
    val interleavedVector2 = mutableListOf<Int>()
    for (i in 1..10) {
        print("Digite o elemento $i do primeiro vetor: ")
        vector3.add(readln().toInt())
        print("Digite o elemento $i do segundo vetor: ")
        vector4.add(readln().toInt())
        print("Digite o elemento $i do terceiro vetor: ")
        vector5.add(readln().toInt())
    }
    for (i in 0 until vector3.size) {
        interleavedVector2.add(vector3[i])
        interleavedVector2.add(vector4[i])
        interleavedVector2.add(vector5[i])
    }
    println("Vetor intercalado: $interleavedVector2")

    println("--------------")
    // Foram anotadas as idades e alturas de 30 alunos. Faça um Programa que determine quantos alunos com mais de 13 anos possuem altura inferior à média de altura desses alunos.
    val ages2 = mutableListOf<Int>()
    val heights2 = mutableListOf<Double>()
    var totalHeight = 0.0
    for (i in 1..30) {
        print("Digite a idade do aluno $i: ")
        ages2.add(readln().toInt())
        print("Digite a altura do aluno $i: ")
        val height = readln().toDouble()
        heights2.add(height)
        totalHeight += height
    }
    val averageHeight = totalHeight / heights2.size
    var count = 0
    for (i in 0 until ages2.size) {
        if (ages2[i] > 13 && heights2[i] < averageHeight) {
            count++
        }
    }
    println("Número de alunos com mais de 13 anos e altura inferior à média: $count")


}

