fun main() {
    // fun nombreFuncion(parametro1: Int, parametro2: Persona) : Int {
    // ....
    //}
    imprimirPrefijo("saludos a todos")
    imprimirSaludo()
    imprimirSaludo("Hola José")
    val resultado = suma(10,20)
    val resultado2 = suma(14,30)
    println(resultado)
    println(alCuadrado(5))
    println(alCuadrado(5.5))
}
fun imprimirPrefijo(mensaje: String) {
    println("Algoritmo: $mensaje")
}
fun imprimirSaludo(mensaje: String = "Sring a mostrar si no se pasan parámetros a la función") {
    println(mensaje)
}
fun suma(a: Int, b: Int): Int {
    val s = a + b + 2
    return s
}
fun alCuadrado(x: Int): Int {
    return x * x
}

fun alCuadrado(y: Double) = y * y
