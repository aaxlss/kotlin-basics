fun main(args: Array<String>) {

var largoValorInit = superFuncion("platzi") { value ->
    value.length
}
    println(largoValorInit)

    val lambda = inception("Axel")
    val valorLambda = lambda()
    println(valorLambda)
}

fun superFuncion(valorInit : String, block: (String) -> Int):Int{
    return block(valorInit)
}

fun inception(nombre: String) : () ->String{
    return {
        "Hola desde lambda $nombre"
    }
}