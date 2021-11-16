fun main ()
{
    var numero:Int
    var valor:Int
    var guay:Boolean
    var i:Int

    for (bucle in 0 .. 100){
        numero = bucle
        valor = 0
        guay = false
        i = 1
        while ((i < numero) && !guay)
        {
            valor += i
            if (valor == numero)
                guay = true
            i++
        }
        if (guay)
            println("$numero Es un número Guay")
        // else
        //    println("$numero No es un número Guay")
    }

/*
// Funciona para un numero dado
    numero = 10
    valor = 0
    guay = false
    i = 0

    while ((i < numero) && !guay) {
        valor += i
        if (valor == numero)
            guay = true;
        i++
    }
        if (guay)
            println("$numero Es un número Guay")
        else
            println("$numero No es un número Guay")

*/
}