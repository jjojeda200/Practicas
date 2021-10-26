open class FrutasTres(){

    var color:String = ""
    var sabor:String = ""
    var precio:Int = 0
    var numHojas:Int = 0

    constructor(Color:String,Sabor:String,Precio:Int):this(){
        this.color = Color
        this.sabor = Sabor
        this.precio = Precio
    }

    constructor(Color:String,Sabor:String,Precio:Int,NumHojas:Int):this()
    {
        this.color = Color
        this.sabor = Sabor
        this.precio = Precio
        this.numHojas = NumHojas
    }

    fun pudrirse()
    {
        print("La fruta se esta pudriendo")
    }
}

class FrutasGras():FrutasTres(){

    var cantidadGras:Int = 0

    constructor(Grasa:Int):this()
    {
        this.cantidadGras = Grasa
    }
}

fun main() {
    var manzana = FrutasTres("Rojo","Dulce",4)
    var manzanaConHojas = FrutasTres("Verde","Agria",5,2)
    var aguacate = FrutasGras(10)
    aguacate.color = "verde"

    println(manzanaConHojas.numHojas)
    println(aguacate.cantidadGras)
    println(aguacate.color)

}