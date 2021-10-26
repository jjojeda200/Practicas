fun main(argumentos: Array<String>)
{

/*If Else */
    val a = 10
    val b = 10
    val c = 10
    val numeroMayor:Int
    numeroMayor = if(a>b && a>c) a else if(b>a && b>c) b else c
    println("El numero mayor de todas mis variables es: $numeroMayor")

    // var nMayor:Int
    // nMayor = if(valor[0]>valor[1] && valor[0]>valor[2]) valor[0] else if(valor[1]>valor[2]) valor[1] else valor[2]
    // println(valor[3])
    // println("El numero mayor de todas mis variables es: $nMayor")

    var valor = intArrayOf(10,12,11,0)
    valor[3] = if(valor[0]>valor[1] && valor[0]>valor[2]) valor[0] else if(valor[1]>valor[2]) valor[1] else valor[2]
    println("El numero mayor de todas mis variables es: ${valor[3]}")

/*Ciclos When*/
    val calificacion = 3
    var resena:String

    when(calificacion){
        1 -> resena = "No me gusto la comida, me causo malestar."
        2 -> resena = "No me gusto, pero la bebida si"
        3 -> {println("El cliente califico con 3 estrellas")
            resena = "Mediocre"}
        4 -> resena = "Me gusto pero puede mejorar."
        5 -> resena = "La mejor comida mexicana en mucho tiempo"
        else -> resena = "Reseña mal escrita"
    }

    println(resena)

/*Ciclos for in */
    var arregloInt = intArrayOf(4,5,6,7,8,9,10,11,12,13,14,15,16,17,18)

    for((indice,valor)   in arregloInt.withIndex())
    {
        // println("El indice ${indice + 1} representa el valor de: $valor")
        println("El indice $indice contiene el valor: $valor")
    }

/*Ciclos while do-while */
    var x = 0

    while (x<=10)
    {
        if(x <= 8) println(x)
        // break
        x = x + 2
    }

    var y = 1

    do
    {
        println("Estoy adentro del do while")
    }
    while(y!=1)

/*Introducción a funciones en Kotlin */

    var resultado = sumaTem(10,8)
    val cosenoUno = Math.cos(1.0)

    println(resultado)
    println(cosenoUno)

}

fun sumaTem(a:Int,b:Int):Int
{
    return a+b
}