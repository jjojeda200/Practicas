/* FUNCIONES EN MAPAS (diccionarios)

   size: tamaño de la colección.
   isEmpty(): indica si el mapa está vacío.
   containsKey(key: K): indica si el mapa contiene una clave.
   containsValue(value: V): indica si el mapa contiene un valor.
   get(key: K): valor asociado a la llave dada o null si no se encuentra.
   keys: devuelve un Set inmutable con todas las claves en el mapa.
   values: Collection inmutable de todos los valores en el mapa.
   */

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