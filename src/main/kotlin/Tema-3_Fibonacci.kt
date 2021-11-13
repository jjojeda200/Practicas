fun mainet() {
    val numVal = 18
    var fib = 0
    var aux = 1

    if(numVal > 0) {
        (1 .. numVal).forEach { print("[$fib] ")
            aux += fib
            fib = aux - fib
        }
    } else {
        println("El numero debe ser mayor a cero!!")
    }
    println()
}