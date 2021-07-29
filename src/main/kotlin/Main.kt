fun main(args: Array<String>) {

    imprirNombre("Axel", "Sanchez")
    imprirNombre(nombre="Axel", apellido="Sanchez")
}

fun imprirNombre (nombre: String,segundoNombre:String ="", apellido: String){
    println("Mi nombre $nombre $segundoNombre $apellido")
}