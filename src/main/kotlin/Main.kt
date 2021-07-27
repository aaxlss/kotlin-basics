fun main(args: Array<String>) {
    val nombreColor = "Amarillo"

    when (nombreColor) {
        "Amarillo" -> {
            println("Amarillo es un color amarillo")
        }
        "Rojo", "Carmesi" -> println("Rojo es un color rojo") //utilizado para valores con el mismo resultado


        else -> println("Error, no info del color")
    }

    val codigo = 200

    when(codigo){
        in 200..299 -> println("todo ha ido bien")
        in 400..500 -> println("ALgo ha fallado")
        else -> println("codigo desconocido")
    }

    val tallaDeZapatos = 41

    val mensaje = when(tallaDeZapatos){
        41,43 -> "tenemos disponible"
        42, 44 -> "Casi no hay"
        45 -> "no hay"
        else -> "solo hay tallas 41, 42, 43 ,44, 45"
    }

    println(mensaje)

}