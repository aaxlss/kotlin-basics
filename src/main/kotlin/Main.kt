const val PI = 3.141516 //constante de tipo variable que nunca cambia. tiempo de compilacion
fun main(args: Array<String>) {
    var dinero: Int = 10 //variable de lectura y escritora (mutable)

    println(dinero)

    dinero = 6

    println(dinero)

    val nombre = "Maria" // variable de solo lectura (no mutable) Tiempo de ejecucion

}