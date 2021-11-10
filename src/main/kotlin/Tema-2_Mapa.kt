fun main() {
    val mapa1 = mutableMapOf("Uno" to 1, "Dos" to 2, "Tres" to 3)
    mapa1.put("cuatro",4)
    mapa1["Uno"] = 10
    mapa1["Cinco"] = 5

    val mapa2 = mutableMapOf(
        Pair("Uno",1),
        Pair("Dos",2),
        Pair("Tres",3)
    )
    mapa2.put("cuatro",4)

    val conjunto = mutableSetOf<Int>()
    conjunto.add(1)
    conjunto.add(2)
    conjunto.add(3)

    println(mapa1)
    println(mapa2)
    println(conjunto)

}