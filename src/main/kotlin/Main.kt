import kotlin.reflect.typeOf

fun main(args: Array<String>) {
    val tablica = arrayOf(1f,2f,3f)

    for (el in tablica)
        print("$el ")
    println()

    for (i in 0 .. tablica.size-1)
        print("${tablica[i]} ")
    println()

    for (i in tablica.indices)
        print("${tablica[i]} ")

    var arrayList = ArrayList<Float>()

    arrayList.add(5f)
    arrayList.add(1.0f)

    val list = listOf<Float>(1f,2f,3f)

    val mlist = mutableListOf(3f,1f,5f,1)
}