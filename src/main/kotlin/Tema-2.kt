fun main() {

    val cadena1:String = "Juan"
    val cadena2:String = "Villalvazo"
    val dinero:Int = 10
    println("Nombre: $cadena1 $cadena2\ntengo ${'$'}$dinero")
    val cadena3:String=("Nombre: $cadena1 $cadena2\ntengo ${'$'}$dinero")
    val cadena4:Int=cadena3.length
    println ("El String anterior tiene $cadena4 caracteres")


    /*Arreglos */
    println("\nPrimer valor del arreglo (1,2,3)")
    val arreglo = intArrayOf(1,2,3)
    print(arreglo[0])

    val cualquiera:Any = 18.18f
    println("$cualquiera, \n")

    val a = 5
    val b = 3
    val c = -12
    //true           ||    false
    println((a != b || c < a) || (b == c))

    var Boolean = (a > 3);			 	     println("Ejercicio a) es $Boolean")
    Boolean = (a > b);						 println("Ejercicio b) es $Boolean")
    Boolean = (a < c);					     println("Ejercicio c) es $Boolean")
    Boolean = (c < b);					     println("Ejercicio d) es $Boolean")
    Boolean = (b != a);				   	     println("Ejercicio e) es $Boolean")
    Boolean = (a == 8);					     println("Ejercicio f) es $Boolean")
    Boolean = (b * c == 18);		         println("Ejercicio g) es $Boolean")
    Boolean = (a * b == -30);		         println("Ejercicio h) es $Boolean")
    Boolean = (c / b < a);				     println("Ejercicio i) es $Boolean")
    Boolean = (c / b == -11);			     println("Ejercicio j) es $Boolean")
    Boolean = (c / b == -4);			     println("Ejercicio k) es $Boolean")
    Boolean = (a + c + b == 59);		     println("Ejercicio l) es $Boolean")
    Boolean = ((a+b == 8) && (a-b == 2));    println("Ejercicio m) es $Boolean")
    Boolean = ((a+b == 8) || (a-b == 6));    println("Ejercicio n) es $Boolean")
    Boolean = (a > 3 && b > 4 && c < 3);     println("Ejercicio o) es $Boolean")
    Boolean = (a > 3 && b >= 3 && c < -3);   println("Ejercicio p) es $Boolean")

}