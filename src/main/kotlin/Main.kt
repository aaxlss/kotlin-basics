fun main(args: Array<String>) {

    var heroes = mapOf(
        "iron" to 34,
        "spider" to 32,
        "america" to 12
    ) // map object unmutable
     println(heroes)

    var mapMutable = mutableMapOf(
        "iron" to 34,
        "spider" to 32,
        "america" to 12
    )

    println(mapMutable)

    mapMutable.put("verde", 789)

    println(mapMutable)


    mapMutable["storm"] = 40
    println(mapMutable)

    var iron = mapMutable["iron"]
    println(iron)

    mapMutable.remove("storm")

    println(mapMutable.keys)
    println(mapMutable.values)
}