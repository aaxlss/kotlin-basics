fun main(args: Array<String>) {
//acceder a las propiedades directamente de una variable

    val colores = listOf("azul", "amarill", "rojo")

    with(colores){
        println("Los colores son $this")
        println("Cantidades de colores ${this.size}")
    }
}