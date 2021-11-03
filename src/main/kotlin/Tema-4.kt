// Vamos a crear una clase base, con la que después podremos especificar objetos (instaciar)
class Frutas(Color:String,Sabor:String,Precio:Int,Frescura:Int)
{
    var color:String = ""
    var sabor:String = ""
    var precio:Int = 0
    var frescura:Int = 0

    init
    {
        this.color = Color
        this.sabor = Sabor
        this.precio = Precio
        this.frescura = Frescura
    }
    fun pudrirse1(a:Int)
    {
        print("\nLa fruta se esta pudriendo, frecura = $a")
    }
    fun pudrirse2(a:Int)
    {
        print("\nLa fruta es caput, frescura = $a")
    }
}


fun main() {
    // Para crear un objeto de la clase Frutas procedemos a instaciar
    var Manzana = Frutas("Verde","Dulce",4,9)

    // Comprobamos la creación del objeto
    println(Manzana.color)
    println(Manzana.sabor)
    println(Manzana.precio)

    // Metodos

    while (Manzana.frescura > 2)
    {
        if(Manzana.frescura > 2)
            Manzana.pudrirse1(Manzana.frescura)
        //var Manzana = Frutas()
        Manzana.frescura = Manzana.frescura - 2
    }
    Manzana.pudrirse2(Manzana.frescura)

    val xx:Int = Manzana.frescura
    println("\n $xx")
}