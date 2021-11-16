//Las estructuras de datos son una parte muy importante de cualquier lengujae de programación
//Y otra vez es importante los conceptos mutable(var) e inmutable(val).
fun main() {
    //1. Crear variables del tipo MutableSet y Set
    println("======== Ejercicio 1 ===========")
    val numeros: Set<Int> = setOf(1,2,3,4,5) // immutable set
    val numerosMutable: MutableSet<Int> = mutableSetOf(1, 2, 3)
    println("set mutable -> $numerosMutable")
    numerosMutable.add(4)
    println("set mutable despues de añadir 4 -> $numerosMutable")
    println(numeros.size)

    //2. Confirmar a existencia de un valor determinado en alguna de las posiciones
    println("======== Ejercicio 2 ===========")
    if (numeros.contains(4))
        println("¡Contiene el número 4! ")

    // Borrar un elemento del set si existe
    println("\nBorra el elemento 3 ${numerosMutable.remove(3)}")
    println(numerosMutable)
    if (numeros.isEmpty())
        println("numeros es isEmpty")
    else println("numeros no es isEmpty")

    numerosMutable.clear()
    println("NumerosMutable despues de un clear $numerosMutable y su nuevo tamaño es ${numerosMutable.size}")

    numerosMutable.addAll(numeros)
    println("set mutable -> $numerosMutable")

    //3. obtener el primer y ultimo elemento
    println("======== Ejercicio 3 ===========")
    println(numerosMutable.first())
    println(numerosMutable.last())
    println(numeros.first())

    //4. Crear la lista llamada numerosPares con los números pares de la variable numeros
    println("======== Ejercicio 4 ===========")
//    val nuevaListaPares: MutableSet<Int> = mutableListOf()
//    for(n in numeros) {
//        if (n%2 == 0) {
//            nuevaListaPares.add(n)
//        }
//    }
//    println("Nueva lista de pares: $nuevaListaPares")
//    Solución kotlin
    val numerosPares: List<Int> = numeros.filter { it % 2 == 0 }
    println("Nueva lista de pares: $numerosPares")

    //5. Mostrar el último numero par de la lista edades
    println("======== Ejercicio 5 ===========")
    val edades = setOf(18,33,25,12,11,15)
    val ultimaEdadPar = edades.last { it%2 == 0 }
    println("edades = $edades")
    println("Última edad par: $ultimaEdadPar")

}
