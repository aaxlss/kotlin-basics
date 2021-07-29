fun main(args: Array<String>) {

    val frase = "Platzi".randomCase()

    printFrase(frase)
}
//esta funcion es de tipo Unit, se puede especificar el tipo de retorno unit o no. Esta funcion no tienen la palabra reservada return
fun printFrase(frase: String):Unit{
    println(frase)
}

//Esta es una funcion de tipo Extension. Esta pertenece al objeto que se indica antes del nombre
fun String.randomCase() : String{
    val randomNumber = 0..99
    val random = randomNumber.random()

    return if(random.rem(2) == 0){
        this.uppercase()
    } else{
        this.lowercase()
    }
}


//esta funcion retorna un resultado de tipo String. (Funcion normal)
//fun randomCase(frase: String) : String{
//    val randomNumber = 0..99
//    val random = randomNumber.random()
//
//    return if(random.rem(2) == 0){
//        frase.uppercase()
//    } else{
//        frase.lowercase()
//    }
//}