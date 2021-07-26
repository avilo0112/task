import kotlin.random.Random

fun main() {
    val s: String = "number: "
    val i: Int = Random.nextInt(1,10)
    println(i)

    val v = if (i > 7)
        println("Привет")
    else
        println("")
}
