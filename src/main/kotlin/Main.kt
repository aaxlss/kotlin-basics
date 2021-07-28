fun main(args: Array<String>) {

    var nombre: String? = null

    val characterNombre : Int = nombre?.length ?: 0 //if the result is null, it will take the value from the right

    println("value: $characterNombre")
}