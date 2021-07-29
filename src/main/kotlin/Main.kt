fun main(args: Array<String>) {
//permite applicar operaciones sobre una variable y luego regresar el valor

    val mobiles = mutableListOf("g 1", "g2", "H 1", "H 2", "X 2")
        .apply {
            removeIf { option -> option.contains("g") }
        }
    println(mobiles)

    val colores : MutableList<String> = mutableListOf("amarillo", "azul", "rojo")

    colores?.apply {
        println("El color $this")
        println("longitud ${this.size}")
    }
}