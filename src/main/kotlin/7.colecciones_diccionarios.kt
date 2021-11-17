// En kotlin los diccionarios son mapas
// Los mapas se componen de una pareja: clave/valor

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
    // 1. crear un mapa(similar a HashMap en Java) con los datos de una persona
    val mapPersona = mapOf("nombre" to "Juan", "edad" to 30, "dirección" to "Madrid")
    val dias = mapOf(
            "mes" to "Mayo",
            18 to "Lunes",
            19 to "Martes")

    //2. crear un mapa dentro de otro mapa
    val mapPais = mapOf(
            "nombre" to "España",
            "capital" to mapOf(
                    "nombre" to "Madrid",
                    "habitantes" to 6662000
            )
    )

    //3.Como acceder a los elementos que hay dentro de un mapa
    println(mapPersona["nombre"])
    println(dias["mes"])
    println(dias[18])
    val mapaCapital = mapPais["capital"] as Map<String, Any>
    println(mapaCapital["habitantes"])

//    4.Añadir un elemento al mapa
//    mapPersona["edad"] = 19
    val mapaMutable = mutableMapOf(
            "nombre" to "Juan",
            "edad" to 30,
            "dirección" to "Madrid")
    mapaMutable["genero"] = "masculino"
    mapaMutable["edad"] = 19

    //5. Crear un submapa usando filter
    val mapaEdad = mapaMutable.filter { it.key == "edad" }
    println(mapaEdad["edad"])
    println(mapaMutable)
    mapaMutable["nombre"] = "José Juan"
    println(mapaMutable)
}