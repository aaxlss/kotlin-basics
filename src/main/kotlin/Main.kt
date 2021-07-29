fun main(args: Array<String>) {
    //la funcion Let permite ejecutar una variable cuando la variable no es nula. Esto para proteger the nullpointerException

    val nombre : String? = "Axel"
    nombre?.let {
        valor -> println("El resultado es $nombre")
    }
}