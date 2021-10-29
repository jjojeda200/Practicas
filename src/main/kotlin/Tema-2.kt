fun main() {

    val cadena1:String = "Jose Juan"
    val cadena2:String = "Ojeda Granados"
    val dinero:Int = 10
    println("Nombre: $cadena1 $cadena2\ntengo ${'$'}$dinero")
    val cadena3:String=("Nombre: $cadena1 $cadena2\n Y tengo ${'$'}$dinero")
    val cadena4:Int=cadena3.length
    println ("El String anterior tiene $cadena4 caracteres")

    /*Arreglos */
    val arreglo = intArrayOf(1,2,3)
    print("\nMuestra primer valor del arreglo (1,2,3):  ")
    println(arreglo[0])
    println("\n")

    /*Operaciones */
    println("Muestra el resultado de Cierto/Falso de una serie de operaciones")
    println("para los valores de a=5, b=3 y c=-12")
    val a = 5
    val b = 3
    val c = -12
    var Boolean = (a != b || c < a) || (b == c)
    println("Ejercicio (a != b || c < a) || (b == c) es $Boolean")
    Boolean = (a > 3);                      println("Ejercicio a > 3 es $Boolean")
    Boolean = (a > b);                      println("Ejercicio a > b es $Boolean")
    Boolean = (a < c);                      println("Ejercicio a < c es $Boolean")
    Boolean = (c < b);                      println("Ejercicio c < b es $Boolean")
    Boolean = (b != a);                     println("Ejercicio b != a es $Boolean")
    Boolean = (a == 8);                     println("Ejercicio a == 8 es $Boolean")
    Boolean = (b * c == 18);                println("Ejercicio b * c == 18 es $Boolean")
    Boolean = (a * b == -30);               println("Ejercicio a * b == -30 es $Boolean")
    Boolean = (c / b < a);                  println("Ejercicio c / b < a es $Boolean")
    Boolean = (c / b == -11);               println("Ejercicio c / b == -11 es $Boolean")
    Boolean = (c / b == -4);                println("Ejercicio c / b == -4 es $Boolean")
    Boolean = (a + c + b == 59);            println("Ejercicio a + c + b == 59 es $Boolean")
    Boolean = ((a+b == 8) && (a-b == 2));   println("Ejercicio (a+b == 8) && (a-b == 2) es $Boolean")
    Boolean = ((a+b == 8) || (a-b == 6));   println("Ejercicio (a+b == 8) || (a-b == 6) es $Boolean")
    Boolean = (a > 3 && b > 4 && c < 3);    println("Ejercicio a > 3 && b > 4 && c < 3 es $Boolean")
    Boolean = (a > 3 && b >= 3 && c < -3);  println("Ejercicio a > 3 && b >= 3 && c < -3 es $Boolean")
}
