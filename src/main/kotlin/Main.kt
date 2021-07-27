const val PI = 3.141516 //constante de tipo variable que nunca cambia. tiempo de compilacion
fun main(args: Array<String>) {
    var dinero: Int = 10 //variable de lectura y escritora (mutable)

    println(dinero)

    dinero = 6

    println(dinero)

    //val nombre = "Maria" // variable de solo lectura (no mutable) Tiempo de ejecucion


    val boolean = true
    val numeroLargo: Long = 3L //soporte para numeros grandes
    val double: Double = 2.7182 //numeros de tipo flotante largos
    val float: Float = 2.8f //numeros de tipo flotante

    val primerValor = 20
    var segundoValor = 10

    var tercerValor = primerValor.minus(segundoValor);

    println(tercerValor)

    val apellido = "Sanchez"
    val nombre = "axel"
    val nombreCompleto = nombre + " " + apellido
    val nombreCompletoAnotherway = "Mi nombre $nombre $apellido"

    println(nombreCompleto)
    println(nombreCompletoAnotherway)
}