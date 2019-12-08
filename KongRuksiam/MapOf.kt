// MapOf
import java.util.TreeMap

fun main(args: Array<String>) {
    var bot = mapOf("Name" to "Namchok", "Age" to "12")

    for(b in bot){
        println(b.key + " " + b.value)
    }
}