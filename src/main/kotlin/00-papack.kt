object constantes{
    const val moneda: String = "EUR"
}

fun main(){

    var saldo: Float = 300.54f
    var sueldo = 789.10f

    println("\n*********************************************")
    println("********** CURSO BASICO DE KOTLIN ***********")
    println("*********************************************\n")
    val nombre = "José"
    var vip: Boolean = true
    var saludo = "Hola " + nombre

    if (vip == true) saludo += ", te queremos mucho"
    println(saludo)
    mostrar_saldo (saldo)

    saldo = ingresar_dinero (saldo,254.23f)
    saldo = retirar_dinero (saldo, 50.7f)
    saldo = ingresar_sueldo (saldo, sueldo)

    val fecha = "11/11/2021"
    //           0123456789
    print("\n" + fecha + "\n")

    val day  = fecha.subSequence(0,1).toString().toInt()
    if (day == 1){
        saldo = ingresar_sueldo (saldo, sueldo)
    }
    val month  = fecha.subSequence(3,5).toString().toInt()
    print("\n Mes " + month)
    when (month){
        1, 2, 3 -> print ("\n En invierno no hay ofertas de inversiones\n")
        4, 5, 6 -> print ("\n En primavera hay ofertas de inversiones con el 1.5% de interés\n")
        7, 8, 9 -> print ("\n En verano hay ofertas de inversiones con el 2.5% de interés\n")
        10, 11, 12 -> print ("\n En otoño hay ofertas de inversiones con el 3.5% de interés\n")
    }
    print("***************************************************************\n")
    var recibos: Array<String> = arrayOf("luz", "agua", "gas")
    recibos.set(2, "internet")

    recorrer_array(recibos)

    var matriz = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6),
        intArrayOf(7, 8, 9)
    )
    for (i in (0 until 3)){
        println()
        for (j in (0 until 3)){
            print("${matriz[i][j]},")
        }
    }
    print("\n***************************************************************\n")
    print("**** Llamando una función mainet() del Tema-3_Fibonacci.kt ****\n")
    mainet()
}

fun mostrar_saldo(saldo: Float){
    print("\nTienes $saldo ${constantes.moneda}\n")
}
fun ingresar_dinero(saldo: Float, cantidad: Float):Float{
    var sal:Float = saldo + cantidad
    print("Se han ingresado $cantidad ${constantes.moneda}")
    mostrar_saldo (sal)
    return sal
}
fun ingresar_sueldo(saldo: Float, sueldo: Float): Float{
    var sal = saldo + sueldo
    print("Se han ingresado tu sueldo de $sueldo ${constantes.moneda}")
    mostrar_saldo (sal)
    return sal
}
fun retirar_dinero(saldo: Float, cantidad: Float): Float{
    var sal = saldo - cantidad
    print("Se han retirado $cantidad ${constantes.moneda}")
    mostrar_saldo (sal)
    return sal
}

fun recorrer_array(a: Array<String>){
    println()
    println("recorriendo array con for (i in 0 .. a.size-1)")
    for (i in 0 .. a.size-1)
        println("${i+1}: " + a.get(i))

    println()
    println("recorriendo array con for (i in a)")
    for (i in a)
        println(i)

    println()
    println("recorriendo array con for (i in a.indices)")
    for (i in a.indices)
        println(a.get(i))
}