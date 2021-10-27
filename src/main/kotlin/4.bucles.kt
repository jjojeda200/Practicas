// Los bucles en kotlin son similares a otros lenguajes
fun main() {
    //1. escribe un bucle que imprima por pantalla del 0 al 9 usando while
    println("======== Ejercicio 1 ===========")
    var i = 0
    while (i<10) {
        print(" $i")
        i++
    }
    println()

    //2. escribe un bucle que imprima por pantalla del 0 al 10 usando for
    println("======== Ejercicio 2 ===========")
    for(j in 0..10) { // En java sería: for(int j=0; j<=10; j++)
        print(" $j")
    }
    println()

    //3. escribe un bucle forEach que imprima por pantalla del 0 al 5
    println("======== Ejercicio 3 ===========")
    (0..5).forEach {
        print(" $it")
    }
    println()

    //4. escribe un bucle que imprima por pantalla del 5 al 10
    println("======== Ejercicio 4 ===========")
    for(j in 5..10) { // En java sería: for(int j=5; j<=10; j++)
        print(" $j")
    }
    println()

    //5. escribe un bucle que imprima por pantalla de 6 a 2
    println("======== Ejercicio 5 ===========")
    for (j in 6 down 2) { //for (j in 6..2) //esto compila pero no funciona!
        print(" $j")
    }
    println()

    //6. recorre una lista e imprime por pantalla su contenido
    println("======== Ejercicio 6 ===========")
    val letras = listOf("a", "b", "c", "d")
    for (letra in letras) {
        print(" $letra")
    }

    //7. recorre la lista letras e imprime por pantalla su contenido usando foreach
    println("\n======== Ejercicio 7 ===========")
    letras.forEach {
        print(" $it")
    }

    //8. recorre la lista edades e imprime por pantalla las edades pares usando foreach
    println("\n======== Ejercicio 8 ===========")
    val edades = listOf(20,18,31,33,15,22)
    edades.forEach {
        if (it%2 == 0) {
            print(" $it")
        }
    }

    //9. recorre la lista edades e imprime por pantalla las edades pares usando foreach
    //y renombra la variable "it" a "edad"
    println("\n======== Ejercicio 9 ===========")
    edades.forEach { edad ->
        if (edad%2 == 0) {
            print(" $edad")
        }
    }

}

private infix fun Int.down(to: Int): IntProgression {
    return IntProgression.fromClosedRange(this, to, -1)
}