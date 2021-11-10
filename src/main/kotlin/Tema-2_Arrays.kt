fun main() {

    //La principal diferencia con respecto al uso es que Las Matrices (Arrays)
    // tienen un tamaño fijo, mientras que (Mutable)List puede ajustar su tamaño
    // de forma dinámica. Además, Array es mutable mientras que List no lo es.

    val num = arrayListOf("One", "Two", "Three", "Four")

    for( numero in num )
        imp(numero)
    imp("\n")

    impln(num[2])
    impln(num.get(1))

    // Array mutable
    num[2] = "3"
    num.set(1, "2")

    for( numero in num )
        imp(numero)
    imp("\n")
    val tamaño:String = num.size.toString()
    impln("El tamaño del Array es: $tamaño")
    impln(num.size.toString())

    // Existen varios tipos de arrays predefinidos
    // ByteArray, ShortArray, IntArray

    // --------------------------------------------------------------------------------
    // Creación de un array vacio y con valores Nulos
    val jugadores: Array<String?> = arrayOfNulls(6)
    jugadores[0] = "SF00"
    jugadores[1] = "SF01"
    jugadores[2] = "SF02"
    for( jugador in jugadores )
        imp(jugador + " ")
    imp("\n")
    jugadores.forEach{ print ( it + " ")}

    // --------------------------------------------------------------------------------
    // Ahora manejo de Listas
    val numLista : MutableList<String> = mutableListOf("Uno", "Dos", "Tres", "Cuatro")

    for( numL in numLista )
        imp(numL)
    imp("\n")
    impln(numLista[2])
    impln(numLista.get(1))

    numLista.add("Seis")
    numLista.add(4,"Cinco")

    for( numL in numLista )
        imp(numL)
    imp("\n")
}
fun imp(numero: String?) {
    print(" $numero")
}
fun impln(numero: String) {
    println(numero)
}
