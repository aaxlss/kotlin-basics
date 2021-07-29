fun main(args: Array<String>) {
//permite ejecutar una serie de operaciones despues de declarar una variable
    var phones = mutableListOf("Google Pixel 2XL", "Google Pixel 4a", "Huawei Redmi 9", "Xiaomi mi a3" )
        .run{
            removeIf { phone -> phone.contains("Google") }
            this
        }

    println(phones)
}