fun main(args: Array<String>) {


    var myLambda : (String) -> Int = {
        valor -> valor.length
    }

    val lambdaValue = myLambda("String")
    println(lambdaValue)

    val saludos = listOf("Hola", "Hi")

    val longitudSaludos = saludos.map(myLambda)
    println(longitudSaludos)

}