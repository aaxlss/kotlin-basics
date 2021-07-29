fun main(args: Array<String>) {
//set no tienen elementos repetidos solo se cuenta el primero
    var vocales = setOf("a","a","c")

    println(vocales)

    var mutables = mutableSetOf(1,2,3,4,5,6,7,8,9)
    println(mutables)
    mutables.add(10)
    mutables.add(1)
    println(mutables)

    mutables.remove(6)
    println(mutables)

    val valorDelSet: Int? = mutables.firstOrNull() { number -> number > 2 }
    println(valorDelSet)
}
