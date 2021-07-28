fun main(args: Array<String>) {

    val listName = listOf("aaa", "xxxxx", "eeeeee") // list no mutable

    println(listName)

    val listaVacia = mutableListOf<String>() //lista mutable

    println(listaVacia)
    listaVacia.add("rrrrr")
    println(listaVacia)

    val valor =listaVacia.get(0)
    println(valor)

    val usandoOperador = listaVacia[0]
    println(usandoOperador)


    val primerValor: String? = listName.firstOrNull() //si la lista esta vacia se retornara un null
    println(primerValor)

    listaVacia.removeAt(0)

    println(listaVacia)

    listaVacia.add("78979789")

    listaVacia.removeIf { option -> option.length> 3 }

    println(listaVacia)


//  Arrays

    val myArray = arrayOf(1,2,3,4)
    println("myArray: $myArray")
    println("myArray: ${myArray.toList()}")

}