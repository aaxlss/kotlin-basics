fun main(args: Array<String>) {
    val nombre = ""

    if (nombre.isNotEmpty()){
        println("el largo de la variable nombre es: ${nombre.length}")
    } else {
        println("error, la variable esa vacia")
    }

    val mensaje: String = if (nombre.length > 4){
        "tu nombre es largo"
    } else if(nombre.isEmpty()){
        "Nombre esta vacio"
    }
    else {
        "tienes un nombre corto"
    }

    println(mensaje)

}