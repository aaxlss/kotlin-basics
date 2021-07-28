fun main(args: Array<String>) {
    var nombre: String? = "null" //puede ser nulo con el signo ?
    println(nombre?.length)
    try {
        throw NullPointerException("Error con null")
        nombre!!.length
    } catch (e : NullPointerException){
        println("Error: $e")
    } finally {
        println("Termino la aplicacion")
    }


    var primerValor = 0
    var segundoValor = 10
    var resultado : Int = try {
        segundoValor / primerValor
    } catch (e : Exception){
        0
    }

    print("rseultado: $resultado")
}