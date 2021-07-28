fun main(args: Array<String>) {

    val list = listOf("11a4444","b444444444422", "c33")

    for (option in list){
        println("option: $option")
    }

    list.forEach { option -> println("option: $option") }


    val characterOptions: List<Int> = list.map { option -> option.length }
    println("length: $characterOptions")

    var listaFiltrada = list.filter { option -> option.length > 5 }
    println("filtrados: $listaFiltrada")
}