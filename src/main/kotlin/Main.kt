fun main(args: Array<String>) {

    var lotteryNumbers = listOf(345,345,234,567,768,789,4,8,9,7,1)

    var numeroSort = lotteryNumbers.sorted()

    println(numeroSort)


    var numerosDec = lotteryNumbers.sortedDescending()

    println(numerosDec)

    var orderMultiplos = lotteryNumbers.sortedBy { number -> number < 50 } //ordena numeros mayores a 50 primero y deja los menores al final

    println(orderMultiplos)

    var randomSort = lotteryNumbers.shuffled()
    println(randomSort)

    var reverseList = lotteryNumbers.reversed()
    println(reverseList)




}