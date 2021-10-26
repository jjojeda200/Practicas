class FrutasDos(){

    var color:String = ""
    var sabor:String = ""
    var precio:Int = 0
    var numHojas:Int = 0

    /*
    constructor(Color:String,Sabor:String,Precio:Int):this()
    {
       this.color = Color
       this.sabor = Sabor
       this.precio = Precio
    }
    */

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
fun main() {
    // var manzana = FrutasDos("Rojo","Dulce",4)
    var manzanaConHojas = FrutasDos("Verde","Agria",5,2)

    println(manzanaConHojas.numHojas)
}