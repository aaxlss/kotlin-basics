fun main(args: Array<String>) {
//permite obtener una vairbale y ejecutar codigo con esa varible que puede ser utilizado con otro funcion
    var list = mutableListOf<Int>(1,2,3,4,5,6,).also {
        list -> println("Valor origindal $list")
    }.asReversed()

    println(list)
}