import java.math.RoundingMode

/* Conversión de coordenadas "Grados Decimales vs Grados/Minutos/Segundos"

Para el posicionamiento, podemos encontrar cualquier lugar de la Tierra usando coordenadas
de latitud y longitud. Y medimos esas coordenadas usando grados decimales o grados/minutos/segundos.

Mientras que las líneas de latitud oscilan entre -90 y +90 grados, las coordenadas de longitud están
entre -180 y +180 grados.

Latitud N = +
        S = -
Longitud    E = -
            O = +

Convertir de Notación sexagesimal a decimal:
    Grados se quedan como están
    1′ = (1/60)° = 0,01666667° (redondeando a ocho dígitos)
    1″ = (1/60)′ = (1/3600)° = 0,00027778°

Así, 12°15′23″ = 12° + 15(1/60)° + 23(1/3600)° ≈ 12,25639°
*/

fun main(){

    // Grados Sexagesimal
    // Latitud
    var latGrados = 0.0
    var latMinutos = 0.0
    var latSegundos = 0.0

    // Longitud
    var lonGrados = 0.0
    var lonMinutos = 0.0
    var lonSegundos = 0.0

    latGrados = 36.0
    latMinutos = (59.0/60)
    latSegundos = (32.0/3600)

    lonGrados = 6.0
    lonMinutos = (26.0/60)
    lonSegundos = (37.0/3600)

    // Longitud y Latidud en Decimal
    var latDecimal:Double = latGrados + latMinutos + latSegundos
    var lonDecimal = lonGrados + lonMinutos + lonSegundos
    println("La Latitud en Decimal son: $latDecimal")
    println("La Longitud en Decimal son: $lonDecimal")

    print("***************************************************************\n")
    // https://iqanansoft.es/ddp_web/trabajar-con-numeros-y-operaciones-matematicas-en-android-con-kotlin/
/*
    val number:Double = latDecimal
    val number3digits:Double = String.format("%.3f", number).toDouble()
    val number2digits:Double = String.format("%.2f", number3digits).toDouble()
    val solution:Double = String.format("%.1f", number2digits).toDouble()
*/
    println(String.format("%.2f",latDecimal))
    print("***************************************************************\n")


    val number:Double = latDecimal
    val number4digits:Double = Math.round(number * 10000.0) / 10000.0
    val number3digits:Double = Math.round(number * 1000.0) / 1000.0
    val number2digits:Double = Math.round(number3digits * 100.0) / 100.0
    val solution:Double = Math.round(number2digits * 10.0) / 10.0
    println(number4digits)

    print("***************************************************************\n")
    val rounded = number.toBigDecimal().setScale(5, RoundingMode.UP).toDouble()
    println(rounded) // 0.1



/*
    La parte entera de los grados decimales será también los grados del sistema sexagesimal (121°).
    Multiplicar los decimales del valor original por 60 (.135 * 60 = 8.1).
    La parte entera del resultado anterior serán los minutos (8’).
    Multiplicar los decimales del paso 2 por 60 (.1 * 60 = 6).
    El resultado del paso anterior serán los segundos (6’’).
    Tomar los resultados de los pasos 1, 3 y 5 para formar el resultado final (121°8’6’’).
*/

}